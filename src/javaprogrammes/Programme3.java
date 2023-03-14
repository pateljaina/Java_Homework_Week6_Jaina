package javaprogrammes;

/**
 * Write a Java programme using the following steps.
 */
public class Programme3 {

    int a = 30;//3.1 Declare one instance and one static variable.
    static int b = 25;

    public void method2() {//3.2 Declare one instance method.
        System.out.println(a);//3.4 Call both instance and static variables into both instance and static methods inside the
        //print statement.
        System.out.println(b);
    }

    public static void method1() {//3.3 Declare one static method.
        Programme3 obj1 = new Programme3();//3.4 Call both instance and static variables into both instance and static methods inside the
        //print statement.
        System.out.println(obj1.a);
        System.out.println(b);
    }

    public static void main(String[] args) {//3.5 Declare the Main method.
        method1();//3.6 Call both instance and static methods into the Main method and run the programme
        Programme3 obj2 = new Programme3();
        obj2.method2();
    }

}










