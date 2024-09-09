/**
 * generated by Xtext 2.35.0
 */
package org.xtext.example.mydsl.myDsl.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xtext.example.mydsl.myDsl.AnonymousFunction;
import org.xtext.example.mydsl.myDsl.ArithmeticExpression;
import org.xtext.example.mydsl.myDsl.AugmentedAssignment;
import org.xtext.example.mydsl.myDsl.Block;
import org.xtext.example.mydsl.myDsl.Case;
import org.xtext.example.mydsl.myDsl.CharLiteral;
import org.xtext.example.mydsl.myDsl.ComparisonExpression;
import org.xtext.example.mydsl.myDsl.ConsoleLogStatement;
import org.xtext.example.mydsl.myDsl.Default;
import org.xtext.example.mydsl.myDsl.DoWhileLoop;
import org.xtext.example.mydsl.myDsl.DomainModel;
import org.xtext.example.mydsl.myDsl.ExponentiationExpression;
import org.xtext.example.mydsl.myDsl.Expression;
import org.xtext.example.mydsl.myDsl.ExpressionStatement;
import org.xtext.example.mydsl.myDsl.ForLoop;
import org.xtext.example.mydsl.myDsl.FunctionCall;
import org.xtext.example.mydsl.myDsl.FunctionDeclaration;
import org.xtext.example.mydsl.myDsl.FunctionReturn;
import org.xtext.example.mydsl.myDsl.IfStatement;
import org.xtext.example.mydsl.myDsl.Import;
import org.xtext.example.mydsl.myDsl.JoinFunctionCall;
import org.xtext.example.mydsl.myDsl.LogicalExpression;
import org.xtext.example.mydsl.myDsl.MultiplicationExpression;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.NotBoolean;
import org.xtext.example.mydsl.myDsl.NumberLiteral;
import org.xtext.example.mydsl.myDsl.PostfixOperator;
import org.xtext.example.mydsl.myDsl.PrefixOperator;
import org.xtext.example.mydsl.myDsl.SliceFunctionCall;
import org.xtext.example.mydsl.myDsl.SplitFunctionCall;
import org.xtext.example.mydsl.myDsl.Statement;
import org.xtext.example.mydsl.myDsl.StringLiteral;
import org.xtext.example.mydsl.myDsl.StringManipulationFunctionCall;
import org.xtext.example.mydsl.myDsl.StringManipulationStatement;
import org.xtext.example.mydsl.myDsl.SwitchStatement;
import org.xtext.example.mydsl.myDsl.ThrowStatement;
import org.xtext.example.mydsl.myDsl.TryCatchStatement;
import org.xtext.example.mydsl.myDsl.VariableDeclaration;
import org.xtext.example.mydsl.myDsl.VariableReference;
import org.xtext.example.mydsl.myDsl.WhileLoop;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage
 * @generated
 */
