package StringPrograms;
import java.time.*;  
import java.util.*;  
 
public class ageCalculator {

	public static void main(String[] args) {
		System.out.print("Enter date of birth in YYYY-MM-DD format: ");  
		Scanner scanner = new Scanner(System.in);  
		String input = scanner.nextLine();  
		scanner.close();  
		
		LocalDate dob = LocalDate.parse(input);
		
		LocalDate curDate = LocalDate.now();  
		Period period = Period.between(dob, curDate);  
		System.out.printf("Your age is %d years %d months and %d days.", 
				period.getYears(), period.getMonths(), period.getDays());  
		
	}

}
