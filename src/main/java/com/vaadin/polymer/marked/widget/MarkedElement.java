/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from marked-element project by The Polymer Project Authors (https://polymer.github.io/AUTHORS.txt)
 * that is licensed with https://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.marked.widget;

import com.vaadin.polymer.marked.*;

import com.vaadin.polymer.marked.widget.event.MarkedLoadendEvent;
import com.vaadin.polymer.marked.widget.event.MarkedLoadendEventHandler;

import com.vaadin.polymer.marked.widget.event.MarkedRenderCompleteEvent;
import com.vaadin.polymer.marked.widget.event.MarkedRenderCompleteEventHandler;

import com.vaadin.polymer.marked.widget.event.MarkedRequestErrorEvent;
import com.vaadin.polymer.marked.widget.event.MarkedRequestErrorEventHandler;

import com.vaadin.polymer.marked.widget.event.SyntaxHighlightEvent;
import com.vaadin.polymer.marked.widget.event.SyntaxHighlightEventHandler;

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
 * <p>Element wrapper for the <a href="https://github.com/chjj/marked">marked</a> library.</p>
 * <p><code>&lt;marked-element&gt;</code> accepts Markdown source and renders it to a child
 * element with the class <code>markdown-html</code>. This child element can be styled
 * as you would a normal DOM element. If you do not provide a child element
 * with the <code>markdown-html</code> class, the Markdown source will still be rendered,
 * but to a shadow DOM child that cannot be styled.</p>
 * <h3 id="markdown-content">Markdown Content</h3>
 * <p>The Markdown source can be specified several ways:</p>
 * <h4 id="use-the-markdown-attribute-to-bind-markdown">Use the <code>markdown</code> attribute to bind markdown</h4>
 * <pre><code>&lt;marked-element markdown=&quot;`Markdown` is _awesome_!&quot;&gt;
 *   &lt;div slot=&quot;markdown-html&quot;&gt;&lt;/div&gt;
 * &lt;/marked-element&gt;
 * 
 * </code></pre><h4 id="use-script-type-text-markdown-element-child-to-inline-markdown">Use <code>&lt;script type=&quot;text/markdown&quot;&gt;</code> element child to inline markdown</h4>
 * <pre><code>&lt;marked-element&gt;
 *   &lt;div slot=&quot;markdown-html&quot;&gt;&lt;/div&gt;
 *   &lt;script type=&quot;text/markdown&quot;&gt;
 *     Check out my markdown!
 * 
 *     We can even embed elements without fear of the HTML parser mucking up their
 *     textual representation:
 * 
 *     ```html
 *     &lt;awesome-sauce&gt;
 *       &lt;div&gt;Oops, I&#39;m about to forget to close this div.
 *     &lt;/awesome-sauce&gt;
 *     ```
 *   &lt;/script&gt;
 * &lt;/marked-element&gt;
 * 
 * </code></pre><h4 id="use-script-type-text-markdown-src-url-element-child-to-specify-remote-markdown">Use <code>&lt;script type=&quot;text/markdown&quot; src=&quot;URL&quot;&gt;</code> element child to specify remote markdown</h4>
 * <pre><code>&lt;marked-element&gt;
 *   &lt;div slot=&quot;markdown-html&quot;&gt;&lt;/div&gt;
 *   &lt;script type=&quot;text/markdown&quot; src=&quot;../guidelines.md&quot;&gt;&lt;/script&gt;
 * &lt;/marked-element&gt;
 * 
 * </code></pre><p>Note that the <code>&lt;script type=&quot;text/markdown&quot;&gt;</code> approach is <em>static</em>. Changes to
 * the script content will <em>not</em> update the rendered markdown!</p>
 * <p>Though, you can data bind to the <code>src</code> attribute to change the markdown.</p>
 * <p>```html
 * <marked-element>
 *   <div slot="markdown-html"></div>
 *   &lt;script type=”text/markdown” src$=”[[source]]”&gt;</script>
 * </marked-element>
 * …</p>
 * <p><script>
 *   ...
 *   this.source = '../guidelines.md';
 * </script>
 * ```</p>
 * <h3 id="styling">Styling</h3>
 * <p>If you are using a child with the <code>markdown-html</code> class, you can style it
 * as you would a regular DOM element:</p>
 * <pre><code>[slot=&quot;markdown-html&quot;] p {
 *   color: red;
 * }
 * 
 * [slot=&quot;markdown-html&quot;] td:first-child {
 *   padding-left: 24px;
 * }
 * 
 * </code></pre>
 */
public class MarkedElement extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public MarkedElement() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public MarkedElement(String html) {
        super(MarkedElementElement.TAG, MarkedElementElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public MarkedElementElement getPolymerElement() {
        return Js.cast(getElement());
    }


    /**
     * <p>Enable GFM line breaks (regular newlines instead of two spaces for breaks)</p>
     *
     * JavaScript Info:
     * @property breaks
     * @type Boolean
     * 
     */
    public  boolean getBreaks() {
        return getPolymerElement().getBreaks();
    }
    /**
     * <p>Enable GFM line breaks (regular newlines instead of two spaces for breaks)</p>
     *
     * JavaScript Info:
     * @property breaks
     * @type Boolean
     * 
     */
    public  void setBreaks(boolean value) {
        getPolymerElement().setBreaks(value);
    }

    /**
     * <p>If true, disables the default sanitization of any markdown received by
     * a request and allows fetched unsanitized markdown</p>
     * <p>e.g. fetching markdown via <code>src</code> that has HTML.
     * Note: this value overrides <code>sanitize</code> if a request is made.</p>
     *
     * JavaScript Info:
     * @property disableRemoteSanitization
     * @type Boolean
     * 
     */
    public  boolean getDisableRemoteSanitization() {
        return getPolymerElement().getDisableRemoteSanitization();
    }
    /**
     * <p>If true, disables the default sanitization of any markdown received by
     * a request and allows fetched unsanitized markdown</p>
     * <p>e.g. fetching markdown via <code>src</code> that has HTML.
     * Note: this value overrides <code>sanitize</code> if a request is made.</p>
     *
     * JavaScript Info:
     * @property disableRemoteSanitization
     * @type Boolean
     * 
     */
    public  void setDisableRemoteSanitization(boolean value) {
        getPolymerElement().setDisableRemoteSanitization(value);
    }

    /**
     * <p>A reference to the XMLHttpRequest instance used to generate the
     * network request.</p>
     *
     * JavaScript Info:
     * @property xhr
     * @type XMLHttpRequest
     * 
     */
    public  JavaScriptObject getXhr() {
        return getPolymerElement().getXhr();
    }
    /**
     * <p>A reference to the XMLHttpRequest instance used to generate the
     * network request.</p>
     *
     * JavaScript Info:
     * @property xhr
     * @type XMLHttpRequest
     * 
     */
    public  void setXhr(JavaScriptObject value) {
        getPolymerElement().setXhr(value);
    }

    /**
     * <p>Conform to obscure parts of markdown.pl as much as possible. Don’t fix any of the original markdown bugs or poor behavior.</p>
     *
     * JavaScript Info:
     * @property pedantic
     * @type Boolean
     * 
     */
    public  boolean getPedantic() {
        return getPolymerElement().getPedantic();
    }
    /**
     * <p>Conform to obscure parts of markdown.pl as much as possible. Don’t fix any of the original markdown bugs or poor behavior.</p>
     *
     * JavaScript Info:
     * @property pedantic
     * @type Boolean
     * 
     */
    public  void setPedantic(boolean value) {
        getPolymerElement().setPedantic(value);
    }

    /**
     * <p>Sanitize the output. Ignore any HTML that has been input.</p>
     *
     * JavaScript Info:
     * @property sanitize
     * @type Boolean
     * 
     */
    public  boolean getSanitize() {
        return getPolymerElement().getSanitize();
    }
    /**
     * <p>Sanitize the output. Ignore any HTML that has been input.</p>
     *
     * JavaScript Info:
     * @property sanitize
     * @type Boolean
     * 
     */
    public  void setSanitize(boolean value) {
        getPolymerElement().setSanitize(value);
    }

    /**
     * <p>Use “smart” typographic punctuation for things like quotes and dashes.</p>
     *
     * JavaScript Info:
     * @property smartypants
     * @type Boolean
     * 
     */
    public  boolean getSmartypants() {
        return getPolymerElement().getSmartypants();
    }
    /**
     * <p>Use “smart” typographic punctuation for things like quotes and dashes.</p>
     *
     * JavaScript Info:
     * @property smartypants
     * @type Boolean
     * 
     */
    public  void setSmartypants(boolean value) {
        getPolymerElement().setSmartypants(value);
    }

    /**
     * <p>Callback function invoked by Marked after HTML has been rendered.
     * It must take two arguments: err and text and must return the resulting text.</p>
     *
     * JavaScript Info:
     * @property callback
     * @type Function
     * 
     */
    public  PolymerFunction getCallback() {
        return getPolymerElement().getCallback();
    }
    /**
     * <p>Callback function invoked by Marked after HTML has been rendered.
     * It must take two arguments: err and text and must return the resulting text.</p>
     *
     * JavaScript Info:
     * @property callback
     * @type Function
     * 
     */
    public  void setCallback(PolymerFunction value) {
        getPolymerElement().setCallback(value);
    }

    /**
     * <p>Function used to customize a sanitize behavior.
     * It takes one argument: element String without text Contents.</p>
     * <p>e.g. <code>&lt;div&gt;</code> <code>&lt;a href=&quot;/&quot;&gt;</code> <code>&lt;/p&gt;&#39;.
     * Note: To enable this function, must set</code>sanitize` to true.
     * WARNING: If you are using this option to untrusted text, you must to prevent XSS Attacks.</p>
     *
     * JavaScript Info:
     * @property sanitizer
     * @type Function
     * 
     */
    public  PolymerFunction getSanitizer() {
        return getPolymerElement().getSanitizer();
    }
    /**
     * <p>Function used to customize a sanitize behavior.
     * It takes one argument: element String without text Contents.</p>
     * <p>e.g. <code>&lt;div&gt;</code> <code>&lt;a href=&quot;/&quot;&gt;</code> <code>&lt;/p&gt;&#39;.
     * Note: To enable this function, must set</code>sanitize` to true.
     * WARNING: If you are using this option to untrusted text, you must to prevent XSS Attacks.</p>
     *
     * JavaScript Info:
     * @property sanitizer
     * @type Function
     * 
     */
    public  void setSanitizer(PolymerFunction value) {
        getPolymerElement().setSanitizer(value);
    }

    /**
     * <p>Function used to customize a renderer based on the <a href="https://github.com/chjj/marked#overriding-renderer-methods">API specified in the Marked
     * library</a>.
     * It takes one argument: a marked renderer object, which is mutated by the function.</p>
     *
     * JavaScript Info:
     * @property renderer
     * @type Function
     * 
     */
    public  PolymerFunction getRenderer() {
        return getPolymerElement().getRenderer();
    }
    /**
     * <p>Function used to customize a renderer based on the <a href="https://github.com/chjj/marked#overriding-renderer-methods">API specified in the Marked
     * library</a>.
     * It takes one argument: a marked renderer object, which is mutated by the function.</p>
     *
     * JavaScript Info:
     * @property renderer
     * @type Function
     * 
     */
    public  void setRenderer(PolymerFunction value) {
        getPolymerElement().setRenderer(value);
    }

    /**
     * <p>The markdown source that should be rendered by this element.</p>
     *
     * JavaScript Info:
     * @property markdown
     * @type String
     * 
     */
    public  String getMarkdown() {
        return getPolymerElement().getMarkdown();
    }
    /**
     * <p>The markdown source that should be rendered by this element.</p>
     *
     * JavaScript Info:
     * @property markdown
     * @type String
     * 
     */
    public  void setMarkdown(String value) {
        getPolymerElement().setMarkdown(value);
    }


    // Needed in UIBinder
    /**
     * <p>A reference to the XMLHttpRequest instance used to generate the
     * network request.</p>
     *
     * JavaScript Info:
     * @attribute xhr
     * 
     */
    public void setXhr(String value) {
        Polymer.property(this.getPolymerElement(), "xhr", value);
    }


    /**
     * <p>Renders <code>markdown</code> into this element’s DOM.</p>
     * <p>This is automatically called whenever the <code>markdown</code> property is changed.</p>
     * <p>The only case where you should be calling this is if you are providing
     * markdown via <code>&lt;script type=&quot;text/markdown&quot;&gt;</code> after this element has been
     * constructed (or updating that markdown).</p>
     *
     * JavaScript Info:
     * @method render
     * 
     * 
     */
    public void render() {
        getPolymerElement().render();
    }

    /**
     * <p>Unindents the markdown source that will be rendered.</p>
     *
     * JavaScript Info:
     * @method unindent
     * @param {string} text  
     * 
     * @return {String}
     */
    public String unindent(String text) {
        return getPolymerElement().unindent(text);
    }


    /**
     * <p>Fired when the XHR finishes loading</p>
     *
     * JavaScript Info:
     * @event marked-loadend
     */
    public HandlerRegistration addMarkedLoadendHandler(MarkedLoadendEventHandler handler) {
        return addDomHandler(handler, MarkedLoadendEvent.TYPE);
    }

    /**
     * <p>The <code>marked-render-complete</code> event is fired once Markdown to HTML
     * conversion has finished, and the DOM has been populated via the resulting
     * HTML.</p>
     *
     * JavaScript Info:
     * @event marked-render-complete
     */
    public HandlerRegistration addMarkedRenderCompleteHandler(MarkedRenderCompleteEventHandler handler) {
        return addDomHandler(handler, MarkedRenderCompleteEvent.TYPE);
    }

    /**
     * <p>Fired when an error is received while fetching remote markdown content.</p>
     *
     * JavaScript Info:
     * @event marked-request-error
     */
    public HandlerRegistration addMarkedRequestErrorHandler(MarkedRequestErrorEventHandler handler) {
        return addDomHandler(handler, MarkedRequestErrorEvent.TYPE);
    }

    /**
     * <p>Fired when the content is being processed and before it is rendered.
     * Provides an opportunity to highlight code blocks based on the programming language used. This
     * is also known as syntax highlighting. One example would be to use a prebuilt syntax
     * highlighting library, e.g with <a href="https://highlightjs.org/">highlightjs</a>.</p>
     *
     * JavaScript Info:
     * @event syntax-highlight
     */
    public HandlerRegistration addSyntaxHighlightHandler(SyntaxHighlightEventHandler handler) {
        return addDomHandler(handler, SyntaxHighlightEvent.TYPE);
    }

}
