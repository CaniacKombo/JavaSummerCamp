String word = "raceecar";
println (word.length()-1);
 boolean pd = false;
  int firstHalfInt = 0;
 int secondHalfInt = word.length()-1;
 
int  middleWordOne = (word.length()-1)/ 2;
int middleWordTwo = word.length() / 2;
println (middleWordOne);
println (middleWordTwo);
 
 
 
 if( word.length() == 1){
    println ("This is a palindrome");
   pd = true;
 }

 while(pd == false){
    char firstHalf = word.charAt(firstHalfInt);
 char secondHalf = word.charAt (secondHalfInt);
   if ( firstHalf == secondHalf){

   firstHalfInt = firstHalfInt + 1  ;
   secondHalfInt = secondHalfInt - 1;
    println (firstHalf);
    println (secondHalf);
   
   }
    if( firstHalfInt == secondHalfInt || firstHalfInt == secondHalfInt - 1 ){
   println ("This is a palindrome");
   pd = true;
}
 else{
 
    if( firstHalf != secondHalf){
   println ("NOT A PALINDROME");
   pd = true;
   
 }

 } 

}
