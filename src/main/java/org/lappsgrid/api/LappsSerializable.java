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

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * A Serializable interface that includes readObject and writeObject methods.
 * <p/>
 * LAPPS objects that are serialized should never rely on the default Java
 * serialization mechanism and should explicitly read and write their
 * data to/from object streams.
 *
 * @author Keith Suderman
 */
public interface LappsSerializable extends Serializable {
  void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException;

  void writeObject(ObjectOutputStream stream) throws IOException, ClassNotFoundException;
}
