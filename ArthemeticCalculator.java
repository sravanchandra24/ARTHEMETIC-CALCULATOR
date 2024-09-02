package Programming;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArthemeticCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        double FirstNum, SecondNum, Result;
        int num;

        while (true) {
            try {
                System.out.println("CHOOSE ONE NUMBER: ");
                System.out.println("1.ADD  2.SUB  3.MUL  4.DIV  5.EXIT");
                num = sc.nextInt();

                if (num == 5) {
                    System.out.println("Exiting...");
                    break;
                }

                if (num < 1 || num > 5) {
                    System.out.println("---INVALID NUMBER---");
                    continue;
                }

                System.out.print("ENTER FIRST NUMBER: ");
                FirstNum = sc.nextDouble();
                System.out.print("ENTER SECOND NUMBER: ");
                SecondNum = sc.nextDouble();

                switch (num) {
                    case 1:
                        Result = FirstNum + SecondNum;
                        System.out.println("ADDITION OF " + FirstNum + " AND " + SecondNum + " IS : " + Result);
                        break;
                    case 2:
                        Result = FirstNum - SecondNum;
                        System.out.println("SUBTRACTION OF " + FirstNum + " AND " + SecondNum + " IS : " + Result);
                        break;
                    case 3:
                        Result = FirstNum * SecondNum;
                        System.out.println("MULTIPLICATION OF " + FirstNum + " AND " + SecondNum + " IS : " + Result);
                        break;
                    case 4:
                        if (SecondNum == 0) {
                            System.out.println("---DIVISION BY ZERO IS NOT ALLOWED---");
                        } else {
                            Result = FirstNum / SecondNum;
                            System.out.println("DIVISION OF " + FirstNum + " AND " + SecondNum + " IS : " + Result);
                        }
                        break;
                }
                System.out.println();
            } catch (InputMismatchException e) {
                System.out.println("---INVALID INPUT, PLEASE ENTER NUMERIC VALUES ONLY---");
                sc.next(); // Clear the invalid input
            }
        }

        sc.close();
    }
}
