package com.codeup.backendapi.domain;

import com.codeup.backendapi.data.Report;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "photos")
@DynamicUpdate
public class Photo {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String description;
    private String imagePath;
    private String imageFileName;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "uxo_photos",
            joinColumns =
            @JoinColumn(name = "reports_id"),
            inverseJoinColumns =
            @JoinColumn(name = "uxo_photos"))
    private List<Report> report;

    public List<Report> getReport() {
        return report;
    }

    public void setReport(List<Report> report) {
        this.report = report;
    }

    public Photo(String title, String description, String imagePath, String imageFileName) {
        this.title = title;
        this.description = description;
        this.imagePath = imagePath;
        this.imageFileName = imageFileName;
    }

    public Photo() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public String getImageFileName() {
        return imageFileName;
    }

    public void setImageFileName(String imageFileName) {
        this.imageFileName = imageFileName;
    }
}