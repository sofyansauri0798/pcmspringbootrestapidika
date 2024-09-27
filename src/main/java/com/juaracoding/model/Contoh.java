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
import java.time.LocalDate;

@Entity
@Table(uniqueConstraints = @UniqueConstraint(columnNames = {"namaContoh","deskripsiContoh","contohDouble"},name = "uhuy"),
        indexes =
                {
                        @Index(name = "idx_contoh_char",columnList = "contohChar"),
                        @Index(name = "idx_contoh_short",columnList = "contohShort")
                })
public class Contoh {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Short id;
    /** WAJIB DIRUBAH */
    private String namaContoh;
    private String deskripsiContoh;
    private Double contohDouble;
    private Byte contohByte;
    private Short contohShort;
    private Boolean contohBoolean;
    private Character contohChar;
    private LocalDate createdAt;
}
