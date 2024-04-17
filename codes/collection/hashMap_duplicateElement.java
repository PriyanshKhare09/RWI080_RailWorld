package collection;
import java.util.*;

public class hashMap_duplicateElement{
//remove duplicate character 
public static void removeDuplicate()
{
	String str="GoodMorning";
	HashMap<Character,Integer> hp=new HashMap<>();
	StringBuffer sb=new StringBuffer();
	
	for(int i=0;i<str.length();i++)
	{
		if(!hp.containsKey(str.charAt(i)))
		{
			sb.append(str.charAt(i));
			hp.put(str.charAt(i),1);
		}
//		else {
//			hp.put(str.charAt(i),1);
//		}
	}
	System.out.println(sb);
	
	
}


	public static void main(String[] args) {
		
	
		// TODO Auto-generated method stub
		String str="Priyansh Khare".replace(" ", "").toLowerCase();
		
		HashMap<Character,Integer> hp=new HashMap<>();
		char ch[]=str.toCharArray();
		
		for(char cha:ch)
		{
			if(hp.containsKey(cha))
			{
				hp.put(cha, hp.get(cha)+1);
			}
			else {
				hp.put(cha,1);
			}
		}
//		System.out.println(hp);
		
		//print the duplicate element using entry set
		for(Map.Entry<Character, Integer> entry:hp.entrySet())
		{
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey()+":"+entry.getValue());
			}
		}
		 hashMap_duplicateElement.removeDuplicate();
		
	}

}
