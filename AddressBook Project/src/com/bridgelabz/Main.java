package com.bridgelabz;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void edit(ArrayList<Contact> list, String x, long pn) {
        for (Contact contact : list) {
            if (contact.getFirstName().equals(x)) {
                contact.setPhoneNo(pn);
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the Address Book");
        ArrayList<Contact> list = new ArrayList<>();
        Set list1= new HashSet<>();

        Scanner sc  = new Scanner(System.in);

        while (true) {
            System.out.println("\nOption 1 :- To Add the Contact" +
                    "\nOption 2 :- To Edit the Contact" +
                    "\nOption 3 :- To Remove the Contact" +
                    "\nOption 4 :- To Exit");
            System.out.print("Enter the Option: ");
            int option = sc.nextInt();

            if (option == 1) {
                Scanner fn = new Scanner(System.in);
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

                list.add(new Contact(s1, s2, s3, s4, s5, s6, s7, s8));
                for (int i =0;i<list.size();i++){
                    list1.add(list.get(i));
                }
                System.out.println(list);

            }
            else if (option == 2) {
                Scanner ss = new Scanner(System.in);
                System.out.print("Enter The First Name: ");
                String str1 = ss.nextLine();

                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).firstName.equals(str1)) {
                        Main.edit(list,str1,00000);
                    }
                }
                System.out.println(list);
            } else if (option == 3) {
                Scanner ss = new Scanner(System.in);
                System.out.print("Enter The First Name: ");
                String str1 = ss.nextLine();
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).firstName.equals(str1)) {
                        list.remove(i);
                    }
                }
                System.out.println(list);
            } else if (option == 4) {
                break;
            }
        }


        System.out.println(list1);

    }

}
