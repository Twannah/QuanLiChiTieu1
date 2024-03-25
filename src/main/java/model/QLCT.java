/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;

/**
 *
 * @author ADMIN
 */
public class QLCT {
    private int id;
    private String nguon;
    private Double SoTien;
    private LocalDate ngay;
    private String noidung;

    public QLCT() {
    }

    public QLCT(int id, String nguon, Double SoTien,
            LocalDate ngay, String noidung) {
        this.id = id;
        this.nguon = nguon;
        this.SoTien = SoTien;
        this.ngay = ngay;
        this.noidung = noidung;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNguon() {
        return nguon;
    }

    public void setNguon(String nguon) {
        this.nguon = nguon;
    }

    public Double getSoTien() {
        return SoTien;
    }

    public void setSoTien(Double SoTien) {
        this.SoTien = SoTien;
    }

    public LocalDate getNgay() {
        return ngay;
    }

    public void setNgay(LocalDate ngay) {
        this.ngay = ngay;
    }

    public String getNoidung() {
        return noidung;
    }

    public void setNoidung(String noidung) {
        this.noidung = noidung;
    }
}
