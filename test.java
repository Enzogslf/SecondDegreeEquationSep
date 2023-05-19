public class test {

	// ideas and what this does(even if obvious)
	// use if statements to check if a number has a letter next to it, etc
	// this gets parts of the string after and before a plus or minus
	public static void main(String[] args){
		
	String test = "1x^2+5a";
	int plus =  test.lastIndexOf("+");
	int minus = test.lastIndexOf("-");
	//System.out.println(plus); < for debugging ig
	//System.out.println(minus);
	
	if(plus != -1 ){

	//System.out.println("hello"); < more debugging i guess
	String afterplus = test.substring(plus+1);

	String beforeplus = test.substring(0, plus);
	System.out.println("a:"+ beforeplus);
	System.out.println("b:"+ afterplus);
	}
	if(minus != -1){
		String afterminus = test.substring(minus+1);
		System.out.println(afterminus);
	}
}
}
