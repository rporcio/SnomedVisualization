/**
 */
package snomed.visualization.dsl.visualizationDsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import snomed.visualization.dsl.visualizationDsl.Concept;
import snomed.visualization.dsl.visualizationDsl.Relationship;
import snomed.visualization.dsl.visualizationDsl.VisualizationDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link snomed.visualization.dsl.visualizationDsl.impl.RelationshipImpl#getType <em>Type</em>}</li>
 *   <li>{@link snomed.visualization.dsl.visualizationDsl.impl.RelationshipImpl#getDestination <em>Destination</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelationshipImpl extends MinimalEObjectImpl.Container implements Relationship
{
  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected Concept type;

  /**
   * The cached value of the '{@link #getDestination() <em>Destination</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDestination()
   * @generated
   * @ordered
   */
  protected Concept destination;

  /**
   * @generated NOT
   */
  private boolean defined;

  /**
   * @generated NOT
   */
  private int group;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RelationshipImpl()
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
    return VisualizationDslPackage.Literals.RELATIONSHIP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Concept getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType(Concept newType, NotificationChain msgs)
  {
    Concept oldType = type;
    type = newType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VisualizationDslPackage.RELATIONSHIP__TYPE, oldType, newType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(Concept newType)
  {
    if (newType != type)
    {
      NotificationChain msgs = null;
      if (type != null)
        msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VisualizationDslPackage.RELATIONSHIP__TYPE, null, msgs);
      if (newType != null)
        msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VisualizationDslPackage.RELATIONSHIP__TYPE, null, msgs);
      msgs = basicSetType(newType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VisualizationDslPackage.RELATIONSHIP__TYPE, newType, newType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Concept getDestination()
  {
    return destination;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDestination(Concept newDestination, NotificationChain msgs)
  {
    Concept oldDestination = destination;
    destination = newDestination;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VisualizationDslPackage.RELATIONSHIP__DESTINATION, oldDestination, newDestination);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDestination(Concept newDestination)
  {
    if (newDestination != destination)
    {
      NotificationChain msgs = null;
      if (destination != null)
        msgs = ((InternalEObject)destination).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VisualizationDslPackage.RELATIONSHIP__DESTINATION, null, msgs);
      if (newDestination != null)
        msgs = ((InternalEObject)newDestination).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VisualizationDslPackage.RELATIONSHIP__DESTINATION, null, msgs);
      msgs = basicSetDestination(newDestination, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VisualizationDslPackage.RELATIONSHIP__DESTINATION, newDestination, newDestination));
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
      case VisualizationDslPackage.RELATIONSHIP__TYPE:
        return basicSetType(null, msgs);
      case VisualizationDslPackage.RELATIONSHIP__DESTINATION:
        return basicSetDestination(null, msgs);
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
      case VisualizationDslPackage.RELATIONSHIP__TYPE:
        return getType();
      case VisualizationDslPackage.RELATIONSHIP__DESTINATION:
        return getDestination();
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
      case VisualizationDslPackage.RELATIONSHIP__TYPE:
        setType((Concept)newValue);
        return;
      case VisualizationDslPackage.RELATIONSHIP__DESTINATION:
        setDestination((Concept)newValue);
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
      case VisualizationDslPackage.RELATIONSHIP__TYPE:
        setType((Concept)null);
        return;
      case VisualizationDslPackage.RELATIONSHIP__DESTINATION:
        setDestination((Concept)null);
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
      case VisualizationDslPackage.RELATIONSHIP__TYPE:
        return type != null;
      case VisualizationDslPackage.RELATIONSHIP__DESTINATION:
        return destination != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * @generated NOT
   */
  @Override
  public void setDefined(boolean value) {
	  this.defined = value;
  }

  /**
   * @generated NOT
   */
  @Override
  public boolean isDefined() {
	  return defined;
  }

  /**
   * @generated NOT
   */
  @Override
  public void setGroup(int group) {
	  this.group = group;
  }

  /**
   * @generated NOT
   */
  @Override
  public int getGroup() {
	  return group;
  }

} //RelationshipImpl
