package com.codeup.backendapi.data;

import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "reports")
@DynamicUpdate
public class Report {

    //----- FIELDS -----
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String category;
    private String description;
    private String status = "unverified";
    private String moreDetails;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "uxo_location",
            joinColumns =
            @JoinColumn(name = "uxo_location"),
            inverseJoinColumns =
            @JoinColumn(name = "uxo_reportid"))

    private List<Location> location;

    public Report(Long id, String category, String description, String moreDetails, Location location) {
        this.id = id;
        this.category = category;
        this.location = location;
        this.description = description;
        this.moreDetails = moreDetails;
    }

    public Report() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<Location> getLocation() {
        return location;
    }

    public void setLocation(List<Location> location) {
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

    @Override
    public String toString() {
        return "Report{" +
                "id=" + id +
                ", category='" + category + '\'' +
                ", location=" + location +
                ", description='" + description + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
