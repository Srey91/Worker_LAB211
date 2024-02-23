/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author 84898
 */
public class SalaryHistory {
    private String code;
    private String name;
    private int age;
    private double salary;
    private String status;
    private Date date;

    public SalaryHistory() {
    }

    public SalaryHistory(String code, String name, int age, double salary, String status, Date date) {
        this.code = code;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.status = status;
        this.date = date;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    public void outputFormat()
    {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
        System.out.printf("%-7s%-10s%-5s%-10s%-10s%-20s", "|" + code, "|" + name, "|" + age, "|" + salary, "|" + status, "|" + sdf.format(date) + "\n");
    }

    @Override
    public String toString() {
        return "WorkerSalaryInformation{" + "code=" + code + ", name=" + name + ", age=" + age + ", salary=" + salary + ", status=" + status + ", date=" + date + '}';
    }
    
    
}
