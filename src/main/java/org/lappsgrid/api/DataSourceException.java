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
 * Exception for Data Source in general.
 *
 * @author Di Wang
 */
public class DataSourceException extends LappsException {
  /**
   * The Constant serialVersionUID.
   */
  private static final long serialVersionUID = 196698557475849982L;

  public DataSourceException() {
    super();
  }

  public DataSourceException(String message, Throwable cause) {
    super(message, cause);
  }

  public DataSourceException(String message) {
    super(message);
  }

  public DataSourceException(Throwable cause) {
    super(cause);
  }

}
