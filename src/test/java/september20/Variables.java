void main(){
    //variable - temporory storage of value
    //primitive data types; int, char, float, double, boolean, byte, short, long
    //non-primitive data types ; String, List, arrays
    //data types:
    int a1; //-2^31 to 2^31-1
    byte b2; //-128 to 127
    char c3;
    boolean d4;
    short e5;
    long f6;
    float g7;
    double h8; //16 digits

    //Syntax of assigning values of variables:
    a1 = 127;
    b2 = 127;
    c3 = 'a';
    d4 = false;
    e5 = 32767;
    f6 = 9223372036854775807L; //-9223372036854775808 to 9223372036854775807
    g7 = 3.14F;
    h8 = 3.1415926535897932384626433832795;

    //reassign values:
    int a = 10;
    int b = 20;
    a = b;
    b = 30;

    //output:
    System.out.println(a); //10
    System.out.println(b); //30
    System.out.println(a1); //127
    System.out.println(c3); //a
    System.out.println(d4); //true
    System.out.println(f6);

}

