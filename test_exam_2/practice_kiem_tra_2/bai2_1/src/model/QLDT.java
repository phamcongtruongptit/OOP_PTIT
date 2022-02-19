/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import entity.IntlPhoneNumber;
import entity.PhoneNumber;



/**
 *
 * @author Quang Dunh
 */
public class QLDT implements PhoneBook {

    private  List<PhoneNumber> list;
    private  Scanner scanner = new Scanner(System.in);

    public QLDT() {
        list = new ArrayList<>();
        list.add(new PhoneNumber("023", "1234541"));
        list.add(new PhoneNumber("023", "11564"));
        list.add(new PhoneNumber("012", "88787"));
        list.add(new IntlPhoneNumber("84", "0323", "675545441"));
        list.add(new IntlPhoneNumber("12", "094", "90423212"));
    }

    private boolean kiemTraNoiVung(String noiVung) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getNoiVung().equalsIgnoreCase(noiVung)) {
                return false;
            }
        }
        return true;
    }

    private int viTri(String maVung) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getMaVung().equalsIgnoreCase(maVung)) {
                return i;
            }
        }
        return -1;
    }

    private PhoneNumber nhap() {
        String maVung, noiVung;
        while (true) {
            System.out.println("Nhap ma vung");
            maVung = scanner.nextLine();
            if (!maVung.matches("^0{1}\\d{2,3}$")) {
                System.err.println("Nhap lai!!!");
            } else {
                break;
            }
        }
        while (true) {
            System.out.println("Nhap noi vung");
            noiVung = scanner.nextLine();
            if (noiVung.matches("^\\d+$") && kiemTraNoiVung(noiVung)) {
                break;
            } else {
                System.err.println("Nhap lai!!!");
            }
        }

        return new PhoneNumber(maVung, noiVung);
    }

    @Override
    public void themDienThoaiTrongNuoc() {
        PhoneNumber phoneNumber = nhap();
        list.add(phoneNumber);
    }

    @Override
    public void themDienThoaiQuocTe() {
        PhoneNumber phoneNumber = nhap();
        String maQuocGia;
        while (true) {
            System.out.println("Nhap ma quoc gia");
            maQuocGia = scanner.nextLine();
            if (maQuocGia.matches("^\\d+$")) {
                break;
            } else {
                System.err.println("Nhap lai!!!");
            }
        }
        list.add(new IntlPhoneNumber(maQuocGia, phoneNumber.getMaVung(), phoneNumber.getNoiVung()));
    }

    @Override
    public void timDienThoaiTheoMaVung() {
        String maVung;
        System.out.println("Nhap ma vung can tim");
        maVung = scanner.nextLine();
        int index = viTri(maVung);
        if (index == -1) {
            System.out.println("Khong co ma vung nay, nhap lai");
        } else {
            for (PhoneNumber phoneNumber : list) {
                if (phoneNumber.getMaVung().equalsIgnoreCase(maVung)) {
                    System.out.println(phoneNumber.toString());
                }
            }
        }
    }

    @Override
    public void lietKeCacSoDienThoai() {
        for (PhoneNumber phoneNumber : list) {
            System.out.println(phoneNumber.toString());
        }
    }

    @Override
    public void lietKeCacSoDienThoaiTrongNuoc() {
        for (PhoneNumber phoneNumber : list) {
            if (phoneNumber instanceof IntlPhoneNumber == false) {
                System.out.println(phoneNumber.toString());
            }
        }
    }

    @Override
    public void lietKeCacSoDienThoaiQuocTe() {
        for (PhoneNumber phoneNumber : list) {
            if (phoneNumber instanceof IntlPhoneNumber) {
                System.out.println(phoneNumber.toString());
            }
        }
    }

    @Override
    public void tongSoDienThoaiTheoTungVung() {
        Map<String, Long> count = list.stream().
                collect(Collectors.groupingBy(PhoneNumber::getMaVung,
                        Collectors.counting()));
        System.out.println(count);
    }

    @Override
    public void timDienThoaiTheoDuoi() {
        String duoi;
        System.out.println("Nhap duoi");
        duoi = scanner.nextLine();
        for (PhoneNumber phoneNumber : list) {
            if (phoneNumber.getNoiVung().endsWith(duoi)) {
                System.out.println(phoneNumber.toString());
            }
        }
    }

    @Override
    public void sapXep() {
        Collections.sort(list, new Comparator<PhoneNumber>() {
            @Override
            public int compare(PhoneNumber o1, PhoneNumber o2) {
                if (o1.getMaVung().compareToIgnoreCase(o2.getMaVung()) > 0) {
                    return 1;
                } else if (o1.getMaVung().compareToIgnoreCase(o2.getMaVung()) == 0) {
                    return o1.getNoiVung().compareToIgnoreCase(o2.getNoiVung());
                } else {
                    return -1;
                }
            }
        });
    }

}
