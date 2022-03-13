package homework6;
/*
3. Write a Java programme using the following steps.
 */

public class Programme3 {
    //3.1 Declare one instance and one static variable.
    int a = 10;
    static String name = "Nest";

    //3.2 Declare one instance method.
    //3.4 Call both instance and static variables into both instance and static methods inside the
    //print statem3.2 Declare one instance method.3.2 Declare one instance method.

    public void test1() {
        System.out.println(a);
        System.out.println(Programme3.name);


    }

    //3.3 Declare one static method.
    public static void test() {
        Programme3 obj = new Programme3();
        System.out.println(obj.a);
        System.out.println(name);

    }
    //3.5 Declare the Main method.
    //3.6 Call both instance and static methods into the Main method and run the programme.

    public static void main(String[] args) {
        test();
        Programme3 obj = new Programme3();
        obj.test1();
    }
}
