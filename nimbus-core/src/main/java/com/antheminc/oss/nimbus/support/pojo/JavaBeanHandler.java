/**
 *  Copyright 2016-2018 the original author or authors.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package com.antheminc.oss.nimbus.support.pojo;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

/**
 * @author Soham Chakravarti
 *
 */
public interface JavaBeanHandler {

	default public <T> T getValue(PropertyDescriptor pd, Object target) {
		return getValue(pd.getReadMethod(), target);
	}
	
	public <T> T getValue(Method readMethod, Object target);	
	
	
	default public <T> void setValue(PropertyDescriptor pd, Object target, T value) {
		setValue(pd.getWriteMethod(), target, value);
	}
	
	public <T> void setValue(Method writeMethod, Object target, T value);
	
	public <T> T instantiate(Class<T> clazz);
}
