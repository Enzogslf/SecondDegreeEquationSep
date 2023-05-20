
/**?!
 * *chalange: separate second degree equations into 3 parts(a,b and c, for x^2, x, NUM)
 * 
 * *separation example:
 * *input= 1x^2+2x-3= 0
 * *output: A:1
 * *        B:2
 * *        c:-3
 * 
 * !done first idea: get all numbers and letters before a plus or minus sign,
 * !done: learn modifying strings and outputs in java
 * 
 * ?ignore the previous monomials(maybe done with a loop?)
 * 
 ** work in progress plan: get indexOf of the equation, use substring to extract the part we want
 *todo: looking to expand that plan^
 *todo: detect if its imcomplete or complete(if b or c = 0)
 *todo: detect if its even a second degree equation(if a = 0 its not a second degree equation)
 */

import java.util.Scanner;

public class main extends checker {
    public static void main(String[] args) {
        // !depracateded comments/code/notes:
        // String equation = 1x^2+2x-3=0;
        // int a = equation.indexOf(1);
        // boolean ab = equation.contains("x^2");
        // System.out.println(a);
        // System.out.println(ab);
        // int c;

        // ? gets input and calls checker class and methods, sry if too obvious
        try (Scanner eqinput = new Scanner(System.in)) {
            String test = eqinput.nextLine();

            checker f1 = new checker();
            f1.input = test;
            // f1.indexOfMinus = f1.allIndexOf("-");
            // f1.checksMinus()
            f1.allIndexOf("+");
            f1.getNumber();
            // f1.checksPlus();
            // f1.xChecker();
            System.out.println("");
        }

    }
}
