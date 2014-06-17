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
 * Data objects passed between LAPPS web services.
 * <p/>
 * Data objects consist of a <code>discrimintator</code> and a
 * <code>payload</code>. The payload field carries the data and the discriminator is used to
 * hold any type information for the data.
 * <p/>
 * Discriminator values are represented as <code>long</code> values in
 * this implementation.  A central "Discriminator Registry" should be
 * consulted to map discriminator names to values and vice-versa.
 *
 * @author Keith Suderman
 * @author Di Wang
 */
public class Data
{
   protected String discriminator;
   protected String payload;

   // Empty default constructor.
   public Data()
   {
   }

   public Data(String type)
   {
      this.discriminator = type;
   }

   public Data(String type, String payload)
   {
      this.discriminator = type;
      this.payload = payload;
   }

   public String getDiscriminator()
   {
      return discriminator;
   }
   public void setDiscriminator(String discriminator)
   {
      this.discriminator = discriminator;
   }

   public String getPayload() { return payload; }
   public void setPayload(String payload)
   {
      this.payload = payload;
   }
}
