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

package com.liferay.biz.amf.service.model;

import com.liferay.biz.amf.service.service.ClpSerializer;
import com.liferay.biz.amf.service.service.ListTypeLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Neil Zhao Jin
 */
public class ListTypeClp extends BaseModelImpl<ListType> implements ListType {
	public ListTypeClp() {
	}

	public Class<?> getModelClass() {
		return ListType.class;
	}

	public String getModelClassName() {
		return ListType.class.getName();
	}

	public long getPrimaryKey() {
		return _listTypeId;
	}

	public void setPrimaryKey(long primaryKey) {
		setListTypeId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_listTypeId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("listTypeId", getListTypeId());
		attributes.put("name", getName());
		attributes.put("type", getType());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long listTypeId = (Long)attributes.get("listTypeId");

		if (listTypeId != null) {
			setListTypeId(listTypeId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String type = (String)attributes.get("type");

		if (type != null) {
			setType(type);
		}
	}

	public long getListTypeId() {
		return _listTypeId;
	}

	public void setListTypeId(long listTypeId) {
		_listTypeId = listTypeId;

		if (_listTypeRemoteModel != null) {
			try {
				Class<?> clazz = _listTypeRemoteModel.getClass();

				Method method = clazz.getMethod("setListTypeId", long.class);

				method.invoke(_listTypeRemoteModel, listTypeId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;

		if (_listTypeRemoteModel != null) {
			try {
				Class<?> clazz = _listTypeRemoteModel.getClass();

				Method method = clazz.getMethod("setName", String.class);

				method.invoke(_listTypeRemoteModel, name);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public String getType() {
		return _type;
	}

	public void setType(String type) {
		_type = type;

		if (_listTypeRemoteModel != null) {
			try {
				Class<?> clazz = _listTypeRemoteModel.getClass();

				Method method = clazz.getMethod("setType", String.class);

				method.invoke(_listTypeRemoteModel, type);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getListTypeRemoteModel() {
		return _listTypeRemoteModel;
	}

	public void setListTypeRemoteModel(BaseModel<?> listTypeRemoteModel) {
		_listTypeRemoteModel = listTypeRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _listTypeRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_listTypeRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			ListTypeLocalServiceUtil.addListType(this);
		}
		else {
			ListTypeLocalServiceUtil.updateListType(this);
		}
	}

	@Override
	public ListType toEscapedModel() {
		return (ListType)ProxyUtil.newProxyInstance(ListType.class.getClassLoader(),
			new Class[] { ListType.class }, new AutoEscapeBeanHandler(this));
	}

	public ListType toUnescapedModel() {
		return this;
	}

	@Override
	public Object clone() {
		ListTypeClp clone = new ListTypeClp();

		clone.setListTypeId(getListTypeId());
		clone.setName(getName());
		clone.setType(getType());

		return clone;
	}

	public int compareTo(ListType listType) {
		long primaryKey = listType.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ListTypeClp)) {
			return false;
		}

		ListTypeClp listType = (ListTypeClp)obj;

		long primaryKey = listType.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{listTypeId=");
		sb.append(getListTypeId());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", type=");
		sb.append(getType());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("com.liferay.biz.amf.service.model.ListType");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>listTypeId</column-name><column-value><![CDATA[");
		sb.append(getListTypeId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>type</column-name><column-value><![CDATA[");
		sb.append(getType());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _listTypeId;
	private String _name;
	private String _type;
	private BaseModel<?> _listTypeRemoteModel;
}