/*******************************************************************************
 * Copyright 2012 André Rouél
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package net.sf.uadetector;

/**
 * Basic interface for user agent string parsers.
 * 
 * @author André Rouél
 */
public interface UserAgentStringParser {

	/**
	 * Detects informations about a network client based on a user agent string.<br>
	 * <br>
	 * Typically user agent string will be read by an instance of {@code HttpServletRequest}. With the method
	 * {@code getHeader("User-Agent")} you can get direct access to this string.
	 * 
	 * @param userAgent
	 *            user agent string
	 * @return the detected information of an user agent
	 */
	UserAgent parse(final String userAgent);

}
