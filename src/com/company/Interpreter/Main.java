package com.company.Interpreter;

import java.lang.reflect.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Design Pattern Interpreter");

        String [] questionsAsked = new String[8];
        questionsAsked [0] = "1 pints to tablespoons";
        questionsAsked [1] = "2 pints to tablespoons";
        questionsAsked [2] = "1 quarts to cups";
        questionsAsked [3] = "1 tablespoons to quarts";
        questionsAsked [4] = "1 quarts to pints";
        questionsAsked [5] = "2 cups to pints";
        questionsAsked [6] = "20 quarts to cups";
        questionsAsked [7] = "1000 tablespoons to quarts";

        for(String questionAsked: questionsAsked) {
            ConversionContext question = new ConversionContext(questionAsked);

            String fromConversion = question.getFromConversion();

            String toConversion = question.getToConversion();

            double quantity = question.getQuantity();

            try {

                Class<?> tempClass = Class.forName("com.company.Interpreter." + fromConversion);

                Constructor<?> con = tempClass.getConstructor();

                Object convertFrom = (Expression) con.newInstance();

                Class[] methodParams = new Class[]{Double.TYPE};

                Method conversionMethod = tempClass.getMethod(toConversion, methodParams);

                Object[] params = new Object[]{quantity};

                String toQuantity = (String) conversionMethod.invoke(convertFrom, params);

                String answerToQues = question.getResponse() +
                        toQuantity + " " + toConversion;

                System.out.println(answerToQues);

            } catch (
                    Exception e) {
                e.printStackTrace();
            }
        }
    }
}
