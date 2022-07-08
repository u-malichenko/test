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

package com.test.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.test.model.Father;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Father in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class FatherCacheModel implements CacheModel<Father>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof FatherCacheModel)) {
			return false;
		}

		FatherCacheModel fatherCacheModel = (FatherCacheModel)object;

		if (fid == fatherCacheModel.fid) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, fid);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{fid=");
		sb.append(fid);
		sb.append(", fname=");
		sb.append(fname);
		sb.append(", occupation=");
		sb.append(occupation);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Father toEntityModel() {
		FatherImpl fatherImpl = new FatherImpl();

		fatherImpl.setFid(fid);

		if (fname == null) {
			fatherImpl.setFname("");
		}
		else {
			fatherImpl.setFname(fname);
		}

		if (occupation == null) {
			fatherImpl.setOccupation("");
		}
		else {
			fatherImpl.setOccupation(occupation);
		}

		fatherImpl.resetOriginalValues();

		return fatherImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		fid = objectInput.readLong();
		fname = objectInput.readUTF();
		occupation = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		objectOutput.writeLong(fid);

		if (fname == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(fname);
		}

		if (occupation == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(occupation);
		}
	}

	public long fid;
	public String fname;
	public String occupation;

}