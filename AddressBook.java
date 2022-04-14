package com.bridgelabz;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import java.util.Scanner;

public class AddressBook {
    static Logger logger = Logger.getLogger(AddressBook.class);
    static Scanner sc = new Scanner(System.in);
    public static void main (String [] args) {
        BasicConfigurator.configure();
        logger.info("Welcome to Address Book ");

        while (true) {

            logger.info("1.press 1 for creating new contact");
            logger.info("2.to exit press 2");
            logger.info("press option");
            int option = sc.nextInt();

            switch (option) {
                case 1: {
                    logger.info("you have selected the option for creation");
                    break;
                }
                case 2: {
                    logger.info("you have selected to exit");
                    System.exit(0);
                }
                default:
                    logger.info("please select right choice ");

            }
        }
    }
}
