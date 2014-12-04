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
 * A DataSource returns {@link Data} objects from a source of data.
 * <p>
 * The type of Data returned by a DataSource depends on the data
 * source implementation. Possibilities include, but are not limited
 * to, entire documents, segments of documents, XML documents (or
 * fragments), single words, or lists of annotations.
 *
 * @author Keith Suderman
 */
@Service(namespace = "lapps:datasource")
@WebService
public interface DataSource
{
	/**
	 * Returns the size of this datasource, that is, the number of
	 * unique keys returned by the @{link #list} method.
	 *
	 * @return The number of artifacts managed by this datasource.
	 */
   int size(Data data);

	/**
	 * Returns a @{link Data} object containing a white-space
	 * delimited list of keys. The particular white-space character
	 * used SHOULD be specified in the discriminator field of the
	 * @{code Data} object.
	 *
	 */
   Data list(Data data);


	/**
	 * Returns a single document from the DataSource.
	 *
	 * @param data A {@link org.lappsgrid.api.Data} object containing the
	 *               ID of the document to be returned.
	 * @return A {@link Data} object containing the document.
	 */
   Data get(Data data);

	/**
	 * Returns the metadata for the DataSource in a JSON-LD payload.
	 */
	Data getMetadata();

   /**
    * Returns a data object corresponding to the given query.
    * the given query.
    *
    * @param query
    * @return
    */
   Data query(Data query);
}
