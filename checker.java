	// outdated comments{
	// ideas and what this does(even if obvious)
	// use if statements to check if a number has a letter next to it, etc: isDigit() charAt(int index) isLetter(boolean)
	// this gets parts of the string after and before a plus or minus
	// overall this is the backbone of the code, i need to make these individiual-
	// functions to be used in main}


public class checker {
	public StringBuffer inputBuffer = new StringBuffer("");
	public String input = inputBuffer.toString();
	// ints plus and minus return the value of the empty StringBuffer, not scanner input
	// however method Xchecker returns the scanner input, how??
	int plus = input.indexOf("+");
	int minus = input.indexOf("-");

public void checksPlus() {
	// the issue above is probably why beforeplus results in a exception
	// String beforeplus = input.substring(0, plus);
	System.out.println(plus);
	 String afterplus = input.substring(plus+1);
	if(plus != -1 )
		System.out.println(afterplus);
	else
		System.out.println("no plus :(");
}

	public void checksMinus() {
		String afterminus = input.substring(minus+1);
		if(minus != -1)
		System.out.println(afterminus);

		else
		System.out.println("no minus :(");
	}



	public void xChecker(){
		System.out.println(minus);
		boolean x = input.contains("-");
		if (x = true) {
			 int locationOfX = input.indexOf("-");
			
			 while (locationOfX >= 0) {
				 System.out.println(locationOfX);
				 locationOfX = input.indexOf("-", locationOfX + 1);
			 }				
		 }
}

}
