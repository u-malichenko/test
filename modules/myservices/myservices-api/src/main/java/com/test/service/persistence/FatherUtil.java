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

package com.test.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.test.model.Father;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the father service. This utility wraps <code>com.test.service.persistence.impl.FatherPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FatherPersistence
 * @generated
 */
public class FatherUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Father father) {
		getPersistence().clearCache(father);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, Father> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Father> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Father> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Father> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Father> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Father update(Father father) {
		return getPersistence().update(father);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Father update(Father father, ServiceContext serviceContext) {
		return getPersistence().update(father, serviceContext);
	}

	/**
	 * Returns all the fathers where occupation = &#63;.
	 *
	 * @param occupation the occupation
	 * @return the matching fathers
	 */
	public static List<Father> findByOccupation(String occupation) {
		return getPersistence().findByOccupation(occupation);
	}

	/**
	 * Returns a range of all the fathers where occupation = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FatherModelImpl</code>.
	 * </p>
	 *
	 * @param occupation the occupation
	 * @param start the lower bound of the range of fathers
	 * @param end the upper bound of the range of fathers (not inclusive)
	 * @return the range of matching fathers
	 */
	public static List<Father> findByOccupation(
		String occupation, int start, int end) {

		return getPersistence().findByOccupation(occupation, start, end);
	}

	/**
	 * Returns an ordered range of all the fathers where occupation = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FatherModelImpl</code>.
	 * </p>
	 *
	 * @param occupation the occupation
	 * @param start the lower bound of the range of fathers
	 * @param end the upper bound of the range of fathers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching fathers
	 */
	public static List<Father> findByOccupation(
		String occupation, int start, int end,
		OrderByComparator<Father> orderByComparator) {

		return getPersistence().findByOccupation(
			occupation, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the fathers where occupation = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FatherModelImpl</code>.
	 * </p>
	 *
	 * @param occupation the occupation
	 * @param start the lower bound of the range of fathers
	 * @param end the upper bound of the range of fathers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching fathers
	 */
	public static List<Father> findByOccupation(
		String occupation, int start, int end,
		OrderByComparator<Father> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByOccupation(
			occupation, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first father in the ordered set where occupation = &#63;.
	 *
	 * @param occupation the occupation
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching father
	 * @throws NoSuchFatherException if a matching father could not be found
	 */
	public static Father findByOccupation_First(
			String occupation, OrderByComparator<Father> orderByComparator)
		throws com.test.exception.NoSuchFatherException {

		return getPersistence().findByOccupation_First(
			occupation, orderByComparator);
	}

	/**
	 * Returns the first father in the ordered set where occupation = &#63;.
	 *
	 * @param occupation the occupation
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching father, or <code>null</code> if a matching father could not be found
	 */
	public static Father fetchByOccupation_First(
		String occupation, OrderByComparator<Father> orderByComparator) {

		return getPersistence().fetchByOccupation_First(
			occupation, orderByComparator);
	}

	/**
	 * Returns the last father in the ordered set where occupation = &#63;.
	 *
	 * @param occupation the occupation
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching father
	 * @throws NoSuchFatherException if a matching father could not be found
	 */
	public static Father findByOccupation_Last(
			String occupation, OrderByComparator<Father> orderByComparator)
		throws com.test.exception.NoSuchFatherException {

		return getPersistence().findByOccupation_Last(
			occupation, orderByComparator);
	}

	/**
	 * Returns the last father in the ordered set where occupation = &#63;.
	 *
	 * @param occupation the occupation
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching father, or <code>null</code> if a matching father could not be found
	 */
	public static Father fetchByOccupation_Last(
		String occupation, OrderByComparator<Father> orderByComparator) {

		return getPersistence().fetchByOccupation_Last(
			occupation, orderByComparator);
	}

	/**
	 * Returns the fathers before and after the current father in the ordered set where occupation = &#63;.
	 *
	 * @param fid the primary key of the current father
	 * @param occupation the occupation
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next father
	 * @throws NoSuchFatherException if a father with the primary key could not be found
	 */
	public static Father[] findByOccupation_PrevAndNext(
			long fid, String occupation,
			OrderByComparator<Father> orderByComparator)
		throws com.test.exception.NoSuchFatherException {

		return getPersistence().findByOccupation_PrevAndNext(
			fid, occupation, orderByComparator);
	}

	/**
	 * Removes all the fathers where occupation = &#63; from the database.
	 *
	 * @param occupation the occupation
	 */
	public static void removeByOccupation(String occupation) {
		getPersistence().removeByOccupation(occupation);
	}

	/**
	 * Returns the number of fathers where occupation = &#63;.
	 *
	 * @param occupation the occupation
	 * @return the number of matching fathers
	 */
	public static int countByOccupation(String occupation) {
		return getPersistence().countByOccupation(occupation);
	}

	/**
	 * Caches the father in the entity cache if it is enabled.
	 *
	 * @param father the father
	 */
	public static void cacheResult(Father father) {
		getPersistence().cacheResult(father);
	}

	/**
	 * Caches the fathers in the entity cache if it is enabled.
	 *
	 * @param fathers the fathers
	 */
	public static void cacheResult(List<Father> fathers) {
		getPersistence().cacheResult(fathers);
	}

	/**
	 * Creates a new father with the primary key. Does not add the father to the database.
	 *
	 * @param fid the primary key for the new father
	 * @return the new father
	 */
	public static Father create(long fid) {
		return getPersistence().create(fid);
	}

	/**
	 * Removes the father with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param fid the primary key of the father
	 * @return the father that was removed
	 * @throws NoSuchFatherException if a father with the primary key could not be found
	 */
	public static Father remove(long fid)
		throws com.test.exception.NoSuchFatherException {

		return getPersistence().remove(fid);
	}

	public static Father updateImpl(Father father) {
		return getPersistence().updateImpl(father);
	}

	/**
	 * Returns the father with the primary key or throws a <code>NoSuchFatherException</code> if it could not be found.
	 *
	 * @param fid the primary key of the father
	 * @return the father
	 * @throws NoSuchFatherException if a father with the primary key could not be found
	 */
	public static Father findByPrimaryKey(long fid)
		throws com.test.exception.NoSuchFatherException {

		return getPersistence().findByPrimaryKey(fid);
	}

	/**
	 * Returns the father with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param fid the primary key of the father
	 * @return the father, or <code>null</code> if a father with the primary key could not be found
	 */
	public static Father fetchByPrimaryKey(long fid) {
		return getPersistence().fetchByPrimaryKey(fid);
	}

	/**
	 * Returns all the fathers.
	 *
	 * @return the fathers
	 */
	public static List<Father> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the fathers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FatherModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fathers
	 * @param end the upper bound of the range of fathers (not inclusive)
	 * @return the range of fathers
	 */
	public static List<Father> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the fathers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FatherModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fathers
	 * @param end the upper bound of the range of fathers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of fathers
	 */
	public static List<Father> findAll(
		int start, int end, OrderByComparator<Father> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the fathers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FatherModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fathers
	 * @param end the upper bound of the range of fathers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of fathers
	 */
	public static List<Father> findAll(
		int start, int end, OrderByComparator<Father> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the fathers from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of fathers.
	 *
	 * @return the number of fathers
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static FatherPersistence getPersistence() {
		return _persistence;
	}

	private static volatile FatherPersistence _persistence;

}