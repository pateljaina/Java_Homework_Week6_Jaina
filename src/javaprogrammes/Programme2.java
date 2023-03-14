package javaprogrammes;

/**
 * Write a Java programme using the following steps.
 */
public class Programme2 {

    static int a = 20; //2.1 Declare two static variables
    static int b = 15;

    public static void addition() {//2.2 Declare one static method
        System.out.println(a + b);//2.3 Call both static variables into the static method inside the print statement
    }

    public static void main(String[] args) {//2.4 Declare the Main method
        addition(); //2.5 Call the static method into the Main method and Run the programme.
    }
}

