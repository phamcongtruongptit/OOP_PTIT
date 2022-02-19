/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktra1;

/**
 *
 * @author ADMIN
 */
public class Main1 {
    public static void main(String[] args) {
        PhanSo ps=new PhanSo(-9, -3);
        ps.viet();
        PhanSo p1=new PhanSo(4, 3);
        p1.viet();
        
        PhanSo pt=p1.tong(ps);
        pt.viet();
        
        PhanSo ph=p1.hieu(ps);
        ph.viet();
        
        PhanSo pth=p1.thuong(ps);
        pth.viet();
        
        PhanSo ptt=p1.tich(ps);
        ptt.viet();
    }
}
