package com.codeup.backendapi.dto;

import com.codeup.backendapi.data.Report;

public class CreateReportDto {

//    ----- FIELDS -----
    private String category;
    private String lat;
    private String lon;
    private String moreDetails;

    private String size;
    private String img_file_path;
    private String color;
    private int quantity;
    private String secondaryColor;

    public CreateReportDto(String category, String lat, String lon, String moreDetails) {
        this.category = category;
        this.moreDetails = moreDetails;
        this.lat = lat;
        this.lon = lon;
    }

    public CreateReportDto() {
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getImg_file_path() {
        return img_file_path;
    }

    public void setImg_file_path(String img_file_path) {
        this.img_file_path = img_file_path;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
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
                ", img_file_path='" + img_file_path + '\'' +
                ", color='" + color + '\'' +
                ", quantity=" + quantity +
                ", secondaryColor='" + secondaryColor + '\'' +
                '}';
    }
}
