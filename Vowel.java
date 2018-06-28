import java.util.*;
class Vowel{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter your string: ");
		String inputstring=sc.nextLine();
		String newinputstring=inputstring.replaceAll("[AEIOUaeiou]", "");
		System.out.println("your string without vowels are: ");
System.out.println(newinputstring);
			}
}