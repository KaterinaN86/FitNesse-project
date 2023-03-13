package org.example;

public class AttemptLoginAndValidateResults {
    private String lastLoginResult;

    public boolean createAccountWithPasswordInStatus(String accountName, String password, String status) {
        if("valid".equalsIgnoreCase(status))
            lastLoginResult = "success";

        if("do not create".equalsIgnoreCase(status))
            lastLoginResult = "account not found";

        if("revoked".equalsIgnoreCase(status))
            lastLoginResult = "account revoked";

        if("password expired".equalsIgnoreCase(status))
            lastLoginResult = "password expired";

        return true;
    }

    public void attemptLoginsToWith(int attempts, String account, String password) {
    }

    public String lastLoginResultIs() {
        return lastLoginResult;
    }

    public static void main(String[] args) {

    }
}
