package Calendar;

import java.util.Scanner;

public class Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Sun Mon Tue Wed Thr Fri Sat Sun");
		System.out.println("================================");
		System.out.println(" 1   2   3   4   5   6   7  ");
		System.out.println(" 8   9  10  11  12  13  14");
		System.out.println("15  16  17  18  19  20  21");
		System.out.println("22  23  24  25  26  27  28");
		
		//Find maximum dates of month.
		Scanner scanner=new Scanner(System.in);
		System.out.println("Type month");
		int month=scanner.nextInt();
		
		int[] maxDays= {31, 28, 31,30,31,30, 31,31,30,31, 30, 31};
		
		System.out.printf("Month %d has maximum %d days", month, maxDays[month-1] );
		scanner.close();

	}

}
