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
package com.kohlschutter.boilerpipe.sax;

import com.kohlschutter.boilerpipe.labels.DefaultLabels;
import com.kohlschutter.boilerpipe.labels.LabelAction;

/**
 * Default {@link TagAction}s. Seem to work well.
 */
public class DefaultTagActionMap extends TagActionMap {
  /**
   * (“script, style, noscript, option, .hidden, amp-app-banner, amp-img, amp-state, amp-sidebar, amp-sticky-ad, amp-ad, amp-social-share, amp-carousel, amp-iframe, amp-embed, amp-analytics, amp-geo, amp-consent, amp-user-notification”)
   */

  /**
     * 
     */
  private static final long serialVersionUID = 1L;

  public static final TagActionMap INSTANCE = new DefaultTagActionMap();

  protected DefaultTagActionMap() {
    setTagAction("STYLE", CommonTagActions.TA_IGNORABLE_ELEMENT);
    setTagAction("SCRIPT", CommonTagActions.TA_IGNORABLE_ELEMENT);
    setTagAction("OPTION", CommonTagActions.TA_IGNORABLE_ELEMENT);
    setTagAction("OBJECT", CommonTagActions.TA_IGNORABLE_ELEMENT);
    setTagAction("EMBED", CommonTagActions.TA_IGNORABLE_ELEMENT);
    setTagAction("APPLET", CommonTagActions.TA_IGNORABLE_ELEMENT);
    setTagAction("LINK", CommonTagActions.TA_IGNORABLE_ELEMENT);

    /// Hard code ignore all AMP tags
    setTagAction("AMP-USER-NOTIFICATION", CommonTagActions.TA_IGNORABLE_ELEMENT);
    setTagAction("AMP-APP-BANNER", CommonTagActions.TA_IGNORABLE_ELEMENT);
    setTagAction("AMP-IMG", CommonTagActions.TA_IGNORABLE_ELEMENT);
    setTagAction("AMP-STATE", CommonTagActions.TA_IGNORABLE_ELEMENT);
    setTagAction("AMP-SIDEBAR", CommonTagActions.TA_IGNORABLE_ELEMENT);
    setTagAction("AMP-STICKY-AD", CommonTagActions.TA_IGNORABLE_ELEMENT);
    setTagAction("AMP-AD", CommonTagActions.TA_IGNORABLE_ELEMENT);
    setTagAction("AMP-SOCIAL-SHARE", CommonTagActions.TA_IGNORABLE_ELEMENT);
    setTagAction("AMP-CAROUSEL", CommonTagActions.TA_IGNORABLE_ELEMENT);
    setTagAction("AMP-IFRAME", CommonTagActions.TA_IGNORABLE_ELEMENT);
    setTagAction("AMP-EMBED", CommonTagActions.TA_IGNORABLE_ELEMENT);
    setTagAction("AMP-ANALYTICS", CommonTagActions.TA_IGNORABLE_ELEMENT);
    setTagAction("AMP-GEO", CommonTagActions.TA_IGNORABLE_ELEMENT);
    setTagAction("AMP-CONSENT", CommonTagActions.TA_IGNORABLE_ELEMENT);
    setTagAction("AMP-AD-ENABLE-REFRESH", CommonTagActions.TA_IGNORABLE_ELEMENT);
    setTagAction("AMP-TWITTER", CommonTagActions.TA_IGNORABLE_ELEMENT);

    setTagAction("A", CommonTagActions.TA_ANCHOR_TEXT);
    setTagAction("BODY", CommonTagActions.TA_BODY);

    setTagAction("STRIKE", CommonTagActions.TA_INLINE_NO_WHITESPACE);
    setTagAction("U", CommonTagActions.TA_INLINE_NO_WHITESPACE);
    setTagAction("B", CommonTagActions.TA_INLINE_NO_WHITESPACE);
    setTagAction("I", CommonTagActions.TA_INLINE_NO_WHITESPACE);
    setTagAction("EM", CommonTagActions.TA_INLINE_NO_WHITESPACE);
    setTagAction("STRONG", CommonTagActions.TA_INLINE_NO_WHITESPACE);
    setTagAction("SPAN", CommonTagActions.TA_INLINE_NO_WHITESPACE);

    // New in 1.1 (especially to improve extraction quality from Wikipedia etc.)
    setTagAction("SUP", CommonTagActions.TA_INLINE_NO_WHITESPACE);

    // New in 1.2
    setTagAction("CODE", CommonTagActions.TA_INLINE_NO_WHITESPACE);
    setTagAction("TT", CommonTagActions.TA_INLINE_NO_WHITESPACE);
    setTagAction("SUB", CommonTagActions.TA_INLINE_NO_WHITESPACE);
    setTagAction("VAR", CommonTagActions.TA_INLINE_NO_WHITESPACE);

    setTagAction("ABBR", CommonTagActions.TA_INLINE_WHITESPACE);
    setTagAction("ACRONYM", CommonTagActions.TA_INLINE_WHITESPACE);

    setTagAction("FONT", CommonTagActions.TA_INLINE_NO_WHITESPACE); // could also use TA_FONT

    // added in 1.1.1
    setTagAction("NOSCRIPT", CommonTagActions.TA_IGNORABLE_ELEMENT);

    // New in 1.3
    setTagAction("LI", new CommonTagActions.BlockTagLabelAction(new LabelAction(DefaultLabels.LI)));
    setTagAction("H1", new CommonTagActions.BlockTagLabelAction(new LabelAction(DefaultLabels.H1,
        DefaultLabels.HEADING)));
    setTagAction("H2", new CommonTagActions.BlockTagLabelAction(new LabelAction(DefaultLabels.H2,
        DefaultLabels.HEADING)));
    setTagAction("H3", new CommonTagActions.BlockTagLabelAction(new LabelAction(DefaultLabels.H3,
        DefaultLabels.HEADING)));
  }
}
