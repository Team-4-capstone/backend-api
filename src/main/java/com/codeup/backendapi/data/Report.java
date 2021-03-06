package com.codeup.backendapi.data;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
    private String moreDetails;

    @JsonIgnoreProperties("report")
    @JoinTable(name = "uxo_location",
            joinColumns =
            @JoinColumn(name = "reports_id"),
            inverseJoinColumns =
            @JoinColumn(name = "uxo_location"))

    @OneToOne
    private Location location;

    @JsonIgnoreProperties("report")
    @JoinTable(name = "uxo_posts",
            joinColumns =
            @JoinColumn(name = "reports_id"),
            inverseJoinColumns =
            @JoinColumn(name = "uxo_posts"))
    @OneToMany
    private List<Posts> posts;


    public List<Posts> getPosts() {
        return posts;
    }

    public void setPosts(List<Posts> posts) {
        this.posts = posts;
    }

    @JsonIgnoreProperties("report")
    @JoinTable(name = "uxo_categories",
            joinColumns =
            @JoinColumn(name = "reports_id"),
            inverseJoinColumns =
            @JoinColumn(name = "uxo_categories"))

    @OneToOne
    private Category category;


    @JsonIgnoreProperties("report")
    @JoinTable(name = "uxo_description",
            joinColumns =
            @JoinColumn(name = "reports_id"),
            inverseJoinColumns =
            @JoinColumn(name = "uxo_description"))

    @OneToOne
    private Description description;

    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }


    @JsonIgnoreProperties("report")
    @JoinTable(name = "uxo_status",
            joinColumns =
            @JoinColumn(name = "reports_id"),
            inverseJoinColumns =
            @JoinColumn(name = "uxo_status"))

    @OneToOne
    private Status status;
    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Report(Long id, String moreDetails, Location location, Category category, Description description, Status status) {
        this.id = id;
        this.moreDetails = moreDetails;
        this.location = location;
        this.category = category;
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

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getMoreDetails() {
        return moreDetails;
    }

    public void setMoreDetails(String moreDetails) {
        this.moreDetails = moreDetails;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Report{" +
                "id=" + id +
                ", moreDetails='" + moreDetails + '\'' +
                ", location=" + location +
                ", category=" + category +
                ", description=" + description +
                ", status=" + status +
                '}';
    }
}