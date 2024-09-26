package september23;

import java.nio.charset.CharacterCodingException;

public class StringConcepts {
    public static void main(String[] args) {
        String b ="This is my first string program that we are discussing";
        System.out.println(b.length());
        System.out.println(b.isEmpty());
        System.out.println(b.toLowerCase());
        System.out.println(b.startsWith(""));
        System.out.println(b.toLowerCase().startsWith("this"));
        System.out.println(b.toUpperCase().startsWith("THIS"));
        System.out.println(b.startsWith("first",11));
        System.out.println(b.endsWith("scussing"));
        System.out.println(b.replace("first","second"));
        System.out.println(b.contains("ring"));
       // System.out.println(b.contains("hat we");
        System.out.println(b.concat(" ! Yes it is."));
        System.out.println(b.charAt(30));
        System.out.println(b.charAt(3));
        System.out.println(b.substring(4));
        System.out.println(b.substring(10,29));
       // System.out.println(b.substring(30,20));
        System.out.println(b.repeat(7));
        System.out.println(b.indexOf('i'));
        System.out.println(b.indexOf('k'));
        System.out.println(b.indexOf("first"));
        System.out.println(b.indexOf("is",45));
        System.out.println(b.indexOf('p',30,35));
        System.out.println(b.lastIndexOf('i'));
        System.out.println(b.lastIndexOf("are"));
        System.out.println(b.lastIndexOf("z"));
        System.out.println(b.lastIndexOf("my",20));
        System.out.println(b.charAt(2));
       String dummy=Character.toString(b.charAt(20));
        System.out.println(dummy.repeat(10));
        String c3="    Jack is    .";
        System.out.println(c3.trim());
        System.out.println(c3.stripTrailing());
        String s4="This is a new day to begin a new show";
        System.out.println(s4.replace("new", "old"));
        //System.out.println(;s4.codePointAt(s4.codePointAt(10));

        String s5="This is a new day to begin a new show";
        //System.out.println(s4.equals());

    }
}
