package id.sch.smktelkom_mlg.learn.recyclerview3.model;

import java.io.Serializable;

/**
 * Created by Mochammad Al_97 on 11/1/2016.
 */
public class Hotel implements Serializable {

    public String judul;
    public String descripsi;
    public String foto;
    public String detail;
    public String lokasi;

    public Hotel(String judul, String descripsi, String foto, String detail, String lokasi) {
        this.judul = judul;
        this.descripsi = descripsi;
        this.foto = foto;
        this.detail = detail;
        this.lokasi = lokasi;
    }
}
