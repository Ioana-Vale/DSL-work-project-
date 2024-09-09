package org.xtext.example.mydsl.ui.contentassist;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;
import org.xtext.example.mydsl.myDsl.VariableDeclaration;

public class MyDslProposalProvider extends AbstractMyDslProposalProvider {

	@Override
  public void completeVariableDeclaration_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
        if(model instanceof VariableDeclaration) {
        	VariableDeclaration variable = (VariableDeclaration) model;
        	 if (variable.getType() != null && "int".equals(variable.getType().getName()) ) {
                 acceptor.accept(createCompletionProposal("intiger", context));
            }else if (variable.getType() != null && "String".equals(variable.getType().getName())) {
                acceptor.accept(createCompletionProposal("string", context));
            }else if (variable.getType() != null && "float".equals(variable.getType().getName())) {
                acceptor.accept(createCompletionProposal("floatNumber", context));
            }else if (variable.getType() != null && "let".equals(variable.getType().getName())) {
                 acceptor.accept(createCompletionProposal("variable", context));
             }else if (variable.getType() != null && "const".equals(variable.getType().getName())) {
                 acceptor.accept(createCompletionProposal("constValue", context));
             }else if (variable.getType() != null && "val".equals(variable.getType().getName())) {
                 acceptor.accept(createCompletionProposal("variable", context));
                 }
        }
        
        super.completeVariableDeclaration_Name(model, assignment, context, acceptor);
    }
       
}