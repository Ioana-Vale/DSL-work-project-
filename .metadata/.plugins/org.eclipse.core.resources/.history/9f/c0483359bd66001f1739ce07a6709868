package org.xtext.example.mydsl.validation;

import java.util.HashMap;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.validation.Check;
import org.xtext.example.mydsl.myDsl.ArithmeticExpression;
import org.xtext.example.mydsl.myDsl.CharLiteral;
import org.xtext.example.mydsl.myDsl.DomainModel;
import org.xtext.example.mydsl.myDsl.ExponentiationExpression;
import org.xtext.example.mydsl.myDsl.FunctionCall;
import org.xtext.example.mydsl.myDsl.FunctionDeclaration;
import org.xtext.example.mydsl.myDsl.LogicalExpression;
import org.xtext.example.mydsl.myDsl.MultiplicationExpression;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.NumberLiteral;
import org.xtext.example.mydsl.myDsl.Boolean;
import org.xtext.example.mydsl.myDsl.StringLiteral;
import org.xtext.example.mydsl.myDsl.VariableDeclaration;
import org.xtext.example.mydsl.myDsl.VariableReference;
import org.xtext.example.mydsl.myDsl.Type;

public class MyDslValidator extends AbstractMyDslValidator {

	 public static final String VARIABLE_DECLARATION_NAME = "variableDeclarationName";
	    public static final String FUNCTION_CALL_NAME = "functionCallName";
	    public static final String FUNCTION_DECLARATION_NAME = "duplicateFunctionName";
	    public static final String DUPLICATE_VARIABLE_NAME = "duplicateVariableName";
	    public static final String UNDECLARED_VARIABLE_REFERENCE = "undeclaredVariableReference";
	    public static final String INVALID_TYPE = "invalidType";
	    public static final String INCORRECT_PARAMETER_COUNT = "incorrectParameterCount";
	    public static final String EXCESSIVE_NESTING = "excessiveNesting";
	    public static final String RECURSIVE_FUNCTION = "recursiveFunction";
	    public static final String INCORRECT_FUNCTION_NAME_FORMAT = "incorrectFunctionNameFormat";
	    public static final String INCORRECT_VARIABLE_NAME_FORMAT = "incorrectVariableNameFormat";
	    public static final String INVALID_TYPE_COMBINATION = "invalidNumericStringSequence";
	    public static final String MISSING_RETURN_STATEMENT = "missingReturnStatement";
	    public static final String UNUSED_PARAMETER = "unusedParameter";
	    public static final String INCONSISTENT_TYPE_USAGE = "inconsistentTypeUsage";

	    private final Map<FunctionDeclaration, Set<String>> functionParametersMap = new HashMap<>();
	    private final Map<FunctionDeclaration, Set<String>> functionUsedParametersMap = new HashMap<>();
	    private final Set<String> functionNames = new HashSet<>();
	    private final Map<FunctionDeclaration, Set<String>> variableDeclarationsMap = new HashMap<>();

