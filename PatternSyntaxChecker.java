//Using Regex, we can easily match or search for patterns in a text. Before searching for a pattern, we have to specify one using some well-defined syntax.
//In this problem, you are given a pattern. You have to check whether the syntax of the given pattern is valid.
//Note: In this problem, a regex is only valid if you can compile it using the Pattern.compile method.

//Input Format

//The first line of input contains an integer , denoting the number of test cases. The next  lines contain a string of any printable characters representing the pattern of a regex.

//Output Format

//For each test case, print Valid if the syntax of the given pattern is correct. Otherwise, print Invalid. Do not print the quotes.


import java.util.Scanner;
import java.util.regex.*;

public class PatterSyntaxChecker
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		for(int i=0; i<testCases;i++){
			String pattern = in.nextLine();
            try{
            Pattern p = Pattern.compile(pattern);
            System.out.println("Valid");
            }
            catch(Exception e){
                System.out.println("Invalid");
            }
    
		}
	}
}



