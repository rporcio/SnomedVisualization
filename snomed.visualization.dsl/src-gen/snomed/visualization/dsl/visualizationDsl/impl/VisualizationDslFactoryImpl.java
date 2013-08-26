/**
 */
package snomed.visualization.dsl.visualizationDsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import snomed.visualization.dsl.visualizationDsl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VisualizationDslFactoryImpl extends EFactoryImpl implements VisualizationDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static VisualizationDslFactory init()
  {
    try
    {
      VisualizationDslFactory theVisualizationDslFactory = (VisualizationDslFactory)EPackage.Registry.INSTANCE.getEFactory(VisualizationDslPackage.eNS_URI);
      if (theVisualizationDslFactory != null)
      {
        return theVisualizationDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new VisualizationDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VisualizationDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case VisualizationDslPackage.MODEL: return createModel();
      case VisualizationDslPackage.EXPRESSION: return createExpression();
      case VisualizationDslPackage.ISA_RELATIONSHIPS: return createIsaRelationships();
      case VisualizationDslPackage.RELATIONSHIP_GROUP: return createRelationshipGroup();
      case VisualizationDslPackage.RELATIONSHIPS: return createRelationships();
      case VisualizationDslPackage.RELATIONSHIP: return createRelationship();
      case VisualizationDslPackage.CONCEPT: return createConcept();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IsaRelationships createIsaRelationships()
  {
    IsaRelationshipsImpl isaRelationships = new IsaRelationshipsImpl();
    return isaRelationships;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RelationshipGroup createRelationshipGroup()
  {
    RelationshipGroupImpl relationshipGroup = new RelationshipGroupImpl();
    return relationshipGroup;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Relationships createRelationships()
  {
    RelationshipsImpl relationships = new RelationshipsImpl();
    return relationships;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Relationship createRelationship()
  {
    RelationshipImpl relationship = new RelationshipImpl();
    return relationship;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Concept createConcept()
  {
    ConceptImpl concept = new ConceptImpl();
    return concept;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VisualizationDslPackage getVisualizationDslPackage()
  {
    return (VisualizationDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static VisualizationDslPackage getPackage()
  {
    return VisualizationDslPackage.eINSTANCE;
  }

} //VisualizationDslFactoryImpl
