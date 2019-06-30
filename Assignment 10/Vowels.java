/**
* class to count number of vowels in a string
**/
public class Vowels{
	/**
	* method to count number of vowels in string
	*@param str
	**/

	public static int numOfVowels(String str){
	//converts the string to all lower case
	str.toLowerCase();

		// if string is empty or null no vowels are in it
		if(str.length() == 0 || str == null){
		return 0;
		}


		/**
		* if first character of string is a vowel it is counted
		* returns 1 and calls itself for recursion
		* when it calls itself it uses a substring as its parameter
		* @param str.substring()
		* this shortens the string one character at a time as method is run many times
		* terminating condition is when there is only one character left in the string and is checked for a vowel or consonant
		**/
		else if(str.charAt(0) == 'a' || str.charAt(0) == 'e' || str.charAt(0) == 'i' || str.charAt(0) == 'o' || str.charAt(0) == 'u'){
			return  1 + numOfVowels(str.substring(1));
		}

		// if first character is a consonant then method is called for recursion without counting any vowels
		else{
			return 0 + numOfVowels(str.substring(1));
		}

	}
}
