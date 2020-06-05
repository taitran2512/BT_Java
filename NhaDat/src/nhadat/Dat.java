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
public class Dat extends QLNhaDat {

    private String loaidat;

    @Override
    public String toString() {
        return "Dat{" + super.toString() + ", loaidat= " + loaidat + ", thanh tien = " + ThanhTien() + '}';
    }

    public String getLoaidat() {
        return loaidat;
    }

    public void setLoaidat(String loaidat) {
        this.loaidat = loaidat;
    }

    public Dat(String loaidat, String ma_gd, Date ngay_gd, int dongia, int dientich) {
        super(ma_gd, ngay_gd, dongia, dientich);
        this.loaidat = loaidat;
    }

    public Dat() {
        this.loaidat = "";
    }

    @Override
    public double ThanhTien() {
        double thanhtien = 0;
        if (this.loaidat.equals("A")) {
            thanhtien = dientich * dongia * 1.5;
        } else {
            thanhtien = dientich * dongia;
        }
        return thanhtien;
    }

    @Override
    public String loai() {
        String s = "";
        if (loaidat == "A") {
            s = "A";
        } else if (loaidat == "B") {
            s = "B";
        } else {
            s = "C";
        }
        return s;
    }

}
