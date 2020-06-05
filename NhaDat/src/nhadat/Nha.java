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
public class Nha extends QLNhaDat {

    private String loainha;
    private String diachi;

    @Override
    public String toString() {
        return "Nha{" + super.toString() + ", loainha = " + loainha + ", diachi = " + diachi + ", thanh tien = " + ThanhTien() + '}';
    }

    public String getLoainha() {
        return loainha;
    }

    public void setLoainha(String loainha) {
        this.loainha = loainha;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public Nha(String loainha, String diachi, String ma_gd, Date ngay_gd, int dongia, int dientich) {
        super(ma_gd, ngay_gd, dongia, dientich);
        this.loainha = loainha;
        this.diachi = diachi;
    }

    public Nha() {
        this.loainha = "";
        this.diachi = "";
    }

    @Override
    public double ThanhTien() {
        double thanhtien = 0;
        if (this.loainha.equals("Thường")) {
            thanhtien = dientich * dongia * 90 / 100;
        } else {
            thanhtien = dientich * dongia;
        }
        return thanhtien;
    }

    @Override
    public String loai() {
        String s = "";
        if (loainha == "Cao cấp") {
            s = "Cao cấp";
        } else {
            s = "Thường";
        }
        return s;//To change body of generated methods, choose Tools | Templates.
    }

}
