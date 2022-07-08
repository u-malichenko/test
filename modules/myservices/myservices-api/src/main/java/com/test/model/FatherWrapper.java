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

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Father}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Father
 * @generated
 */
public class FatherWrapper
	extends BaseModelWrapper<Father> implements Father, ModelWrapper<Father> {

	public FatherWrapper(Father father) {
		super(father);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("fid", getFid());
		attributes.put("fname", getFname());
		attributes.put("occupation", getOccupation());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long fid = (Long)attributes.get("fid");

		if (fid != null) {
			setFid(fid);
		}

		String fname = (String)attributes.get("fname");

		if (fname != null) {
			setFname(fname);
		}

		String occupation = (String)attributes.get("occupation");

		if (occupation != null) {
			setOccupation(occupation);
		}
	}

	@Override
	public Father cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the fid of this father.
	 *
	 * @return the fid of this father
	 */
	@Override
	public long getFid() {
		return model.getFid();
	}

	/**
	 * Returns the fname of this father.
	 *
	 * @return the fname of this father
	 */
	@Override
	public String getFname() {
		return model.getFname();
	}

	/**
	 * Returns the occupation of this father.
	 *
	 * @return the occupation of this father
	 */
	@Override
	public String getOccupation() {
		return model.getOccupation();
	}

	/**
	 * Returns the primary key of this father.
	 *
	 * @return the primary key of this father
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the fid of this father.
	 *
	 * @param fid the fid of this father
	 */
	@Override
	public void setFid(long fid) {
		model.setFid(fid);
	}

	/**
	 * Sets the fname of this father.
	 *
	 * @param fname the fname of this father
	 */
	@Override
	public void setFname(String fname) {
		model.setFname(fname);
	}

	/**
	 * Sets the occupation of this father.
	 *
	 * @param occupation the occupation of this father
	 */
	@Override
	public void setOccupation(String occupation) {
		model.setOccupation(occupation);
	}

	/**
	 * Sets the primary key of this father.
	 *
	 * @param primaryKey the primary key of this father
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	@Override
	protected FatherWrapper wrap(Father father) {
		return new FatherWrapper(father);
	}

}