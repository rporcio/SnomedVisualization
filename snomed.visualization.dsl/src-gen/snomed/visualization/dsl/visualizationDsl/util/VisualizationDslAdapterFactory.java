/**
 */
package snomed.visualization.dsl.visualizationDsl.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import snomed.visualization.dsl.visualizationDsl.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see snomed.visualization.dsl.visualizationDsl.VisualizationDslPackage
 * @generated
 */
public class VisualizationDslAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static VisualizationDslPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VisualizationDslAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = VisualizationDslPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VisualizationDslSwitch<Adapter> modelSwitch =
    new VisualizationDslSwitch<Adapter>()
    {
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseIsaRelationships(IsaRelationships object)
      {
        return createIsaRelationshipsAdapter();
      }
      @Override
      public Adapter caseRelationshipGroup(RelationshipGroup object)
      {
        return createRelationshipGroupAdapter();
      }
      @Override
      public Adapter caseRelationships(Relationships object)
      {
        return createRelationshipsAdapter();
      }
      @Override
      public Adapter caseRelationship(Relationship object)
      {
        return createRelationshipAdapter();
      }
      @Override
      public Adapter caseConcept(Concept object)
      {
        return createConceptAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link snomed.visualization.dsl.visualizationDsl.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see snomed.visualization.dsl.visualizationDsl.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link snomed.visualization.dsl.visualizationDsl.IsaRelationships <em>Isa Relationships</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see snomed.visualization.dsl.visualizationDsl.IsaRelationships
   * @generated
   */
  public Adapter createIsaRelationshipsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link snomed.visualization.dsl.visualizationDsl.RelationshipGroup <em>Relationship Group</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see snomed.visualization.dsl.visualizationDsl.RelationshipGroup
   * @generated
   */
  public Adapter createRelationshipGroupAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link snomed.visualization.dsl.visualizationDsl.Relationships <em>Relationships</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see snomed.visualization.dsl.visualizationDsl.Relationships
   * @generated
   */
  public Adapter createRelationshipsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link snomed.visualization.dsl.visualizationDsl.Relationship <em>Relationship</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see snomed.visualization.dsl.visualizationDsl.Relationship
   * @generated
   */
  public Adapter createRelationshipAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link snomed.visualization.dsl.visualizationDsl.Concept <em>Concept</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see snomed.visualization.dsl.visualizationDsl.Concept
   * @generated
   */
  public Adapter createConceptAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //VisualizationDslAdapterFactory
