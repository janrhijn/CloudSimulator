/**
 */
package uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.provider;

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

import uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Component;
import uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.SoftwareSystemArchitectureFactory;
import uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.SoftwareSystemArchitecturePackage;

/**
 * This is the item provider adapter for a {@link uu.thesis.emf.metamodel.softwaresystemarchitecture.SoftwareSystemArchitecture.Component} object.
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

			addNamePropertyDescriptor(object);
			addContainsPropertyDescriptor(object);
			addPart_of_vpcPropertyDescriptor(object);
			addServer_durationPropertyDescriptor(object);
			addServer_unitPropertyDescriptor(object);
			addData_inPropertyDescriptor(object);
			addData_outPropertyDescriptor(object);
			addStorage_capacityPropertyDescriptor(object);
			addRequestPropertyDescriptor(object);
			addOperational_component_costPropertyDescriptor(object);
			addMax_waiting_timePropertyDescriptor(object);
			addData_processedPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
						SoftwareSystemArchitecturePackage.Literals.COMPONENT__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Contains feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContainsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Component_contains_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Component_contains_feature",
								"_UI_Component_type"),
						SoftwareSystemArchitecturePackage.Literals.COMPONENT__CONTAINS, true, false, true, null, null,
						null));
	}

	/**
	 * This adds a property descriptor for the Part of vpc feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPart_of_vpcPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Component_part_of_vpc_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Component_part_of_vpc_feature",
						"_UI_Component_type"),
				SoftwareSystemArchitecturePackage.Literals.COMPONENT__PART_OF_VPC, true, false, false,
				ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Server duration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addServer_durationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Component_server_duration_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Component_server_duration_feature",
						"_UI_Component_type"),
				SoftwareSystemArchitecturePackage.Literals.COMPONENT__SERVER_DURATION, true, false, false,
				ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Server unit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addServer_unitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Component_server_unit_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Component_server_unit_feature",
						"_UI_Component_type"),
				SoftwareSystemArchitecturePackage.Literals.COMPONENT__SERVER_UNIT, true, false, false,
				ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Data in feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addData_inPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Component_data_in_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Component_data_in_feature",
								"_UI_Component_type"),
						SoftwareSystemArchitecturePackage.Literals.COMPONENT__DATA_IN, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Data out feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addData_outPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Component_data_out_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Component_data_out_feature",
								"_UI_Component_type"),
						SoftwareSystemArchitecturePackage.Literals.COMPONENT__DATA_OUT, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Storage capacity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStorage_capacityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Component_storage_capacity_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Component_storage_capacity_feature",
						"_UI_Component_type"),
				SoftwareSystemArchitecturePackage.Literals.COMPONENT__STORAGE_CAPACITY, true, false, false,
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
						SoftwareSystemArchitecturePackage.Literals.COMPONENT__REQUEST, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Operational component cost feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOperational_component_costPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Component_operational_component_cost_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_Component_operational_component_cost_feature", "_UI_Component_type"),
						SoftwareSystemArchitecturePackage.Literals.COMPONENT__OPERATIONAL_COMPONENT_COST, true, false,
						false, ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Max waiting time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMax_waiting_timePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Component_max_waiting_time_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Component_max_waiting_time_feature",
						"_UI_Component_type"),
				SoftwareSystemArchitecturePackage.Literals.COMPONENT__MAX_WAITING_TIME, true, false, false,
				ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Data processed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addData_processedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_Component_data_processed_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_Component_data_processed_feature",
						"_UI_Component_type"),
				SoftwareSystemArchitecturePackage.Literals.COMPONENT__DATA_PROCESSED, true, false, false,
				ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
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
			childrenFeatures.add(SoftwareSystemArchitecturePackage.Literals.COMPONENT__CAPABILITY);
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
		case SoftwareSystemArchitecturePackage.COMPONENT__NAME:
		case SoftwareSystemArchitecturePackage.COMPONENT__PART_OF_VPC:
		case SoftwareSystemArchitecturePackage.COMPONENT__SERVER_DURATION:
		case SoftwareSystemArchitecturePackage.COMPONENT__SERVER_UNIT:
		case SoftwareSystemArchitecturePackage.COMPONENT__DATA_IN:
		case SoftwareSystemArchitecturePackage.COMPONENT__DATA_OUT:
		case SoftwareSystemArchitecturePackage.COMPONENT__STORAGE_CAPACITY:
		case SoftwareSystemArchitecturePackage.COMPONENT__REQUEST:
		case SoftwareSystemArchitecturePackage.COMPONENT__OPERATIONAL_COMPONENT_COST:
		case SoftwareSystemArchitecturePackage.COMPONENT__MAX_WAITING_TIME:
		case SoftwareSystemArchitecturePackage.COMPONENT__DATA_PROCESSED:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case SoftwareSystemArchitecturePackage.COMPONENT__CAPABILITY:
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

		newChildDescriptors.add(createChildParameter(SoftwareSystemArchitecturePackage.Literals.COMPONENT__CAPABILITY,
				SoftwareSystemArchitectureFactory.eINSTANCE.createPricing_Function()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return MetamodelEditPlugin.INSTANCE;
	}

}
