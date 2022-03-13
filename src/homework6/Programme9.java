package homework6;
/*
9. Write a program to convert the upper case to lower case.
 */

import java.util.Locale;

public class Programme9 {
    public static void main(String[] args) {
        Programme9 p9 = new Programme9();
        p9.cases();

            }
            public void cases(){
        String name = "Miss Cath Brown";
                System.out.println("All In Uppercase: " + name.toUpperCase());
                System.out.println("All In Lowercase: " + name.toLowerCase());
            }
}
