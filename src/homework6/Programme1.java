package homework6;

/*
 *1. Write a Java programme using the following steps.
*/
public class Programme1 {
    // 1.1 Declare two instance variables.
    int a = 100;
    String name = "Kate";

    //1.2 Declare one instance method.
    //1.3 Call both instance variables into the instance method inside the print statement.
    public void test() {
        System.out.println(a);
        System.out.println(name);

    }

    //1.4 Declare the Main method.
    //1.5 Call the above instance method into the Main method and Run the programme.
    public static void main(String[] args) {
        Programme1 obj = new Programme1();
        System.out.println(obj.a);
        obj.test();
    }
}

