/*
 * Copyright 2009 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.google.reducisaurus;

import com.google.reducisaurus.servlets.ErrorCollector;

import com.yahoo.platform.yui.compressor.JavaScriptCompressor;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public final class JsCompressor {

  public void compress(StringReader jssr, final StringWriter writer,
      final ErrorCollector errorCollector) throws IOException {

    JavaScriptCompressor jsc = new JavaScriptCompressor(jssr, errorCollector);
    int linebreakpos = -1;
    boolean munge = true;
    boolean verbose = false;
    boolean preserveAllSemis = false;
    boolean disableOptimizations = false;
    jsc.compress(writer, linebreakpos, munge, verbose, preserveAllSemis,
        disableOptimizations);
  }
}
