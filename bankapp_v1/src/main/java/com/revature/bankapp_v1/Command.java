package com.revature.bankapp_v1;

public class Command {
    private String commandWord;

    public Command(String firstWord) {
        this.commandWord = firstWord;
        
    }

    public String getCommandWord() {
        return commandWord;
    }

    public boolean isUnknown() {
        return (commandWord == null);
    }

}