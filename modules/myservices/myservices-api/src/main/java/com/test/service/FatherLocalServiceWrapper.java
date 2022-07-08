/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.test.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link FatherLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see FatherLocalService
 * @generated
 */
public class FatherLocalServiceWrapper
	implements FatherLocalService, ServiceWrapper<FatherLocalService> {

	public FatherLocalServiceWrapper() {
		this(null);
	}

	public FatherLocalServiceWrapper(FatherLocalService fatherLocalService) {
		_fatherLocalService = fatherLocalService;
	}

	/**
	 * Adds the father to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FatherLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param father the father
	 * @return the father that was added
	 */
	@Override
	public com.test.model.Father addFather(com.test.model.Father father) {
		return _fatherLocalService.addFather(father);
	}

	/**
	 * Creates a new father with the primary key. Does not add the father to the database.
	 *
	 * @param fid the primary key for the new father
	 * @return the new father
	 */
	@Override
	public com.test.model.Father createFather(long fid) {
		return _fatherLocalService.createFather(fid);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fatherLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the father from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FatherLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param father the father
	 * @return the father that was removed
	 */
	@Override
	public com.test.model.Father deleteFather(com.test.model.Father father) {
		return _fatherLocalService.deleteFather(father);
	}

	/**
	 * Deletes the father with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FatherLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param fid the primary key of the father
	 * @return the father that was removed
	 * @throws PortalException if a father with the primary key could not be found
	 */
	@Override
	public com.test.model.Father deleteFather(long fid)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fatherLocalService.deleteFather(fid);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fatherLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _fatherLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _fatherLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _fatherLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _fatherLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.test.model.impl.FatherModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _fatherLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.test.model.impl.FatherModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _fatherLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _fatherLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _fatherLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.test.model.Father fetchFather(long fid) {
		return _fatherLocalService.fetchFather(fid);
	}

	@Override
	public java.util.List<com.test.model.Father> findByOccupation(
		String occupation) {

		return _fatherLocalService.findByOccupation(occupation);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _fatherLocalService.getActionableDynamicQuery();
	}

	/**
	 * Returns the father with the primary key.
	 *
	 * @param fid the primary key of the father
	 * @return the father
	 * @throws PortalException if a father with the primary key could not be found
	 */
	@Override
	public com.test.model.Father getFather(long fid)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fatherLocalService.getFather(fid);
	}

	@Override
	public java.util.List<com.test.model.Father> getFatherByOccupation(
		String occupation) {

		return _fatherLocalService.getFatherByOccupation(occupation);
	}

	/**
	 * Returns a range of all the fathers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.test.model.impl.FatherModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fathers
	 * @param end the upper bound of the range of fathers (not inclusive)
	 * @return the range of fathers
	 */
	@Override
	public java.util.List<com.test.model.Father> getFathers(
		int start, int end) {

		return _fatherLocalService.getFathers(start, end);
	}

	/**
	 * Returns the number of fathers.
	 *
	 * @return the number of fathers
	 */
	@Override
	public int getFathersCount() {
		return _fatherLocalService.getFathersCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _fatherLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _fatherLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _fatherLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the father in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect FatherLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param father the father
	 * @return the father that was updated
	 */
	@Override
	public com.test.model.Father updateFather(com.test.model.Father father) {
		return _fatherLocalService.updateFather(father);
	}

	@Override
	public FatherLocalService getWrappedService() {
		return _fatherLocalService;
	}

	@Override
	public void setWrappedService(FatherLocalService fatherLocalService) {
		_fatherLocalService = fatherLocalService;
	}

	private FatherLocalService _fatherLocalService;

}