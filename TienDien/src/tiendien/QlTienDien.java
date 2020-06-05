/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendien;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author trant
 */
public class QlTienDien {

    private String maso;
    private String hoten;
    private Date ngayrahd;
    protected int so_kw;
    protected int dongia;

    @Override
    public boolean equals(Object obj) {
        return this.maso.equalsIgnoreCase(((QlTienDien) obj).maso); //To change body of generated methods, choose Tools | Templates.

    }

    @Override
    public String toString() {
        return " maso=" + maso + ", hoten=" + hoten + ", ngayrahd=" + ngayrahd + ", so_kw=" + so_kw + ", dongia=" + dongia + '}';
    }

    public String getMaso() {
        return maso;
    }

    public void setMaso(String maso) {
        this.maso = maso;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public Date getNgayrahd() {
        return ngayrahd;
    }

    public void setNgayrahd(Date ngayrahd) {
        this.ngayrahd = ngayrahd;
    }

    public int getSo_kw() {
        return so_kw;
    }

    public void setSo_kw(int so_kw) {
        this.so_kw = so_kw;
    }

    public int getDongia() {
        return dongia;
    }

    public void setDongia(int dongia) {
        this.dongia = dongia;
    }

    public QlTienDien(String maso, String hoten, Date ngayrahd, int so_kw, int dongia) {
        this.maso = maso;
        this.hoten = hoten;
        this.ngayrahd = ngayrahd;
        this.so_kw = so_kw;
        this.dongia = dongia;
    }

    public QlTienDien() {
        this.maso = "";
        this.hoten = "";
        this.ngayrahd = null;
        this.so_kw = 0;
        this.dongia = 0;
    }
    
    public double ThanhTien(){
        double thanhtien = so_kw * dongia;
        return thanhtien;
    }


}
