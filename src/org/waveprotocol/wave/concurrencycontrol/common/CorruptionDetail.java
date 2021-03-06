/**
 * Copyright 2010 Google Inc.
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
 *
 */

package org.waveprotocol.wave.concurrencycontrol.common;

/**
 * Carries information about a turbulence or related phenomenon (such
 * as an operation channel shutdown).
 *
 * This is a throwable so that it can be logged and will reveal the
 * stack trace of where it originated.
 *
 * @author ohler@google.com (Christian Ohler)
 */
public class CorruptionDetail extends Throwable {
  private final ResponseCode errorCode;

  public final ResponseCode getErrorCode() {
    return errorCode;
  }

  private static String addErrorToMessage(ResponseCode errorCode, String message) {
    return "[" + errorCode + "] " + message;
  }

  public CorruptionDetail(ResponseCode errorCode, String message) {
    this(errorCode, message, null);
  }

  public CorruptionDetail(ResponseCode errorCode, String message, Throwable cause) {
    super(addErrorToMessage(errorCode, message), cause);
    this.errorCode = errorCode;
  }
}
