
//HIT CTRL+A to select all
//Then CTRL+C to copy
// StringTest
// Functions for Manipulating Strings
// Complete Function Stubs
// Test in function in main

public class APCSString {
    
    // 1.
    public static String writeFirstLast(String name) {
   	 String fullName = "";
   	 //TODO: Complete function code
   	int comma = name.indexOf(',') ;
   	int space = name.indexOf(' ');
   	System.out.println (name);
   	System.out.println (comma);
 	System.out.println (space);
   	String first = name.substring(0 , comma );
   	String last = "";
   
   	if(name.charAt(comma ) == ',') {
   		last = name.substring(comma + 2 , name.length() );
   		System.out.println ( last);
   	}
   		
   	System.out.println (first);
   	fullName = last + ',' + first;
//   	System.out.println(fullName);
   	 return fullName;
    }
    
    // 2.
    public static String reverse(String str) {
   	 String out = "";
   	 //TODO: Complete function code
   	 for(int i = str.length() -1 ; i >= 0 ; i--) {
   		char reverse = str.charAt(i);
   		out = out + reverse;
   		
    		 
   	 }
   	 System.out.println(out);
   	 return out;
    }
    
    // 3.
    public static boolean isPalindrome(String str) {
   	 boolean out = true;
   	 String lowerCase = str.toLowerCase();
   	 lowerCase =lowerCase.replaceAll("\\W+", "");
   	 //TODO: Complete function code
   	int firstHalfInt = 0;
   	int secondHalfInt = lowerCase.length()-1;
   	if ( lowerCase.length() == 1) {
   	  return out;
   	}
   	for (int i = firstHalfInt; i < lowerCase.length()/2; i++) {
   	  char firstHalf = lowerCase.charAt( i);
   	  char secondHalf = lowerCase.charAt (secondHalfInt);
   	  System.out.println ("firstHalf : " + firstHalf + " secondHalf : " + secondHalf);
   	  if ( firstHalf != secondHalf){
   	    out = false;
   	    break;
   	  }
   	  secondHalfInt--;
   	 
    }
   	return out;
    }
    
    // 4.
    public static String removeDashes(String ssn) {
   	 String out = "";
   	 //TODO: Complete function code
   	out = ssn.replaceAll("-", "");
  
   	 return out;
    }
    
    // 5a and 5b.
    public static String changeDateFormat(String dateStr) {
   	 String out = "";
   	 //TODO: Complete function code
   	 int firstSlash = dateStr.indexOf('/');
   	 String month = dateStr.substring(0 , firstSlash);
   	 String withoutMonth = dateStr.substring(firstSlash + 1 , dateStr.length());
   	 int secondSlash = withoutMonth.indexOf('/');
   	 String day = withoutMonth.substring(0 , secondSlash);
   	 String year = withoutMonth.substring(secondSlash + 1 , withoutMonth.length());
   	 System.out.println(day);
   	 System.out.println(month);
   	 System.out.println(withoutMonth);
	 System.out.println(year);
   	 
	 out = day + '-' + month + '-' + year;
   	 return out;
    }
    
    // 6a.
    public static String lastFour(String ccNumber) {
   	 String out = "";
   	 //TODO: Complete function code
   	 String last4 = ccNumber.substring(ccNumber.length() -4, ccNumber.length());
   	 out = last4;
   	 return out;
    }
    
    // 6b.
    public static String lastFive(String ccNumber) {
   	 String out = "";
   	 //TODO: Complete function code
   	 String ccNumber1 = ccNumber.replaceAll("\\W+", "");
   	 String last5 = ccNumber1.substring(ccNumber1.length() -5, ccNumber1.length());
   	 out = last5;
   	 return out;
    }
    
    // 7.
    public static String scroll(String str) {
   	 String out = "";
   	 //TODO: Complete function code
   	 char firstLetter = str.charAt(0);
   	String wordNoLetter = str.substring(1 , str.length());
   	String finalWord = wordNoLetter + firstLetter;
   	 out = finalWord;
   	 return out;
    }
    
    // 8.
    public static String removeComments(String str) {
   	 String out = "";
   	 //TODO: Complete function code
   	 
   	 return out;
    }
    
    // 9.
    public static String removeTag(String html) {
   	 String out = "";
   	 //TODO: Complete function code
   	 
   	 return out;
    }
    
    // 10.
    public boolean isValidISBN(String isbn) {
   	 boolean valid = true;
   	 //TODO: Complete function code
   	 
   	 return valid;
    }
    
    

    public static void main(String[] args) {
   	 // Test your functions here
   	 // For example
   	 // 1.
   	 System.out.println("Testing Number 1");
   	 String name = "Twain, Mark";
   	 System.out.println(writeFirstLast(name));
   	 //2.
   	 System.out.println("Testing 2");
   	 String word = "Applesauce";
   	 System.out.println(reverse(word));
   	 //3.
	 System.out.println("Testing 3");
   	 String pd = "o";
   	 System.out.println(isPalindrome(pd));
   	 //4.
   	 System.out.println("Testing 4");
   	 String social = "9491-59-9597";
   	 System.out.println(removeDashes(social));
   	 //5.
   	 System.out.println("Testing 5a 5b");
   	 String dates = "06/12/2019";
   	 System.out.println(changeDateFormat(dates));
   	 //6a
   	 System.out.println("Testing 6a");
   	 String lastFore = "1234 1234 1234 4321";
   	 System.out.println(lastFour(lastFore));
   	 //6b
   	 System.out.println("Testing 6b");
   	 String lastFuve = "1234 1234 1234 4321";
   	 System.out.println(lastFive(lastFuve));
   	 //7
   	 System.out.println("Testing 7");
   	 String rando = "applesauce";
   	 System.out.println(scroll(rando));
    }
    
    

}
