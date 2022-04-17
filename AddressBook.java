package com.bridgelabz;

import java.util.ArrayList;

public class AddressBook {
    private ArrayList<Contact> friends; // An array of Contacts - each stores info for one friend

    // Create an empty AddressBook
    public AddressBook() {
        friends = new ArrayList<Contact>();
    }

    // Add a contact that's passed in as a parameter.
    public void addContact(Contact c) {
        friends.add(c);
    }

    // Print out info on all contacts using method Contact class.
    public void printContacts() {
        for (int i=0;i<friends.size();i++)
            System.out.println(friends.get(i));
    }

    // Returns the number of friends currently in AddressBook
    public int numContacts() {
        return friends.size();
    }

    // Returns a non-neg integer if a Contact with name s exists corresponding
    // to which place in the array friends the Contact is stored. Returns -1
    // otherwise.
    private int haveContact(String s) {
        for (int i=0;i<friends.size();i++)
            if (friends.get(i).getName().equals(s))
                return i;
        return -1;
    }

    // Deletes a contact with name s, if one is in the AddressBook.
    public void deleteContact(String s) {
        int place = haveContact(s);
        if (place >= 0)
            friends.remove(place);
    }
}

