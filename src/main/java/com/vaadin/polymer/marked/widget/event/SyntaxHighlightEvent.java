/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from marked-element project by The Polymer Project Authors (https://polymer.github.io/AUTHORS.txt)
 * that is licensed with https://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.marked.widget.event;

import com.google.gwt.event.dom.client.DomEvent;
import elemental2.core.JsArray;
import com.google.gwt.core.client.JavaScriptObject;
import jsinterop.base.Js;

/**
 * <p>Fired when the content is being processed and before it is rendered.
 * Provides an opportunity to highlight code blocks based on the programming language used. This
 * is also known as syntax highlighting. One example would be to use a prebuilt syntax
 * highlighting library, e.g with <a href="https://highlightjs.org/">highlightjs</a>.</p>
 */
public class SyntaxHighlightEvent extends DomEvent<SyntaxHighlightEventHandler> {

    public static Type<SyntaxHighlightEventHandler> TYPE = new Type<SyntaxHighlightEventHandler>(
       com.vaadin.polymer.marked.event.SyntaxHighlightEvent.NAME, new SyntaxHighlightEvent());


    public SyntaxHighlightEvent() {
    }

    public Type<SyntaxHighlightEventHandler> getAssociatedType() {
        return TYPE;
    }

    protected void dispatch(SyntaxHighlightEventHandler handler) {
        handler.onSyntaxHighlight(this);
    }

    public com.vaadin.polymer.marked.event.SyntaxHighlightEvent getPolymerEvent() {
        return Js.cast(super.getNativeEvent());
    }


    /**
     * 
     */
    public  String getCode() {
        return getPolymerEvent().getDetail().getCode();
    }

    /**
     * 
     */
    public  String getLang() {
        return getPolymerEvent().getDetail().getLang();
    }

}
