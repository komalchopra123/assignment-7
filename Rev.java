import java.util.*;
class Rev{
	public static void main(String[] args){
		String original,reverse=" ";
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the string which you want to reverse: ");
		original=sc.nextLine();
		int length=original.length();
for(int i=length-1;i>=0;i--){
	reverse=reverse+original.charAt(i);
}
	System.out.print("reverse of a string: "+reverse);
}
}