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
 *
 */
package org.waveprotocol.wave.model.operation.wave;

/**
 * Vacuous implementation of a {@code WaveletOperationVisitor}, such that
 * visitor implementations only need to implement methods meaningful to their
 * context.
 *
 */
public class WaveletOperationVisitorImpl implements WaveletOperationVisitor {

  @Override
  public void visitNoOp(NoOp op) {}

  @Override
  public void visitVersionUpdateOp(VersionUpdateOp op) {}

  @Override
  public void visitAddParticipant(AddParticipant op) {}

  @Override
  public void visitRemoveParticipant(RemoveParticipant op) {}

  @Override
  public void visitWaveletBlipOperation(WaveletBlipOperation op) {}
}
