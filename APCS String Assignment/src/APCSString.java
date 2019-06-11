
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
   	int comma = name.indexOf(',') + 1;
   	System.out.println (name);
   	System.out.println (comma);
   	String first = name.substring(0 , comma -1);
   	String last = "";
   	if(name.charAt(comma + 1) == ' ') {
   		last = name.substring(comma + 2);
   		System.out.println ( last);
   	}
   		
   	System.out.println (first);
   	 return fullName;
    }
    
    // 2.
    public static String reverse(String str) {
   	 String out = "";
   	 //TODO: Complete function code
   	 
   	 return out;
    }
    
    // 3.
    public static boolean isPalindrome(String str) {
   	 boolean out = true;
   	 //TODO: Complete function code
   	 
   	 return out;
    }
    
    // 4.
    public static String removeDashes(String ssn) {
   	 String out = "";
   	 //TODO: Complete function code
   	 
   	 return out;
    }
    
    // 5a and 5b.
    public static String changeDateFormat(String dateStr) {
   	 String out = "";
   	 //TODO: Complete function code
   	 
   	 return out;
    }
    
    // 6a.
    public static String lastFour(String ccNumber) {
   	 String out = "";
   	 //TODO: Complete function code
   	 
   	 return out;
    }
    
    // 6b.
    public static String lastFive(String ccNumber) {
   	 String out = "";
   	 //TODO: Complete function code
   	 
   	 return out;
    }
    
    // 7.
    public static String scroll(String str) {
   	 String out = "";
   	 //TODO: Complete function code
   	 
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

    }

}
