String word = "racecar";
boolean pd = true;
int firstHalfInt = 0;
int secondHalfInt = word.length()-1;


if ( word.length() == 1) {
  
  pd = true;
}



for (int i = firstHalfInt; i < word.length()/2; i++) {
  char firstHalf = word.charAt( i);
  char secondHalf = word.charAt (secondHalfInt);
  println ("firstHalf : " + firstHalf + " secondHalf : " + secondHalf);
  if ( firstHalf != secondHalf){
    pd = false;
    break;
  }
  secondHalfInt--;
}
println("Palindrome  " +pd);

//While loop
//while (firstHalfInt < word.length()/2) {
//  char firstHalf = word.charAt(firstHalfInt);
//  char secondHalf = word.charAt (secondHalfInt);
//  println ("firstHalf : " + firstHalf + " secondHalf : " + secondHalf);
//  if ( firstHalf != secondHalf){
//    pd = false;
//    break;
//  }
//  firstHalfInt++;
//  secondHalfInt--;



//while (pd == false) {
//  char firstHalf = word.charAt(firstHalfInt);
//  char secondHalf = word.charAt (secondHalfInt);
//  if ( firstHalf == secondHalf) {

//    firstHalfInt = firstHalfInt + 1  ;
//    secondHalfInt = secondHalfInt - 1;
//    println (firstHalf);
//    println (secondHalf);
//  }
//  if ( firstHalfInt == secondHalfInt || firstHalfInt == secondHalfInt - 1 ) {
//    println ("This is a palindrome");
//    pd = true;
//  } 
//  else {
//    if ( firstHalf != secondHalf) {
//      println ("NOT A PALINDROME");
//      pd = true;
//    }
//  }
//}
