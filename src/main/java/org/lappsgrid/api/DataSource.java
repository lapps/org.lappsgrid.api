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

import javax.jws.WebService;


/**
 * A DataSource returns {@link Data} objects based on an input query.
 * <p/>
 * The type of Data returned by a data source depends on the data
 * source implementation. Possibilities include, but are not limited
 * to, entire documents, segments of documents, XML documents (or
 * fragments), single words, or lists of annotations.
 *
 * @author Keith Suderman
 */
@Service(namespace = "lapps:datasource")
@WebService
public interface DataSource {
  /**
   * Returns a data object corresponding to the given query.
   * the given query.
   *
   * @param query
   * @return
   */
  Data query(Data query);
}
