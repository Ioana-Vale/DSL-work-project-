/**
 * generated by Xtext 2.35.0
 */
package org.xtext.example.mydsl.myDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.mydsl.myDsl.Case;
import org.xtext.example.mydsl.myDsl.Default;
import org.xtext.example.mydsl.myDsl.Expression;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.SwitchStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Switch Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.SwitchStatementImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.SwitchStatementImpl#getCases <em>Cases</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.SwitchStatementImpl#getDefaultCase <em>Default Case</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SwitchStatementImpl extends StatementImpl implements SwitchStatement
{
	/**
	 * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression expression;

	/**
	 * The cached value of the '{@link #getCases() <em>Cases</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCases()
	 * @generated
	 * @ordered
	 */
	protected EList<Case> cases;

	/**
	 * The cached value of the '{@link #getDefaultCase() <em>Default Case</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultCase()
	 * @generated
	 * @ordered
	 */
	protected Default defaultCase;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwitchStatementImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return MyDslPackage.Literals.SWITCH_STATEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getExpression()
	{
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExpression(Expression newExpression, NotificationChain msgs)
	{
		Expression oldExpression = expression;
		expression = newExpression;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.SWITCH_STATEMENT__EXPRESSION, oldExpression, newExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpression(Expression newExpression)
	{
		if (newExpression != expression)
		{
			NotificationChain msgs = null;
			if (expression != null)
				msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.SWITCH_STATEMENT__EXPRESSION, null, msgs);
			if (newExpression != null)
				msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.SWITCH_STATEMENT__EXPRESSION, null, msgs);
			msgs = basicSetExpression(newExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.SWITCH_STATEMENT__EXPRESSION, newExpression, newExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Case> getCases()
	{
		if (cases == null)
		{
			cases = new EObjectContainmentEList<Case>(Case.class, this, MyDslPackage.SWITCH_STATEMENT__CASES);
		}
		return cases;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Default getDefaultCase()
	{
		return defaultCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultCase(Default newDefaultCase, NotificationChain msgs)
	{
		Default oldDefaultCase = defaultCase;
		defaultCase = newDefaultCase;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.SWITCH_STATEMENT__DEFAULT_CASE, oldDefaultCase, newDefaultCase);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultCase(Default newDefaultCase)
	{
		if (newDefaultCase != defaultCase)
		{
			NotificationChain msgs = null;
			if (defaultCase != null)
				msgs = ((InternalEObject)defaultCase).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.SWITCH_STATEMENT__DEFAULT_CASE, null, msgs);
			if (newDefaultCase != null)
				msgs = ((InternalEObject)newDefaultCase).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.SWITCH_STATEMENT__DEFAULT_CASE, null, msgs);
			msgs = basicSetDefaultCase(newDefaultCase, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.SWITCH_STATEMENT__DEFAULT_CASE, newDefaultCase, newDefaultCase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
	{
		switch (featureID)
		{
			case MyDslPackage.SWITCH_STATEMENT__EXPRESSION:
				return basicSetExpression(null, msgs);
			case MyDslPackage.SWITCH_STATEMENT__CASES:
				return ((InternalEList<?>)getCases()).basicRemove(otherEnd, msgs);
			case MyDslPackage.SWITCH_STATEMENT__DEFAULT_CASE:
				return basicSetDefaultCase(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID)
		{
			case MyDslPackage.SWITCH_STATEMENT__EXPRESSION:
				return getExpression();
			case MyDslPackage.SWITCH_STATEMENT__CASES:
				return getCases();
			case MyDslPackage.SWITCH_STATEMENT__DEFAULT_CASE:
				return getDefaultCase();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case MyDslPackage.SWITCH_STATEMENT__EXPRESSION:
				setExpression((Expression)newValue);
				return;
			case MyDslPackage.SWITCH_STATEMENT__CASES:
				getCases().clear();
				getCases().addAll((Collection<? extends Case>)newValue);
				return;
			case MyDslPackage.SWITCH_STATEMENT__DEFAULT_CASE:
				setDefaultCase((Default)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID)
	{
		switch (featureID)
		{
			case MyDslPackage.SWITCH_STATEMENT__EXPRESSION:
				setExpression((Expression)null);
				return;
			case MyDslPackage.SWITCH_STATEMENT__CASES:
				getCases().clear();
				return;
			case MyDslPackage.SWITCH_STATEMENT__DEFAULT_CASE:
				setDefaultCase((Default)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID)
	{
		switch (featureID)
		{
			case MyDslPackage.SWITCH_STATEMENT__EXPRESSION:
				return expression != null;
			case MyDslPackage.SWITCH_STATEMENT__CASES:
				return cases != null && !cases.isEmpty();
			case MyDslPackage.SWITCH_STATEMENT__DEFAULT_CASE:
				return defaultCase != null;
		}
		return super.eIsSet(featureID);
	}

} //SwitchStatementImpl
