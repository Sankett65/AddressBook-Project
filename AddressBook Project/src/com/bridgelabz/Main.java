package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Address Book");
        ArrayList<Contact> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Option 1 :- To Add the Contact to Address Book");
        System.out.print("Select Option: ");
        int option = sc.nextInt();

       if (option==1){
           Scanner fn = new Scanner(System.in);
           System.out.print("Enter First Name: ");
           String s1=fn.nextLine();
           Scanner ln = new Scanner(System.in);
           System.out.print("Enter Last Name: ");
           String s2=ln.nextLine();
           Scanner add = new Scanner(System.in);
           System.out.print("Enter Address: ");
           String s3=add.nextLine();
           Scanner ci = new Scanner(System.in);
           System.out.print("Enter City: ");
           String s4=ci.nextLine();
           Scanner st = new Scanner(System.in);
           System.out.print("Enter State: ");
           String s5=st.nextLine();
           Scanner zi = new Scanner(System.in);
           System.out.print("Enter Zipcode: ");
           int s6=zi.nextInt();
           Scanner pn = new Scanner(System.in);
           System.out.print("Enter Phone Number: ");
           long s7=pn.nextLong();
           Scanner em = new Scanner(System.in);
           System.out.print("Enter Email: ");
           String s8=em.nextLine();

           list.add(new Contact(s1,s2,s3,s4,s5,s6,s7,s8));
           System.out.println(list);
       }

    }

}
