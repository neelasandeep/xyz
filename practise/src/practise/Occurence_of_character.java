package practise;
import java.util.Scanner;

public class Occurence_of_character {

	public static void main(String[] args) {
  Scanner sc= new Scanner(System.in);
  
 System.out.println("Enter string ypu want");
 String str=sc.nextLine();
 str=str.replace(" ", "");
 secondOccur(str);
 System.out.println("=-----------------------------------------------------------------=");
 while(str.length()>0) {
	 char ch=str.charAt(0);
	 System.out.println((char)((int)ch-32)+ " occured "+charCount(ch,str)+"times");
	 
	 str=str.replace(""+ch, "");
 }

 
 
 
	}
	public static int charCount(char ch ,String str) {
		int count=0;
		while(str.indexOf(ch)!=-1) {
			count++;
			str=str.substring(str.indexOf(ch)+1);
		}
		
		
		
		return count;
	}
	public static void secondOccur(String str) {
		int a[]=new int[26];
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>=65 && str.charAt(i)<=90 ) {
				a[str.charAt(i)-65]++;
			}else if(str.charAt(i)>=97 && str.charAt(i)<=122)
				a[str.charAt(i)-97]++;
		}
		for(int i=0;i<26; i++) {
			if(a[i]!=0)
			System.out.println((char)(i+65)+"   occured "+a[i]+"times");
		}
	}

}
