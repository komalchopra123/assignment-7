import java.util.*;
class Occurencestring{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String line=sc.nextLine();
		String line1=sc.nextLine();
		if(line.contains(line1)==true){
			System.out.println("string contains another string");
		}
		else{
			System.out.println("string not contains another string");
		}
	}
}