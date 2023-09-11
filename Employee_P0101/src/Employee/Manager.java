/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Administrator
 */

public class Manager extends ArrayList<Employee> {
    
    public static int menu() {
        System.out.println("1. Add employee");
        System.out.println("2. Update employee");
        System.out.println("3. Delete employee");
        System.out.println("4. Search employee");
        System.out.println("5. Sort employee");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
        int choice = Validation.checkUserChoice(6, 1);
        return choice;
    }
    
    public void addEmployee() {
        String id;
        String firstName;
        String lastName; 
        String email;
        String address;
        String sex; 
        String agency;
        int phone;
        int day;
        int month;
        int year;
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
        System.out.print("Enter firstname: ");
        firstName = Validation.checkString();
        firstName = normalize(firstName);
        System.out.print("Enter lastname: ");
        lastName = Validation.checkString();
        lastName = normalize(lastName);
        do {       
            System.out.print("Enter email: ");
            email = Validation.checkString();
            if(findEmployeeByEmail(email) >0 )
            {
                System.out.print("Employee email is duplicate ");
            }
            valid = email.matches("^[A-Za-z0-9]+@gmail.com$");
            if(valid == false)
            {
                System.out.print("Wrong code ");
            }
        } while (findEmployeeById(id) >0 || valid == false);
        System.out.print("Enter address: ");
        address = Validation.checkString();
        address = normalize(address);
        System.out.print("Enter sex:");
        sex = Validation.checkString();
        sex = normalize(sex);
        System.out.print("Enter agency: ");
        agency = Validation.checkString();
        agency = normalize(agency);
        System.out.print("Enter phone: ");
        phone = Validation.checkInt();
        System.out.print("Enter day of birth: ");
        day = Validation.checkInt();
        System.out.print("Enter month of birth: ");
        month = Validation.checkInt();
        System.out.print("Enter year of birth: ");
        year = Validation.checkInt();
        System.out.print("Enter salary: ");
        salary = Validation.checkDouble();
        this.add(new Employee(id, firstName, lastName, email, address, sex, agency, phone, day, month, year, salary));        
    }
    
    private String normalize(String fullname)
    {
        String[] Split=fullname.trim().split("[\\s]+");
        fullname="";
        for(String a:Split)
        {
              fullname+=a.substring(0, 1).toUpperCase()+a.substring(1).toLowerCase()+" ";
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
    
    public int findEmployeeByFirstName(String firstName) {
        for(int i =0; i<this.size(); i++) {
            if( firstName.matches(this.get(i).getFirstName())) {
                return i;
            }
        }
        return -1;
    }
    
    public void updateDoctor() {
        String firstName;
        String lastName; 
        String email;
        String address;
        String sex; 
        String agency;
        int phone;
        int day;
        int month;
        int year;
        double salary;
        boolean valid;
        String id ;
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
        
        System.out.print("Enter firstname: ");
        firstName = Validation.checkString();
        firstName = normalize(firstName);
        System.out.print("Enter lastname: ");
        lastName = Validation.checkString();
        lastName = normalize(lastName);
        do {       
            System.out.print("Enter email: ");
            email = Validation.checkString();
            if(findEmployeeByEmail(email) >0 )
            {
                System.out.print("Employee email is duplicate ");
            }
            valid = email.matches("^[A-Za-z0-9]+@gmail.com$");
            if(valid == false)
            {
                System.out.print("Wrong code ");
            }
        } while (findEmployeeById(id) >0 || valid == false);
        System.out.print("Enter address: ");
        address = Validation.checkString();
        address = normalize(address);
        System.out.print("Enter sex:");
        sex = Validation.checkString();
        sex = normalize(sex);
        System.out.print("Enter agency: ");
        agency = Validation.checkString();
        agency = normalize(agency);
        System.out.print("Enter phone: ");
        phone = Validation.checkInt();
        System.out.print("Enter day of birth: ");
        day = Validation.checkInt();
        System.out.print("Enter month of birth: ");
        month = Validation.checkInt();
        System.out.print("Enter year of birth: ");
        year = Validation.checkInt();
        System.out.print("Enter salary: ");
        salary = Validation.checkDouble();

        
       
        if ( !Validation.checkUpdate(doctor, code, name, specialization, availability) )
        {
            System.out.println("No update");
            return;
        }
        doctor.setCode(code);
        doctor.setName(name);
        doctor.setSpecialization(specialization);
        doctor.setAvailability(availability);
        System.out.println("Update successful");
    }
    
    public void removeEmployee() {
        System.out.println("Enter the employee id you want to remove: ");
        String target = Validation.checkString();
        int index = findEmployeeById(target);
        if(index <0  ) {
            System.out.println("Employe not exits");
        }
        else {
            this.remove(index);
        }
    }
    
    public void searchEmployee() {
        System.out.print("Enter firstname: ");
        String nameSearch = Validation.checkString();
        int index = findEmployeeByFirstName(nameSearch);
        if( index < 0) {
            System.out.println("Student not exits");
        }
        else {
            System.out.print((this.get(index).getId())+"   ");
            System.out.print((this.get(index).getFirstName()) + " "+ this.get(index).getLastName()+"   ");
            System.out.print((this.get(index).getPhone())+"   ");
            System.out.print((this.get(index).getEmail())+"   ");
            this.get(index).getDOB();
            System.out.print((this.get(index).getSex())+"   ");
            System.out.print((this.get(index).getSalary())+"   ");
            System.out.print((this.get(index).getAgency()));
        }
    }
    
    public void sortEmployee()
    {
        if( this.size() == 0)
        {
            System.out.println("Empty List.");
            return;
        }
        Collections.sort(this);
        System.out.println("\nEMPLOYEE LIST");
        System.out.println("----------------");
        for ( Employee x: this)x.print();
    }
    
}
