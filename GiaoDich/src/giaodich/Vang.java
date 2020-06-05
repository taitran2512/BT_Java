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
public class Vang extends QLGiaodich{
    private String loaivang;

    @Override
    public String toString() {
        return "Vang{"+ super.toString() + ", loaivang = " + loaivang + ", thanh tien = "+ ThanhTien()+'}';
    }

    public String getLoaivang() {
        return loaivang;
    }

    public void setLoaivang(String loaivang) {
        this.loaivang = loaivang;
    }

    public Vang(String loaivang, String ma_gd, Date ngay_gd, int dongia, int soluong) {
        super(ma_gd, ngay_gd, dongia, soluong);
        this.loaivang = loaivang;
    }

    public Vang() {
        this.loaivang = "";
    }
    
    public double ThanhTien()
    {
        double thanhtien =0;
        thanhtien = soluong * dongia;        
        return thanhtien;
    }
}
