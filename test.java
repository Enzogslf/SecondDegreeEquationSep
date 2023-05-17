public class test {
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
