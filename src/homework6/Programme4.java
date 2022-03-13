package homework6;
/*
4. Write a Java programme using the following steps.
 */

public class Programme4 {
    //4.1 Declare two instance
    int a = 100;
    String name = "Kate";
 //   and two static variables.
    static int b = 10;
    static String name1 = "Java";

    //4.2 Declare one instance method.
    public void testIns(){
        System.out.println(a);
        System.out.println(name);
        System.out.println(b);
        System.out.println(name1);

    }
    //4.4 Call all four instance and static variables into both instance and static methods inside the
    //print statement.
    //4.3 Declare one static method.
    public static void testSta() {
        Programme4 obj = new Programme4();
        System.out.println(obj.a);
        System.out.println(obj.name);
        System.out.println(b);
        System.out.println(name1);
    }
//4.5 Declare the Main method.
//4.6 Call both instance and static methods into the Main method and run the programme.
public static void main(String[] args) {
    testSta();
    Programme4 obj = new Programme4();
    obj.testIns();
}
}
