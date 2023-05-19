/*chalange: separate second degree equations into 3 parts(a,b and c, for
x^2, x, NUM)
 * detect if its imcomplete or complete(if b or c = 0)
 * detect if its even a second degree equation(if a = 0 its not a second
 *  degree equation)
 * 
 * separation example:
 * input= 1x^2+2x-3= 0
 * output: A:1
 *         B:2
 *         c:-3
 * 
 * first idea: get all numbers and letters before a plus or minus sign,
 * and ignore the previous monomials(maybe done with a loop?)
 * learn modifying strings and outputs in java
 * 
 * plan: get indexOf of the equation, use substring to extract the part we want
 * DONE THAT IN test.java!
 * LOOKING FOR EXPANDING THAT SOLUTION
 */

import java.util.Scanner;

public class main{
    public static void main(String[] args) {
    //    String equation = 1x^2+2x-3=0;
    //     int a = equation.indexOf(1);
    //     boolean ab = equation.contains("x^2");
    //     System.out.println(a);
    //     System.out.println(ab);
    //     int c;

    Scanner eqinput = new Scanner(System.in);
    String test = eqinput.nextLine();
    test.toString();
    
    String input = test; //redundant but still used
    System.out.println(input);
    }


}

