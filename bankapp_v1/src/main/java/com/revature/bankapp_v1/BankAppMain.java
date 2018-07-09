package com.revature.bankapp_v1;
 
import java.util.*;
import java.io.*;

public class BankAppMain {
    private Parser parser;

    public static void main(String[] args) {
        BankAppMain bank = new BankAppMain();
        bank.startSession();

        /*
        BankAccount acct1 = new BankAccount();
        String filename = "serializedBankAccount.txt";

        Customer p = new Customer("Bob", 55);

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name:");

        try {
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename));
                oos.writeObject(p);
            } catch (IOException ex) {
                ex.printStackTrace();
            } 
        
        try {
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename));
                Object q = ois.readObject();
                System.out.println(q);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        */

    }

    public BankAppMain() {
        parser = new Parser();
    }

    public void startSession() {
        System.out.println();
        System.out.println("Welcome to Revature Bank");
        System.out.println("What would you like to do?");
        System.out.println("Type Number:");
        System.out.println("1. Set or Update your Personal Account Info");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Display Account Info.");
        System.out.println("5. Exit");

        boolean finished = false;
        while (!finished) {
            Command command = parser.getCommand();
            finished = processCommand(command);
        }
        System.out.println("Thanks for banking with Revature!");
    }

    private boolean processCommand(Command command) {
        boolean wantToQuit = false;
        
        if(command.isUnknown()) {
            System.out.println("I don't understand");
            return false;
        }

        String commandWord = command.getCommandWord();
        if(commandWord.equals("go")) {
            goRoom(command);
        } else if (commandWord.equals("help")) {
            System.out.println("You are lost.");
            System.out.println("You google for help.");
            System.out.println("A voice on high speaks out: ");
            System.out.println();
            parser.showCommands();
        } else if (commandWord.equals("quit")) {
            wantToQuit = quit(command);
        }

        return wantToQuit;
    }

    private void goRoom(Command command) {

        //Try to leave current room
        /*
        Room nextRoom = currentRoom.getExit(direction);

        if(nextRoom == null) {
            System.out.println("Can't go there!");
        } else {
            currentRoom = nextRoom;
            System.out.println(currentRoom.getLongDescription());
        }
        */
    }

    private boolean quit(Command command) { 
            return true;
    }
}
