String binary = "111";
int output = 0;

for (int counter = 1; counter < binary.length() + 1; counter++){
 if( binary.charAt(binary.length() - counter) == '1'){
   output = (output * 2) + 1;
   println (output);
   
   
  
 }
 else {
   output = output * 2;
   println (output);
 } 
}
