package Q8;

public class LetterSwap {

	
/* Given a string str and two positions i and j
 * Set first to the substring from the start of 
 * the string to the last position before i
 * 
 * Set middle to the substring from positions i + 1 to the end of the string
 * 
 * Set last to the substring from position j+1 to the end of the string
 * 
 * Concatenate the following five strings; first, the string containins just
 * the character at position j middle, the string containing just the character
 * at position i, and last
 * 
 * WORD:	GATEWAY
 */
	
	//Trying to create word: 'getaway'
	// G A T E W A Y
	// 0 1 2 3 4 5 6
	
	public static void main (String args[]){

		String word = "Gateway";
		
		String g = word.substring(0,1);
		String t = word.substring(2,3);
		String a = word.substring(1,2);
		String e = word.substring(3,4);
		String end = word.substring(4,7);
		
		String newWord = g + e + t + a + end;
		System.out.println(g);
		System.out.println(e);
		System.out.println(t);
		System.out.println(a);
		System.out.println(end);
		System.out.println(word);
		System.out.println(newWord);
		
		
		
		
	}
	
}
