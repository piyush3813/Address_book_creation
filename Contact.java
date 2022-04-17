package com.bridgelabz;

public class Contact {
    private String name; // Stores name of Contact
    private String email; // stors email
    private int age;  // Stores age of Contact
    private long phonenumber; // Stores phone number of contact
    private int bday;  // Stores birthday in an int

    // Creates Contact object based on parameters.
    public Contact(String n, String e ,int a, long p, int month, int day) {
        name = n;
        email = e;
        age = a;
        phonenumber = p;
        bday = 100*month + day;
    }

    // Changes phone number of contact
    public void changeNumber(long newnum) {
        phonenumber = newnum;
    }

    // Implements the passing of Contact's birthday.
    public void Birthday() {
        age++;
    }

    // Returns the email of a Contact
    public String getEmail() {
        return email;
    }

    // Returns the name of a Contact
    public String getName() {
        return name;
    }

    // Returns the age of a Contact
    public int getAge() {
        return age;
    }

    // Returns the phone number of a Contact
    public long getNumber() {
        return phonenumber;
    }

    // Prints all information about a contact out.
    public String toString() {
        return  "Name: " + name +"E-mail: " + email + " Age: " + age + " Phone#: " + phonenumber +
                " Birthday: " + getBdayMonth() + "/" + getBdayDay();
    }

    // Returns month of Contact's birthday
    public int getBdayMonth() {
        return bday/100;
    }

    // Returns day of the month of Contact's birthday
    public int getBdayDay() {
        return bday%100;
    }
}

