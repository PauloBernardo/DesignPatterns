package com.company.Visitor;

public interface Visitor {
    double visit(Liquor liquor);
    double visit(Tobacco tobacco);
    double visit(Necessity necessity);
}
