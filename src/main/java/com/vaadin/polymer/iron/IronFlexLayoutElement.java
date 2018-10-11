/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from iron-flex-layout project by The Polymer Authors
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
 * <p>The <code>&lt;iron-flex-layout&gt;</code> component provides simple ways to use
 * <a href="https://developer.mozilla.org/en-US/docs/Web/Guide/CSS/Flexible_boxes">CSS flexible box layout</a>,
 * also known as flexbox. This component provides two different ways to use flexbox:</p>
 * <ol>
 * <li><p><a href="https://github.com/PolymerElements/iron-flex-layout/tree/master/iron-flex-layout-classes.html">Layout classes</a>.
 * The layout class stylesheet provides a simple set of class-based flexbox rules, that
 * let you specify layout properties directly in markup. You must include this file
 * in every element that needs to use them.</p>
 * <p>Sample use:</p>
 * <p>```
 * <custom-element-demo>
 *   <template></p>
 * <pre><code>&lt;script src=&quot;../webcomponentsjs/webcomponents-lite.js&quot;&gt;&lt;/script&gt;
 * &lt;next-code-block&gt;&lt;/next-code-block&gt;
 * </code></pre><p>  </template>
 * </custom-element-demo>
 * ```</p>
 * <p><code>html
 * &lt;link rel=&quot;import&quot; href=&quot;iron-flex-layout-classes.html&quot;&gt;
 * &lt;style is=&quot;custom-style&quot; include=&quot;iron-flex iron-flex-alignment&quot;&gt;&lt;/style&gt;
 * &lt;style&gt;
 *   .test { width: 100px; }
 * &lt;/style&gt;
 * &lt;div class=&quot;layout horizontal center-center&quot;&gt;
 *   &lt;div class=&quot;test&quot;&gt;horizontal layout center alignment&lt;/div&gt;
 * &lt;/div&gt;</code></p>
 * </li>
 * <li><p><a href="https://github.com/PolymerElements/iron-flex-layout/blob/master/iron-flex-layout.html">Custom CSS mixins</a>.
 * The mixin stylesheet includes custom CSS mixins that can be applied inside a CSS rule using the <code>@apply</code> function.</p>
 * </li>
 * </ol>
 * <p>Please note that the old <a href="https://github.com/PolymerElements/iron-flex-layout/tree/master/classes">/deep/ layout classes</a>
 * are deprecated, and should not be used. To continue using layout properties
 * directly in markup, please switch to using the new <code>dom-module</code>-based
 * <a href="https://github.com/PolymerElements/iron-flex-layout/tree/master/iron-flex-layout-classes.html">layout classes</a>.
 * Please note that the new version does not use <code>/deep/</code>, and therefore requires you
 * to import the <code>dom-modules</code> in every element that needs to use them.</p>
 * <p>A complete <a href="https://elements.polymer-project.org/guides/flex-layout">guide</a> to <code>&lt;iron-flex-layout&gt;</code> is available.</p>
 */
@JsType(isNative=true, namespace = JsPackage.GLOBAL, name = "HTMLElement")
public class IronFlexLayoutElement extends PolymerElement {

    @JsOverlay public static final String TAG = "iron-flex-layout";
    @JsOverlay public static final String SRC = "iron-flex-layout/iron-flex-layout.html";



}
