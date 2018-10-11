/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-location project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron;

import elemental2.dom.HTMLElement;
import elemental2.dom.Element;
import com.google.gwt.core.client.JavaScriptObject;
import elemental2.core.JsArray;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import com.vaadin.polymer.PolymerElement;
import com.vaadin.polymer.PolymerFunction;

/**
 * <p>The <code>iron-location</code> element manages binding to and from the current URL.</p>
 * <p>iron-location is the first, and lowest level element in the Polymer team’s
 * routing system. This is a beta release of iron-location as we continue work
 * on higher level elements, and as such iron-location may undergo breaking
 * changes.</p>
 * <h4 id="properties">Properties</h4>
 * <p>When the URL is: <code>/search?query=583#details</code> iron-location’s properties will be:</p>
 * <ul>
 * <li>path: <code>&#39;/search&#39;</code></li>
 * <li>query: <code>&#39;query=583&#39;</code></li>
 * <li>hash: <code>&#39;details&#39;</code></li>
 * </ul>
 * <p>These bindings are bidirectional. Modifying them will in turn modify the URL.</p>
 * <p>iron-location is only active while it is attached to the document.</p>
 * <h4 id="links">Links</h4>
 * <p>While iron-location is active in the document it will intercept clicks on links
 * within your site, updating the URL pushing the updated URL out through the
 * databinding system. iron-location only intercepts clicks with the intent to
 * open in the same window, so middle mouse clicks and ctrl/cmd clicks work fine.</p>
 * <p>You can customize this behavior with the <code>urlSpaceRegex</code>.</p>
 * <h4 id="dwell-time">Dwell Time</h4>
 * <p>iron-location protects against accidental history spamming by only adding
 * entries to the user’s history if the URL stays unchanged for <code>dwellTime</code>
 * milliseconds.</p>
 */
@JsType(isNative=true, namespace = JsPackage.GLOBAL, name = "HTMLElement")
public class IronLocationElement extends PolymerElement {

    @JsOverlay public static final String TAG = "iron-location";
    @JsOverlay public static final String SRC = "iron-location/iron-location.html";


    /**
     * <p>If the user was on a URL for less than <code>dwellTime</code> milliseconds, it
     * won’t be added to the browser’s history, but instead will be replaced
     * by the next entry.</p>
     * <p>This is to prevent large numbers of entries from clogging up the user’s
     * browser history. Disable by setting to a negative number.</p>
     *
     * JavaScript Info:
     * @property dwellTime
     * @type Number
     * 
     */
    @JsProperty public native  double getDwellTime();
    /**
     * <p>If the user was on a URL for less than <code>dwellTime</code> milliseconds, it
     * won’t be added to the browser’s history, but instead will be replaced
     * by the next entry.</p>
     * <p>This is to prevent large numbers of entries from clogging up the user’s
     * browser history. Disable by setting to a negative number.</p>
     *
     * JavaScript Info:
     * @property dwellTime
     * @type Number
     * 
     */
    @JsProperty public native  void setDwellTime(double value);

    /**
     * <p>A flag that specifies whether the spaces in query that would normally be
     * encoded as %20 should be encoded as +.</p>
     * <p>Given an example text “hello world”, it is encoded in query as
     * - “hello%20world” without the parameter
     * - “hello+world” with the parameter</p>
     *
     * JavaScript Info:
     * @property encodeSpaceAsPlusInQuery
     * @type Boolean
     * 
     */
    @JsProperty public native  boolean getEncodeSpaceAsPlusInQuery();
    /**
     * <p>A flag that specifies whether the spaces in query that would normally be
     * encoded as %20 should be encoded as +.</p>
     * <p>Given an example text “hello world”, it is encoded in query as
     * - “hello%20world” without the parameter
     * - “hello+world” with the parameter</p>
     *
     * JavaScript Info:
     * @property encodeSpaceAsPlusInQuery
     * @type Boolean
     * 
     */
    @JsProperty public native  void setEncodeSpaceAsPlusInQuery(boolean value);

    /**
     * <p>A regexp that defines the set of URLs that should be considered part
     * of this web app.</p>
     * <p>Clicking on a link that matches this regex won’t result in a full page
     * navigation, but will instead just update the URL state in place.</p>
     * <p>This regexp is given everything after the origin in an absolute
     * URL. So to match just URLs that start with /search/ do:
     *     url-space-regex=”^/search/“</p>
     *
     * JavaScript Info:
     * @property urlSpaceRegex
     * @type (string|RegExp)
     * 
     */
    @JsProperty public native  Object getUrlSpaceRegex();
    /**
     * <p>A regexp that defines the set of URLs that should be considered part
     * of this web app.</p>
     * <p>Clicking on a link that matches this regex won’t result in a full page
     * navigation, but will instead just update the URL state in place.</p>
     * <p>This regexp is given everything after the origin in an absolute
     * URL. So to match just URLs that start with /search/ do:
     *     url-space-regex=”^/search/“</p>
     *
     * JavaScript Info:
     * @property urlSpaceRegex
     * @type (string|RegExp)
     * 
     */
    @JsProperty public native  void setUrlSpaceRegex(Object value);

    /**
     * <p>The hash component of the URL.</p>
     *
     * JavaScript Info:
     * @property hash
     * @type String
     * 
     */
    @JsProperty public native  String getHash();
    /**
     * <p>The hash component of the URL.</p>
     *
     * JavaScript Info:
     * @property hash
     * @type String
     * 
     */
    @JsProperty public native  void setHash(String value);

    /**
     * <p>The pathname component of the URL.</p>
     *
     * JavaScript Info:
     * @property path
     * @type String
     * 
     */
    @JsProperty public native  String getPath();
    /**
     * <p>The pathname component of the URL.</p>
     *
     * JavaScript Info:
     * @property path
     * @type String
     * 
     */
    @JsProperty public native  void setPath(String value);

    /**
     * <p>The query string portion of the URL.</p>
     *
     * JavaScript Info:
     * @property query
     * @type String
     * 
     */
    @JsProperty public native  String getQuery();
    /**
     * <p>The query string portion of the URL.</p>
     *
     * JavaScript Info:
     * @property query
     * @type String
     * 
     */
    @JsProperty public native  void setQuery(String value);


}
