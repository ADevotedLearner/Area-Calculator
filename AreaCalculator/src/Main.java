/*

Write a method named area with one double parameter named radius.

The method needs to return a double value that represents the area of a circle.

If the parameter radius is negative then return -1.0 to represent an invalid value.

Write another overloaded method with 2 parameters x and y (both doubles), where x and y represent the sides of a rectangle.

The method needs to return an area of a rectangle.

If either or both parameters is/are a negative return -1.0 to indicate an invalid value.

*/

public class Main {

    // The main method is the entry point for the program.
    public static void main(String[] args){

        // Call the area method for a circle with radius -6 and print the result.
        System.out.println(area(-6));

        // Call the area method for a rectangle with radius 1 and width 10, and print the result.
        System.out.println(area(1, 10));
    }

    // This method calculates the area of a circle given its radius.
    public static double area(double radius){

        // Calculate the area using the formula: area = radius * radius * Math.PI
        double area = radius * radius * Math.PI;

        // If the radius is negative, return -1 to indicate an error condition.
        // Otherwise, return the calculated area.
        return (radius < 0) ? -1.0 : area;
    }

    // This method calculates the area of a rectangle given its radius and width.
    public static double area(double radius, double width){

        // Calculate the area using the formula: area = radius * width
        double areaRectangle = radius * width;

        // If either the radius or width is negative, return -1 to indicate an error condition.
        // Otherwise, return the calculated area.
        return (radius < 0 || width < 0) ? -1.0 : areaRectangle;
    }
}
