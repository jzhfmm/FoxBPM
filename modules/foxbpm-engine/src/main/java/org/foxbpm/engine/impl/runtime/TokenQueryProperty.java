/**
 * Copyright 1996-2014 FoxBPM Co.,Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * @author ych
 */
package org.foxbpm.engine.impl.runtime;

import java.util.HashMap;
import java.util.Map;

import org.foxbpm.engine.query.QueryProperty;

public class TokenQueryProperty implements QueryProperty {

	private static final Map<String, TokenQueryProperty> properties = new HashMap<String, TokenQueryProperty>();

	public static final TokenQueryProperty PROCESSINSTANCE_ID = new TokenQueryProperty("PROCESSINSTANCE_ID");
	public static final TokenQueryProperty TOKEN_ID = new TokenQueryProperty("TOKEN_ID");

	private String name;

	public TokenQueryProperty(String name) {
		this.name = name;
		properties.put(name, this);
	}

	public String getName() {
		return name;
	}

	public static TokenQueryProperty findByName(String propertyName) {
		return properties.get(propertyName);
	}
}
