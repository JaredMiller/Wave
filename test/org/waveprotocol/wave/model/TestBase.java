/**
 * Copyright 2008 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.waveprotocol.wave.model;

import com.google.gwt.junit.client.GWTTestCase;

/**
 * The base class for client gwt wrapper model tests.
 *
 * @author zdwang@google.com (David Wang)
 */
public abstract class TestBase extends GWTTestCase {

  /**
   * The default constructor.
   */
  public TestBase() {
  }

  /**
   * Specifies a module to use when running this test case. The returned module
   * must cause the source for this class to be included.
   *
   * @see com.google.gwt.junit.client.GWTTestCase#getModuleName()
   */
  @Override
  public String getModuleName() {
    return "org.waveprotocol.wave.model.tests";
  }

}
