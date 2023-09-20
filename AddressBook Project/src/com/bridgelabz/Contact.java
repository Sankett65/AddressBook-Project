package com.bridgelabz;

import java.util.*;

public class Contact {
    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    int zipcode;
    long phoneNo;
    String email;


    public Contact(String firstName, String lastName, String address, String city, String state, int zipcode, long phoneNo, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.phoneNo = phoneNo;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipcode=" + zipcode +
                ", phoneNo=" + phoneNo +
                ", email='" + email + '\'' +
                '}';
    }
}

class AddressBook{
    String name;
   List<Contact> list ;

    public AddressBook(String name) {
        this.name=name;
        list=new ArrayList<>();
    }

    public AddressBook(){
       list=new ArrayList<>();
    }



    public void addContact( Contact contact){
        list.add(contact);
    }

    public void setContact( String x, long pn){
        for (Contact contact : list) {
            if (contact.getFirstName().equals(x)) {
                contact.setPhoneNo(pn);
            }
        }
    }

    public void removeContact(Contact contact){
        list.remove(contact);
    }

    public List<Contact> getContacts() {
        return list;
    }
}

class AddressBookManager {
     Map<String, AddressBook> addressBooks;

    public AddressBookManager() {
        this.addressBooks = new HashMap<>();
    }

    public void createAddressBook(String name) {
        if (!addressBooks.containsKey(name)) {
            AddressBook addressBook = new AddressBook(name);
            addressBooks.put(name, addressBook);
            System.out.println("Address book '" + name + "' created successfully.");
        } else {
            System.out.println("An address book with the name '" + name + "' already exists.");
        }
    }

    public void createAddressBook(String name,Contact contact) {
        if (!addressBooks.containsKey(name)) {
            AddressBook addressBook = new AddressBook(name);
            addressBook.addContact(contact);
            System.out.println("Address Book '" + name + "' created and Below is the list of Contact.");
        } else {
            System.out.println("Address Book '" + name + "' already exists.");
        }
    }

    public AddressBook getAddressBook(String name) {
        return addressBooks.get(name);
    }

    public void listAddressBooks() {
        System.out.println("Available Address Books:");
        for (String name : addressBooks.keySet()) {
            System.out.println("- " + name);
        }
    }

}



