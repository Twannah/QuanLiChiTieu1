/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class QLCTXML {
    public void ghi(List<QLCT> list) throws IOException {
        try (PrintWriter pw = new PrintWriter(new File("qlct.xml"))) {
            for (QLCT a : list) {
                pw.println(a.getId());
                pw.println(a.getNguon());
                pw.println(a.getNoidung());
                pw.println(a.getSoTien());
                pw.println(a.getNgay());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    
    public List<QLCT> docqlct() {
        List<QLCT> list = new ArrayList<>();
        try (Scanner sc = new Scanner(new File("qlct.xml"))) {
            while (sc.hasNext()) {
                QLCT a = new QLCT();
                a.setId(Integer.parseInt(sc.nextLine()));
                a.setNguon(sc.nextLine());
                a.setNoidung(sc.nextLine());
                a.setSoTien(Double.parseDouble(sc.nextLine()));
                a.setNgay(LocalDate.parse(sc.nextLine())); // Assuming date is provided as a string in a valid format
                list.add(a);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return list;
    }

    public void ghiquanly(QLCT ql) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
