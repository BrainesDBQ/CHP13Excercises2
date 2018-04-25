package chapter13Recursion;

public class Vowels {
	 public static int count_Vowels(String strVowel)
	    {
	        int VowelCount = 0;
	        for (int i = 0; i < strVowel.length(); i++)
	        {
	            if (strVowel.charAt(i) == 'a' || strVowel.charAt(i) == 'e' || strVowel.charAt(i) == 'i'
	                    || strVowel.charAt(i) == 'o' || strVowel.charAt(i) == 'u'|| strVowel.charAt(i) == 'A' || strVowel.charAt(i) == 'E' || strVowel.charAt(i) == 'I'
	                    || strVowel.charAt(i) == 'O' || strVowel.charAt(i) == 'U')
	            {
	            	VowelCount++;
	            }
	        }
	        return VowelCount;
	    }

}
