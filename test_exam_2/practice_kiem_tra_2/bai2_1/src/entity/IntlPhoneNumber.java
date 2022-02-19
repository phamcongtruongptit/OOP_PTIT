/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Quang Dunh
 */
public class IntlPhoneNumber extends PhoneNumber {

    private String maQuocGia;

    public IntlPhoneNumber() {
    }

    public IntlPhoneNumber(String maQuocGia, String maVung, String noiVung) {
        super(maVung, noiVung);
        this.maQuocGia = maQuocGia;
    }

    public String getMaQuocGia() {
        return maQuocGia;
    }

    public void setMaQuocGia(String maQuocGia) {
        this.maQuocGia = maQuocGia;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(getMaVung());
        sb.deleteCharAt(0);
        String ma = sb.toString();
        return maQuocGia + "-" + ma + "-" + getNoiVung();
    }

}

