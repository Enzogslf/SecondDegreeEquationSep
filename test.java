	// ideas and what this does(even if obvious)
	// use if statements to check if a number has a letter next to it, etc: isDigit() charAt(int index) isLetter(boolean)
	// this gets parts of the string after and before a plus or minus
	// overall this is the backbone of the code, i need to make these individiual-
	// functions to be used in main

public class test {
	static String test = "1x^2+5x"; //testing string
	

		public class operators {
int plus =  test.lastIndexOf("+");
int minus = test.lastIndexOf("-");
//System.out.println(plus); < for debugging (checking if it exists (if its not equal to -1))
//System.out.println(minus);


	public void checks() {
		if(plus != -1 ){

			//System.out.println("hello"); < more debugging i guess
			String afterplus = test.substring(plus+1);
			String beforeplus = test.substring(0, plus);
			// System.out.println("a:"+ beforeplus); "hardcoded part"
			// System.out.println("b:"+ afterplus);
		}
	if(minus != -1){
			String afterminus = test.substring(minus+1);
			System.out.println(afterminus);
}

		boolean x = test.contains("x");
		if (x = true) {
			int locationOfX = test.indexOf("x");
			
			while (locationOfX >= 0) {
				System.out.println(locationOfX);
				locationOfX = test.indexOf("x", locationOfX + 1);
			}
			
			
}

}
}
	public static void main(String[] args){
		
}
}
