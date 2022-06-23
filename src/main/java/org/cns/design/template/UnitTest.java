package org.cns.design.template;

public class UnitTest {

    public static void main(String[] args) {
        DataRenderer renderer = new XmlDataRenderer();
        renderer.render();
        renderer = new CsvDataRenderer();
        renderer.render();
    }
}
