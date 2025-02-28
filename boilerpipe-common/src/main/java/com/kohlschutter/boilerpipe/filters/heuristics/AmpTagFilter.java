/**
 * boilerpipe
 *
 * Copyright (c) 2009, 2014 Christian Kohlschütter
 *
 * The author licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.kohlschutter.boilerpipe.filters.heuristics;

import com.kohlschutter.boilerpipe.BoilerpipeFilter;
import com.kohlschutter.boilerpipe.BoilerpipeProcessingException;
import com.kohlschutter.boilerpipe.document.TextBlock;
import com.kohlschutter.boilerpipe.document.TextDocument;
import org.cyberneko.html.HTMLElements;
import org.jsoup.select.Elements;

/**
 *   Remove the <amp> </amp> tags
 *      from the text
 */
public class AmpTagFilter implements BoilerpipeFilter {

    @Override
    public boolean process(TextDocument doc) throws BoilerpipeProcessingException {

        /**
        for( TextBlock tb : doc.getTextBlocks() ) {
           Elements elems = tb.getElements();
           tb.
        }
         **/

        return false;
    }
}
