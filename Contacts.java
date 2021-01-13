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
public class Contacts {

    private int id;
    private String fullName;
    private String lastName;
    private String firstName;
    private String group;
    private String address;
    private String phone;

    public Contacts() {
    }

    public Contacts(int id, String fullName, String firstName, String lastName, String group, String address, String phone) {
        this.id = id;
        this.fullName = fullName;
        this.lastName = lastName;
        this.firstName = firstName;
        this.group = group;
        this.address = address;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    //allow user create contact
    public static void addContacts(ArrayList<Contacts> le) {
        System.out.print("Enter first name: ");
        String firstName = Validation.checkInputName();
        System.out.print("Enter last name: ");
        String lastName = Validation.checkInputName();
        System.out.print("Enter group: ");
        String group = Validation.checkInputString();
        System.out.print("Enter address: ");
        String address = Validation.checkInputString();
        System.out.print("Enter phone: ");
        String phone = Validation.checkInputPhone();
        int langth = le.size();
        int id = le.get(langth - 1).getId() + 1;
        le.add(new Contacts(id, firstName + " " + lastName, group, address,
                phone, firstName, lastName));
        System.err.println("Add successful.");
    }

    //allow user display all contact
    public static void displayContacts(ArrayList<Contacts> le) {
        System.out.printf("%-5s%-25s%-20s%-20s%-20s%-20s%-20s\n", "Id", "Name",
                "First name", "Last name", "Group", "Address", "Phone");
        //print infomation of contact from first to last list contact
        for (int i = 0; i < le.size(); i++) {
            System.out.printf("%-5d%-25s%-20s%-20s%-20s%-20s%-20s\n",
                    le.get(i).getId(), le.get(i).getFullName(),
                    le.get(i).getFirstName(), le.get(i).getLastName(),
                    le.get(i).getGroup(), le.get(i).getAddress(), le.get(i).getPhone());
        }
    }

    //allow user delete contact
    public static void deleteContacts(ArrayList<Contacts> le) {
        System.out.print("Enter id: ");
        int id = Validation.checkInputIntLimit(0, Integer.MAX_VALUE);
        int checkIdRemove = Validation.checkIdRemove(le, id);

        if (checkIdRemove != -1) {
            le.remove(checkIdRemove);
            System.out.println("Delete an expense successful");
            
            for (int i = id - 1; i < le.size(); i++) {
                le.get(i).setId(le.get(i).getId() - 1);
            }
        } else {
            System.err.println("Delete an expense fail");
        }

    }
  
}
