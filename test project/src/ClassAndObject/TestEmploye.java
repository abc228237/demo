package ClassAndObject;

public class TestEmploye {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*	Employe alex,linda,john;
		
		alex = new Employe();
		linda = new Employe();
		john = new Employe(); */
		
		Employe alex = new Employe();
		Employe linda = new Employe();
		Employe john = new Employe();
		
		alex.salary = 40000.00;
		alex.bonus = 10000.00;
		alex.calculateTotalPay();
		
		linda.salary = 30000.00;
		linda.bonus = 15000.00;
		linda.calculateTotalPay();
		
		john.salary = 50000.00;
		john.bonus = 20000.00;
		john.calculateTotalPay();
	}

}
