package com.epam.homework8;

public class Validator {

    public Validator()
    {

    }

    public static boolean validateInteger(String input)
    {
        try
        {
            Integer.parseInt(input);
        }
        catch(NumberFormatException e)
        {
            System.out.println("Invalid Integer");
            return false;
        }
        return true;
    }

    public static boolean validateFloat(String input)
    {
        try
        {
            //validate here
            Float.parseFloat(input);
        }
        catch(NumberFormatException e)
        {
            System.out.println("Invalid Float");
            return false;
        }
        return true;
    }

}