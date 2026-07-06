public class Main {
    public static void main(String[] args) {
        //Task 1
        int x = -7;

        if (x < 0) {
             System.out.println("Minus");
        } else if (x > 0) {
             System.out.println("Plus");
        } else {
             System.out.println("Zero");
        }

        //Task 2
        int a = 15;
        int b = 28;

        if (a > b) {
             System.out.println(a);
        } else if (b > a) {
             System.out.println(b);
        } else {
             System.out.println("equal");
        }

        //Task 3
        int n = 12;

        if (n % 2 == 0) {
             System.out.println("Even");
            if (n > 0) {
                 System.out.println("plus");
            } else if (n < 0) {
                 System.out.println("minus");
            } else  {
                 System.out.println("zero");
            }
        } else {
             System.out.println("Odd");
            if (n > 0) {
                 System.out.println("plus");
            } else if (n < 0) {
                 System.out.println("minus");
            } else  {
                 System.out.println("zero");
            }
        }

        //Task 4
        int r = 10;
        int t = 4;
        char c = '+';

        switch (c) {
            case '+':
                 System.out.println(r + t);
                break;
            case '-':
                 System.out.println(r - t);
                break;
            case '*':
                 System.out.println(r * t);
                break;
            case '/':
                if (t == 0) {
                     System.out.println("Error divide to 0");
                } else {
                     System.out.println(r / t);
                }
                break;
            default:
                 System.out.println("Invalid character");
                break;
        }

        //Task 5
        int m = 5;

        switch (m) {
            case 3, 4, 5:
                 System.out.println("Spring");
                break;
            case 6, 7, 8:
                 System.out.println("Summer");
                break;
            case 9, 10, 11:
                 System.out.println("Autumn");
                break;
            case 12,1,2:
                 System.out.println("Winter");
                break;
            default:
                 System.out.println("Invalid number");
        }
    }
}
