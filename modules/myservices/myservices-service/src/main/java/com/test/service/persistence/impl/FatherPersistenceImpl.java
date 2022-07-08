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

package com.test.service.persistence.impl;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;

import com.test.exception.NoSuchFatherException;
import com.test.model.Father;
import com.test.model.FatherTable;
import com.test.model.impl.FatherImpl;
import com.test.model.impl.FatherModelImpl;
import com.test.service.persistence.FatherPersistence;
import com.test.service.persistence.FatherUtil;
import com.test.service.persistence.impl.constants.FirstPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the father service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = {FatherPersistence.class, BasePersistence.class})
public class FatherPersistenceImpl
	extends BasePersistenceImpl<Father> implements FatherPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>FatherUtil</code> to access the father persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		FatherImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByOccupation;
	private FinderPath _finderPathWithoutPaginationFindByOccupation;
	private FinderPath _finderPathCountByOccupation;

	/**
	 * Returns all the fathers where occupation = &#63;.
	 *
	 * @param occupation the occupation
	 * @return the matching fathers
	 */
	@Override
	public List<Father> findByOccupation(String occupation) {
		return findByOccupation(
			occupation, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Father> findByOccupation(
		String occupation, int start, int end) {

		return findByOccupation(occupation, start, end, null);
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
	@Override
	public List<Father> findByOccupation(
		String occupation, int start, int end,
		OrderByComparator<Father> orderByComparator) {

		return findByOccupation(
			occupation, start, end, orderByComparator, true);
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
	@Override
	public List<Father> findByOccupation(
		String occupation, int start, int end,
		OrderByComparator<Father> orderByComparator, boolean useFinderCache) {

		occupation = Objects.toString(occupation, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByOccupation;
				finderArgs = new Object[] {occupation};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByOccupation;
			finderArgs = new Object[] {
				occupation, start, end, orderByComparator
			};
		}

		List<Father> list = null;

		if (useFinderCache) {
			list = (List<Father>)finderCache.getResult(finderPath, finderArgs);

			if ((list != null) && !list.isEmpty()) {
				for (Father father : list) {
					if (!occupation.equals(father.getOccupation())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_FATHER_WHERE);

			boolean bindOccupation = false;

			if (occupation.isEmpty()) {
				sb.append(_FINDER_COLUMN_OCCUPATION_OCCUPATION_3);
			}
			else {
				bindOccupation = true;

				sb.append(_FINDER_COLUMN_OCCUPATION_OCCUPATION_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(FatherModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindOccupation) {
					queryPos.add(occupation);
				}

				list = (List<Father>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first father in the ordered set where occupation = &#63;.
	 *
	 * @param occupation the occupation
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching father
	 * @throws NoSuchFatherException if a matching father could not be found
	 */
	@Override
	public Father findByOccupation_First(
			String occupation, OrderByComparator<Father> orderByComparator)
		throws NoSuchFatherException {

		Father father = fetchByOccupation_First(occupation, orderByComparator);

		if (father != null) {
			return father;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("occupation=");
		sb.append(occupation);

		sb.append("}");

		throw new NoSuchFatherException(sb.toString());
	}

	/**
	 * Returns the first father in the ordered set where occupation = &#63;.
	 *
	 * @param occupation the occupation
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching father, or <code>null</code> if a matching father could not be found
	 */
	@Override
	public Father fetchByOccupation_First(
		String occupation, OrderByComparator<Father> orderByComparator) {

		List<Father> list = findByOccupation(
			occupation, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last father in the ordered set where occupation = &#63;.
	 *
	 * @param occupation the occupation
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching father
	 * @throws NoSuchFatherException if a matching father could not be found
	 */
	@Override
	public Father findByOccupation_Last(
			String occupation, OrderByComparator<Father> orderByComparator)
		throws NoSuchFatherException {

		Father father = fetchByOccupation_Last(occupation, orderByComparator);

		if (father != null) {
			return father;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("occupation=");
		sb.append(occupation);

		sb.append("}");

		throw new NoSuchFatherException(sb.toString());
	}

	/**
	 * Returns the last father in the ordered set where occupation = &#63;.
	 *
	 * @param occupation the occupation
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching father, or <code>null</code> if a matching father could not be found
	 */
	@Override
	public Father fetchByOccupation_Last(
		String occupation, OrderByComparator<Father> orderByComparator) {

		int count = countByOccupation(occupation);

		if (count == 0) {
			return null;
		}

		List<Father> list = findByOccupation(
			occupation, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
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
	@Override
	public Father[] findByOccupation_PrevAndNext(
			long fid, String occupation,
			OrderByComparator<Father> orderByComparator)
		throws NoSuchFatherException {

		occupation = Objects.toString(occupation, "");

		Father father = findByPrimaryKey(fid);

		Session session = null;

		try {
			session = openSession();

			Father[] array = new FatherImpl[3];

			array[0] = getByOccupation_PrevAndNext(
				session, father, occupation, orderByComparator, true);

			array[1] = father;

			array[2] = getByOccupation_PrevAndNext(
				session, father, occupation, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Father getByOccupation_PrevAndNext(
		Session session, Father father, String occupation,
		OrderByComparator<Father> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_FATHER_WHERE);

		boolean bindOccupation = false;

		if (occupation.isEmpty()) {
			sb.append(_FINDER_COLUMN_OCCUPATION_OCCUPATION_3);
		}
		else {
			bindOccupation = true;

			sb.append(_FINDER_COLUMN_OCCUPATION_OCCUPATION_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(FatherModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindOccupation) {
			queryPos.add(occupation);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(father)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<Father> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the fathers where occupation = &#63; from the database.
	 *
	 * @param occupation the occupation
	 */
	@Override
	public void removeByOccupation(String occupation) {
		for (Father father :
				findByOccupation(
					occupation, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(father);
		}
	}

	/**
	 * Returns the number of fathers where occupation = &#63;.
	 *
	 * @param occupation the occupation
	 * @return the number of matching fathers
	 */
	@Override
	public int countByOccupation(String occupation) {
		occupation = Objects.toString(occupation, "");

		FinderPath finderPath = _finderPathCountByOccupation;

		Object[] finderArgs = new Object[] {occupation};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FATHER_WHERE);

			boolean bindOccupation = false;

			if (occupation.isEmpty()) {
				sb.append(_FINDER_COLUMN_OCCUPATION_OCCUPATION_3);
			}
			else {
				bindOccupation = true;

				sb.append(_FINDER_COLUMN_OCCUPATION_OCCUPATION_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindOccupation) {
					queryPos.add(occupation);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_OCCUPATION_OCCUPATION_2 =
		"father.occupation = ?";

	private static final String _FINDER_COLUMN_OCCUPATION_OCCUPATION_3 =
		"(father.occupation IS NULL OR father.occupation = '')";

	public FatherPersistenceImpl() {
		setModelClass(Father.class);

		setModelImplClass(FatherImpl.class);
		setModelPKClass(long.class);

		setTable(FatherTable.INSTANCE);
	}

	/**
	 * Caches the father in the entity cache if it is enabled.
	 *
	 * @param father the father
	 */
	@Override
	public void cacheResult(Father father) {
		entityCache.putResult(FatherImpl.class, father.getPrimaryKey(), father);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the fathers in the entity cache if it is enabled.
	 *
	 * @param fathers the fathers
	 */
	@Override
	public void cacheResult(List<Father> fathers) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (fathers.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (Father father : fathers) {
			if (entityCache.getResult(
					FatherImpl.class, father.getPrimaryKey()) == null) {

				cacheResult(father);
			}
		}
	}

	/**
	 * Clears the cache for all fathers.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(FatherImpl.class);

		finderCache.clearCache(FatherImpl.class);
	}

	/**
	 * Clears the cache for the father.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Father father) {
		entityCache.removeResult(FatherImpl.class, father);
	}

	@Override
	public void clearCache(List<Father> fathers) {
		for (Father father : fathers) {
			entityCache.removeResult(FatherImpl.class, father);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FatherImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(FatherImpl.class, primaryKey);
		}
	}

	/**
	 * Creates a new father with the primary key. Does not add the father to the database.
	 *
	 * @param fid the primary key for the new father
	 * @return the new father
	 */
	@Override
	public Father create(long fid) {
		Father father = new FatherImpl();

		father.setNew(true);
		father.setPrimaryKey(fid);

		return father;
	}

	/**
	 * Removes the father with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param fid the primary key of the father
	 * @return the father that was removed
	 * @throws NoSuchFatherException if a father with the primary key could not be found
	 */
	@Override
	public Father remove(long fid) throws NoSuchFatherException {
		return remove((Serializable)fid);
	}

	/**
	 * Removes the father with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the father
	 * @return the father that was removed
	 * @throws NoSuchFatherException if a father with the primary key could not be found
	 */
	@Override
	public Father remove(Serializable primaryKey) throws NoSuchFatherException {
		Session session = null;

		try {
			session = openSession();

			Father father = (Father)session.get(FatherImpl.class, primaryKey);

			if (father == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFatherException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(father);
		}
		catch (NoSuchFatherException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Father removeImpl(Father father) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(father)) {
				father = (Father)session.get(
					FatherImpl.class, father.getPrimaryKeyObj());
			}

			if (father != null) {
				session.delete(father);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (father != null) {
			clearCache(father);
		}

		return father;
	}

	@Override
	public Father updateImpl(Father father) {
		boolean isNew = father.isNew();

		if (!(father instanceof FatherModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(father.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(father);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in father proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom Father implementation " +
					father.getClass());
		}

		FatherModelImpl fatherModelImpl = (FatherModelImpl)father;

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(father);
			}
			else {
				father = (Father)session.merge(father);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(FatherImpl.class, fatherModelImpl, false, true);

		if (isNew) {
			father.setNew(false);
		}

		father.resetOriginalValues();

		return father;
	}

	/**
	 * Returns the father with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the father
	 * @return the father
	 * @throws NoSuchFatherException if a father with the primary key could not be found
	 */
	@Override
	public Father findByPrimaryKey(Serializable primaryKey)
		throws NoSuchFatherException {

		Father father = fetchByPrimaryKey(primaryKey);

		if (father == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchFatherException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return father;
	}

	/**
	 * Returns the father with the primary key or throws a <code>NoSuchFatherException</code> if it could not be found.
	 *
	 * @param fid the primary key of the father
	 * @return the father
	 * @throws NoSuchFatherException if a father with the primary key could not be found
	 */
	@Override
	public Father findByPrimaryKey(long fid) throws NoSuchFatherException {
		return findByPrimaryKey((Serializable)fid);
	}

	/**
	 * Returns the father with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param fid the primary key of the father
	 * @return the father, or <code>null</code> if a father with the primary key could not be found
	 */
	@Override
	public Father fetchByPrimaryKey(long fid) {
		return fetchByPrimaryKey((Serializable)fid);
	}

	/**
	 * Returns all the fathers.
	 *
	 * @return the fathers
	 */
	@Override
	public List<Father> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	@Override
	public List<Father> findAll(int start, int end) {
		return findAll(start, end, null);
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
	@Override
	public List<Father> findAll(
		int start, int end, OrderByComparator<Father> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
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
	@Override
	public List<Father> findAll(
		int start, int end, OrderByComparator<Father> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<Father> list = null;

		if (useFinderCache) {
			list = (List<Father>)finderCache.getResult(finderPath, finderArgs);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_FATHER);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_FATHER;

				sql = sql.concat(FatherModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<Father>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the fathers from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Father father : findAll()) {
			remove(father);
		}
	}

	/**
	 * Returns the number of fathers.
	 *
	 * @return the number of fathers
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_FATHER);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "fid";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_FATHER;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return FatherModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the father persistence.
	 */
	@Activate
	public void activate() {
		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);

		_finderPathWithPaginationFindByOccupation = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByOccupation",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"occupation"}, true);

		_finderPathWithoutPaginationFindByOccupation = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByOccupation",
			new String[] {String.class.getName()}, new String[] {"occupation"},
			true);

		_finderPathCountByOccupation = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByOccupation",
			new String[] {String.class.getName()}, new String[] {"occupation"},
			false);

		_setFatherUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setFatherUtilPersistence(null);

		entityCache.removeCache(FatherImpl.class.getName());
	}

	private void _setFatherUtilPersistence(
		FatherPersistence fatherPersistence) {

		try {
			Field field = FatherUtil.class.getDeclaredField("_persistence");

			field.setAccessible(true);

			field.set(null, fatherPersistence);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	@Override
	@Reference(
		target = FirstPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = FirstPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = FirstPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_FATHER =
		"SELECT father FROM Father father";

	private static final String _SQL_SELECT_FATHER_WHERE =
		"SELECT father FROM Father father WHERE ";

	private static final String _SQL_COUNT_FATHER =
		"SELECT COUNT(father) FROM Father father";

	private static final String _SQL_COUNT_FATHER_WHERE =
		"SELECT COUNT(father) FROM Father father WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "father.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No Father exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No Father exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		FatherPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private FatherModelArgumentsResolver _fatherModelArgumentsResolver;

}