package ClassAndObject;

public class Employe {

	Double salary;
	Double bonus;
	
	void calculateTotalPay(){
		
		Double totalPay = salary + bonus;
		System.out.println("totalpay = " + totalPay);

		
	}	
}
