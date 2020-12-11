package be.intecbrussel;

public class ExceptionDemo {
    public static void main(String[] args) {
//        try {
//            System.out.println(args[0] = "Hello");
//            System.out.println(2 / 0);
//            System.out.println(new int[]{1, 2, 3}[3]);
//        } catch (ArrayIndexOutOfBoundsException ioobe) {
//            System.out.println("Hey Mate, you are trying to access an index that is out of bounds! You dumdum.");
//        } catch (ArithmeticException ae) {
//            System.out.println("Hey mate, you can't divide by 0. It will fry the app!");
//        }

        try {
            System.out.println(2 / 0);
            System.out.println(args[0] = "Hello");
            System.out.println(new int[]{1, 2, 3}[3]);
        } catch (ArithmeticException ae) {
            System.out.println("Hey Mate, you are trying to access an index that is out of bounds! You dumdum.");
        } catch (Exception e) {
            System.out.println("Hey mate, you can't divide by 0. It will fry the app!");
        }


        System.out.println("App over. ");
    }
}