	    @Check
	    public void checkExpressionTypes(org.xtext.example.mydsl.myDsl.Expression expression) {
	        if (expression instanceof ArithmeticExpression) {
	            ArithmeticExpression arithOp = (ArithmeticExpression) expression;
	            Type leftType = inferType(arithOp.getLeft());
	            Type rightType = inferType(arithOp.getRight());

	            if (leftType != null && rightType != null && leftType != rightType) {
	                error("Type mismatch: " + leftType + " and " + rightType + " cannot be used together in an arithmetic expression.",
	                      MyDslPackage.Literals.ARITHMETIC_EXPRESSION__RIGHT,
	                      INVALID_TYPE_COMBINATION);
	            }
	        } else if (expression instanceof ExponentiationExpression) {
	            ExponentiationExpression expOp = (ExponentiationExpression) expression;
	            Type leftType = inferType(expOp.getLeft());
	            Type rightType = inferType(expOp.getRight());

	            if (leftType != null && rightType != null && leftType != rightType) {
	                error("Type mismatch: " + leftType + " and " + rightType + " cannot be used together in an exponentiation expression.",
	                      MyDslPackage.Literals.EXPONENTIATION_EXPRESSION__RIGHT,
	                      INVALID_TYPE_COMBINATION);
	            }
	            if (leftType != Type.INT && leftType != Type.FLOAT) {
	                error("Type must be int or float.",
	                      MyDslPackage.Literals.EXPONENTIATION_EXPRESSION__RIGHT,
	                      INVALID_TYPE_COMBINATION);
	            }
	        } else if (expression instanceof MultiplicationExpression) {
	            MultiplicationExpression mulOp = (MultiplicationExpression) expression;
	            Type leftType = inferType(mulOp.getLeft());
	            Type rightType = inferType(mulOp.getRight());

	            if (leftType != null && rightType != null && leftType != rightType) {
	                error("Type mismatch: " + leftType + " and " + rightType + " cannot be used together in a multiplication expression.",
	                      MyDslPackage.Literals.MULTIPLICATION_EXPRESSION__RIGHT,
	                      INVALID_TYPE_COMBINATION);
	            }
	            if (leftType != Type.INT && leftType != Type.FLOAT) {
	                error("Type must be int or float.",
	                      MyDslPackage.Literals.MULTIPLICATION_EXPRESSION__RIGHT,
	                      INVALID_TYPE_COMBINATION);
	            }
	        } else if (expression instanceof LogicalExpression) {
	            LogicalExpression logOp = (LogicalExpression) expression;
	            Type leftType = inferType(logOp.getLeft());
	            Type rightType = inferType(logOp.getRight());

	            if (leftType != null && rightType != null && leftType != rightType) {
	                error("Type mismatch: " + leftType + " and " + rightType + " cannot be used together in a logical expression.",
	                      MyDslPackage.Literals.LOGICAL_EXPRESSION__RIGHT,
	                      INVALID_TYPE_COMBINATION);
	            }
	            if (leftType != Type.BOOLEAN) {
	                error("Type must be boolean for logical expressions.",
	                      MyDslPackage.Literals.LOGICAL_EXPRESSION__RIGHT,
	                      INVALID_TYPE_COMBINATION);
	            }
	        }
	    }

	    private Type inferType(org.xtext.example.mydsl.myDsl.Expression expression) {
	       
	        if (expression instanceof VariableReference) {
	            VariableReference varRef = (VariableReference) expression;
	            VariableDeclaration varDec=varRef.getName();
	            
	            if(varDec!=null) {
	            	return varDec.getType();
	            }
	        } else if (expression instanceof NumberLiteral) {
	            return Type.INT;
	        } else if (expression instanceof StringLiteral) {
	            return Type.STRING;
	        } else if (expression instanceof CharLiteral) {
	            return Type.CHAR;
	        }
	        else if (expression instanceof Boolean) {
	            return Type.BOOLEAN;
	        }
	        return null;
	    }

	    private DomainModel getModel(EObject eObject) {
	        EObject container = eObject;
	        while (container != null && !(container instanceof DomainModel)) {
	            container = container.eContainer();
	        }
	        return (DomainModel) container;
	    }

	    private Type getTypeForVariable(VariableDeclaration variableDeclaration, DomainModel model) {
	        Map<String, Type> variableTypeMap = getVariableTypes(model);
	        return variableTypeMap.get(variableDeclaration);
	    }

	    public static Map<String, Type> getVariableTypes(DomainModel model) {
	        Map<String, Type> variableTypeMap = new HashMap<>();
	        for (EObject eObject : model.getStatements()) {
	            if (eObject instanceof VariableDeclaration) {
	                VariableDeclaration varDef = (VariableDeclaration) eObject;
	                String varName = varDef.getName();
	                Type varType = varDef.getType();
	                variableTypeMap.put(varName, varType);
	            }
	        }
	        return variableTypeMap;
	    }

	    @Check
	    public void checkVariableDeclarationName(VariableDeclaration variableDeclaration) {
	        String variableName = variableDeclaration.getName();
	        if (variableName != null && !variableName.isEmpty() && !Character.isLowerCase(variableName.charAt(0))) {
	            warning("Variable names should start with a lowercase letter",
	                    MyDslPackage.Literals.VARIABLE_DECLARATION__NAME,
	                    VARIABLE_DECLARATION_NAME);
	        }
	    }


