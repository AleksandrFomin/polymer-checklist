/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from marked-element project by The Polymer Project Authors (https://polymer.github.io/AUTHORS.txt)
 * that is licensed with https://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.marked.event;

import elemental2.core.JsArray;
import com.google.gwt.core.client.JavaScriptObject;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import elemental2.dom.Element;
import com.vaadin.polymer.PolymerEvent;
import elemental2.dom.EventInit;
import elemental2.dom.EventTarget;

/**
 * <p>The <code>marked-render-complete</code> event is fired once Markdown to HTML
 * conversion has finished, and the DOM has been populated via the resulting
 * HTML.</p>
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Event")
public class MarkedRenderCompleteEvent extends PolymerEvent {

    @JsOverlay public static final String NAME = "marked-render-complete";

    public MarkedRenderCompleteEvent(EventInit eventInitDict) {
        super(NAME, eventInitDict);
    }

    public MarkedRenderCompleteEvent() {
        super(NAME);
    }


}
