/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Sp0054;


import java.util.ArrayList;


/**
 *
 * @author Admin
 */
public class Main {
       
    public static void main(String[] args) {
        ArrayList<Contacts> le = new ArrayList<>();      
        le.add(new Contacts(1, "Iker Casillas", "Star", "Spain", "1234567890", "Iker", "Casillas"));
        le.add(new Contacts(2, "John Terry", "Star", "England", "1234567890", "John", "Terry"));
        le.add(new Contacts(3, "Raul Gonzalez", "Star", "Spain", "1234567890", "Raul", "Gonzalez"));
        int id = 0;
        while (true) {
            System.out.println("1. Add a contact");
            System.out.println("2. Display all contacts");
            System.out.println("3. Delete a contact");
            System.out.println("4. Exit");
            System.out.print("Your choice: ");
            int choice = Validation.checkInputIntLimit(1, 4);
            switch (choice) {
                case 1:
                    Contacts.addContacts(le);
                    break;
                case 2:
                    Contacts.displayContacts(le);
                    break;
                case 3:
                    Contacts.deleteContacts(le);
                    id--;
                    break;
                case 4:
                    return;
            }
        }
    }
}

    

 
