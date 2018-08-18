package com.hackerrank.challenges.barclays.mcq.outputone;

/**
 * Created using IntelliJ IDEA.
 * Author:  abhijeetmuneshwar,
 * Date:    29/04/18,
 * Time:    2:24 PM
 */
class Constructor
{
    static String str;
    public void Constructor()
    {
        System.out.println("In constructor");
        str = "Hello World";
    }
    public static void main(String [] args)
    {
        Constructor c = new Constructor();
        System.out.println(str);
    }
}