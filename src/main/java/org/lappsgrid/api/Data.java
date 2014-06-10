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
   //protected String payload;
   protected byte[] payload;

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
      this.payload = payload.getBytes();
   }

   public Data(String type, byte[] payload)
   {
      this.discriminator = type;
      this.payload = payload;
   }

   public String getDiscriminator()
   {
      return discriminator;
   }

   public String getPayload()
   {
      if (payload == null)
      {
         return null;
      }

      return new String(payload);
   }

   /**
    * Retrieves the payload string as a byte array.
    *
    * @return a byte array obtained by Base64 decoding the payload string.
    */
   public byte[] asBytes()
   {
      return payload;
   }

   public boolean hasError()
   {
      return "error".equals(discriminator);
   }
}
