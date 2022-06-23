package org.cns.design.adapter;

public class WeatherAdapter {

    public int findTemperature(int zipcode) {
        String city = null;
        if(zipcode == 12345) {
            city = "London";
        }
        WeatherFinder finder = new WeatherFinderImpl();
        int temp = finder.find(city);
        return temp;
    }
}
