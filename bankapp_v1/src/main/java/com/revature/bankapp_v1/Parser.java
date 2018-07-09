package com.revature.bankapp_v1;

import java.util.Scanner;

public class Parser {
    private CommandWords commands;
    private Scanner reader;

    //its best to have constructors include the definitions of fields
    public Parser() {
        commands = new CommandWords();
        reader = new Scanner(System.in);
    }

    public Command getCommand() {
        String inputLine;
        String word1 = null;
        String word2 = null;

        System.out.print("> ");
        inputLine = reader.nextLine();

        //tokenizer?
        //this tokenizes by blank spaces. take 1st and 2nd word, ignore everything else
        Scanner tokenizer = new Scanner(inputLine);
        if (tokenizer.hasNext()) {
            word1 = tokenizer.next();
            if (tokenizer.hasNext()) {
                word2 = tokenizer.next();
            }
        }

        //check if words are known
        if (commands.isCommand(word1)) {
            return new Command(word1);
        } else {
            return new Command(null);
        }
    }

    public void showCommands() {
        commands.showAll();
    }
}