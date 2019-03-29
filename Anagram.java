import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;
import java.util.HashSet;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileReader;
import java.util;

import java.io.BufferedReader;
public class Anagram
{
	public static void main(String args[])
	{

		File file = new File("A-small-practice.in");

		BufferedReader b = new BufferedReader(new FileReader(f));
		
		FileReader fileReader = new FileReader(file);


	
		HashSet<String> Bset = new HashSet<String>();
		ArrayList<String> Aset = new ArrayList<String>();

		int numOfAnagrams = Integer.parseInt(in.readline());;
		
		int length = 4;

		String A = "SUBXXXXXX";
		String B = "SUBBUSUSB";
		int count = 0;
		
		for(int x=0; x<length; x++)
		{
			
		}
		for(int a=0; a<= A.length();a++)
			for(int b=a+1; b<= A.length();b++)
			{
				String original = A.substring(a,b);
        		char[] chars = original.toCharArray();
        		Arrays.sort(chars);
       		    String sorted = new String(chars);				
				Aset.add(sorted);

				original = B.substring(a,b);
				chars = original.toCharArray();
        		Arrays.sort(chars);
				sorted = new String(chars);			
				Bset.add(sorted);
				
			}

		System.out.println(Aset);
		System.out.println(Bset);
		
		Iterator<String> AsetIter = Aset.iterator();
		while (AsetIter.hasNext()) 
			{
				if(Bset.contains(AsetIter.next()))
				count++;		
			
			}

		System.out.println(count);
		}


		


		

	
}