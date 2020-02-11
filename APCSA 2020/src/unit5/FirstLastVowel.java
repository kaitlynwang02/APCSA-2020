package unit5;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class FirstLastVowel
{
   public static String go( String word )
	{
	   
	   String a = "a";
	   String e = "e";
	   String i = "i";
	   String o = "o";
	   String u = "u";
	   String A = "A";
	   String E = "E";
	   String I = "I";
	   String O = "O";
	   String U = "U";
	   
	   if (word.startsWith(a) || word.endsWith(a) || word.startsWith(e) || word.endsWith(e) || word.startsWith(i) || word.endsWith(i) || word.startsWith(o) || word.endsWith(o) || word.startsWith(u) || word.endsWith(u) || word.startsWith(A) || word.endsWith(A) || word.startsWith(E) || word.endsWith(E) || word.startsWith(I) || word.endsWith(I) || word.startsWith(O) || word.endsWith(O) || word.startsWith(U) || word.endsWith(U))
	   return "yes";
	   
	   else
	   return "no";
	}
}