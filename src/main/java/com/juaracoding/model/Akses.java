package com.juaracoding.model;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Akses {

    @Id
    private int id;

    //    @JsonProperty("nama_akses")
    private String namaAkses;


//    private User user;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamaAkses() {
        return namaAkses;
    }

    public void setNamaAkses(String namaAkses) {
        this.namaAkses = namaAkses;
    }
}
