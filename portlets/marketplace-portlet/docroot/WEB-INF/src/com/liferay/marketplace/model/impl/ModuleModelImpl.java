/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
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

package com.liferay.marketplace.model.impl;

import com.liferay.marketplace.model.Module;
import com.liferay.marketplace.model.ModuleModel;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

/**
 * The base model implementation for the Module service. Represents a row in the &quot;Marketplace_Module&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.liferay.marketplace.model.ModuleModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ModuleImpl}.
 * </p>
 *
 * @author Ryan Park
 * @see ModuleImpl
 * @see com.liferay.marketplace.model.Module
 * @see com.liferay.marketplace.model.ModuleModel
 * @generated
 */
public class ModuleModelImpl extends BaseModelImpl<Module>
	implements ModuleModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a module model instance should use the {@link com.liferay.marketplace.model.Module} interface instead.
	 */
	public static final String TABLE_NAME = "Marketplace_Module";
	public static final Object[][] TABLE_COLUMNS = {
			{ "uuid_", Types.VARCHAR },
			{ "moduleId", Types.BIGINT },
			{ "appId", Types.BIGINT },
			{ "contextName", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table Marketplace_Module (uuid_ VARCHAR(75) null,moduleId LONG not null primary key,appId LONG,contextName VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table Marketplace_Module";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.liferay.marketplace.model.Module"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.liferay.marketplace.model.Module"),
			true);

	public Class<?> getModelClass() {
		return Module.class;
	}

	public String getModelClassName() {
		return Module.class.getName();
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.liferay.marketplace.model.Module"));

	public ModuleModelImpl() {
	}

	public long getPrimaryKey() {
		return _moduleId;
	}

	public void setPrimaryKey(long primaryKey) {
		setModuleId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_moduleId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	public String getUuid() {
		if (_uuid == null) {
			return StringPool.BLANK;
		}
		else {
			return _uuid;
		}
	}

	public void setUuid(String uuid) {
		if (_originalUuid == null) {
			_originalUuid = _uuid;
		}

		_uuid = uuid;
	}

	public String getOriginalUuid() {
		return GetterUtil.getString(_originalUuid);
	}

	public long getModuleId() {
		return _moduleId;
	}

	public void setModuleId(long moduleId) {
		_moduleId = moduleId;
	}

	public long getAppId() {
		return _appId;
	}

	public void setAppId(long appId) {
		if (!_setOriginalAppId) {
			_setOriginalAppId = true;

			_originalAppId = _appId;
		}

		_appId = appId;
	}

	public long getOriginalAppId() {
		return _originalAppId;
	}

	public String getContextName() {
		if (_contextName == null) {
			return StringPool.BLANK;
		}
		else {
			return _contextName;
		}
	}

	public void setContextName(String contextName) {
		if (_originalContextName == null) {
			_originalContextName = _contextName;
		}

		_contextName = contextName;
	}

	public String getOriginalContextName() {
		return GetterUtil.getString(_originalContextName);
	}

	@Override
	public Module toEscapedModel() {
		if (isEscapedModel()) {
			return (Module)this;
		}
		else {
			if (_escapedModelProxy == null) {
				_escapedModelProxy = (Module)ProxyUtil.newProxyInstance(_classLoader,
						_escapedModelProxyInterfaces,
						new AutoEscapeBeanHandler(this));
			}

			return _escapedModelProxy;
		}
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(0,
					Module.class.getName(), getPrimaryKey());
		}

		return _expandoBridge;
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	@Override
	public Object clone() {
		ModuleImpl moduleImpl = new ModuleImpl();

		moduleImpl.setUuid(getUuid());
		moduleImpl.setModuleId(getModuleId());
		moduleImpl.setAppId(getAppId());
		moduleImpl.setContextName(getContextName());

		moduleImpl.resetOriginalValues();

		return moduleImpl;
	}

	public int compareTo(Module module) {
		long primaryKey = module.getPrimaryKey();

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
		if (obj == null) {
			return false;
		}

		Module module = null;

		try {
			module = (Module)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = module.getPrimaryKey();

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
	public void resetOriginalValues() {
		ModuleModelImpl moduleModelImpl = this;

		moduleModelImpl._originalUuid = moduleModelImpl._uuid;

		moduleModelImpl._originalAppId = moduleModelImpl._appId;

		moduleModelImpl._setOriginalAppId = false;

		moduleModelImpl._originalContextName = moduleModelImpl._contextName;
	}

	@Override
	public CacheModel<Module> toCacheModel() {
		ModuleCacheModel moduleCacheModel = new ModuleCacheModel();

		moduleCacheModel.uuid = getUuid();

		String uuid = moduleCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			moduleCacheModel.uuid = null;
		}

		moduleCacheModel.moduleId = getModuleId();

		moduleCacheModel.appId = getAppId();

		moduleCacheModel.contextName = getContextName();

		String contextName = moduleCacheModel.contextName;

		if ((contextName != null) && (contextName.length() == 0)) {
			moduleCacheModel.contextName = null;
		}

		return moduleCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(9);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", moduleId=");
		sb.append(getModuleId());
		sb.append(", appId=");
		sb.append(getAppId());
		sb.append(", contextName=");
		sb.append(getContextName());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(16);

		sb.append("<model><model-name>");
		sb.append("com.liferay.marketplace.model.Module");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>moduleId</column-name><column-value><![CDATA[");
		sb.append(getModuleId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>appId</column-name><column-value><![CDATA[");
		sb.append(getAppId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>contextName</column-name><column-value><![CDATA[");
		sb.append(getContextName());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = Module.class.getClassLoader();
	private static Class<?>[] _escapedModelProxyInterfaces = new Class[] {
			Module.class
		};
	private String _uuid;
	private String _originalUuid;
	private long _moduleId;
	private long _appId;
	private long _originalAppId;
	private boolean _setOriginalAppId;
	private String _contextName;
	private String _originalContextName;
	private transient ExpandoBridge _expandoBridge;
	private Module _escapedModelProxy;
}