/**
 */
package snomed.visualization.dsl.visualizationDsl.impl;

import java.io.Serializable;
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
 *   <li>{@link snomed.visualization.dsl.visualizationDsl.impl.ExpressionImpl#getStandaloneRelationships <em>Standalone Relationships</em>}</li>
 *   <li>{@link snomed.visualization.dsl.visualizationDsl.impl.ExpressionImpl#getRelationshipGroups <em>Relationship Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExpressionImpl extends MinimalEObjectImpl.Container implements Expression, Serializable
{
	private static final long serialVersionUID = -3836226762748849833L;

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
   * The cached value of the '{@link #getStandaloneRelationships() <em>Standalone Relationships</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStandaloneRelationships()
   * @generated
   * @ordered
   */
  protected Relationships standaloneRelationships;

  /**
   * The cached value of the '{@link #getRelationshipGroups() <em>Relationship Groups</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelationshipGroups()
   * @generated
   * @ordered
   */
  protected EList<RelationshipGroup> relationshipGroups;

  /**
   * @generated NOT
   */
  private Concept concept;

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
  public Relationships getStandaloneRelationships()
  {
    return standaloneRelationships;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStandaloneRelationships(Relationships newStandaloneRelationships, NotificationChain msgs)
  {
    Relationships oldStandaloneRelationships = standaloneRelationships;
    standaloneRelationships = newStandaloneRelationships;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, VisualizationDslPackage.EXPRESSION__STANDALONE_RELATIONSHIPS, oldStandaloneRelationships, newStandaloneRelationships);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStandaloneRelationships(Relationships newStandaloneRelationships)
  {
    if (newStandaloneRelationships != standaloneRelationships)
    {
      NotificationChain msgs = null;
      if (standaloneRelationships != null)
        msgs = ((InternalEObject)standaloneRelationships).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - VisualizationDslPackage.EXPRESSION__STANDALONE_RELATIONSHIPS, null, msgs);
      if (newStandaloneRelationships != null)
        msgs = ((InternalEObject)newStandaloneRelationships).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - VisualizationDslPackage.EXPRESSION__STANDALONE_RELATIONSHIPS, null, msgs);
      msgs = basicSetStandaloneRelationships(newStandaloneRelationships, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, VisualizationDslPackage.EXPRESSION__STANDALONE_RELATIONSHIPS, newStandaloneRelationships, newStandaloneRelationships));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<RelationshipGroup> getRelationshipGroups()
  {
    if (relationshipGroups == null)
    {
      relationshipGroups = new EObjectContainmentEList<RelationshipGroup>(RelationshipGroup.class, this, VisualizationDslPackage.EXPRESSION__RELATIONSHIP_GROUPS);
    }
    return relationshipGroups;
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
      case VisualizationDslPackage.EXPRESSION__STANDALONE_RELATIONSHIPS:
        return basicSetStandaloneRelationships(null, msgs);
      case VisualizationDslPackage.EXPRESSION__RELATIONSHIP_GROUPS:
        return ((InternalEList<?>)getRelationshipGroups()).basicRemove(otherEnd, msgs);
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
      case VisualizationDslPackage.EXPRESSION__STANDALONE_RELATIONSHIPS:
        return getStandaloneRelationships();
      case VisualizationDslPackage.EXPRESSION__RELATIONSHIP_GROUPS:
        return getRelationshipGroups();
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
      case VisualizationDslPackage.EXPRESSION__STANDALONE_RELATIONSHIPS:
        setStandaloneRelationships((Relationships)newValue);
        return;
      case VisualizationDslPackage.EXPRESSION__RELATIONSHIP_GROUPS:
        getRelationshipGroups().clear();
        getRelationshipGroups().addAll((Collection<? extends RelationshipGroup>)newValue);
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
      case VisualizationDslPackage.EXPRESSION__STANDALONE_RELATIONSHIPS:
        setStandaloneRelationships((Relationships)null);
        return;
      case VisualizationDslPackage.EXPRESSION__RELATIONSHIP_GROUPS:
        getRelationshipGroups().clear();
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
      case VisualizationDslPackage.EXPRESSION__STANDALONE_RELATIONSHIPS:
        return standaloneRelationships != null;
      case VisualizationDslPackage.EXPRESSION__RELATIONSHIP_GROUPS:
        return relationshipGroups != null && !relationshipGroups.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * @generated NOT
   */
  @Override
  public Concept getConcept() {
	  return concept;
  }

  /**
   * @generated NOT
   */
  @Override
  public void setConcept(Concept value) {
	  this.concept = value;
  }

} //ExpressionImpl
