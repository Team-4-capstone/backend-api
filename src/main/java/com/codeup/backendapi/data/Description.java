package com.codeup.backendapi.data;


import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "description")
@DynamicUpdate
public class Description {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String size;
    private String color;
    private String quantity;
    private String secondaryColor;
    private String img_path;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "uxo_description",
            joinColumns =
            @JoinColumn(name = "reports_id"),
            inverseJoinColumns =
            @JoinColumn(name = "uxo_description"))

    private List<Report> report;

    public Description(Long id, String size, String color, String quantity, String secondaryColor, String img_path, List<Report> report) {
        this.id = id;
        this.size = size;
        this.color = color;
        this.quantity = quantity;
        this.secondaryColor = secondaryColor;
        this.img_path = img_path;
        this.report = report;
    }

    public Description() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public List<Report> getReport() {
        return report;
    }

    public String getImg_path() {
        return img_path;
    }

    public void setImg_path(String img_path) {
        this.img_path = img_path;
    }

    public void setReport(List<Report> report) {
        this.report = report;
    }
}
