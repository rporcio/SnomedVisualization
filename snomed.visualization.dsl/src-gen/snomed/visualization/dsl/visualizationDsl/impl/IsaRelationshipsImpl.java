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

import snomed.visualization.dsl.visualizationDsl.Concept;
import snomed.visualization.dsl.visualizationDsl.IsaRelationships;
import snomed.visualization.dsl.visualizationDsl.VisualizationDslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Isa Relationships</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link snomed.visualization.dsl.visualizationDsl.impl.IsaRelationshipsImpl#getRelationships <em>Relationships</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IsaRelationshipsImpl extends MinimalEObjectImpl.Container implements IsaRelationships
{
  /**
   * The cached value of the '{@link #getRelationships() <em>Relationships</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelationships()
   * @generated
   * @ordered
   */
  protected EList<Concept> relationships;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IsaRelationshipsImpl()
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
    return VisualizationDslPackage.Literals.ISA_RELATIONSHIPS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Concept> getRelationships()
  {
    if (relationships == null)
    {
      relationships = new EObjectContainmentEList<Concept>(Concept.class, this, VisualizationDslPackage.ISA_RELATIONSHIPS__RELATIONSHIPS);
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
      case VisualizationDslPackage.ISA_RELATIONSHIPS__RELATIONSHIPS:
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
      case VisualizationDslPackage.ISA_RELATIONSHIPS__RELATIONSHIPS:
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
      case VisualizationDslPackage.ISA_RELATIONSHIPS__RELATIONSHIPS:
        getRelationships().clear();
        getRelationships().addAll((Collection<? extends Concept>)newValue);
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
      case VisualizationDslPackage.ISA_RELATIONSHIPS__RELATIONSHIPS:
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
      case VisualizationDslPackage.ISA_RELATIONSHIPS__RELATIONSHIPS:
        return relationships != null && !relationships.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //IsaRelationshipsImpl
