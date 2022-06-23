package org.cns.design.template;

public class XmlDataRenderer extends DataRenderer{

    @Override
    public String readData() {
        return "XmlData";
    }

    @Override
    public String processData(String data) {
        return data+" processed";
    }
}
