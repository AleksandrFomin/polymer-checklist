/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from prism-element project by The Polymer Project Authors (https://polymer.github.io/AUTHORS.txt)
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.prism.widget;

import com.vaadin.polymer.prism.*;

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
 * <p>Syntax highlighting via <a href="http://prismjs.com/">Prism</a>.</p>
 * <p>Place a <code>&lt;prism-highlighter&gt;</code> in your document, preferably as a direct child of
 * <code>&lt;body&gt;</code>. It will listen for <code>syntax-highlight</code> events on its parent element,
 * and annotate the code being provided via that event.</p>
 * <p>The <code>syntax-highlight</code> event’s detail is expected to have a <code>code</code> property
 * containing the source to highlight. The event detail can optionally contain a
 * <code>lang</code> property, containing a string like <code>&quot;html&quot;</code>, <code>&quot;js&quot;</code>, etc.</p>
 * <p>This flow is supported by <a href="https://github.com/PolymerElements/marked-element"><code>&lt;marked-element&gt;</code></a>.</p>
 */
public class PrismHighlighter extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public PrismHighlighter() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public PrismHighlighter(String html) {
        super(PrismHighlighterElement.TAG, PrismHighlighterElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public PrismHighlighterElement getPolymerElement() {
        return Js.cast(getElement());
    }


    /**
     * <p>Adds languages outside of the core Prism languages.</p>
     * <p>Prism includes a few languages in the core library:
     *   - JavaScript
     *   - Markup
     *   - CSS
     *   - C-Like
     * Use this property to extend the core set with other Prism
     * components and custom languages.</p>
     * <p>Example:
     *   <code>&lt;!-- with languages = {&#39;custom&#39;: myCustomPrismLang}; --&gt;
     *   &lt;!-- or languages = Prism.languages; --&gt;
     *   &lt;prism-highlighter languages=&quot;[[languages]]&quot;&gt;&lt;/prism-highlighter&gt;</code></p>
     *
     * JavaScript Info:
     * @property languages
     * @type !Object
     * 
     */
    public  JavaScriptObject getLanguages() {
        return getPolymerElement().getLanguages();
    }
    /**
     * <p>Adds languages outside of the core Prism languages.</p>
     * <p>Prism includes a few languages in the core library:
     *   - JavaScript
     *   - Markup
     *   - CSS
     *   - C-Like
     * Use this property to extend the core set with other Prism
     * components and custom languages.</p>
     * <p>Example:
     *   <code>&lt;!-- with languages = {&#39;custom&#39;: myCustomPrismLang}; --&gt;
     *   &lt;!-- or languages = Prism.languages; --&gt;
     *   &lt;prism-highlighter languages=&quot;[[languages]]&quot;&gt;&lt;/prism-highlighter&gt;</code></p>
     *
     * JavaScript Info:
     * @property languages
     * @type !Object
     * 
     */
    public  void setLanguages(JavaScriptObject value) {
        getPolymerElement().setLanguages(value);
    }


    // Needed in UIBinder
    /**
     * <p>Adds languages outside of the core Prism languages.</p>
     * <p>Prism includes a few languages in the core library:
     *   - JavaScript
     *   - Markup
     *   - CSS
     *   - C-Like
     * Use this property to extend the core set with other Prism
     * components and custom languages.</p>
     * <p>Example:
     *   <code>&lt;!-- with languages = {&#39;custom&#39;: myCustomPrismLang}; --&gt;
     *   &lt;!-- or languages = Prism.languages; --&gt;
     *   &lt;prism-highlighter languages=&quot;[[languages]]&quot;&gt;&lt;/prism-highlighter&gt;</code></p>
     *
     * JavaScript Info:
     * @attribute languages
     * 
     */
    public void setLanguages(String value) {
        Polymer.property(this.getPolymerElement(), "languages", value);
    }



}