public class MyDslSwitch<T> extends Switch<T>
{
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MyDslPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MyDslSwitch()
	{
		if (modelPackage == null)
		{
			modelPackage = MyDslPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage)
	{
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject)
	{
		switch (classifierID)
		{
			case MyDslPackage.DOMAIN_MODEL:
			{
				DomainModel domainModel = (DomainModel)theEObject;
				T result = caseDomainModel(domainModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MyDslPackage.IMPORT:
			{
				Import import_ = (Import)theEObject;
				T result = caseImport(import_);
				if (result == null) result = caseStatement(import_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MyDslPackage.STATEMENT:
			{
				Statement statement = (Statement)theEObject;
				T result = caseStatement(statement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MyDslPackage.BLOCK:
			{
				Block block = (Block)theEObject;
				T result = caseBlock(block);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MyDslPackage.VARIABLE_DECLARATION:
			{
				VariableDeclaration variableDeclaration = (VariableDeclaration)theEObject;
				T result = caseVariableDeclaration(variableDeclaration);
				if (result == null) result = caseStatement(variableDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MyDslPackage.EXPRESSION_STATEMENT:
			{
				ExpressionStatement expressionStatement = (ExpressionStatement)theEObject;
				T result = caseExpressionStatement(expressionStatement);
				if (result == null) result = caseStatement(expressionStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MyDslPackage.EXPRESSION:
			{
				Expression expression = (Expression)theEObject;
				T result = caseExpression(expression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MyDslPackage.AUGMENTED_ASSIGNMENT:
			{
				AugmentedAssignment augmentedAssignment = (AugmentedAssignment)theEObject;
				T result = caseAugmentedAssignment(augmentedAssignment);
				if (result == null) result = caseExpression(augmentedAssignment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MyDslPackage.POSTFIX_OPERATOR:
			{
				PostfixOperator postfixOperator = (PostfixOperator)theEObject;
				T result = casePostfixOperator(postfixOperator);
				if (result == null) result = caseExpression(postfixOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MyDslPackage.PREFIX_OPERATOR:
			{
				PrefixOperator prefixOperator = (PrefixOperator)theEObject;
				T result = casePrefixOperator(prefixOperator);
				if (result == null) result = caseExpression(prefixOperator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MyDslPackage.ANONYMOUS_FUNCTION:
			{
				AnonymousFunction anonymousFunction = (AnonymousFunction)theEObject;
				T result = caseAnonymousFunction(anonymousFunction);
				if (result == null) result = caseExpression(anonymousFunction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MyDslPackage.NUMBER_LITERAL:
			{
				NumberLiteral numberLiteral = (NumberLiteral)theEObject;
				T result = caseNumberLiteral(numberLiteral);
				if (result == null) result = caseExpression(numberLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MyDslPackage.STRING_LITERAL:
			{
				StringLiteral stringLiteral = (StringLiteral)theEObject;
				T result = caseStringLiteral(stringLiteral);
				if (result == null) result = caseExpression(stringLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MyDslPackage.CHAR_LITERAL:
			{
				CharLiteral charLiteral = (CharLiteral)theEObject;
				T result = caseCharLiteral(charLiteral);
				if (result == null) result = caseExpression(charLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MyDslPackage.VARIABLE_REFERENCE:
			{
				VariableReference variableReference = (VariableReference)theEObject;
				T result = caseVariableReference(variableReference);
				if (result == null) result = caseAugmentedAssignment(variableReference);
				if (result == null) result = casePostfixOperator(variableReference);
				if (result == null) result = casePrefixOperator(variableReference);
				if (result == null) result = caseExpression(variableReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MyDslPackage.IF_STATEMENT:
			{
				IfStatement ifStatement = (IfStatement)theEObject;
				T result = caseIfStatement(ifStatement);
				if (result == null) result = caseStatement(ifStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MyDslPackage.FOR_LOOP:
			{
				ForLoop forLoop = (ForLoop)theEObject;
				T result = caseForLoop(forLoop);
				if (result == null) result = caseStatement(forLoop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MyDslPackage.WHILE_LOOP:
			{
				WhileLoop whileLoop = (WhileLoop)theEObject;
				T result = caseWhileLoop(whileLoop);
				if (result == null) result = caseStatement(whileLoop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MyDslPackage.DO_WHILE_LOOP:
			{
				DoWhileLoop doWhileLoop = (DoWhileLoop)theEObject;
				T result = caseDoWhileLoop(doWhileLoop);
				if (result == null) result = caseStatement(doWhileLoop);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MyDslPackage.FUNCTION_DECLARATION:
			{
				FunctionDeclaration functionDeclaration = (FunctionDeclaration)theEObject;
				T result = caseFunctionDeclaration(functionDeclaration);
				if (result == null) result = caseStatement(functionDeclaration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MyDslPackage.FUNCTION_CALL:
			{
				FunctionCall functionCall = (FunctionCall)theEObject;
				T result = caseFunctionCall(functionCall);
				if (result == null) result = caseStatement(functionCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MyDslPackage.FUNCTION_RETURN:
			{
				FunctionReturn functionReturn = (FunctionReturn)theEObject;
				T result = caseFunctionReturn(functionReturn);
				if (result == null) result = caseStatement(functionReturn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MyDslPackage.CONSOLE_LOG_STATEMENT:
			{
				ConsoleLogStatement consoleLogStatement = (ConsoleLogStatement)theEObject;
				T result = caseConsoleLogStatement(consoleLogStatement);
				if (result == null) result = caseStatement(consoleLogStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MyDslPackage.TRY_CATCH_STATEMENT:
			{
				TryCatchStatement tryCatchStatement = (TryCatchStatement)theEObject;
				T result = caseTryCatchStatement(tryCatchStatement);
				if (result == null) result = caseStatement(tryCatchStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MyDslPackage.SWITCH_STATEMENT:
			{
				SwitchStatement switchStatement = (SwitchStatement)theEObject;
				T result = caseSwitchStatement(switchStatement);
				if (result == null) result = caseStatement(switchStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MyDslPackage.CASE:
			{
				Case case_ = (Case)theEObject;
				T result = caseCase(case_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MyDslPackage.DEFAULT:
			{
				Default default_ = (Default)theEObject;
				T result = caseDefault(default_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MyDslPackage.STRING_MANIPULATION_STATEMENT:
			{
				StringManipulationStatement stringManipulationStatement = (StringManipulationStatement)theEObject;
				T result = caseStringManipulationStatement(stringManipulationStatement);
				if (result == null) result = caseStatement(stringManipulationStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MyDslPackage.STRING_MANIPULATION_FUNCTION_CALL:
			{
				StringManipulationFunctionCall stringManipulationFunctionCall = (StringManipulationFunctionCall)theEObject;
				T result = caseStringManipulationFunctionCall(stringManipulationFunctionCall);
				if (result == null) result = caseStringManipulationStatement(stringManipulationFunctionCall);
				if (result == null) result = caseStatement(stringManipulationFunctionCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MyDslPackage.SPLIT_FUNCTION_CALL:
			{
				SplitFunctionCall splitFunctionCall = (SplitFunctionCall)theEObject;
				T result = caseSplitFunctionCall(splitFunctionCall);
				if (result == null) result = caseStringManipulationFunctionCall(splitFunctionCall);
				if (result == null) result = caseStringManipulationStatement(splitFunctionCall);
				if (result == null) result = caseStatement(splitFunctionCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MyDslPackage.JOIN_FUNCTION_CALL:
			{
				JoinFunctionCall joinFunctionCall = (JoinFunctionCall)theEObject;
				T result = caseJoinFunctionCall(joinFunctionCall);
				if (result == null) result = caseStringManipulationFunctionCall(joinFunctionCall);
				if (result == null) result = caseStringManipulationStatement(joinFunctionCall);
				if (result == null) result = caseStatement(joinFunctionCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MyDslPackage.SLICE_FUNCTION_CALL:
			{
				SliceFunctionCall sliceFunctionCall = (SliceFunctionCall)theEObject;
				T result = caseSliceFunctionCall(sliceFunctionCall);
				if (result == null) result = caseStringManipulationFunctionCall(sliceFunctionCall);
				if (result == null) result = caseStringManipulationStatement(sliceFunctionCall);
				if (result == null) result = caseStatement(sliceFunctionCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MyDslPackage.THROW_STATEMENT:
			{
				ThrowStatement throwStatement = (ThrowStatement)theEObject;
				T result = caseThrowStatement(throwStatement);
				if (result == null) result = caseStatement(throwStatement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MyDslPackage.LOGICAL_EXPRESSION:
			{
				LogicalExpression logicalExpression = (LogicalExpression)theEObject;
				T result = caseLogicalExpression(logicalExpression);
				if (result == null) result = caseExpression(logicalExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MyDslPackage.COMPARISON_EXPRESSION:
			{
				ComparisonExpression comparisonExpression = (ComparisonExpression)theEObject;
				T result = caseComparisonExpression(comparisonExpression);
				if (result == null) result = caseExpression(comparisonExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MyDslPackage.ARITHMETIC_EXPRESSION:
			{
				ArithmeticExpression arithmeticExpression = (ArithmeticExpression)theEObject;
				T result = caseArithmeticExpression(arithmeticExpression);
				if (result == null) result = caseExpression(arithmeticExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MyDslPackage.MULTIPLICATION_EXPRESSION:
			{
				MultiplicationExpression multiplicationExpression = (MultiplicationExpression)theEObject;
				T result = caseMultiplicationExpression(multiplicationExpression);
				if (result == null) result = caseExpression(multiplicationExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MyDslPackage.EXPONENTIATION_EXPRESSION:
			{
				ExponentiationExpression exponentiationExpression = (ExponentiationExpression)theEObject;
				T result = caseExponentiationExpression(exponentiationExpression);
				if (result == null) result = caseExpression(exponentiationExpression);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MyDslPackage.BOOLEAN:
			{
				org.xtext.example.mydsl.myDsl.Boolean boolean_ = (org.xtext.example.mydsl.myDsl.Boolean)theEObject;
				T result = caseBoolean(boolean_);
				if (result == null) result = caseExpression(boolean_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MyDslPackage.NOT_BOOLEAN:
			{
				NotBoolean notBoolean = (NotBoolean)theEObject;
				T result = caseNotBoolean(notBoolean);
				if (result == null) result = caseExpression(notBoolean);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Domain Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Domain Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDomainModel(DomainModel object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Import</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Import</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImport(Import object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStatement(Statement object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlock(Block object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableDeclaration(VariableDeclaration object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpressionStatement(ExpressionStatement object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Augmented Assignment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Augmented Assignment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAugmentedAssignment(AugmentedAssignment object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Postfix Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Postfix Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePostfixOperator(PostfixOperator object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prefix Operator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prefix Operator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrefixOperator(PrefixOperator object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anonymous Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anonymous Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnonymousFunction(AnonymousFunction object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumberLiteral(NumberLiteral object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringLiteral(StringLiteral object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Char Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Char Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCharLiteral(CharLiteral object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableReference(VariableReference object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIfStatement(IfStatement object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>For Loop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>For Loop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForLoop(ForLoop object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>While Loop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>While Loop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhileLoop(WhileLoop object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Do While Loop</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Do While Loop</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDoWhileLoop(DoWhileLoop object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionDeclaration(FunctionDeclaration object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionCall(FunctionCall object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Return</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Return</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionReturn(FunctionReturn object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Console Log Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Console Log Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConsoleLogStatement(ConsoleLogStatement object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Try Catch Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Try Catch Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTryCatchStatement(TryCatchStatement object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Switch Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Switch Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSwitchStatement(SwitchStatement object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCase(Case object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Default</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Default</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefault(Default object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Manipulation Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Manipulation Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringManipulationStatement(StringManipulationStatement object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Manipulation Function Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Manipulation Function Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringManipulationFunctionCall(StringManipulationFunctionCall object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Split Function Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Split Function Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSplitFunctionCall(SplitFunctionCall object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Join Function Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Join Function Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJoinFunctionCall(JoinFunctionCall object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Slice Function Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Slice Function Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSliceFunctionCall(SliceFunctionCall object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Throw Statement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Throw Statement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThrowStatement(ThrowStatement object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Logical Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Logical Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogicalExpression(LogicalExpression object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Comparison Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Comparison Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComparisonExpression(ComparisonExpression object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arithmetic Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arithmetic Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArithmeticExpression(ArithmeticExpression object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiplication Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiplication Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMultiplicationExpression(MultiplicationExpression object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exponentiation Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exponentiation Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExponentiationExpression(ExponentiationExpression object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoolean(org.xtext.example.mydsl.myDsl.Boolean object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not Boolean</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not Boolean</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNotBoolean(NotBoolean object)
	{
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object)
	{
		return null;
	}

} //MyDslSwitch
