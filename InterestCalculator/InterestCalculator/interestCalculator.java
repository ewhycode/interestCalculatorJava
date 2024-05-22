/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

 package com.mycompany.mortgagepaymentcalculatorjava;

 /**
  *
  * @author EYC
  */
 public class MortgagePaymentCalculatorJava {
 
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1 User enter loan amount
        System.out.println("Enter the Total Loan Amount: ");
        double loanAmount = scanner.nextDouble();  //double more precise than float
        
        
        //2 Enter Loan Period in Years
        System.out.println("Enter the loan period in years: ");
        int loanPeriodYears = scanner.nextInt();
        
        System.out.println("Interest Rate (%) \t Monthly Payment \t Total Payment");
        
 //declare variables
        double minInterestRate = 0.05;
        double maxInterestRate = 0.08;
        double incrementInterestRate = 0.125;
        int interestRate = 0;
        int numberOfMonthlyPayments = 0;
        
        //add interest rate increment before reaching max interest rate
        for (double InterestRate = minInterestRate <= maxInterestRate; interestRate += incrementInterestRate); {
             int i = 0;
             /*could use while loop
             while (minInterestRate < 8.00) {
             System.out.println(i);
             i++;
             */
 }
     }
            double monthlyInterestRate = interestRate / 12;
            int loanPeriod;
            int numberOfMonthlyPayments =  loanPeriod * 12; //in years
            
        //3 Display the monthly payment formula
        double monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - (1/1+monthlyInterestRate) (Math.pow(12+numberOfYears));
            
        //4Display the Total Payment, for each %
        double totalPayment = monthlyPayment * 12 * numberOfYears;
            
            System.out.printlnf("%.2f, interestRate, monthlyPayment, totalPayment")
        }
        scanner.close();
         
       
    
 }
 