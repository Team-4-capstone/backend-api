package com.codeup.backendapi.dto;

import com.codeup.backendapi.data.Report;

public class CreateReportDto {

//    ----- FIELDS -----
    private String category;
    private String lat;
    private String lon;
    private String moreDetails;
    private String img_path;
    private String size;
    private String color;
    private String quantity;
    private String secondaryColor;

    public CreateReportDto(String category, String lat, String lon, String moreDetails, String img_path, String size, String color, String quantity, String secondaryColor) {
        this.category = category;
        this.lat = lat;
        this.lon = lon;
        this.moreDetails = moreDetails;
        this.img_path = img_path;
        this.size = size;
        this.color = color;
        this.quantity = quantity;
        this.secondaryColor = secondaryColor;
    }

    public CreateReportDto() {
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getSecondaryColor() {
        return secondaryColor;
    }

    public void setSecondaryColor(String secondaryColor) {
        this.secondaryColor = secondaryColor;
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

    public String getImg_path() {
        return img_path;
    }

    public void setImg_path(String img_path) {
        this.img_path = img_path;
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
                ", moreDetails='" + moreDetails + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", quantity=" + quantity +
                ", secondaryColor='" + secondaryColor + '\'' +
                '}';
    }
}
