package com.company.Facade;

public class SecurityCodeCheck {
    private final int securityCode;

    public SecurityCodeCheck(int securityCode) {
        this.securityCode = securityCode;
    }

    public int getSecurityCode() {
        return securityCode;
    }

    public boolean isCodeCorrect(int securityCode) {
        if(securityCode == getSecurityCode()) {
            return true;
        } else {
            System.out.println("Security Code is wrong");
            return false;
        }
    }
}
