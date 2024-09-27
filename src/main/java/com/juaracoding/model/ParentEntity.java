package com.juaracoding.model;
/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on August 19, 2024
@Author Sofyan Sauri a.k.a. Sofyan Sauri
Java Developer
Created on 27/09/2024 17:59
@Last Modified 27/09/2024 17:59
Version 1.0
*/

import javax.persistence.*;
import java.util.List;

@Entity
public class ParentEntity {
    @Id
    private Long id;

    @Column(unique=true)
    private String name;

    /** modified when migration */
    @Column(length=15,nullable = false)
    private String namaParent;

    private String active;

    @OneToMany(mappedBy = "parentEntity",cascade = CascadeType.PERSIST)
    private List<ChildEntity> child;

    public String getNamaParent() {
        return namaParent;
    }

    public void setNamaParent(String namaParent) {
        this.namaParent = namaParent;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<ChildEntity> getChild() {
        return child;
    }

    public void setChild(List<ChildEntity> child) {
        this.child = child;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
