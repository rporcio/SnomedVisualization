/**
 */
package snomed.visualization.dsl.visualizationDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import snomed.visualization.dsl.visualizationDsl.Concept;
import snomed.visualization.dsl.visualizationDsl.Expression;
import snomed.visualization.dsl.visualizationDsl.IsaRelationships;
import snomed.visualization.dsl.visualizationDsl.RelationshipGroup;
import snomed.visualization.dsl.visualizationDsl.Relationships;
import snomed.visualization.dsl.visualizationDsl.VisualizationDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link snomed.visualization.dsl.visualizationDsl.impl.ExpressionImpl#getIsaRelationships <em>Isa Relationships</em>}</li>
 *   <li>{@link snomed.visualization.dsl.visualizationDsl.impl.ExpressionImpl#getUngroupedRelationships <em>Ungrouped Relationships</em>}</li>
 *   <li>{@link snomed.visualization.dsl.visualizationDsl.impl.ExpressionImpl#getGroupedRelationships <em>Grouped Relationships</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExpressionImpl extends MinimalEObjectImpl.Container implements Expression
{
	protected Concept concept;
	
  /**
   * The cached value of the '{@link #getIsaRelationships() <em>Isa Relationships</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIsaRelationships()
   * @generated
   * @ordered
   */
  protected IsaRelationships isaRelationships;

  /**
   * The cached value of the '{@link #getUngroupedRelationships() <em>Ungrouped Relationships</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUngroupedRelationships()
   * @generated
   * @ordered
   */
  protected Relationships ungroupedRelationships;

  /**
   * The cached value of the '{@link #getGroupedRelationships() <em>Grouped Relationships</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGroupedRelationships()
   * @generated
   * @ordered
   */
  protected EList<RelationshipGroup> groupedRelationships;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExpressionImpl()
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
    return VisualizationDslPackage.Literals.EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IsaRelationships getIsaRelationships()
  {
    return isaRelationships;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetIsaRelationships(IsaRelationships newIsaRelationships, NotificationChain msgs)
  {
    IsaRelationships oldIsaRelationships = isaRelationships;
    isaRelationships = newIsaRelationships;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VisualizationDslPackage.EXPRESSION__ISA_RELATIONSHIPS, oldIsaRelationships, newIsaRelationships);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsaRelationships(IsaRelationships newIsaRelationships)
  {
    if (newIsaRelationships != isaRelationships)
    {
      NotificationChain msgs = null;
      if (isaRelationships != null)
        msgs = ((InternalEObject)isaRelationships).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VisualizationDslPackage.EXPRESSION__ISA_RELATIONSHIPS, null, msgs);
      if (newIsaRelationships != null)
        msgs = ((InternalEObject)newIsaRelationships).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VisualizationDslPackage.EXPRESSION__ISA_RELATIONSHIPS, null, msgs);
      msgs = basicSetIsaRelationships(newIsaRelationships, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VisualizationDslPackage.EXPRESSION__ISA_RELATIONSHIPS, newIsaRelationships, newIsaRelationships));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Relationships getUngroupedRelationships()
  {
    return ungroupedRelationships;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUngroupedRelationships(Relationships newUngroupedRelationships, NotificationChain msgs)
  {
    Relationships oldUngroupedRelationships = ungroupedRelationships;
    ungroupedRelationships = newUngroupedRelationships;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VisualizationDslPackage.EXPRESSION__UNGROUPED_RELATIONSHIPS, oldUngroupedRelationships, newUngroupedRelationships);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUngroupedRelationships(Relationships newUngroupedRelationships)
  {
    if (newUngroupedRelationships != ungroupedRelationships)
    {
      NotificationChain msgs = null;
      if (ungroupedRelationships != null)
        msgs = ((InternalEObject)ungroupedRelationships).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VisualizationDslPackage.EXPRESSION__UNGROUPED_RELATIONSHIPS, null, msgs);
      if (newUngroupedRelationships != null)
        msgs = ((InternalEObject)newUngroupedRelationships).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VisualizationDslPackage.EXPRESSION__UNGROUPED_RELATIONSHIPS, null, msgs);
      msgs = basicSetUngroupedRelationships(newUngroupedRelationships, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VisualizationDslPackage.EXPRESSION__UNGROUPED_RELATIONSHIPS, newUngroupedRelationships, newUngroupedRelationships));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<RelationshipGroup> getGroupedRelationships()
  {
    if (groupedRelationships == null)
    {
      groupedRelationships = new EObjectContainmentEList<RelationshipGroup>(RelationshipGroup.class, this, VisualizationDslPackage.EXPRESSION__GROUPED_RELATIONSHIPS);
    }
    return groupedRelationships;
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
      case VisualizationDslPackage.EXPRESSION__ISA_RELATIONSHIPS:
        return basicSetIsaRelationships(null, msgs);
      case VisualizationDslPackage.EXPRESSION__UNGROUPED_RELATIONSHIPS:
        return basicSetUngroupedRelationships(null, msgs);
      case VisualizationDslPackage.EXPRESSION__GROUPED_RELATIONSHIPS:
        return ((InternalEList<?>)getGroupedRelationships()).basicRemove(otherEnd, msgs);
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
      case VisualizationDslPackage.EXPRESSION__ISA_RELATIONSHIPS:
        return getIsaRelationships();
      case VisualizationDslPackage.EXPRESSION__UNGROUPED_RELATIONSHIPS:
        return getUngroupedRelationships();
      case VisualizationDslPackage.EXPRESSION__GROUPED_RELATIONSHIPS:
        return getGroupedRelationships();
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
      case VisualizationDslPackage.EXPRESSION__ISA_RELATIONSHIPS:
        setIsaRelationships((IsaRelationships)newValue);
        return;
      case VisualizationDslPackage.EXPRESSION__UNGROUPED_RELATIONSHIPS:
        setUngroupedRelationships((Relationships)newValue);
        return;
      case VisualizationDslPackage.EXPRESSION__GROUPED_RELATIONSHIPS:
        getGroupedRelationships().clear();
        getGroupedRelationships().addAll((Collection<? extends RelationshipGroup>)newValue);
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
      case VisualizationDslPackage.EXPRESSION__ISA_RELATIONSHIPS:
        setIsaRelationships((IsaRelationships)null);
        return;
      case VisualizationDslPackage.EXPRESSION__UNGROUPED_RELATIONSHIPS:
        setUngroupedRelationships((Relationships)null);
        return;
      case VisualizationDslPackage.EXPRESSION__GROUPED_RELATIONSHIPS:
        getGroupedRelationships().clear();
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
      case VisualizationDslPackage.EXPRESSION__ISA_RELATIONSHIPS:
        return isaRelationships != null;
      case VisualizationDslPackage.EXPRESSION__UNGROUPED_RELATIONSHIPS:
        return ungroupedRelationships != null;
      case VisualizationDslPackage.EXPRESSION__GROUPED_RELATIONSHIPS:
        return groupedRelationships != null && !groupedRelationships.isEmpty();
    }
    return super.eIsSet(featureID);
  }

@Override
public Concept getConcept() {
	return this.concept;
}

@Override
public void setConcept(Concept concept) {
	this.concept = concept;
}

} //ExpressionImpl
