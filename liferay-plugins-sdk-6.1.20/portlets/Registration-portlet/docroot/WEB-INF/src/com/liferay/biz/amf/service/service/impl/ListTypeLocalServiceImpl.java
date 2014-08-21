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

package com.liferay.biz.amf.service.service.impl;

import com.liferay.biz.amf.service.model.ListType;
import com.liferay.biz.amf.service.service.base.ListTypeLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.SystemException;

import java.util.List;

/**
 * The implementation of the list type local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.liferay.biz.amf.service.service.ListTypeLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Neil Zhao Jin
 * @see com.liferay.biz.amf.service.service.base.ListTypeLocalServiceBaseImpl
 * @see com.liferay.biz.amf.service.service.ListTypeLocalServiceUtil
 */
public class ListTypeLocalServiceImpl extends ListTypeLocalServiceBaseImpl {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.liferay.biz.amf.service.service.ListTypeLocalServiceUtil} to access the list type local service.
	 */
	public List<ListType> getListTypeByN_T(String name, String type)
			throws Exception {
		return listTypePersistence.findByN_T(name, type);
	}

	public int countListTypeByN_T(String name, String type) throws Exception {
		return listTypePersistence.countByN_T(name, type);
	}

	public ListType addListType(String name, String type) throws Exception {
		long listTypeId = 
				counterLocalService.increment(ListType.class.getName());
		ListType listType= listTypePersistence.create(listTypeId);
		listType.setName(name);
		listType.setType(type);
		listTypePersistence.update(listType, false);

		return listType;
	}
}