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

import jp.go.nict.langrid.commons.rpc.intf.Service;

@Service(namespace = "lapps:service")
public interface WebService
{
   /**
    * Returns the set of data types that must be present in the
    * input to the {@link #execute(Data)} method
    */
//   @Deprecated
//   long[] requires();

   /**
    * Returns the set of data types that will be included in the output.
    */
//   @Deprecated
//   long[] produces();

   /**
    * Executes a web service on the given input. Returns the output, if any,
    * of the web service in a {@link Data} object.
    */
   Data execute(Data input);

   /**
    * Configures a WebService.
    * <p/>
    * Returns any errors in a {@link Data} object. Otherwise returns a Data
    * object with the "ok" Discriminator type.
    *
    * @param config
    * @return
    */
   Data configure(Data config);

   Data getMetadata();

}
