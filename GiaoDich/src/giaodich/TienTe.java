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
public class TienTe extends QLGiaodich{
    private float tigia;
    private String loaitien;

    @Override
    public String toString() {
        return "TienTe{" + super.toString() +", tigia = " + tigia + ", loaitien = " + loaitien +", thanh tien = "+ ThanhTien()+ '}';
    }

    public float getTigia() {
        return tigia;
    }

    public void setTigia(float tigia) {
        this.tigia = tigia;
    }

    public String getLoaitien() {
        return loaitien;
    }

    public void setLoaitien(String loaitien) {
        this.loaitien = loaitien;
    }

    public TienTe(float tigia, String loaitien, String ma_gd, Date ngay_gd, int dongia, int soluong) {
        super(ma_gd, ngay_gd, dongia, soluong);
        this.tigia = tigia;
        this.loaitien = loaitien;
    }

    public TienTe() {
        this.tigia = 0;
        this.loaitien = "";
    }
    
    @Override
    public double ThanhTien()
    {
        double thanhtien = 0;
        if(this.loaitien.equals("USD") || this.loaitien.equals("EURO"))
        {
            thanhtien = soluong * dongia * tigia;
        }
        else
        {
            thanhtien = soluong * dongia;
        }
        return thanhtien;
    }
    
}
