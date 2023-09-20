package com.bridgelabz;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the Address Book");
        AddressBook addressBook= new AddressBook();
        AddressBookManager addressBookManager=new AddressBookManager();

        Scanner sc  = new Scanner(System.in);

        while (true) {
            System.out.println("\nOption 1 :- To create AddressBook" +
                    "\nOption 2 :- To add the Contact"+
                    "\nOption 3 :- To Edit the Contact" +
                    "\nOption 4 :- To Remove the Contact" +
                    "\nOption 5 :- To Exit");
            System.out.print("Enter the Option: ");
            int option = sc.nextInt();

            if (option==1){
                System.out.print("Enter the name of the new address book: ");
                Scanner scc = new Scanner(System.in);
                String addressBookName = scc.nextLine();
                addressBookManager.createAddressBook(addressBookName);

            }else if (option == 2) {
                Scanner fn = new Scanner(System.in);

                System.out.print("Enter Address Book name: ");
                String addressBookName = fn.nextLine();

                System.out.print("\nEnter First Name: ");
                String s1 = fn.nextLine();
                Scanner ln = new Scanner(System.in);
                System.out.print("Enter Last Name: ");
                String s2 = ln.nextLine();
                Scanner add = new Scanner(System.in);
                System.out.print("Enter Address: ");
                String s3 = add.nextLine();
                Scanner ci = new Scanner(System.in);
                System.out.print("Enter City: ");
                String s4 = ci.nextLine();
                Scanner st = new Scanner(System.in);
                System.out.print("Enter State: ");
                String s5 = st.nextLine();
                Scanner zi = new Scanner(System.in);
                System.out.print("Enter Zipcode: ");
                int s6 = zi.nextInt();
                Scanner pn = new Scanner(System.in);
                System.out.print("Enter Phone Number: ");
                long s7 = pn.nextLong();
                Scanner em = new Scanner(System.in);
                System.out.print("Enter Email: ");
                String s8 = em.nextLine();

                addressBook.addContact(new Contact(s1,s2,s3,s4,s5,s6,s7,s8));
                addressBookManager.createAddressBook(addressBookName,new Contact(s1,s2,s3,s4,s5,s6,s7,s8));

                System.out.println(addressBook.list);

            }
            else if (option == 3) {
                Scanner ss = new Scanner(System.in);
                System.out.print("Enter The First Name: ");
                String str1 = ss.nextLine();

                for (int i = 0; i < addressBook.list.size(); i++) {
                    if (addressBook.list.get(i).firstName.equals(str1)) {
                        addressBook.setContact(str1,00000);
                    }
                }
                System.out.println(addressBook.list);
            } else if (option == 4) {
                Scanner ss = new Scanner(System.in);
                System.out.print("Enter The First Name: ");
                String str1 = ss.nextLine();
                for (int i = 0; i < addressBook.list.size(); i++) {
                    if (addressBook.list.get(i).firstName.equals(str1)) {
                        addressBook.list.remove(i);
                    }
                }
                System.out.println(addressBook.list);
            } else if (option == 5) {
                addressBookManager.listAddressBooks();

            } else if (option==6) {
                break;
            }
        }
        Scanner scc = new Scanner(System.in);

    }
}
