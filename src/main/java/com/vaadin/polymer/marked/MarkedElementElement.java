/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from marked-element project by The Polymer Project Authors (https://polymer.github.io/AUTHORS.txt)
 * that is licensed with https://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.marked;

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
@JsType(isNative=true, namespace = JsPackage.GLOBAL, name = "HTMLElement")
public class MarkedElementElement extends PolymerElement {

    @JsOverlay public static final String TAG = "marked-element";
    @JsOverlay public static final String SRC = "marked-element/marked-element.html";


    /**
     * <p>Enable GFM line breaks (regular newlines instead of two spaces for breaks)</p>
     *
     * JavaScript Info:
     * @property breaks
     * @type Boolean
     * 
     */
    @JsProperty public native  boolean getBreaks();
    /**
     * <p>Enable GFM line breaks (regular newlines instead of two spaces for breaks)</p>
     *
     * JavaScript Info:
     * @property breaks
     * @type Boolean
     * 
     */
    @JsProperty public native  void setBreaks(boolean value);

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
    @JsProperty public native  boolean getDisableRemoteSanitization();
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
    @JsProperty public native  void setDisableRemoteSanitization(boolean value);

    /**
     * <p>A reference to the XMLHttpRequest instance used to generate the
     * network request.</p>
     *
     * JavaScript Info:
     * @property xhr
     * @type XMLHttpRequest
     * 
     */
    @JsProperty public native  JavaScriptObject getXhr();
    /**
     * <p>A reference to the XMLHttpRequest instance used to generate the
     * network request.</p>
     *
     * JavaScript Info:
     * @property xhr
     * @type XMLHttpRequest
     * 
     */
    @JsProperty public native  void setXhr(JavaScriptObject value);

    /**
     * <p>Conform to obscure parts of markdown.pl as much as possible. Don’t fix any of the original markdown bugs or poor behavior.</p>
     *
     * JavaScript Info:
     * @property pedantic
     * @type Boolean
     * 
     */
    @JsProperty public native  boolean getPedantic();
    /**
     * <p>Conform to obscure parts of markdown.pl as much as possible. Don’t fix any of the original markdown bugs or poor behavior.</p>
     *
     * JavaScript Info:
     * @property pedantic
     * @type Boolean
     * 
     */
    @JsProperty public native  void setPedantic(boolean value);

    /**
     * <p>Sanitize the output. Ignore any HTML that has been input.</p>
     *
     * JavaScript Info:
     * @property sanitize
     * @type Boolean
     * 
     */
    @JsProperty public native  boolean getSanitize();
    /**
     * <p>Sanitize the output. Ignore any HTML that has been input.</p>
     *
     * JavaScript Info:
     * @property sanitize
     * @type Boolean
     * 
     */
    @JsProperty public native  void setSanitize(boolean value);

    /**
     * <p>Use “smart” typographic punctuation for things like quotes and dashes.</p>
     *
     * JavaScript Info:
     * @property smartypants
     * @type Boolean
     * 
     */
    @JsProperty public native  boolean getSmartypants();
    /**
     * <p>Use “smart” typographic punctuation for things like quotes and dashes.</p>
     *
     * JavaScript Info:
     * @property smartypants
     * @type Boolean
     * 
     */
    @JsProperty public native  void setSmartypants(boolean value);

    /**
     * <p>Callback function invoked by Marked after HTML has been rendered.
     * It must take two arguments: err and text and must return the resulting text.</p>
     *
     * JavaScript Info:
     * @property callback
     * @type Function
     * 
     */
    @JsProperty public native  PolymerFunction getCallback();
    /**
     * <p>Callback function invoked by Marked after HTML has been rendered.
     * It must take two arguments: err and text and must return the resulting text.</p>
     *
     * JavaScript Info:
     * @property callback
     * @type Function
     * 
     */
    @JsProperty public native  void setCallback(PolymerFunction value);

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
    @JsProperty public native  PolymerFunction getSanitizer();
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
    @JsProperty public native  void setSanitizer(PolymerFunction value);

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
    @JsProperty public native  PolymerFunction getRenderer();
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
    @JsProperty public native  void setRenderer(PolymerFunction value);

    /**
     * <p>The markdown source that should be rendered by this element.</p>
     *
     * JavaScript Info:
     * @property markdown
     * @type String
     * 
     */
    @JsProperty public native  String getMarkdown();
    /**
     * <p>The markdown source that should be rendered by this element.</p>
     *
     * JavaScript Info:
     * @property markdown
     * @type String
     * 
     */
    @JsProperty public native  void setMarkdown(String value);


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
    public native void render();

    /**
     * <p>Unindents the markdown source that will be rendered.</p>
     *
     * JavaScript Info:
     * @method unindent
     * @param {string} text  
     * 
     * @return {String}
     */
    public native String unindent(String text);

}
