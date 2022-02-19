/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package class4;

/**
 *
 * @author ADMIN
 */
public class GiangVien implements OopSinhVien{
    private int n=9;
    @Override
    public void diem(SinhVien sv) {
        System.out.println("gia tri:"+n);
                sv.diHoc();
    }

    @Override
    public void hienthi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
