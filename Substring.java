import java.util.*;
class Substring{
	public static void main(String[] args){
		int c,i,length;
		String string,sub;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a string which you want to print it's all substring");
		string=sc.nextLine();
		length=string.length();
		System.out.println("substrings of \" "+string+"\" are: ");
		for(c=0;c<length;c++){
			for(i=1;i<=length-c;i++){
				sub=string.substring(c,c+i);
				System.out.println(sub);
			}
		}

	}
}