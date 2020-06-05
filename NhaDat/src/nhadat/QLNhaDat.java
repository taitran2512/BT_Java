/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhadat;

import java.util.Date;

/**
 *
 * @author trant
 */
public class QLNhaDat {

    private String ma_gd;
    private Date ngay_gd;
    protected int dongia;
    protected int dientich;

    @Override
    public boolean equals(Object obj) {
        return this.ma_gd.equalsIgnoreCase(((QLNhaDat)obj).ma_gd); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public QLNhaDat(String ma_gd, Date ngay_gd, int dongia, int dientich) {
        this.ma_gd = ma_gd;
        this.ngay_gd = ngay_gd;
        this.dongia = dongia;
        this.dientich = dientich;
    }

    public QLNhaDat() {
        this.ma_gd = "";
        this.ngay_gd = null;
        this.dongia = 0;
        this.dientich = 0;
    }

    public String getMa_gd() {
        return ma_gd;
    }

    public void setMa_gd(String ma_gd) {
        this.ma_gd = ma_gd;
    }

    public Date getNgay_gd() {
        return ngay_gd;
    }

    public void setNgay_gd(Date ngay_gd) {
        this.ngay_gd = ngay_gd;
    }

    public int getDongia() {
        return dongia;
    }

    public void setDongia(int dongia) {
        this.dongia = dongia;
    }

    public int getDientich() {
        return dientich;
    }

    public void setDientich(int dientich) {
        this.dientich = dientich;
    }

    @Override
    public String toString() {
        return "ma_gd = " + ma_gd + ", ngay_gd = " + ngay_gd + ", dongia = " + dongia + ", dientich = " + dientich;
    }

    public double ThanhTien() {
        double thanhtien = 0;
        return thanhtien;
    }
    
    public  String loai(){
        String s="";
        return s;
    }
}
