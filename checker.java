// !outdated comments
// !DONE:overall this is the backbone of the code, i need to make these individiual-
// !functions to be used in main^

// *still relevant coments:
// *ideas and what this does(even if obvious)
// *this gets parts of the string after and before a plus or minus
// *it also checks if there are,and every instance of "x" in the string
// todo: use if statements to check if a number has a letter next to it, etc: isDigit() charAt(int index) isLetter(boolean)

public class checker {
	public StringBuffer inputBuffer = new StringBuffer("");
	public String input = inputBuffer.toString();

	public int allIndexOf(String str) {
		boolean x;
		int lx;
		x = input.contains(str);
		if (x = true) {
			lx = input.indexOf(str);	
			while(lx >= 0) {
				//  System.out.println(lx);
				lx = input.indexOf(str, lx + 1);
				return lx;
			}
			 return lx;
		}
		 else {
			return -1;
		 }

		// return lx;
	}
	
	
	public void getNumber(){
	int indexOfX = allIndexOf("x");
	int indexOfPlus = allIndexOf("+");
	int indexOfMinus = allIndexOf("-");

	System.out.println(indexOfX);
	}
// 	public void checksPlus() {
// 		// * String beforeplus = input.substring(0, plus);
// 		int plus = input.indexOf("+");
// 		String afterplus = input.substring(plus + 1);
// 		if (plus != -1)
// 			System.out.println(afterplus);
// 		else
// 		System.out.println("");
//  } 
 	// public void checksMinus(){
	// 	int minus = input.indexOf("-");
	// 	String afterminus = input.substring(minus + 1);
	// 	if (minus != -1)
	// 		System.out.println(afterminus);

	// 	else
	// 		System.out.println("");
	// }

	// public void xChecker() {
	// 	boolean x = input.contains("x");
	// 	if (x = true) {
	// 		int locationOfX = input.indexOf("x");

	// 		while (locationOfX >= 0) {
	// 			System.out.println(locationOfX);
	// 			locationOfX = input.indexOf("x", locationOfX + 1);
	// 		}
	// 	}
	// }
}
