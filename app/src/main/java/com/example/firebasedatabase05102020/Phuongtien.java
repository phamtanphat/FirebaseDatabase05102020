package com.example.firebasedatabase05102020;

public class Phuongtien {
    private String ten;
    private int sobanhxe;

    public Phuongtien(String ten, int sobanhxe) {
        this.ten = ten;
        this.sobanhxe = sobanhxe;
    }

    public Phuongtien() {
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSobanhxe() {
        return sobanhxe;
    }

    public void setSobanhxe(int sobanhxe) {
        this.sobanhxe = sobanhxe;
    }
}
