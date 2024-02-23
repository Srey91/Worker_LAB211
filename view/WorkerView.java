/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.text.ParseException;
import java.util.Date;
import model.Worker;
import model.WorkerManagement;
import model.SalaryHistory;
import model.SalaryHistoryManagement;
import validation.Validation;

/**
 *
 * @author 84898
 */
public class WorkerView {
    WorkerManagement wm = new WorkerManagement();
    SalaryHistoryManagement shm = new SalaryHistoryManagement();
    Validation v = new Validation();
    
    public void add()
    {
        System.out.println("--------- Add Worker ----------");
        String code = v.getDoctorCode(wm.getWorkerList());
        String name = v.getString("Name");
        int age = v.getIntegerInRange("Age", 18, 50);
        double salary = v.getDouble("Salary");
        String workLocation = v.getString("Work Location");
        
        Worker worker = new Worker(code, name, age, salary, workLocation);
        wm.getWorkerList().add(worker);
        
        System.out.println("Add successful!!");
    }
    
    public void IncreaseOrDecreaseSalary(int choice) throws ParseException
    {
        System.out.println("------- Up/Down Salary --------");
        String codeCheck = v.getString("Code");
        boolean isExist = false;
        int index = 0;
        
        for (Worker worker : wm.getWorkerList())
        {
            if (codeCheck.equals(worker.getCode()))
            {
                isExist = true;
                index = wm.getWorkerList().indexOf(worker);
            }
        }
  
        if (isExist)
        {
            double number = v.getDouble("Amount Of Salary");
            String code = wm.getWorkerList().get(index).getCode();
            String name = wm.getWorkerList().get(index).getName();
            int age = wm.getWorkerList().get(index).getAge();
            double salary;
            String status;
            
            if (choice == 2)
            {
                wm.getWorkerList().get(index).increaseSalary(number);
                salary = wm.getWorkerList().get(index).getSalary();
                status = "UP";
            }else 
            {
                if (number > wm.getWorkerList().get(index).getSalary())
                {
                    System.out.println("The amount of salary is higher than base salary!!!");
                }else
                    wm.getWorkerList().get(index).decreaseSalary(number);
                    salary = wm.getWorkerList().get(index).getSalary();
                    status = "DOWN";
            }
            Date date = v.getDate("Date");
            
            SalaryHistory wsi = new SalaryHistory(code, name, age, salary, status, date);
            shm.getWorkerSalaryInformationList().add(wsi);
            
        }else
            System.out.println("Worker not found!!!");
    }
    
    public void display()
    {
        System.out.println("--------------------Display Information Salary-----------------------");
        rowBorder(7); rowBorder(10); rowBorder(5); rowBorder(10); rowBorder(10); rowBorder(20); System.out.println("|");
        
        System.out.printf("%-7s%-10s%-5s%-10s%-10s%-20s", "|Code", "|Name", "|Age", "|Salary", "|Status", "|Date");
        System.out.println("|");
        rowBorder(7); rowBorder(10); rowBorder(5); rowBorder(10); rowBorder(10); rowBorder(20); System.out.println("|");
        for (SalaryHistory sh : shm.getWorkerSalaryInformationList())
        {
            sh.outputFormat();
        }
        
        System.out.println("|");
        rowBorder(7); rowBorder(10); rowBorder(5); rowBorder(10); rowBorder(10); rowBorder(20); System.out.println("|"); 
    }
    
    public void rowBorder(int number)
    {   
        System.out.print("|");
        for (int i = 0; i < number - 1; i++)
        {
            System.out.print("-");
        }
    }
}
