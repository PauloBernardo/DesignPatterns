package com.company.ChainOfResponsibility;

public class SubtractNumbers implements Chain{
    private Chain nextChain;

    @Override
    public void setNextChain(Chain nextChain) {
        this.nextChain = nextChain;
    }

    @Override
    public double calculate(Numbers request) throws Exception {
        if (request.getCalculationWanted().equals("sub")) {
            return request.getNumber1() - request.getNumber2();
        } else {
            if (this.nextChain != null) {
                return this.nextChain.calculate(request);
            } else {
                throw new Exception("Can't calculate this");
            }
        }
    }
}
