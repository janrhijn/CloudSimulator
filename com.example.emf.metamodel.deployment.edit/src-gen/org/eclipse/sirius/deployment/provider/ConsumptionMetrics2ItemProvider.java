/**
 */
package org.eclipse.sirius.deployment.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

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

import org.eclipse.sirius.deployment.ConsumptionMetrics2;
import org.eclipse.sirius.deployment.DeploymentPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.sirius.deployment.ConsumptionMetrics2} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConsumptionMetrics2ItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConsumptionMetrics2ItemProvider(AdapterFactory adapterFactory) {
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

			addServerTimePropertyDescriptor(object);
			addServerUnitTimePropertyDescriptor(object);
			addDataInPropertyDescriptor(object);
			addDataOutPropertyDescriptor(object);
			addStorageCapacityPropertyDescriptor(object);
			addRequestPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Server Time feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addServerTimePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ConsumptionMetrics2_ServerTime_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ConsumptionMetrics2_ServerTime_feature",
						"_UI_ConsumptionMetrics2_type"),
				DeploymentPackage.Literals.CONSUMPTION_METRICS2__SERVER_TIME, true, false, false,
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
						getResourceLocator(), getString("_UI_ConsumptionMetrics2_ServerUnitTime_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_ConsumptionMetrics2_ServerUnitTime_feature", "_UI_ConsumptionMetrics2_type"),
						DeploymentPackage.Literals.CONSUMPTION_METRICS2__SERVER_UNIT_TIME, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Data In feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataInPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ConsumptionMetrics2_DataIn_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ConsumptionMetrics2_DataIn_feature",
						"_UI_ConsumptionMetrics2_type"),
				DeploymentPackage.Literals.CONSUMPTION_METRICS2__DATA_IN, true, false, false,
				ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Data Out feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataOutPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ConsumptionMetrics2_DataOut_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ConsumptionMetrics2_DataOut_feature",
						"_UI_ConsumptionMetrics2_type"),
				DeploymentPackage.Literals.CONSUMPTION_METRICS2__DATA_OUT, true, false, false,
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
						getResourceLocator(), getString("_UI_ConsumptionMetrics2_StorageCapacity_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_ConsumptionMetrics2_StorageCapacity_feature", "_UI_ConsumptionMetrics2_type"),
						DeploymentPackage.Literals.CONSUMPTION_METRICS2__STORAGE_CAPACITY, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Request feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRequestPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ConsumptionMetrics2_Request_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ConsumptionMetrics2_Request_feature",
						"_UI_ConsumptionMetrics2_type"),
				DeploymentPackage.Literals.CONSUMPTION_METRICS2__REQUEST, true, false, false,
				ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns ConsumptionMetrics2.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ConsumptionMetrics2"));
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
		ConsumptionMetrics2 consumptionMetrics2 = (ConsumptionMetrics2) object;
		return getString("_UI_ConsumptionMetrics2_type") + " " + consumptionMetrics2.getServerTime();
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

		switch (notification.getFeatureID(ConsumptionMetrics2.class)) {
		case DeploymentPackage.CONSUMPTION_METRICS2__SERVER_TIME:
		case DeploymentPackage.CONSUMPTION_METRICS2__SERVER_UNIT_TIME:
		case DeploymentPackage.CONSUMPTION_METRICS2__DATA_IN:
		case DeploymentPackage.CONSUMPTION_METRICS2__DATA_OUT:
		case DeploymentPackage.CONSUMPTION_METRICS2__STORAGE_CAPACITY:
		case DeploymentPackage.CONSUMPTION_METRICS2__REQUEST:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
