package com.codeup.backendapi.data;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="status")
@DynamicUpdate
public class Status {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String status = "unverified";

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "uxo_status",
            joinColumns =
            @JoinColumn(name = "reports_id"),
            inverseJoinColumns =
            @JoinColumn(name = "uxo_status"))

    private List<Report> report;


    public Status(Long id, String status) {
        this.id = id;
        this.status = status;
    }
    public Status(){};

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Report> getReport() {
        return report;
    }

    public void setReport(List<Report> report) {
        this.report = report;
    }
}
