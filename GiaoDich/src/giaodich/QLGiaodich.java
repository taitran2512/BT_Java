/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package giaodich;

import java.util.Date;

/**
 *
 * @author trant
 */
public class QLGiaodich {
    private String ma_gd;
    private Date ngay_gd;
    protected int dongia;
    protected int soluong;

    @Override
    public String toString() {
        return "ma_gd = " + ma_gd + ", ngay_gd = " + ngay_gd + ", dongia = " + dongia + ", soluong = " + soluong;
    }

    @Override
    public boolean equals(Object obj) {
        return this.ma_gd.equalsIgnoreCase(((QLGiaodich)obj).ma_gd); //To change body of generated methods, choose Tools | Templates.
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

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public QLGiaodich(String ma_gd, Date ngay_gd, int dongia, int soluong) {
        this.ma_gd = ma_gd;
        this.ngay_gd = ngay_gd;
        this.dongia = dongia;
        this.soluong = soluong;
    }

    public QLGiaodich() {
        this.ma_gd = "";
        this.ngay_gd = null;
        this.dongia = 0;
        this.soluong = 0;
    }
    public double ThanhTien()
    {
        double thanhtien =0;
        thanhtien = soluong * dongia;        
        return thanhtien;
    }

    
}
