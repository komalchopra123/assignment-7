import java.util.*;
class Countnumberofword{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter your string in which you want to count the number of words: ");
		while(sc.hasNext()){
			String line=sc.nextLine();
			String[] arr=line.split(" ");
			int word=0;
			for(int i=0;i<arr.length;i++){
				word++;
			}
			System.out.println(word);
		}
	}
}