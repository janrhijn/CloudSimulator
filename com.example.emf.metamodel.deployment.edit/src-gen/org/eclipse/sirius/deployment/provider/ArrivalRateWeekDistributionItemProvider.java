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

import org.eclipse.sirius.deployment.ArrivalRateWeekDistribution;
import org.eclipse.sirius.deployment.DeploymentPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.sirius.deployment.ArrivalRateWeekDistribution} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ArrivalRateWeekDistributionItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrivalRateWeekDistributionItemProvider(AdapterFactory adapterFactory) {
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

			addMondayPropertyDescriptor(object);
			addTuesdayPropertyDescriptor(object);
			addWednesdayPropertyDescriptor(object);
			addThursdayPropertyDescriptor(object);
			addFridayPropertyDescriptor(object);
			addSaturdayPropertyDescriptor(object);
			addSundayPropertyDescriptor(object);
			addTotalPerWeekPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Monday feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMondayPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ArrivalRateWeekDistribution_Monday_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ArrivalRateWeekDistribution_Monday_feature",
						"_UI_ArrivalRateWeekDistribution_type"),
				DeploymentPackage.Literals.ARRIVAL_RATE_WEEK_DISTRIBUTION__MONDAY, true, false, false,
				ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Tuesday feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTuesdayPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ArrivalRateWeekDistribution_Tuesday_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ArrivalRateWeekDistribution_Tuesday_feature",
						"_UI_ArrivalRateWeekDistribution_type"),
				DeploymentPackage.Literals.ARRIVAL_RATE_WEEK_DISTRIBUTION__TUESDAY, true, false, false,
				ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Wednesday feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWednesdayPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ArrivalRateWeekDistribution_Wednesday_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ArrivalRateWeekDistribution_Wednesday_feature",
						"_UI_ArrivalRateWeekDistribution_type"),
				DeploymentPackage.Literals.ARRIVAL_RATE_WEEK_DISTRIBUTION__WEDNESDAY, true, false, false,
				ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Thursday feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addThursdayPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ArrivalRateWeekDistribution_Thursday_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ArrivalRateWeekDistribution_Thursday_feature",
						"_UI_ArrivalRateWeekDistribution_type"),
				DeploymentPackage.Literals.ARRIVAL_RATE_WEEK_DISTRIBUTION__THURSDAY, true, false, false,
				ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Friday feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFridayPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ArrivalRateWeekDistribution_Friday_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ArrivalRateWeekDistribution_Friday_feature",
						"_UI_ArrivalRateWeekDistribution_type"),
				DeploymentPackage.Literals.ARRIVAL_RATE_WEEK_DISTRIBUTION__FRIDAY, true, false, false,
				ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Saturday feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSaturdayPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ArrivalRateWeekDistribution_Saturday_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ArrivalRateWeekDistribution_Saturday_feature",
						"_UI_ArrivalRateWeekDistribution_type"),
				DeploymentPackage.Literals.ARRIVAL_RATE_WEEK_DISTRIBUTION__SATURDAY, true, false, false,
				ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Sunday feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSundayPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ArrivalRateWeekDistribution_Sunday_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ArrivalRateWeekDistribution_Sunday_feature",
						"_UI_ArrivalRateWeekDistribution_type"),
				DeploymentPackage.Literals.ARRIVAL_RATE_WEEK_DISTRIBUTION__SUNDAY, true, false, false,
				ItemPropertyDescriptor.REAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Total Per Week feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTotalPerWeekPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_ArrivalRateWeekDistribution_TotalPerWeek_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_ArrivalRateWeekDistribution_TotalPerWeek_feature",
						"_UI_ArrivalRateWeekDistribution_type"),
				DeploymentPackage.Literals.ARRIVAL_RATE_WEEK_DISTRIBUTION__TOTAL_PER_WEEK, true, false, false,
				ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns ArrivalRateWeekDistribution.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ArrivalRateWeekDistribution"));
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
		ArrivalRateWeekDistribution arrivalRateWeekDistribution = (ArrivalRateWeekDistribution) object;
		return getString("_UI_ArrivalRateWeekDistribution_type") + " " + arrivalRateWeekDistribution.getMonday();
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

		switch (notification.getFeatureID(ArrivalRateWeekDistribution.class)) {
		case DeploymentPackage.ARRIVAL_RATE_WEEK_DISTRIBUTION__MONDAY:
		case DeploymentPackage.ARRIVAL_RATE_WEEK_DISTRIBUTION__TUESDAY:
		case DeploymentPackage.ARRIVAL_RATE_WEEK_DISTRIBUTION__WEDNESDAY:
		case DeploymentPackage.ARRIVAL_RATE_WEEK_DISTRIBUTION__THURSDAY:
		case DeploymentPackage.ARRIVAL_RATE_WEEK_DISTRIBUTION__FRIDAY:
		case DeploymentPackage.ARRIVAL_RATE_WEEK_DISTRIBUTION__SATURDAY:
		case DeploymentPackage.ARRIVAL_RATE_WEEK_DISTRIBUTION__SUNDAY:
		case DeploymentPackage.ARRIVAL_RATE_WEEK_DISTRIBUTION__TOTAL_PER_WEEK:
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
