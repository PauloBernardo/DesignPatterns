package com.company.ChainOfResponsibility;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Design Pattern Chain Of Responsibility");

        Chain addNumbers = new AddNumbers();
        Chain subtractNumbers = new SubtractNumbers();
        Chain multiNumbers = new MultiNumbers();
        Chain divideNumbers = new DivideNumbers();

        addNumbers.setNextChain(subtractNumbers);
        subtractNumbers.setNextChain(multiNumbers);
        multiNumbers.setNextChain(divideNumbers);

        ArrayList<Numbers> requests = new ArrayList<>();
        requests.add(new Numbers(5.8, 3.7, "add"));
        requests.add(new Numbers(20, 8, "sub"));
        requests.add(new Numbers(10, 5, "mult"));
        requests.add(new Numbers(10, 2, "div"));
        // Get error, because there are no chain for 'exp'
        requests.add(new Numbers(5, 2, "exp"));

        try {
            for(Numbers request: requests)
                System.out.println(
                        request.getNumber1() + " " + request.getCalculationWanted()
                                + " for " + request.getNumber2() + " = " +addNumbers.calculate(request));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
