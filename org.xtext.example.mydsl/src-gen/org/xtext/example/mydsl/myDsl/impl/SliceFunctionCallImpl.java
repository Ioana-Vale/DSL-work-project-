/**
 * generated by Xtext 2.35.0
 */
package org.xtext.example.mydsl.myDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.mydsl.myDsl.Expression;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.SliceFunctionCall;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Slice Function Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.SliceFunctionCallImpl#getStr <em>Str</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.SliceFunctionCallImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.myDsl.impl.SliceFunctionCallImpl#getEnd <em>End</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SliceFunctionCallImpl extends StringManipulationFunctionCallImpl implements SliceFunctionCall
{
	/**
	 * The cached value of the '{@link #getStr() <em>Str</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStr()
	 * @generated
	 * @ordered
	 */
	protected Expression str;

	/**
	 * The default value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected static final int START_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected int start = START_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected static final int END_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected int end = END_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SliceFunctionCallImpl()
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
		return MyDslPackage.Literals.SLICE_FUNCTION_CALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getStr()
	{
		return str;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStr(Expression newStr, NotificationChain msgs)
	{
		Expression oldStr = str;
		str = newStr;
		if (eNotificationRequired())
		{
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.SLICE_FUNCTION_CALL__STR, oldStr, newStr);
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
	public void setStr(Expression newStr)
	{
		if (newStr != str)
		{
			NotificationChain msgs = null;
			if (str != null)
				msgs = ((InternalEObject)str).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.SLICE_FUNCTION_CALL__STR, null, msgs);
			if (newStr != null)
				msgs = ((InternalEObject)newStr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.SLICE_FUNCTION_CALL__STR, null, msgs);
			msgs = basicSetStr(newStr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.SLICE_FUNCTION_CALL__STR, newStr, newStr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getStart()
	{
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStart(int newStart)
	{
		int oldStart = start;
		start = newStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.SLICE_FUNCTION_CALL__START, oldStart, start));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getEnd()
	{
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnd(int newEnd)
	{
		int oldEnd = end;
		end = newEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.SLICE_FUNCTION_CALL__END, oldEnd, end));
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
			case MyDslPackage.SLICE_FUNCTION_CALL__STR:
				return basicSetStr(null, msgs);
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
			case MyDslPackage.SLICE_FUNCTION_CALL__STR:
				return getStr();
			case MyDslPackage.SLICE_FUNCTION_CALL__START:
				return getStart();
			case MyDslPackage.SLICE_FUNCTION_CALL__END:
				return getEnd();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID)
		{
			case MyDslPackage.SLICE_FUNCTION_CALL__STR:
				setStr((Expression)newValue);
				return;
			case MyDslPackage.SLICE_FUNCTION_CALL__START:
				setStart((Integer)newValue);
				return;
			case MyDslPackage.SLICE_FUNCTION_CALL__END:
				setEnd((Integer)newValue);
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
			case MyDslPackage.SLICE_FUNCTION_CALL__STR:
				setStr((Expression)null);
				return;
			case MyDslPackage.SLICE_FUNCTION_CALL__START:
				setStart(START_EDEFAULT);
				return;
			case MyDslPackage.SLICE_FUNCTION_CALL__END:
				setEnd(END_EDEFAULT);
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
			case MyDslPackage.SLICE_FUNCTION_CALL__STR:
				return str != null;
			case MyDslPackage.SLICE_FUNCTION_CALL__START:
				return start != START_EDEFAULT;
			case MyDslPackage.SLICE_FUNCTION_CALL__END:
				return end != END_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (start: ");
		result.append(start);
		result.append(", end: ");
		result.append(end);
		result.append(')');
		return result.toString();
	}

} //SliceFunctionCallImpl
