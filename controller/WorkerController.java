/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.text.ParseException;
import menu.Menu;
import view.WorkerView;

/**
 *
 * @author 84898
 */
public class WorkerController extends Menu{
    public void menu(WorkerView wv)
    {
        String[] content = {"Add Worker", "Up salary", "Down salary", "Display Information salary", "Exit"};
        Menu m = new Menu("======== Worker Management =========", content) {
            @Override
            public void execute(int ch) {
                switch (ch)
                {
                    case 1: wv.add(); break;
                    case 2: 
                        try { wv.IncreaseOrDecreaseSalary(ch); } catch (ParseException ex) { System.out.println(ex.getMessage());}
                        break;
                    case 3:    
                        try { wv.IncreaseOrDecreaseSalary(ch); } catch (ParseException ex) { System.out.println(ex.getMessage());}
                        break;
                    case 4: wv.display(); break;
                }
            }
        };
        m.run();
    }

    @Override
    public void execute(int ch) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
