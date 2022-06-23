package org.cns.design.template;

public class CsvDataRenderer extends DataRenderer{

    @Override
    public String readData() {
        return "CsvData";
    }

    @Override
    public String processData(String data) {
        return data+" processed";
    }
}
