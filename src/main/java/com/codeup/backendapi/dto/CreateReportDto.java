package com.codeup.backendapi.dto;

import com.codeup.backendapi.data.Report;

public class CreateReportDto {

//    ----- FIELDS -----
    private String category;
    private String lat;
    private String lon;
    private String description;
    private String moreDetails;

    public CreateReportDto(String category, String lat, String lon, String description, String moreDetails) {
        this.category = category;
        this.description = description;
        this.moreDetails = moreDetails;
        this.lat = lat;
        this.lon = lon;
    }

    public CreateReportDto() {
    }


    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



    public String getMoreDetails() {
        return moreDetails;
    }

    public void setMoreDetails(String moreDetails) {
        this.moreDetails = moreDetails;
    }

    @Override
    public String toString() {
        return "CreateReportDto{" +
                "category='" + category + '\'' +
                ", lat='" + lat + '\'' +
                ", lon='" + lon + '\'' +
                ", description='" + description + '\'' +
                ", moreDetails='" + moreDetails + '\'' +
                '}';
    }
}
