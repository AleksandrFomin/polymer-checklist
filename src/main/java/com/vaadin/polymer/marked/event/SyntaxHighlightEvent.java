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
 * <p>Fired when the content is being processed and before it is rendered.
 * Provides an opportunity to highlight code blocks based on the programming language used. This
 * is also known as syntax highlighting. One example would be to use a prebuilt syntax
 * highlighting library, e.g with <a href="https://highlightjs.org/">highlightjs</a>.</p>
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Event")
public class SyntaxHighlightEvent extends PolymerEvent {

    @JsOverlay public static final String NAME = "syntax-highlight";

    public SyntaxHighlightEvent(EventInit eventInitDict) {
        super(NAME, eventInitDict);
    }

    public SyntaxHighlightEvent() {
        super(NAME);
    }


    @Override
    @JsProperty
    public native Detail getDetail();

    @JsType(isNative=true)
    public interface Detail extends PolymerEvent.Detail {

        /**
         * 
         */
        @JsProperty  String getCode();

        /**
         * 
         */
        @JsProperty  String getLang();

    }

}
