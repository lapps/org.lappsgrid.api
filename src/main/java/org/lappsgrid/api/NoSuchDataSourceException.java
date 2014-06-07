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
 * Exception when found no such data source.
 *
 * @author Di Wang
 */
public class NoSuchDataSourceException extends DataSourceException {

  /**
   * The Constant serialVersionUID.
   */
  private static final long serialVersionUID = 7624347855738751011L;

  public NoSuchDataSourceException() {
    super();
  }

  public NoSuchDataSourceException(String message, Throwable cause) {
    super(message, cause);
  }

  public NoSuchDataSourceException(String message) {
    super(message);
  }

  public NoSuchDataSourceException(Throwable cause) {
    super(cause);
  }
}
