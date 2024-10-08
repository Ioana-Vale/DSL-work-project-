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

import org.xtext.example.mydsl.myDsl.Expression;
import org.xtext.example.mydsl.myDsl.JoinFunctionCall;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.StringLiteral;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Join Function Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.JoinFunctionCallImpl#getStr <em>Str</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.JoinFunctionCallImpl#getDelimiter <em>Delimiter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JoinFunctionCallImpl extends StringManipulationFunctionCallImpl implements JoinFunctionCall
{
	/**
	 * The cached value of the '{@link #getStr() <em>Str</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStr()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> str;

	/**
	 * The cached value of the '{@link #getDelimiter() <em>Delimiter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelimiter()
	 * @generated
	 * @ordered
	 */
	protected StringLiteral delimiter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JoinFunctionCallImpl()
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
		return MyDslPackage.Literals.JOIN_FUNCTION_CALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Expression> getStr()
	{
		if (str == null)
		{
			str = new EObjectContainmentEList<Expression>(Expression.class, this, MyDslPackage.JOIN_FUNCTION_CALL__STR);
		}
		return str;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringLiteral getDelimiter()
	{
		return delimiter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDelimiter(StringLiteral newDelimiter, NotificationChain msgs)
	{
		StringLiteral oldDelimiter = delimiter;
		delimiter = newDelimiter;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.JOIN_FUNCTION_CALL__DELIMITER, oldDelimiter, newDelimiter);
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
	public void setDelimiter(StringLiteral newDelimiter)
	{
		if (newDelimiter != delimiter)
		{
			NotificationChain msgs = null;
			if (delimiter != null)
				msgs = ((InternalEObject)delimiter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.JOIN_FUNCTION_CALL__DELIMITER, null, msgs);
			if (newDelimiter != null)
				msgs = ((InternalEObject)newDelimiter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.JOIN_FUNCTION_CALL__DELIMITER, null, msgs);
			msgs = basicSetDelimiter(newDelimiter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.JOIN_FUNCTION_CALL__DELIMITER, newDelimiter, newDelimiter));
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
			case MyDslPackage.JOIN_FUNCTION_CALL__STR:
				return ((InternalEList<?>)getStr()).basicRemove(otherEnd, msgs);
			case MyDslPackage.JOIN_FUNCTION_CALL__DELIMITER:
				return basicSetDelimiter(null, msgs);
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
			case MyDslPackage.JOIN_FUNCTION_CALL__STR:
				return getStr();
			case MyDslPackage.JOIN_FUNCTION_CALL__DELIMITER:
				return getDelimiter();
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
			case MyDslPackage.JOIN_FUNCTION_CALL__STR:
				getStr().clear();
				getStr().addAll((Collection<? extends Expression>)newValue);
				return;
			case MyDslPackage.JOIN_FUNCTION_CALL__DELIMITER:
				setDelimiter((StringLiteral)newValue);
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
			case MyDslPackage.JOIN_FUNCTION_CALL__STR:
				getStr().clear();
				return;
			case MyDslPackage.JOIN_FUNCTION_CALL__DELIMITER:
				setDelimiter((StringLiteral)null);
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
			case MyDslPackage.JOIN_FUNCTION_CALL__STR:
				return str != null && !str.isEmpty();
			case MyDslPackage.JOIN_FUNCTION_CALL__DELIMITER:
				return delimiter != null;
		}
		return super.eIsSet(featureID);
	}

} //JoinFunctionCallImpl
