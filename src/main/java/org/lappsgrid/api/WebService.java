/*-
 * Copyright 2014 The Language Application Grid
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package org.lappsgrid.api;

/**
 * Interface for all services deployed to the LAPPS grid.
 * <p>
 * A service accepts a JSON object as input and produces a JSON object
 * as output.  The JSON objects must use the LAPPS Interchange Format (LIF)
 * with the <i>discriminator</i> set to one of the LIF query URI.
 * <p>
 * See http://vocab.lappsgrid.org/discriminators.html for a list of all
 * URI used by LAPPS.
 *
 * @author Keith Suderman
 */
import jp.go.nict.langrid.commons.rpc.intf.Service;

@Service(namespace = "lapps:service")
public interface WebService
{
	String execute(String input);
	String getMetadata();
}
