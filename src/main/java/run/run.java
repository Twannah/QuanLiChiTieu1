/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package run;

import view.TrangChuView;
import view.login;

/**
 *
 * @author ADMIN
 */
public class run {
    public static void main(String[] args) {
        login l = new login(null, true);
        l.setVisible(true);
        TrangChuView userview = new TrangChuView();
        userview.setVisible(true);
    }
}
