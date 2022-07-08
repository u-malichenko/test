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

package com.test.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the Employee service. Represents a row in the &quot;employee&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.test.model.impl.EmployeeModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.test.model.impl.EmployeeImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Employee
 * @generated
 */
@ProviderType
public interface EmployeeModel extends BaseModel<Employee> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a employee model instance should use the {@link Employee} interface instead.
	 */

	/**
	 * Returns the primary key of this employee.
	 *
	 * @return the primary key of this employee
	 */
	public int getPrimaryKey();

	/**
	 * Sets the primary key of this employee.
	 *
	 * @param primaryKey the primary key of this employee
	 */
	public void setPrimaryKey(int primaryKey);

	/**
	 * Returns the eid of this employee.
	 *
	 * @return the eid of this employee
	 */
	public int getEid();

	/**
	 * Sets the eid of this employee.
	 *
	 * @param eid the eid of this employee
	 */
	public void setEid(int eid);

	/**
	 * Returns the ename of this employee.
	 *
	 * @return the ename of this employee
	 */
	@AutoEscape
	public String getEname();

	/**
	 * Sets the ename of this employee.
	 *
	 * @param ename the ename of this employee
	 */
	public void setEname(String ename);

	/**
	 * Returns the occupation of this employee.
	 *
	 * @return the occupation of this employee
	 */
	@AutoEscape
	public String getOccupation();

	/**
	 * Sets the occupation of this employee.
	 *
	 * @param occupation the occupation of this employee
	 */
	public void setOccupation(String occupation);

	@Override
	public Employee cloneWithOriginalValues();

}