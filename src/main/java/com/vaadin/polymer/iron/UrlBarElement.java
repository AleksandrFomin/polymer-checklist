/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-demo-helpers project by The Polymer Authors
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
 * <p><code>url-bar</code> is a helper element that displays a simple read-only URL bar if
 * and only if the page is in an iframe. In this way we can demo elements that
 * deal with the URL in our iframe-based demo environments.</p>
 * <p>If the page is not in an iframe, the url-bar element is not displayed.</p>
 * <h3 id="styling">Styling</h3>
 * <p>The following custom properties and mixins are available for styling:</p>
 * <p>Custom property | Description | Default
 * —————-|————-|———-
 * <code>--url-bar</code> | Mixin applied to the entire element | <code>{}</code></p>
 */
@JsType(isNative=true, namespace = JsPackage.GLOBAL, name = "HTMLElement")
public class UrlBarElement extends PolymerElement {

    @JsOverlay public static final String TAG = "url-bar";
    @JsOverlay public static final String SRC = "iron-demo-helpers/url-bar.html";


    /**
     * 
     *
     * JavaScript Info:
     * @property inIframe
     * @type Boolean
     * 
     */
    @JsProperty public native  boolean getInIframe();
    /**
     * 
     *
     * JavaScript Info:
     * @property inIframe
     * @type Boolean
     * 
     */
    @JsProperty public native  void setInIframe(boolean value);

    /**
     * 
     *
     * JavaScript Info:
     * @property hash
     * @type String
     * 
     */
    @JsProperty public native  String getHash();
    /**
     * 
     *
     * JavaScript Info:
     * @property hash
     * @type String
     * 
     */
    @JsProperty public native  void setHash(String value);

    /**
     * 
     *
     * JavaScript Info:
     * @property path
     * @type String
     * 
     */
    @JsProperty public native  String getPath();
    /**
     * 
     *
     * JavaScript Info:
     * @property path
     * @type String
     * 
     */
    @JsProperty public native  void setPath(String value);

    /**
     * 
     *
     * JavaScript Info:
     * @property query
     * @type String
     * 
     */
    @JsProperty public native  String getQuery();
    /**
     * 
     *
     * JavaScript Info:
     * @property query
     * @type String
     * 
     */
    @JsProperty public native  void setQuery(String value);

    /**
     * 
     *
     * JavaScript Info:
     * @property url
     * @type String
     * 
     */
    @JsProperty public native  String getUrl();
    /**
     * 
     *
     * JavaScript Info:
     * @property url
     * @type String
     * 
     */
    @JsProperty public native  void setUrl(String value);


}
