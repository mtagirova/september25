package september19;

import static java.lang.StringTemplate.STR;

public class Class1 {
    public static void main (String[] args) {
        //main method is nothing the Java Compiler recognises the keyword main
        //prints data onto the console - Hallo World;
        System.out.println("Hello, World!");
        //CTRL+SHITFT+F10
        System.out.println("Mariam");
        System.out.println(40 - 200 / 50);
        System.out.println(30 - 200 / 2 * 100 + 300 - 200);
        //bracket of division
        System.out.print("number obtained is: " + (-30 * 200 - 30 * 30 + 30));
        System.out.print(" the end of the division");
        //+ join to values
        System.out.println(STR."Number obtained is: \{-30 * 200 - 30 * 30 + 30}");

        //reassign values
        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println("Sum of a and b is: " + sum);

        //arrays
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("First element of the array: " + numbers[0]);


    }
}
