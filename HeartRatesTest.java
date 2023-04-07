import java.util.Scanner;

public class HeartRatesTest {

	public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please, enter your first name: ");
        String fname = scan.nextLine();
        
        System.out.println("Please, enter your last name: ");
        String lname = scan.nextLine();
        
        System.out.println("Please, enter your date of birth in the format"
        		+ "-(yyyy-mm-dd)- Example 1989-4-14");
        String age = scan.nextLine();
        
        HeartRates person = new HeartRates(fname, lname, age);
        
        person.targetHeartRange();
        System.out.println(person.toString());
       
    }

}
