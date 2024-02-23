/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import controller.WorkerController;
import view.WorkerView;

/**
 *
 * @author 84898
 */
public class Main {
    public static void main(String[] args) {
        WorkerView wv = new WorkerView();
        WorkerController wc = new WorkerController();
        
        wc.menu(wv);
    }
}
