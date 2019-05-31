/**
 */
package org.eclipse.sirius.deployment.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.sirius.deployment.Component;
import org.eclipse.sirius.deployment.DeploymentFactory;
import org.eclipse.sirius.deployment.DeploymentPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.sirius.deployment.Component} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ComponentItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addPricingschemePropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addServiceLevelPropertyDescriptor(object);
			addServerDurationPropertyDescriptor(object);
			addServerUnitTimePropertyDescriptor(object);
			addDataInPropertyDescriptor(object);
			addDataOutPropertyDescriptor(object);
			addStorageCapacityPropertyDescriptor(object);
			addRequestPropertyDescriptor(object);
			addOperationalComponentCostPropertyDescriptor(object);
			addDeployedUnitsPropertyDescriptor(object);
			addMaxWaitingTimePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Pricingscheme feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPricingschemePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Component_pricingscheme_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Component_pricingscheme_feature",
								"_UI_Component_type"),
						DeploymentPackage.Literals.COMPONENT__PRICINGSCHEME, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Component_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Component_name_feature",
								"_UI_Component_type"),
						DeploymentPackage.Literals.COMPONENT__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Service Level feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addServiceLevelPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Component_serviceLevel_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Component_serviceLevel_feature",
								"_UI_Component_type"),
						DeploymentPackage.Literals.COMPONENT__SERVICE_LEVEL, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Server Duration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addServerDurationPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Component_serverDuration_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Component_serverDuration_feature",
								"_UI_Component_type"),
						DeploymentPackage.Literals.COMPONENT__SERVER_DURATION, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Server Unit Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addServerUnitTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Component_serverUnitTime_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Component_serverUnitTime_feature",
								"_UI_Component_type"),
						DeploymentPackage.Literals.COMPONENT__SERVER_UNIT_TIME, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Data In feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataInPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Component_dataIn_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Component_dataIn_feature",
								"_UI_Component_type"),
						DeploymentPackage.Literals.COMPONENT__DATA_IN, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Data Out feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataOutPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Component_dataOut_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Component_dataOut_feature",
								"_UI_Component_type"),
						DeploymentPackage.Literals.COMPONENT__DATA_OUT, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Storage Capacity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStorageCapacityPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Component_storageCapacity_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Component_storageCapacity_feature",
								"_UI_Component_type"),
						DeploymentPackage.Literals.COMPONENT__STORAGE_CAPACITY, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Request feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRequestPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Component_request_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Component_request_feature",
								"_UI_Component_type"),
						DeploymentPackage.Literals.COMPONENT__REQUEST, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Operational Component Cost feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOperationalComponentCostPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Component_operationalComponentCost_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Component_operationalComponentCost_feature",
						"_UI_Component_type"),
				DeploymentPackage.Literals.COMPONENT__OPERATIONAL_COMPONENT_COST, true, false, false,
				ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Deployed Units feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDeployedUnitsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Component_deployedUnits_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Component_deployedUnits_feature",
								"_UI_Component_type"),
						DeploymentPackage.Literals.COMPONENT__DEPLOYED_UNITS, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Max Waiting Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxWaitingTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Component_maxWaitingTime_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Component_maxWaitingTime_feature",
								"_UI_Component_type"),
						DeploymentPackage.Literals.COMPONENT__MAX_WAITING_TIME, true, false, false,
						ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(DeploymentPackage.Literals.COMPONENT__CONTAINS);
			childrenFeatures.add(DeploymentPackage.Literals.COMPONENT__PRICINGSCHEME);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Component.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Component"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Component) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Component_type")
				: getString("_UI_Component_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Component.class)) {
		case DeploymentPackage.COMPONENT__NAME:
		case DeploymentPackage.COMPONENT__SERVICE_LEVEL:
		case DeploymentPackage.COMPONENT__SERVER_DURATION:
		case DeploymentPackage.COMPONENT__SERVER_UNIT_TIME:
		case DeploymentPackage.COMPONENT__DATA_IN:
		case DeploymentPackage.COMPONENT__DATA_OUT:
		case DeploymentPackage.COMPONENT__STORAGE_CAPACITY:
		case DeploymentPackage.COMPONENT__REQUEST:
		case DeploymentPackage.COMPONENT__OPERATIONAL_COMPONENT_COST:
		case DeploymentPackage.COMPONENT__DEPLOYED_UNITS:
		case DeploymentPackage.COMPONENT__MAX_WAITING_TIME:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case DeploymentPackage.COMPONENT__CONTAINS:
		case DeploymentPackage.COMPONENT__PRICINGSCHEME:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(DeploymentPackage.Literals.COMPONENT__CONTAINS,
				DeploymentFactory.eINSTANCE.createCompute()));

		newChildDescriptors.add(createChildParameter(DeploymentPackage.Literals.COMPONENT__CONTAINS,
				DeploymentFactory.eINSTANCE.createConnector()));

		newChildDescriptors.add(createChildParameter(DeploymentPackage.Literals.COMPONENT__CONTAINS,
				DeploymentFactory.eINSTANCE.createStorage()));

		newChildDescriptors.add(createChildParameter(DeploymentPackage.Literals.COMPONENT__PRICINGSCHEME,
				DeploymentFactory.eINSTANCE.createPricingFunction()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return DeploymentEditPlugin.INSTANCE;
	}

}
