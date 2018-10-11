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
 * <p><code>demo-snippet</code> is a helper element that displays the source of a code snippet and
 * its rendered demo. It can be used for both native elements and
 * Polymer elements.</p>
 * <pre><code>Example of a native element demo
 * 
 *     &lt;demo-snippet&gt;
 *       &lt;template&gt;
 *         &lt;input type=&quot;date&quot;&gt;
 *       &lt;/template&gt;
 *     &lt;/demo-snippet&gt;
 * 
 * Example of a Polymer &lt;paper-checkbox&gt; demo
 * 
 *     &lt;demo-snippet&gt;
 *       &lt;template&gt;
 *         &lt;paper-checkbox&gt;Checkbox&lt;/paper-checkbox&gt;
 *         &lt;paper-checkbox checked&gt;Checkbox&lt;/paper-checkbox&gt;
 *       &lt;/template&gt;
 *     &lt;/demo-snippet&gt;
 * 
 * </code></pre><h3 id="styling">Styling</h3>
 * <p>The following custom properties and mixins are available for styling:</p>
 * <p>Custom property | Description | Default
 * —————-|————-|———-
 * <code>--demo-snippet</code> | Mixin applied to the entire element | <code>{}</code>
 * <code>--demo-snippet-demo</code> | Mixin applied to just the demo section | <code>{}</code>
 * <code>--demo-snippet-code</code> | Mixin applied to just the code section | <code>{}</code></p>
 */
public class DemoSnippet extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public DemoSnippet() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public DemoSnippet(String html) {
        super(DemoSnippetElement.TAG, DemoSnippetElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public DemoSnippetElement getPolymerElement() {
        return Js.cast(getElement());
    }





}
