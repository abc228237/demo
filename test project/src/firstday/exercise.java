package firstday;

public class exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double salory = 20000;
		double tax = 0.0;
		if(salory <= 15000){ 
			tax = salory * .10;
		
		}else if(salory <= 40000){
			tax = salory * .20;
		}else{
			tax = salory * .30;
		}
		System.out.println("Tax = " + tax);
		
		String[] num = {"10" , "20" , "30" , "40"};
		int total = 0;
		for(String temp : num){
			total = total + Integer.parseInt(temp);
		}
		System.out.println("total = " + total);
		
		String a = "James Bond";
		System.out.println(a.substring(6).toLowerCase());
		
		}

}
