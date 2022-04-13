package com.example.happycovidtrackerapp;

import java.util.Map;

public class ResponseModel {

    String country;
    public Map<String, String> countryInfo;

    public ResponseModel() {
    }

    public ResponseModel(String country, Map<String, String> countryInfo) {
        this.country = country;
        this.countryInfo = countryInfo;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Map<String, String> getCountryInfo() {
        return countryInfo;
    }

    public void setCountryInfo(Map<String, String> countryInfo) {
        this.countryInfo = countryInfo;
    }
}
