package com.codeup.backendapi.data;

import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Entity
@Table(name="reports")
@DynamicUpdate
public class Report {

//----- FIELDS -----
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String category;
    private Long location;
    private String description;
    private String status = "unverified";

    public Report(Long id, String category, Long location, String description, String status) {
        this.id = id;
        this.category = category;
        this.location = location;
        this.description = description;
        this.status = status;
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

    public Long getLocation() {
        return location;
    }

    public void setLocation(Long location) {
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
