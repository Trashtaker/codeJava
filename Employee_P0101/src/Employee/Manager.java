/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */

public class Manager extends ArrayList<Employee> {
    public void addEmployee() {
        Birthday bday = new Birthday();
        String id, firstName, lastName,email,address, sex, agency;
        int phone;
        double salary;
        boolean valid = true;
        do {       
            System.out.println("Enter id: ");
            id = Validation.checkString();
            if(findEmployeeById(id) >0 )
            {
                System.out.println("Employee id is duplicate ");
            }
            valid = id.matches("^(\\d+)$");
            if(valid == false)
            {
                System.out.println("Wrong id ");
            }
        } while (findEmployeeById(id) >0 ||valid == false);       
        System.out.println("Enter firstname: ");
        firstName = Validation.checkString();
        System.out.println("Enter firstname: ");
        firstName = Validation.checkString();
        do {       
            System.out.println("Enter email: ");
            email = Validation.checkString();
            if(findEmployeeByEmail(email) >0 )
            {
                System.out.println("Employee email is duplicate ");
            }
            valid = id.matches("^[A-Za-z0-9+_.-]+@gmail.com$");
            if(valid == false)
            {
                System.out.println("Wrong code ");
            }
        } while (findEmployeeById(id) >0 ||valid == false);
        System.out.println("Enter address: ");
        address = Validation.checkString();
        System.out.println("Enter sex ");
        sex = Validation.checkString();
        System.out.println("Enter agency: ");
        agency = Validation.checkString();
        System.out.println("Enter phone: ");
        phone = Validation.checkInt();
        System.out.println("Enter birthday: ");
        
    }
    
    private String normalize(String fullname)
    {
        String[] Split=fullname.trim().split("[\\s]+");
        fullname="";
        for(String a:Split)
        {
              fullname+=a.substring(0, 1).toUpperCase()+a.substring(1)+" ";
        }
        fullname=fullname.trim();
        return fullname;
    }
    
    public int findEmployeeById(String code) {
        for(int i =0; i< this.size();i++)
        {
            if( this.get(i).getId().equalsIgnoreCase(code)) 
            {
                return i;
            }
        }
        return -1;
    }
    
    public int findEmployeeByEmail(String email) {
        for(int i =0; i< this.size();i++)
        {
            if( this.get(i).getEmail().equalsIgnoreCase(email)) 
            {
                return i;
            }
        }
        return -1;
    }

    
    
}
