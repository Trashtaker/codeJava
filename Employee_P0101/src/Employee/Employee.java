/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee;

/**
 *
 * @author Administrator
 * (Id, First Name, Last Name, Phone, Email, Address, DOB, Sex, Salary, Agency
 */
public class Employee implements Comparable<Object> {
    private String id, firstName, lastName,email,address, sex, agency;
    private int phone, day, month, year;
    private double salary;
    
    public Employee(String id, String firstName, String lastName, String email, String address, String sex, String agency, int phone, int day, int month, int year, double salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.sex = sex;
        this.agency = agency;
        this.phone = phone;
        this.day = day;
        this.month = month;
        this.year = year;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getSex() {
        return sex;
    }

    public String getAgency() {
        return agency;
    }

    public int getPhone() {
        return phone;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public double getSalary() {
        return salary;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public void getDOB() {
        System.out.print(this.day + "-" +this.month +"-" + this.year+"   ");
    }
    
    public void print() {
        System.out.print((this.getId())+"   ");
            System.out.print((this.getFirstName())+" ");
            System.out.print((this.getLastName())+"   ");
            System.out.print((this.getPhone())+"   ");
            System.out.print((this.getEmail())+"   ");
            this.getDOB();
            System.out.print((this.getSex())+"   ");
            System.out.print((this.getSalary())+"   ");
            System.out.print((this.getAgency()));
            System.out.println("\n");
    }

    public int compareTo(Object emp) {
        // Compare employees based on their salary
        return Double.compare(this.salary, ((Employee) emp).salary);
        
    }

    
    
    
}
