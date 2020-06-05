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
public class KhachNgoai extends QlTienDien {
    private String quocgia;

    @Override
    public String toString() {
        return "KhachNgoai{" + super.toString() + ", quocgia =" + quocgia +  ", thành tiền = " +ThanhTien()+'}';
    }

    public String getQuocgia() {
        return quocgia;
    }

    public void setQuocgia(String quocgia) {
        this.quocgia = quocgia;
    }

    public KhachNgoai(String quocgia, String maso, String hoten, Date ngayrahd, int so_kw, int dongia) {
        super(maso, hoten, ngayrahd, so_kw, dongia);
        this.quocgia = quocgia;
    }

    public KhachNgoai() {
        this.quocgia = "";
    }

    @Override
    public double ThanhTien() {
        return super.ThanhTien();
    }
}
