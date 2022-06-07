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
    private String img_file_path;
    private String color;
    private int quantity;
    private String secondaryColor;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "uxo_description",
            joinColumns =
            @JoinColumn(name = "reports_id"),
            inverseJoinColumns =
            @JoinColumn(name = "uxo_description"))

    private List<Report> report;

    public Description(Long id, String size, String img_file_path, String color, int quantity, String secondaryColor) {
        this.id = id;
        this.size = size;
        this.img_file_path = img_file_path;
        this.color = color;
        this.quantity = quantity;
        this.secondaryColor = secondaryColor;
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

    public List<Report> getReport() {
        return report;
    }

    public void setReport(List<Report> report) {
        this.report = report;
    }
}
