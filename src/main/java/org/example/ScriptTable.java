package org.example;

public class ScriptTable {
    private String userID;
    private String password;
    private String messageReceived;
    private int loginAttemptsMade;

    public ScriptTable(String userID, String password) {
        this.userID = userID;
        this.password = password;
    }

    public boolean loginWithUserIDAndPassword(String userID, String password) {
        loginAttemptsMade++;
        boolean result = this.userID.equals(userID) && this.password.equals(password);
        if (result) {
            this.messageReceived = String.format("%s Successfully logged in.", this.userID);
        } else {
            this.messageReceived = String.format("%s Login attempt unsuccessful.", this.userID);
        }
        return result;
    }

    public String loginMessageReceived() {
        return messageReceived;
    }

    public int numberOfLoginAttemptsMade() {
        return loginAttemptsMade;
    }

    public static void main(String[] args) {

    }
}
