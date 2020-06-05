/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendien;

import java.util.Date;

/**
 *
 * @author trant
 */
public class KhachVn extends QlTienDien{
    private String loaikh;
    private int dinhmuc;

    @Override
    public String toString() {
        return "KhachVn{" +super.toString()+ ", loaikh=" + loaikh + ", dinhmuc=" + dinhmuc + ", thành tiền = " +ThanhTien()+'}';
    }

    public String getLoaikh() {
        return loaikh;
    }

    public void setLoaikh(String loaikh) {
        this.loaikh = loaikh;
    }

    public int getDinhmuc() {
        return this.dinhmuc;
    }

    public void setDinhmuc(int dinhmuc) {
        this.dinhmuc = dinhmuc;
    }

    public KhachVn(String loaikh, int dinhmuc, String maso, String hoten, Date ngayrahd, int so_kw, int dongia) {
        super(maso, hoten, ngayrahd, so_kw, dongia);
        this.loaikh = loaikh;
        this.dinhmuc = dinhmuc;
    }

    public KhachVn() {
        this.loaikh = "";
        this.dinhmuc = 0;
    }


    
    @Override
    public double ThanhTien()
    {
        double thanhtien = 0;
        if(so_kw <= dinhmuc)
        {
            thanhtien = super.ThanhTien();
        }
        else
        {
            thanhtien = dongia * dinhmuc + ((so_kw - dinhmuc)*dongia*2.5);
        }
        return thanhtien;
    }
}
