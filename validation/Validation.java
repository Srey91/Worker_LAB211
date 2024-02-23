/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package validation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import model.Worker;

/**
 *
 * @author 84898
 */
public class Validation {
    public String getString (String string)
   {
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Enter " + string  + ": ");
       
       while (true)
       {
            String result = sc. nextLine();
           
           if (result.isEmpty())
           {
               System.out.println(string + " can't empty!!!");
               System.out.println("Enter " + string + " again: ");
           }else 
               return result;
       }
   }
    
    public double getDouble (String string)
   {
       while (true)
       {
           try 
           {
                double number  = Double.parseDouble(getString(string));
                if (number > 0)
                    return number;
                else
                    System.out.println(string +  "can't below zero");
           }catch (NumberFormatException e)
           {
               System.out.println("Number invalid!!!");
           }
       }
   }
    
    public int getAnyInteger (String string)
   {
       while (true)
       {
           try 
           {
                int number  = Integer.parseInt(getString(string)); 
                return number;
                
           }catch (NumberFormatException e)
           {
               System.out.println("Number invalid!!!");
           }
       }
   }
    
    public int getIntegerInRange (String string, int min, int max)
   {
       while (true)
       {
           try 
           {
                int number  = Integer.parseInt(getString(string)); 
                if (number >= min  && number <= max)
                    return number;
                else 
                    System.out.println("Age must from " + min + " to " + max + "!");
                
           }catch (NumberFormatException e)
           {
               System.out.println("Number invalid!!!");
           }
       }
   }
    
    public String getDoctorCode(ArrayList<Worker> workerList)
   {
        boolean isExist;
        
        while (true) 
        {
            isExist = false;
            String code = getString("Code");
            
            for (Worker worker : workerList) 
            {
                if (worker.getCode().equals(code)) 
                {
                    System.out.println("Code is existed!!!");
                    isExist = true;
                }
            }
            if(isExist == false) return code;
        }
    }
    
    public Date getDate(String string) throws ParseException
    {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 
        sdf.setLenient(true);
        
        System.out.println("Enter " + string + ": ");
        
        while (true)
        {
            String date = sc.nextLine();
            try
            {
                Date value = sdf.parse(date);  
                return value;

            }catch (ParseException parseException)
            {
                System.err.println(string + " invalid!!!");
            }
        }
    }

}
