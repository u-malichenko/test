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

package com.test.service.impl;

import com.liferay.portal.aop.AopService;

import com.test.model.Father;
import com.test.service.base.FatherLocalServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

import java.util.List;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.test.model.Father",
	service = AopService.class
)
public class FatherLocalServiceImpl extends FatherLocalServiceBaseImpl {
	public List<Father> findByOccupation(String occupation){
		return fatherPersistence.findByOccupation(occupation);
	}

	public List<Father> getFatherByOccupation(String occupation){
		return fatherFinder.getFatherByOccupation(occupation);
	}
}