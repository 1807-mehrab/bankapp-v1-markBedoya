package com.revature.bankapp_v1;

public class CommandWords {
    private static final String[] validCommands = {
        "1", "2", "3", "4", "5"
    };

    public CommandWords() {}

    public boolean isCommand(String input) {
        for(int i=0; i < validCommands.length; i++) {
            if (validCommands[i].equals(input)) {
                return true;
            }
        }
        //if we get here, string was not found in commands
        return false;
    }

    public void showAll() {
        for (String command : validCommands) {
            System.out.print(command + " ");
        }
        System.out.println();
    }
}