/**
 */
package snomed.visualization.dsl.visualizationDsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import snomed.visualization.dsl.visualizationDsl.Relationship;
import snomed.visualization.dsl.visualizationDsl.RelationshipGroup;
import snomed.visualization.dsl.visualizationDsl.VisualizationDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relationship Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link snomed.visualization.dsl.visualizationDsl.impl.RelationshipGroupImpl#getRelationships <em>Relationships</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelationshipGroupImpl extends MinimalEObjectImpl.Container implements RelationshipGroup
{
  /**
   * The cached value of the '{@link #getRelationships() <em>Relationships</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelationships()
   * @generated
   * @ordered
   */
  protected EList<Relationship> relationships;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RelationshipGroupImpl()
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
    return VisualizationDslPackage.Literals.RELATIONSHIP_GROUP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Relationship> getRelationships()
  {
    if (relationships == null)
    {
      relationships = new EObjectContainmentEList<Relationship>(Relationship.class, this, VisualizationDslPackage.RELATIONSHIP_GROUP__RELATIONSHIPS);
    }
    return relationships;
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
      case VisualizationDslPackage.RELATIONSHIP_GROUP__RELATIONSHIPS:
        return ((InternalEList<?>)getRelationships()).basicRemove(otherEnd, msgs);
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
      case VisualizationDslPackage.RELATIONSHIP_GROUP__RELATIONSHIPS:
        return getRelationships();
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
      case VisualizationDslPackage.RELATIONSHIP_GROUP__RELATIONSHIPS:
        getRelationships().clear();
        getRelationships().addAll((Collection<? extends Relationship>)newValue);
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
      case VisualizationDslPackage.RELATIONSHIP_GROUP__RELATIONSHIPS:
        getRelationships().clear();
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
      case VisualizationDslPackage.RELATIONSHIP_GROUP__RELATIONSHIPS:
        return relationships != null && !relationships.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //RelationshipGroupImpl
