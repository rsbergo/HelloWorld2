package lab1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * COS 420 - Lab 1: A Git HelloWorld Tour
 * http://www.cs.usm.maine.edu/~macleod/courses/cos420/Spring2019/Lab1.html
 *
 * Create java program that displays "Hello World" on your machines, create a new repository for that program on your
 * laptop/machine, add to code to staging and commit the code, & then upload this repository to the HelloWorld2
 * repository.
 * 
 * Improved for the second Lab session:
 * COS 420 - Lab 2: Continuing the Git Tour
 * http://www.cs.usm.maine.edu/~macleod/courses/cos420/Spring2020/Lab2.html
 * 
 * Improved for the third Lab session:
 * COS 420 - Lab 3: Issues, Milestones and Project Workflow
 * http://www.cs.usm.maine.edu/~macleod/courses/cos420/Spring2020/Lab3.html
 */
public class HelloWorld
{
    /**
     * Gets the current date and return it as a formatted String. The date is formatted as "YYYY-MM-DD".
     * 
     * @return A string representation of the current date, formatted as "YYYY-MM-DD" 
     */
    public static String getCurrentDate()
    {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date currentDate = new Date();
        
        return dateFormat.format(currentDate);
    }
    
    /**
     * Converts the given bytes value to MiB using the following conversion rates:
     * 
     *     - 1 KB = 1024 bytes
     *     - 1 MG = 1024 KB
     *     
     * @param bytes the value to be converted
     * @return the value in MB equivalent to the given bytes value
     */
    private static double convertFromByteToMiB(long bytes)
    {
        return ((double) bytes / 1024) / 1024;
    }
    
    /**
     * Gets the total amount of memory in the Java virtual machine.
     * 
     * @return the total amount of memory in the Java virtual machine, measured in MB
     */
    public static double getTotalMemory()
    {
        return convertFromByteToMiB(Runtime.getRuntime().totalMemory());
    }
    
    /**
     * Gets the current amount of free memory in the Java virtual machine.
     * 
     * @return the current amount of free memory in the Java virtual machine, measured in MB
     */
    public static double getFreeMemory()
    {
        return convertFromByteToMiB(Runtime.getRuntime().freeMemory());
    }
    
    /**
     * Entry point for application.
     * 
     * @param args main program arguments, currently not used
     */
    public static void main(String[] args)
    {
        System.out.println("Here ye : important announcement");
        System.out.println("Hello World!");
        System.out.println("So long, and thanks for all the fish");
        
        // Part 3
        System.out.println();
        System.out.println("Hello, Alice! Hello, Bob!");
        
        // Part 4
        System.out.println();
        System.out.println("Hello, Charlie!");
        System.out.println("Hello, Denise!");
        
        // Part 5
        System.out.println();
        System.out.println("Hello, Ester!");
        
        //Lab3
        System.out.println();
        System.out.println("--------");
        System.out.println("Lab 3: Issues, Milestones and Project Workflow");
        
        //Lab3 - Part2.a
        System.out.println();
        System.out.println("Current date: " + getCurrentDate());
        
        //Lab3 - Part2.b
        System.out.printf("Current free memory: %.3f MB / %.0f MB\n", getFreeMemory(), getTotalMemory());
    }
}
