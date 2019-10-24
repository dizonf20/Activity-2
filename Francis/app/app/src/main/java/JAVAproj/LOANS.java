package JAVAproj;
import java.util.Scanner;

public class LOANS {

  public static void main(String[] args) {
   double loanAm, intPerYr, monthPay, intPerMo;
   double intPerMo2 = 0;
   double monthPay2 = 0;
   double count = 0;
   
    Scanner myObj = new Scanner(System.in);
    
    System.out.println("-------------------------------------");
    System.out.println("--  EAST WEST LOAN SYSTEM  --");
    System.out.println("-------------------------------------");
    System.out.print("> Loan Amount: $");
    loanAm = myObj.nextDouble();
    System.out.print("> Interest Per Year: ");
    intPerYr = myObj.nextDouble();
    System.out.print("> Monthly Payment: $");
    monthPay = myObj.nextDouble();
    
    double intRate = intPerYr/100;
  
  
  do
  {
    intPerMo = intRate / 12;
    intPerMo2 = loanAm * intPerMo;
    monthPay2 = monthPay - intPerMo;
    
    if(monthPay < intPerMo2)
    {
      System.out.println("The monthly payment is less than the first month's interest payment loan amount could not be repaid.");
    }
    
    else
    {
     loanAm = loanAm - monthPay2;
     count++;
     
    }
  } 
 
  
   while (loanAm > 0);  
  
    System.out.println();
    System.out.println("Months To Paid: " + count);
  }
}
