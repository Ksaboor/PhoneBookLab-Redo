package com.company.PhoneBook;

import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {

    private String name;
    private String phoneNumber;

    public PhoneBook(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    Map phoneBook = new TreeMap<String, String>();

    public void addContact(String name, String phonenumber) {

        phoneBook.put(name, phonenumber);


    }

    public void removeContact(String name) {
        phoneBook.remove(name);
    }


    public void reverseLookup(String phoneNumber) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
