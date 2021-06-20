package com.company.Visitor;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class TaxHolidayVisitor implements Visitor {
    private final DecimalFormat df = new DecimalFormat("#,##0.00", new DecimalFormatSymbols(new Locale("en", "EU")));


    @Override
    public double visit(Liquor liquor) {
        return Double.parseDouble(df.format((liquor.getPrice() * 1.10)));
    }

    @Override
    public double visit(Tobacco tobacco) {
        return Double.parseDouble(df.format((tobacco.getPrice() * 1.30)));
    }

    @Override
    public double visit(Necessity necessity) {
        return Double.parseDouble(df.format((necessity.getPrice() * 1)));
    }
}
