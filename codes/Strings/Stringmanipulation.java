package Strings;

import java.lang.reflect.Array;
import java.util.Arrays;

class Reverse1{
	//Reverse String each character in String
	static void  reverseCharacter(String st)
	{
		String s1="";
		for(int i=st.length()-1;i>=0;i--)
		{
			s1+=st.charAt(i);
		}
		System.out.println(s1);
	}
	
	//Reverse only word in string
	static void reverseWord(String st)
	{
		String [] str=st.split(" ");
		int high=str.length-1;
		int low=0;
		while(high>low)
		{
			  String  tem=str[low];
			  str[low]=str[high];
			  str[high]=tem;
			  high--;
			  low++;
		}
		System.out.println(Arrays.toString(str));
	}
	static boolean checkpalindrome(char []st)
	{
		int low=0;
		int high=st.length-1;
		while(low<high)
		{
			if(st[high]!=st[low])
			{
				return false;
			}
				high--;
				low++;
			
		}
		return true;
	}
	//capitalize fist char in String
	static void capitalize(String st)
	{
		String [] str=st.split(" ");
		String tem="";
		for(int i=0;i<str.length;i++)
		{
			char ch=str[i].charAt(0);
			String c1=String.valueOf(ch).toUpperCase();
			String sub=str[i].substring(1);
			tem+=c1+sub+" ";
		}
		System.out.println(tem);
	}
	
	//check Anagram or not
	static void checkAnagram(String st1,String st2)
	{
//		String st1="aana";
//		String st2="aana";
		char ch[]=st1.toCharArray();
		char ch1[]=st2.toCharArray();
		boolean flag=true;
		if(ch.length!=ch1.length)
		{
			flag=false;
		}
		Arrays.sort(ch1);
		Arrays.sort(ch);
		
		for(int i=0;i<ch1.length;i++)
		{
			if(ch[i]!=ch1[i])
			{
				flag=false;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Given String is Anangran");
		}
		else {
			System.out.println("Given String is Not Anagram");
		}
	
	}

}
public class Stringmanipulation {

	public static void main(String[] args) {
	  Reverse1.reverseCharacter("This is Priyansh Khare");
	  Reverse1.reverseWord("This is RailWorld Pvt ltd");
	  System.out.println(Reverse1.checkpalindrome("MOM".toCharArray()));
	  System.out.println(Reverse1.checkpalindrome("Vishu".toCharArray()));
	Reverse1.capitalize("this is vishu");
	Reverse1.checkAnagram("aana","aana");
	}

}
