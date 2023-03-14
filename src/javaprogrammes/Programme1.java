package javaprogrammes;

/**
 * Write a Java programme using the following steps.
 */
public class Programme1 { //1.1 Declare two instance variables.
    int a = 30;
    int b = 20;

    public void method1() { //1.2 Declare one instance method.
        System.out.println(a);//1.3 Call both instance variables into the instance method inside the print statement.
        System.out.println(b);
    }

    public static void main(String[] args) {//1.4 Declare the Main method
        Programme1 obj = new Programme1();//1.5 Call the above instance method into the Main method and Run the programme.
        obj.method1();
    }

}

