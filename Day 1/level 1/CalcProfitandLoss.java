class CalcProfitandLoss{

public static void main (String args[]){


   int Cp = 129 , Sp = 191 ,profit = Sp - Cp;

   //calculating profit percentage 
   int profitPercent = profit/Cp*100 ;
   
   System.out.println("The cost price is INR  " + Cp + "and selling price      is INR " + Sp +"\n The profit is INR  " + profit + " and the profit     percentage is  " + profitPercent);
   

}

}