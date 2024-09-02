package Programming;
import java.util.Scanner;
public class ArthemeticCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		double FirstNum,SecondNum,Result;
		int num;
		do {
			System.out.println("CHOOSE ONE NUMBER: ");
			System.out.println("1.ADD  2.SUB  3.MUL  4.DIV  5.EXIT");
			num=sc.nextInt();
			switch(num) {
			case 1:
				System.out.print("ENTER FIRST NUMBER : ");
				FirstNum= sc.nextFloat();
				System.out.print("ENTER SECOND NUMBER : ");
				SecondNum= sc.nextFloat();
				Result= FirstNum + SecondNum;
				System.out.println("ADDITION OF " + FirstNum +" AND " + SecondNum + " IS : "+ Result);
				System.out.println();
				break;
			case 2:
				System.out.print("ENTER FIRST NUMBER : ");
				FirstNum= sc.nextFloat();
				System.out.print("ENTER SECOND NUMBER : ");
				SecondNum= sc.nextFloat();
				Result= FirstNum - SecondNum;
				System.out.println("SUBTRACTION OF " + FirstNum +" AND " + SecondNum + " IS : "+ Result);
				System.out.println();
				break;
			case 3:
				System.out.print("ENTER FIRST NUMBER : ");
				FirstNum= sc.nextFloat();
				System.out.print("ENTER SECOND NUMBER : ");
				SecondNum= sc.nextFloat();
				Result= FirstNum * SecondNum;
				System.out.println("MULTIPLICATION OF " + FirstNum +" AND " + SecondNum + " IS : "+ Result);
				System.out.println();
				break;
			case 4:
				System.out.println("ENTER FIRST NUMBER : ");
				FirstNum= sc.nextFloat();
				System.out.print("ENTER SECOND NUMBER : ");
				SecondNum= sc.nextFloat();
				Result= FirstNum / SecondNum;
				System.out.println("DIVISION OF " + FirstNum +" AND " + SecondNum + " IS : "+ Result);
				System.out.println(" ");				
				break;
			default :
				if(num>5) {
					System.out.println("---INVALID NUMBER---");
				}
				break;
		  }
		}while(num<5);
		
		sc.close();
	}
}


