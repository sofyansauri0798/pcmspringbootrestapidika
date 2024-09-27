package com.juaracoding.model;
/*
IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on August 19, 2024
@Author Sofyan Sauri a.k.a. Sofyan Sauri
Java Developer
Created on 27/09/2024 17:58
@Last Modified 27/09/2024 17:58
Version 1.0
*/
import javax.persistence.*;

@Entity
public class ChildEntity {

    @Id
    private int id;

    private String namaChild;

    @ManyToOne
    @JoinColumn(name = "pe_id",foreignKey = @ForeignKey(name = "fk_par_to_ch"))
    private ParentEntity parentEntity;
}
