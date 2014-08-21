/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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

package com.liferay.biz.amf.service.service.persistence;

import com.liferay.biz.amf.service.model.ListType;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the list type service. This utility wraps {@link ListTypePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Neil Zhao Jin
 * @see ListTypePersistence
 * @see ListTypePersistenceImpl
 * @generated
 */
public class ListTypeUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(ListType listType) {
		getPersistence().clearCache(listType);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<ListType> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<ListType> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<ListType> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static ListType update(ListType listType, boolean merge)
		throws SystemException {
		return getPersistence().update(listType, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static ListType update(ListType listType, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(listType, merge, serviceContext);
	}

	/**
	* Caches the list type in the entity cache if it is enabled.
	*
	* @param listType the list type
	*/
	public static void cacheResult(
		com.liferay.biz.amf.service.model.ListType listType) {
		getPersistence().cacheResult(listType);
	}

	/**
	* Caches the list types in the entity cache if it is enabled.
	*
	* @param listTypes the list types
	*/
	public static void cacheResult(
		java.util.List<com.liferay.biz.amf.service.model.ListType> listTypes) {
		getPersistence().cacheResult(listTypes);
	}

	/**
	* Creates a new list type with the primary key. Does not add the list type to the database.
	*
	* @param listTypeId the primary key for the new list type
	* @return the new list type
	*/
	public static com.liferay.biz.amf.service.model.ListType create(
		long listTypeId) {
		return getPersistence().create(listTypeId);
	}

	/**
	* Removes the list type with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param listTypeId the primary key of the list type
	* @return the list type that was removed
	* @throws com.liferay.biz.amf.service.NoSuchListTypeException if a list type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.biz.amf.service.model.ListType remove(
		long listTypeId)
		throws com.liferay.biz.amf.service.NoSuchListTypeException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(listTypeId);
	}

	public static com.liferay.biz.amf.service.model.ListType updateImpl(
		com.liferay.biz.amf.service.model.ListType listType, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(listType, merge);
	}

	/**
	* Returns the list type with the primary key or throws a {@link com.liferay.biz.amf.service.NoSuchListTypeException} if it could not be found.
	*
	* @param listTypeId the primary key of the list type
	* @return the list type
	* @throws com.liferay.biz.amf.service.NoSuchListTypeException if a list type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.biz.amf.service.model.ListType findByPrimaryKey(
		long listTypeId)
		throws com.liferay.biz.amf.service.NoSuchListTypeException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(listTypeId);
	}

	/**
	* Returns the list type with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param listTypeId the primary key of the list type
	* @return the list type, or <code>null</code> if a list type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.biz.amf.service.model.ListType fetchByPrimaryKey(
		long listTypeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(listTypeId);
	}

	/**
	* Returns all the list types where name = &#63; and type = &#63;.
	*
	* @param name the name
	* @param type the type
	* @return the matching list types
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.biz.amf.service.model.ListType> findByN_T(
		java.lang.String name, java.lang.String type)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByN_T(name, type);
	}

	/**
	* Returns a range of all the list types where name = &#63; and type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param name the name
	* @param type the type
	* @param start the lower bound of the range of list types
	* @param end the upper bound of the range of list types (not inclusive)
	* @return the range of matching list types
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.biz.amf.service.model.ListType> findByN_T(
		java.lang.String name, java.lang.String type, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByN_T(name, type, start, end);
	}

	/**
	* Returns an ordered range of all the list types where name = &#63; and type = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param name the name
	* @param type the type
	* @param start the lower bound of the range of list types
	* @param end the upper bound of the range of list types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching list types
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.biz.amf.service.model.ListType> findByN_T(
		java.lang.String name, java.lang.String type, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByN_T(name, type, start, end, orderByComparator);
	}

	/**
	* Returns the first list type in the ordered set where name = &#63; and type = &#63;.
	*
	* @param name the name
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching list type
	* @throws com.liferay.biz.amf.service.NoSuchListTypeException if a matching list type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.biz.amf.service.model.ListType findByN_T_First(
		java.lang.String name, java.lang.String type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.biz.amf.service.NoSuchListTypeException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByN_T_First(name, type, orderByComparator);
	}

	/**
	* Returns the first list type in the ordered set where name = &#63; and type = &#63;.
	*
	* @param name the name
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching list type, or <code>null</code> if a matching list type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.biz.amf.service.model.ListType fetchByN_T_First(
		java.lang.String name, java.lang.String type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByN_T_First(name, type, orderByComparator);
	}

	/**
	* Returns the last list type in the ordered set where name = &#63; and type = &#63;.
	*
	* @param name the name
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching list type
	* @throws com.liferay.biz.amf.service.NoSuchListTypeException if a matching list type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.biz.amf.service.model.ListType findByN_T_Last(
		java.lang.String name, java.lang.String type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.biz.amf.service.NoSuchListTypeException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByN_T_Last(name, type, orderByComparator);
	}

	/**
	* Returns the last list type in the ordered set where name = &#63; and type = &#63;.
	*
	* @param name the name
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching list type, or <code>null</code> if a matching list type could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.biz.amf.service.model.ListType fetchByN_T_Last(
		java.lang.String name, java.lang.String type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByN_T_Last(name, type, orderByComparator);
	}

	/**
	* Returns the list types before and after the current list type in the ordered set where name = &#63; and type = &#63;.
	*
	* @param listTypeId the primary key of the current list type
	* @param name the name
	* @param type the type
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next list type
	* @throws com.liferay.biz.amf.service.NoSuchListTypeException if a list type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.biz.amf.service.model.ListType[] findByN_T_PrevAndNext(
		long listTypeId, java.lang.String name, java.lang.String type,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.biz.amf.service.NoSuchListTypeException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByN_T_PrevAndNext(listTypeId, name, type,
			orderByComparator);
	}

	/**
	* Returns all the list types.
	*
	* @return the list types
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.biz.amf.service.model.ListType> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the list types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of list types
	* @param end the upper bound of the range of list types (not inclusive)
	* @return the range of list types
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.biz.amf.service.model.ListType> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the list types.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of list types
	* @param end the upper bound of the range of list types (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of list types
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.biz.amf.service.model.ListType> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the list types where name = &#63; and type = &#63; from the database.
	*
	* @param name the name
	* @param type the type
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByN_T(java.lang.String name, java.lang.String type)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByN_T(name, type);
	}

	/**
	* Removes all the list types from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of list types where name = &#63; and type = &#63;.
	*
	* @param name the name
	* @param type the type
	* @return the number of matching list types
	* @throws SystemException if a system exception occurred
	*/
	public static int countByN_T(java.lang.String name, java.lang.String type)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByN_T(name, type);
	}

	/**
	* Returns the number of list types.
	*
	* @return the number of list types
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static ListTypePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (ListTypePersistence)PortletBeanLocatorUtil.locate(com.liferay.biz.amf.service.service.ClpSerializer.getServletContextName(),
					ListTypePersistence.class.getName());

			ReferenceRegistry.registerReference(ListTypeUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(ListTypePersistence persistence) {
	}

	private static ListTypePersistence _persistence;
}