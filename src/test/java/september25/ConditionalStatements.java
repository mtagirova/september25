package september25;

public class ConditionalStatements {
    public static void main(String[] args) {
        int a=10;
        if(a==10);
        if(a==11)
            System.out.println("The value of 10 is 10");
        else
            System.out.println("The value of is not 10, actual value is: " +a);
        a=40-20*100;
        if(a%7==0)
        System.out.println("the value of a desirable by 7");
        else if(a%5==0)
        System.out.println("the value of is not dived by 5");

        else if(a%3==0)
            System.out.println("The value of a is dividable by 3");
        else
            System.out.println("The value of a is not divablle by 3, actual value");

        String s1="Hello";
        {
            if(s1.isBlank()==false)
            {
                if(s1.length()%2==0)
                    System.out.println();
            }
        }

    }
}
