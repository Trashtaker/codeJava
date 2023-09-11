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
public class Main {
     public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        Manager Manager = new Manager();
        //loop until user want to exit
        while (true) {
            int choice = Manager.menu();
            switch (choice) {
                case 1:
                    Manager.addEmployee();
                    break;
//                case 2:
//                    Manager.updateDoctor(list);
//                    break;
                case 3:
                    Manager.removeEmployee();
                    break;
                case 4:
                    Manager.searchEmployee();
                    break;
                case 5:
                    Manager.sortEmployee();
                    break;
                        
                case 6:
                    return;
            }

        }

    }
}
