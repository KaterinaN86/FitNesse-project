package org.example;

//Class used to demonstrate Script Table usage to perform FitNesse tests.
public class ScriptTable {
    //Class variables used to define user data for system under test.
    private String userID;
    private String password;
    private String messageReceived;
    private int loginAttemptsMade;

    /**
     * Constructor
     *
     * @param userID   String, initial value
     * @param password String, initial value
     */
    public ScriptTable(String userID, String password) {
        this.userID = userID;
        this.password = password;
    }

    public static void main(String[] args) {

    }

    /**
     * Method that simulates login action by using userID and password values.
     *
     * @param userID   String
     * @param password String
     * @return boolean, set to true only if parameter values for userID and password match initial values.
     */
    public boolean loginWithUserIDAndPassword(String userID, String password) {
        //Incrementing loginAttempts value.
        loginAttemptsMade++;
        //Set to true or false depending on the logical operation result (both userID and password need to match initial values).
        boolean result = this.userID.equals(userID) && this.password.equals(password);
        //Defining messageReceived value depending on result value.
        if (result) {
            this.messageReceived = String.format("%s Successfully logged in.", this.userID);
        } else {
            this.messageReceived = String.format("%s Login attempt unsuccessful.", this.userID);
        }
        return result;
    }

    //Method that acts as getter for messageReceived value
    public String loginMessageReceived() {
        return messageReceived;
    }

    //Method that acts as getter for loginAttemptsMade value
    public int numberOfLoginAttemptsMade() {
        return loginAttemptsMade;
    }
}
