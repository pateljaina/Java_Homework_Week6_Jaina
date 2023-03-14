package javaprogrammes;

/**
 * Write a Java programme using the following steps
 */
public class Programme4 {//4.1 Declare two instance and two static variables.

    int a = 10;
    int b = 20;
    static int c = 30;
    static int d = 40;

    public void method1() { //4.2 Declare one instance method.
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }

    public static void method2() {//4.3 Declare one static method
        Programme4 obj1 = new Programme4();//4.4 Call all four instance and static variables into both instance and static methods inside the
        //print statement.
        Programme4 obj2 = new Programme4();
        System.out.println(obj1.a);
        System.out.println(obj2.b);
        System.out.println(c);
        System.out.println(d);
    }

    public static void main(String[] args) {//4.5 Declare the Main method.
        Programme4 obj3 = new Programme4();//4.6 Call both instance and static methods into the Main method and run the programme.
        obj3.method1();
        method2();
    }
}
