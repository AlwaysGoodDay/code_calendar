package Calendar;

import java.util.Scanner;

public class Calendar {
	
	private static final int[] MAX_DAYS= {31, 28, 31,30,31,30, 31,31,30,31, 30, 31};
	public int maxDaysOfMonth(int month) {
		return MAX_DAYS[month-1];
		
	}

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
		Calendar cal=new Calendar();
		
		String PROMPT="cal> ";
		System.out.println("Type number of repeat.");

		//int repeat=scanner.nextInt();
		
		int month=1;
		while(true) {
			System.out.println("Type month");
			System.out.print(PROMPT);
			month=scanner.nextInt();
			//int[] maxDays
			if(month<1 || month>12) {
				System.out.println("Month is out of bound."+ month);		
				break;
			}
			
			System.out.printf("Month %d has maximum %d days. \n", month, cal.maxDaysOfMonth(month) );

		}
		
		
//		for (int i=0; i<repeat;i++) {
//			System.out.println("Type month");
//			System.out.print(PROMPT);
//
//			int month=scanner.nextInt();
//			
//			//int[] maxDays
//			
//			System.out.printf("Month %d has maximum %d days. \n", month, cal.maxDaysOfMonth(month) );
//		}
		
		System.out.println("Bye~~~~");
//		System.out.println("Type month");
//		int month=scanner.nextInt();
//		
//		//int[] maxDays
//		
//		System.out.printf("Month %d has maximum %d days", month, cal.maxDaysOfMonth(month) );
		scanner.close();

	}

}
