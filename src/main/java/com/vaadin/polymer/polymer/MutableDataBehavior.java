/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from polymer project by The Polymer Authors (http://polymer.github.io/AUTHORS.txt)
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.polymer;

import elemental2.dom.*;
import com.google.gwt.core.client.JavaScriptObject;
import elemental2.core.JsArray;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import com.vaadin.polymer.PolymerFunction;


/**
 * <p>Legacy element behavior to skip strict dirty-checking for objects and arrays,
 * (always consider them to be “dirty”) for use on legacy API Polymer elements.</p>
 * <p>By default, <code>Polymer.PropertyEffects</code> performs strict dirty checking on
 * objects, which means that any deep modifications to an object or array will
 * not be propagated unless “immutable” data patterns are used (i.e. all object
 * references from the root to the mutation were changed).</p>
 * <p>Polymer also provides a proprietary data mutation and path notification API
 * (e.g. <code>notifyPath</code>, <code>set</code>, and array mutation API’s) that allow efficient
 * mutation and notification of deep changes in an object graph to all elements
 * bound to the same object graph.</p>
 * <p>In cases where neither immutable patterns nor the data mutation API can be
 * used, applying this mixin will cause Polymer to skip dirty checking for
 * objects and arrays (always consider them to be “dirty”).  This allows a
 * user to make a deep modification to a bound object graph, and then either
 * simply re-set the object (e.g. <code>this.items = this.items</code>) or call <code>notifyPath</code>
 * (e.g. <code>this.notifyPath(&#39;items&#39;)</code>) to update the tree.  Note that all
 * elements that wish to be updated based on deep mutations must apply this
 * mixin or otherwise skip strict dirty checking for objects/arrays.
 * Specifically, any elements in the binding tree between the source of a
 * mutation and the consumption of it must apply this behavior or enable the
 * <code>Polymer.OptionalMutableDataBehavior</code>.</p>
 * <p>In order to make the dirty check strategy configurable, see
 * <code>Polymer.OptionalMutableDataBehavior</code>.</p>
 * <p>Note, the performance characteristics of propagating large object graphs
 * will be worse as opposed to using strict dirty checking with immutable
 * patterns or Polymer’s path notification API.</p>
 */
@JsType(isNative=true)
public interface MutableDataBehavior {

    @JsOverlay public static final String NAME = "Polymer.MutableDataBehavior";
    @JsOverlay public static final String SRC = "polymer/polymer.html";
    @JsOverlay public default <T> T cast() {
      return (T)this;
    }



}
