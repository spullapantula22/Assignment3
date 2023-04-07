import java.time.*;
import java.util.Scanner;

public class HeartRates {
	
	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;
	private final double RHR = 70;
	private final double LB = 0.5;
	private final double UB = 0.85;
	
	public HeartRates(String fn, String ln, String dob) {
		
		this.firstName = fn;
		this.lastName = ln;
		this.dateOfBirth = LocalDate.parse(dob);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public int calculateAge() {
		
		 LocalDate currentDate = LocalDate.now();
		 Period p = Period.between(dateOfBirth, currentDate);
		 
		 int age = p.getYears();
		 
		 if (age < 0) {
			 throw new IllegalStateException("Invalid age: " + age);
		 }
		 
		 return age;
	}
	
	public double getMaxHeartRate() {
		
		return 220 - HeartRates.this.calculateAge();
	}
	
	public void targetHeartRange() {
		
		double ahr = HeartRates.this.getMaxHeartRate() - RHR;
		
		double lower = (ahr * LB) + RHR;
		double upper = (ahr * UB) + RHR;
		
		System.out.println("The Target Heart Range is in between " 
		+ lower + " and " + upper);
	}
	
	public String toString() {
	    StringBuilder sb = new StringBuilder();
	    
	    sb.append("First Name: ").append(this.firstName).append("\n")
	      .append("Last Name: ").append(this.lastName).append("\n")
	      .append("Date of Birth: ").append(this.dateOfBirth).append("\n")
	      .append("Age: ").append(this.calculateAge()).append("\n")
	      .append("Maximum Heart Rate: ").append(this.getMaxHeartRate()).append("\n");
	    
	    return sb.toString();
	}
}
