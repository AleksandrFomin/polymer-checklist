/*
 * This code was generated with Vaadin Web Component GWT API Generator, 
 * from test-fixture project by unknown author
 * that is licensed with http://polymer.github.io/LICENSE.txt license.
 */
package com.vaadin.polymer.test.widget;

import com.vaadin.polymer.test.*;

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
 * <p>The <code>&lt;test-fixture&gt;</code> element can simplify the exercise of consistently
 * resetting a test suite’s DOM. To use it, wrap the test suite’s DOM as a template:</p>
 * <p><code>html
 * &lt;test-fixture id=&quot;SomeElementFixture&quot;&gt;
 *   &lt;template&gt;
 *     &lt;some-element id=&quot;SomeElementForTesting&quot;&gt;&lt;/some-element&gt;
 *   &lt;/template&gt;
 * &lt;/test-fixture&gt;</code></p>
 * <p>Now, the <code>&lt;test-fixture&gt;</code> element can be used to generate a copy of its
 * template:</p>
 * <p>```html</p>
 * <p><script>
 * describe('<some-element>', function () {
 *   var someElement;</p>
 * <p>  beforeEach(function () {
 *     document.getElementById('SomeElementFixture').create();
 *     someElement = document.getElementById('SomeElementForTesting');
 *   });
 * });
 * </script>
 * ```</p>
 * <p>Fixtured elements can be cleaned up by calling <code>restore</code> on the <code>&lt;test-fixture&gt;</code>:</p>
 * <p><code>javascript
 *   afterEach(function () {
 *     document.getElementById(&#39;SomeElementFixture&#39;).restore();
 *     // &lt;some-element id=&#39;SomeElementForTesting&#39;&gt; has been removed
 *   });</code></p>
 * <p><code>&lt;test-fixture&gt;</code> will create fixtures from all of its immediate <code>&lt;template&gt;</code>
 * children. The DOM structure of fixture templates can be as simple or as complex
 * as the situation calls for.</p>
 * <h2 id="even-simpler-usage-in-mocha">Even simpler usage in Mocha</h2>
 * <p>In Mocha, usage can be simplified even further. Include <code>test-fixture-mocha.js</code>
 * after Mocha in the <code>&lt;head&gt;</code> of your document and then fixture elements like so:</p>
 * <p>```html</p>
 * <p><script>
 * describe('<some-element>', function () {
 *   var someElement;</p>
 * <p>  beforeEach(function () {
 *     someElement = fixture('SomeElementFixture');
 *   });
 * });
 * </script>
 * ```</p>
 * <p>Fixtured elements will be automatically restored in the <code>afterEach</code> phase of the
 * current Mocha <code>Suite</code>.</p>
 * <h2 id="data-bound-templates">Data-bound templates</h2>
 * <p>Data-binding systems are also supported, as long as your (custom) template
 * elements define a <code>stamp(model)</code> method that returns a document fragment. This
 * allows you to stamp out templates w/ custom models for your fixtures.</p>
 * <p>For example, using Polymer 0.8’s <code>dom-template</code>:</p>
 * <p><code>html
 * &lt;test-fixture id=&quot;bound&quot;&gt;
 *   &lt;template is=&quot;dom-template&quot;&gt;
 *     &lt;span&gt;{{greeting}}&lt;/span&gt;
 *   &lt;/template&gt;
 * &lt;/test-fixture&gt;</code></p>
 * <p>You can pass an optional context argument to <code>create()</code> or <code>fixture()</code> to pass
 * the model:</p>
 * <p><code>js
 * var bound = fixture(&#39;bound&#39;, {greeting: &#39;ohai thurr&#39;});</code></p>
 * <h2 id="the-problem-being-addressed">The problem being addressed</h2>
 * <p>Consider the following <code>web-component-tester</code> test suite:</p>
 * <p>```html
 * <!doctype html></p>
 * <p><html></p>
 * <p><head>
 *   <title>some-element test suite</title></p>
 * <p>  <link rel="import" href="../some-element.html"></p>
 * <p></head></p>
 * <p><body>
 *   <some-element id="SomeElementForTesting"></some-element>
 *   <script>
 * describe('<some-element>', function () {
 *   var someElement;</p>
 * <p>  beforeEach(function () {
 *     someElement = document.getElementById('SomeElementForTesting');
 *   });</p>
 * <p>  it('can receive property <code>foo</code>', function () {
 *     someElement.foo = 'bar';
 *     expect(someElement.foo).to.be.equal('bar');
 *   });</p>
 * <p>  it('has a default <code>foo</code> value of <code>undefined</code>', function () {
 *     expect(someElement.foo).to.be.equal(undefined);
 *   });
 * });
 *   </script></p>
 * <p></body></p>
 * <p></html>
 * ```</p>
 * <p>In this contrived example, the suite will pass or fail depending on which order
 * the tests are run in. It is non-deterministic because <code>someElement</code> has
 * internal state that is not properly reset at the end of each test.</p>
 * <p>It would be trivial in the above example to simply reset <code>someElement.foo</code> to
 * the expected default value of <code>undefined</code> in an <code>afterEach</code> hook. However, for
 * non-contrived test suites that target complex elements, this can result in a
 * large quantity of ever-growing set-up and tear-down boilerplate.</p>
 */
public class TestFixture extends PolymerWidget {
    /**
     * Default Constructor.
     */
    public TestFixture() {
       this("");
    }

    /**
     * Constructor used by UIBinder to create widgets with content.
     */
    public TestFixture(String html) {
        super(TestFixtureElement.TAG, TestFixtureElement.SRC, html);
    }

    /**
     * Gets a handle to the Polymer object's underlying DOM element.
     */
    public TestFixtureElement getPolymerElement() {
        return Js.cast(getElement());
    }





}
