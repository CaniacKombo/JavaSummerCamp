


double pounds = 3500;
double conversionNY = 1.27;
double dollars = pounds * conversionNY;

println("us dollars that i have:  " +dollars);

double snickers = .97;


double tax = 1.12;

 double costTaxAdded = (snickers* tax);
 
 println ("cost of snickers in new york with tax:  " +costTaxAdded);


 double moneySpentAfterNYC =(costTaxAdded * 2300); 
 
 
 println ("Cost of 2300 Snickers in new york:  " +moneySpentAfterNYC);
 
 double moneyLeft = (dollars - moneySpentAfterNYC);
 println ("Money Left over:  " + moneyLeft);
 
 double senegalConversionRate = 585;
 double westAfricanFrancs = (moneyLeft * senegalConversionRate);
 println ("francs i got:  " + westAfricanFrancs);
 
 double SenegalyanSnickrs = .85;
 
 double taxSenegal = 1.27;
 
 double snickersSenegal = (taxSenegal * SenegalyanSnickrs);
 
 println ("snickers cost in senegal:  " +snickersSenegal);
 
 
 int snickersBoughtSenegal = (int)(westAfricanFrancs / snickersSenegal);
 
 println ("Snickers bought in senegal:  " +snickersBoughtSenegal);
 
 String number = Integer.toString(snickersBoughtSenegal);
 
for(int i = 0; i < number.length(); i++){
  char numb[] = number.toCharArray();
  print(numb[i]);
  if(i%3 == 0 && numb.length-1 != i){
    print(",");
  }
}
println("");
 
 
 
 
 
 
 
 
 
 
 
 
 //double taxNJ = 1.15;
 
// double snickersNJ = (taxNJ * snickers);
 
 //println ("snickers cost in New Jersey  " +snickersNJ);
 
 
// double snickersBoughtNJ = (moneyLeft / snickersNJ);
 
// println ("Snickers bought in New Jersey  " +snickersBoughtNJ);
 
 
 
