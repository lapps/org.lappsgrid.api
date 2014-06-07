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
 * An exception type to be thrown and caught internally by a LAPPS service.
 * <p/>
 * These exceptions should never be exposed to the user.
 *
 * @author Keith Suderman
 */
public class InternalException extends LappsException {
  private static final long serialVersionUID = 1L;

  public InternalException() {
    super();
  }

  public InternalException(String message, Throwable cause) {
    super(message, cause);
  }

  public InternalException(String message) {
    super(message);
  }

  public InternalException(Throwable cause) {
    super(cause);
  }

}
