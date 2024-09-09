package org.xtext.example.mydsl.scoping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.scoping.impl.SimpleScope;
import org.xtext.example.mydsl.builtin.MyDslBuiltInFunctions;
import org.xtext.example.mydsl.myDsl.Block;
import org.xtext.example.mydsl.myDsl.FunctionCall;
import org.xtext.example.mydsl.myDsl.FunctionDeclaration;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.VariableDeclaration;
import org.xtext.example.mydsl.myDsl.VariableReference;

public class MyDslScopeProvider extends AbstractDeclarativeScopeProvider {

    /**
     * Returns the scope for variable references.
     * @param ref the variable reference.
     * @return the scope containing the variable declarations.
     */
    public IScope scope_VariableReference_name(VariableReference ref) {
        FunctionDeclaration function = EcoreUtil2.getContainerOfType(ref, FunctionDeclaration.class);
        if (function != null) {
            List<VariableDeclaration> variables = function.getBody().getStatements().stream()
                .filter(stmt -> stmt instanceof VariableDeclaration)
                .map(stmt -> (VariableDeclaration) stmt)
                .collect(Collectors.toList());
            return Scopes.scopeFor(variables);
        }

        Block block = EcoreUtil2.getContainerOfType(ref, Block.class);
        if (block != null) {
            List<VariableDeclaration> variables = block.getStatements().stream()
                .filter(stmt -> stmt instanceof VariableDeclaration)
                .map(stmt -> (VariableDeclaration) stmt)
                .collect(Collectors.toList());
            return Scopes.scopeFor(variables);
        }

        return Scopes.scopeFor(List.of());
    }

    /**
     * Returns the scope for function calls.
     * @param call the function call.
     * @return the scope containing the function declarations.
     */
    public IScope scope_FunctionCall_name(FunctionCall call) {
        FunctionDeclaration enclosingFunction = EcoreUtil2.getContainerOfType(call, FunctionDeclaration.class);
        if (enclosingFunction != null) {
            List<FunctionDeclaration> functions = enclosingFunction.getBody().getStatements().stream()
                .filter(stmt -> stmt instanceof FunctionDeclaration)
                .map(stmt -> (FunctionDeclaration) stmt)
                .collect(Collectors.toList());
            return Scopes.scopeFor(functions);
        }

        Block enclosingBlock = EcoreUtil2.getContainerOfType(call, Block.class);
        if (enclosingBlock != null) {
            List<FunctionDeclaration> functions = enclosingBlock.getStatements().stream()
                .filter(stmt -> stmt instanceof FunctionDeclaration)
                .map(stmt -> (FunctionDeclaration) stmt)
                .collect(Collectors.toList());
            return Scopes.scopeFor(functions);
        }

        return Scopes.scopeFor(List.of());
    }

    @Override
    public IScope getScope(EObject context, EReference reference) {
        // Creează un ResourceSet manual
        ResourceSetImpl resourceSet = new ResourceSetImpl();

        // Încarcă funcțiile integrate din XML
        Resource builtInFunctionsResource =MyDslBuiltInFunctions.loadBuiltInFunctions(resourceSet);

        // Obțineți funcțiile din resursa încărcată
        List<FunctionDeclaration> builtInFunctions = builtInFunctionsResource.getContents().stream()
            .filter(FunctionDeclaration.class::isInstance)
            .map(FunctionDeclaration.class::cast)
            .collect(Collectors.toList());

        // Converteți funcțiile în descrieri de obiecte
        List<IEObjectDescription> functionDescriptions = builtInFunctions.stream()
            .map(func -> EObjectDescription.create(QualifiedName.create(func.getName()), func))
            .collect(Collectors.toList());

        // Obțineți scopul părinte
        IScope parentScope = super.getScope(context, reference);

        // Combină lista de descriere de obiecte cu scopul părinte
        return new SimpleScope(parentScope, functionDescriptions);
    }
}