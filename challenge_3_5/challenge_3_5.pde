import java.util.Arrays;

double gradesAdded = 0;
double a[] = {88.5 , 100 , 67 , 72.5 , 80 ,81.5 , 85 , 99 , 95 , 100 , 50 , 45 , 85 , 89.5 , 92};
Arrays.sort(a);       
System.out.println(Arrays.toString(a));
println("lowest grade. "+a[0]);
println("highest grade. "+a[14]);
println("grade median. " + a[a.length /2]);

for(int i = 0 ; i < a.length ; i++ ){
  
  gradesAdded = gradesAdded + a[i];
  
}  
double gradeAvg = gradesAdded / a.length +1;
println ("grade average. " + gradeAvg);
  
   

 
