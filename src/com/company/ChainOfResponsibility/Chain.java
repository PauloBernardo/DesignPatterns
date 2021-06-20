package com.company.ChainOfResponsibility;

public interface Chain {
    void setNextChain(Chain nextChain);
    double calculate(Numbers request) throws Exception;
}
