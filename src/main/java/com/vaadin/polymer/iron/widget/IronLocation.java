/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-location project by The Polymer Authors
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.iron.widget;

import com.vaadin.polymer.iron.*;

import com.vaadin.polymer.*;
import com.vaadin.polymer.PolymerWidget;
import elemental2.core.JsArray;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.core.client.JavaScriptObject;
import com.vaadin.polymer.PolymerFunction;
import elemental2.dom.Element;
import elemental2.dom.HTMLElement;
import jsinterop.base.Js;

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
public class IronLocation extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public IronLocation() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public IronLocation(String html) {
        super(IronLocationElement.TAG, IronLocationElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public IronLocationElement getPolymerElement() {
        return Js.cast(getElement());
    }


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
    public  double getDwellTime() {
        return getPolymerElement().getDwellTime();
    }
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
    public  void setDwellTime(double value) {
        getPolymerElement().setDwellTime(value);
    }

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
    public  boolean getEncodeSpaceAsPlusInQuery() {
        return getPolymerElement().getEncodeSpaceAsPlusInQuery();
    }
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
    public  void setEncodeSpaceAsPlusInQuery(boolean value) {
        getPolymerElement().setEncodeSpaceAsPlusInQuery(value);
    }

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
    public  Object getUrlSpaceRegex() {
        return getPolymerElement().getUrlSpaceRegex();
    }
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
    public  void setUrlSpaceRegex(Object value) {
        getPolymerElement().setUrlSpaceRegex(value);
    }

    /**
     * <p>The hash component of the URL.</p>
     *
     * JavaScript Info:
     * @property hash
     * @type String
     * 
     */
    public  String getHash() {
        return getPolymerElement().getHash();
    }
    /**
     * <p>The hash component of the URL.</p>
     *
     * JavaScript Info:
     * @property hash
     * @type String
     * 
     */
    public  void setHash(String value) {
        getPolymerElement().setHash(value);
    }

    /**
     * <p>The pathname component of the URL.</p>
     *
     * JavaScript Info:
     * @property path
     * @type String
     * 
     */
    public  String getPath() {
        return getPolymerElement().getPath();
    }
    /**
     * <p>The pathname component of the URL.</p>
     *
     * JavaScript Info:
     * @property path
     * @type String
     * 
     */
    public  void setPath(String value) {
        getPolymerElement().setPath(value);
    }

    /**
     * <p>The query string portion of the URL.</p>
     *
     * JavaScript Info:
     * @property query
     * @type String
     * 
     */
    public  String getQuery() {
        return getPolymerElement().getQuery();
    }
    /**
     * <p>The query string portion of the URL.</p>
     *
     * JavaScript Info:
     * @property query
     * @type String
     * 
     */
    public  void setQuery(String value) {
        getPolymerElement().setQuery(value);
    }


    // Needed in UIBinder
    /**
     * <p>If the user was on a URL for less than <code>dwellTime</code> milliseconds, it
     * won’t be added to the browser’s history, but instead will be replaced
     * by the next entry.</p>
     * <p>This is to prevent large numbers of entries from clogging up the user’s
     * browser history. Disable by setting to a negative number.</p>
     *
     * JavaScript Info:
     * @attribute dwell-time
     * 
     */
    public void setDwellTime(String value) {
        Polymer.property(this.getPolymerElement(), "dwellTime", value);
    }

    // Needed in UIBinder
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
     * @attribute url-space-regex
     * 
     */
    public void setUrlSpaceRegex(String value) {
        Polymer.property(this.getPolymerElement(), "urlSpaceRegex", value);
    }



}
