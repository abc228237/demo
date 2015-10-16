package firstday;

public class ExampleString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String x = "James Bond";
		System.out.println("Hello" + x);
		System.out.println(x.toUpperCase());
		System.out.println(x.substring(2));
		System.out.println(x.substring(2,7));
		
		// Wrapper
		String age = "37";
		String salory = "78239.55";
		
		
		int a =Integer.parseInt(age)/2;
		System.out.println(a);
		
		double s =Double.parseDouble(salory) * .15;
		System.out.println(s);
		}

}
