package com.codeup.backendapi.dto;

import com.codeup.backendapi.data.Report;

public class CreateReportDto {

//    ----- FIELDS -----
    private String category;
    private String location;
    private String description;
    private String status = "unverified";
    private String moreDetails;

    public CreateReportDto(String category, String location, String description, String moreDetails) {
        this.category = category;
        this.location = location;
        this.description = description;
        this.moreDetails = moreDetails;
    }

    public CreateReportDto() {
    }


    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMoreDetails() {
        return moreDetails;
    }

    public void setMoreDetails(String moreDetails) {
        this.moreDetails = moreDetails;
    }
}
