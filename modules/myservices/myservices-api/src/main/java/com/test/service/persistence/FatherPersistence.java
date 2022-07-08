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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.test.exception.NoSuchFatherException;
import com.test.model.Father;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the father service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FatherUtil
 * @generated
 */
@ProviderType
public interface FatherPersistence extends BasePersistence<Father> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link FatherUtil} to access the father persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the fathers where occupation = &#63;.
	 *
	 * @param occupation the occupation
	 * @return the matching fathers
	 */
	public java.util.List<Father> findByOccupation(String occupation);

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
	public java.util.List<Father> findByOccupation(
		String occupation, int start, int end);

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
	public java.util.List<Father> findByOccupation(
		String occupation, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Father>
			orderByComparator);

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
	public java.util.List<Father> findByOccupation(
		String occupation, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Father>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first father in the ordered set where occupation = &#63;.
	 *
	 * @param occupation the occupation
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching father
	 * @throws NoSuchFatherException if a matching father could not be found
	 */
	public Father findByOccupation_First(
			String occupation,
			com.liferay.portal.kernel.util.OrderByComparator<Father>
				orderByComparator)
		throws NoSuchFatherException;

	/**
	 * Returns the first father in the ordered set where occupation = &#63;.
	 *
	 * @param occupation the occupation
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching father, or <code>null</code> if a matching father could not be found
	 */
	public Father fetchByOccupation_First(
		String occupation,
		com.liferay.portal.kernel.util.OrderByComparator<Father>
			orderByComparator);

	/**
	 * Returns the last father in the ordered set where occupation = &#63;.
	 *
	 * @param occupation the occupation
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching father
	 * @throws NoSuchFatherException if a matching father could not be found
	 */
	public Father findByOccupation_Last(
			String occupation,
			com.liferay.portal.kernel.util.OrderByComparator<Father>
				orderByComparator)
		throws NoSuchFatherException;

	/**
	 * Returns the last father in the ordered set where occupation = &#63;.
	 *
	 * @param occupation the occupation
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching father, or <code>null</code> if a matching father could not be found
	 */
	public Father fetchByOccupation_Last(
		String occupation,
		com.liferay.portal.kernel.util.OrderByComparator<Father>
			orderByComparator);

	/**
	 * Returns the fathers before and after the current father in the ordered set where occupation = &#63;.
	 *
	 * @param fid the primary key of the current father
	 * @param occupation the occupation
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next father
	 * @throws NoSuchFatherException if a father with the primary key could not be found
	 */
	public Father[] findByOccupation_PrevAndNext(
			long fid, String occupation,
			com.liferay.portal.kernel.util.OrderByComparator<Father>
				orderByComparator)
		throws NoSuchFatherException;

	/**
	 * Removes all the fathers where occupation = &#63; from the database.
	 *
	 * @param occupation the occupation
	 */
	public void removeByOccupation(String occupation);

	/**
	 * Returns the number of fathers where occupation = &#63;.
	 *
	 * @param occupation the occupation
	 * @return the number of matching fathers
	 */
	public int countByOccupation(String occupation);

	/**
	 * Caches the father in the entity cache if it is enabled.
	 *
	 * @param father the father
	 */
	public void cacheResult(Father father);

	/**
	 * Caches the fathers in the entity cache if it is enabled.
	 *
	 * @param fathers the fathers
	 */
	public void cacheResult(java.util.List<Father> fathers);

	/**
	 * Creates a new father with the primary key. Does not add the father to the database.
	 *
	 * @param fid the primary key for the new father
	 * @return the new father
	 */
	public Father create(long fid);

	/**
	 * Removes the father with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param fid the primary key of the father
	 * @return the father that was removed
	 * @throws NoSuchFatherException if a father with the primary key could not be found
	 */
	public Father remove(long fid) throws NoSuchFatherException;

	public Father updateImpl(Father father);

	/**
	 * Returns the father with the primary key or throws a <code>NoSuchFatherException</code> if it could not be found.
	 *
	 * @param fid the primary key of the father
	 * @return the father
	 * @throws NoSuchFatherException if a father with the primary key could not be found
	 */
	public Father findByPrimaryKey(long fid) throws NoSuchFatherException;

	/**
	 * Returns the father with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param fid the primary key of the father
	 * @return the father, or <code>null</code> if a father with the primary key could not be found
	 */
	public Father fetchByPrimaryKey(long fid);

	/**
	 * Returns all the fathers.
	 *
	 * @return the fathers
	 */
	public java.util.List<Father> findAll();

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
	public java.util.List<Father> findAll(int start, int end);

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
	public java.util.List<Father> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Father>
			orderByComparator);

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
	public java.util.List<Father> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Father>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the fathers from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of fathers.
	 *
	 * @return the number of fathers
	 */
	public int countAll();

}