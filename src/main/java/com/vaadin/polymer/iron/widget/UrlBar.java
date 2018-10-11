/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-demo-helpers project by The Polymer Authors
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
public class UrlBar extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public UrlBar() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public UrlBar(String html) {
        super(UrlBarElement.TAG, UrlBarElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public UrlBarElement getPolymerElement() {
        return Js.cast(getElement());
    }


    /**
     * 
     *
     * JavaScript Info:
     * @property inIframe
     * @type Boolean
     * 
     */
    public  boolean getInIframe() {
        return getPolymerElement().getInIframe();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property inIframe
     * @type Boolean
     * 
     */
    public  void setInIframe(boolean value) {
        getPolymerElement().setInIframe(value);
    }

    /**
     * 
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
     * 
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
     * 
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
     * 
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
     * 
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
     * 
     *
     * JavaScript Info:
     * @property query
     * @type String
     * 
     */
    public  void setQuery(String value) {
        getPolymerElement().setQuery(value);
    }

    /**
     * 
     *
     * JavaScript Info:
     * @property url
     * @type String
     * 
     */
    public  String getUrl() {
        return getPolymerElement().getUrl();
    }
    /**
     * 
     *
     * JavaScript Info:
     * @property url
     * @type String
     * 
     */
    public  void setUrl(String value) {
        getPolymerElement().setUrl(value);
    }




}
