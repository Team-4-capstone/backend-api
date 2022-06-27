package com.codeup.backendapi.data;

import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "categories")
@DynamicUpdate
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String category;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "uxo_categories",
            joinColumns =
            @JoinColumn(name = "reports_id"),
            inverseJoinColumns =
            @JoinColumn(name = "uxo_categories"))

    private List<Report> report;

    public Category(Long id, String category) {
        this.id = id;
        this.category = category;
    }

    public Category() {

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

    public List<Report> getReport() {
        return report;
    }

    public void setReport(List<Report> report) {
        this.report = report;
    }
}