	    @Check
	    public void checkVariableNameConvention(VariableDeclaration variableDeclaration) {
	        String variableName = variableDeclaration.getName();
	        if (variableName != null && !isCamelCase(variableName)) {
	            warning("Variable names should be in camelCase: " + variableName,
	                    MyDslPackage.Literals.VARIABLE_DECLARATION__NAME,
	                    INCORRECT_VARIABLE_NAME_FORMAT);
	        }
	    }

	   
	    @Check
	    public void checkVariableDeclaration(VariableDeclaration variableDeclaration) {
	        String variableName = variableDeclaration.getName();
	        EObject container = variableDeclaration.eContainer();
	        if (container instanceof FunctionDeclaration) {
	            FunctionDeclaration functionDeclaration = (FunctionDeclaration) container;
	            Set<String> variableNames = variableDeclarationsMap.computeIfAbsent(functionDeclaration, k -> new HashSet<>());
	            if (variableNames.contains(variableName)) {
	                error("Variable name is already used in this function: " + variableName,
	                      MyDslPackage.Literals.VARIABLE_DECLARATION__NAME,
	                      DUPLICATE_VARIABLE_NAME);
	            }
	            variableNames.add(variableName);
	        }
	    }

	    @Check
	    public void checkVariableReference(VariableReference variableReference) {
	        VariableDeclaration variableName = variableReference.getName();
	        EObject container = variableReference.eContainer();
	        if (container instanceof FunctionDeclaration) {
	            FunctionDeclaration functionDeclaration = (FunctionDeclaration) container;
	            Set<String> variableNames = variableDeclarationsMap.get(functionDeclaration);
	            if (variableNames != null && !variableNames.contains(variableName)) {
	                error("Variable reference to undeclared variable: " + variableName,
	                      MyDslPackage.Literals.VARIABLE_REFERENCE__NAME,
	                      UNDECLARED_VARIABLE_REFERENCE);
	            }
	        }
	    }

	    @Check
	    public void checkVariableAttributes(VariableDeclaration variableDeclaration) {
	        String variableName = variableDeclaration.getName();
	        if (variableName != null && variableName.isEmpty()) {
	            warning("Variable name should not be empty",
	                    MyDslPackage.Literals.VARIABLE_DECLARATION__NAME,
	                    VARIABLE_DECLARATION_NAME);
	        }
	    }

	    private boolean isPascalCase(String name) {
	         return Character.isUpperCase(name.charAt(0)) && !name.contains("_");
	    }

	    private boolean isCamelCase(String name) {
	        return Character.isLowerCase(name.charAt(0)) && !name.contains("_");
	    }

	   

	    @Check
	    public void checkNestingDepth(FunctionDeclaration functionDeclaration) {
	        int depth = determineNestingDepth(functionDeclaration);
	        if (depth > 10) { 
	            warning("Nesting depth is too high: " + depth,
	                    MyDslPackage.Literals.FUNCTION_DECLARATION__BODY,
	                    EXCESSIVE_NESTING);
	        }
	    }

	    private int determineNestingDepth(EObject eObject) {
	        return 0; 
	    }

	    @Check
	    public void checkFunctionRecursion(FunctionDeclaration functionDeclaration) {
	        if (detectRecursion(functionDeclaration)) {
	            warning("Function " + functionDeclaration.getName() + " is recursive.",
	                    MyDslPackage.Literals.FUNCTION_DECLARATION__NAME,
	                    RECURSIVE_FUNCTION);
	        }
	    }

	    private boolean detectRecursion(FunctionDeclaration functionDeclaration) {
	       return false; 
	    }
	    

	    @Check
	    public void checkUnusedParameters(FunctionDeclaration functionDeclaration) {
	        Set<String> parameters = functionParametersMap.getOrDefault(functionDeclaration, new HashSet<>());
	        Set<String> usedParameters = functionUsedParametersMap.getOrDefault(functionDeclaration, new HashSet<>());

	        for (String parameter : parameters) {
	            if (!usedParameters.contains(parameter)) {
	                warning("Parameter '" + parameter + "' is declared but not used in the function.",
	                        MyDslPackage.Literals.FUNCTION_DECLARATION__BODY,
	                        UNUSED_PARAMETER);
	            }
	        }
	    }

	    @Check
	    public void checkInconsistentTypeUsage(VariableDeclaration variableDeclaration) {
	        String variableName = variableDeclaration.getName();
	        Type declaredType = variableDeclaration.getType();
	        
	        DomainModel model = getModel(variableDeclaration);
	        Map<String, Type> variableTypeMap = getVariableTypes(model);

	        for (Map.Entry<String, Type> entry : variableTypeMap.entrySet()) {
	            if (entry.getKey().equals(variableName) && entry.getValue() != declaredType) {
	                error("Variable '" + variableName + "' is being used with inconsistent types.",
	                      MyDslPackage.Literals.VARIABLE_DECLARATION__TYPE,
	                      INCONSISTENT_TYPE_USAGE);
	            }
	        }
	    }
	}
	
