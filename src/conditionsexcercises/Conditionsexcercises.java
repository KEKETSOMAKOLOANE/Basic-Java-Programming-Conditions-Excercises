/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditionsexcercises;


public class Conditionsexcercises {
 //-----------------------------------F start------------------------------------------------
    public int findLargest(int num1,int num2,int num3){
	if(num1>=num2 && num1>=num3)
		return num1;
	else if(num2>=num1 && num2>=num3)
		return num2;
	else
		return num3;

    }
 //-----------------------------------F start------------------------------------------------ 
    public int findSecondLargest(int num1,int num2,int num3){
        int largestNumber=0;
	if(num1>num2 && num1>num3)
        if(num2>num3)
            largestNumber=num2;
        else
            largestNumber= num3;
        
            if(num2>num1 && num2>num3)
            if(num1>num3)
            largestNumber= num1;
        else
            largestNumber= num3;

        if(num3>num1 && num3>num2)
            if(num2>num1)
            largestNumber= num2;
        else
            largestNumber= num1;
    return largestNumber;
    }
  //-----------------------------------F start------------------------------------------------
    public int findLargestAmongSeven(int num1,int num2,int num3,int num4,int num5,int num6,int num7){
	int tempArray[] = {num1,num2,num3,num4,num5,num6,num7};
        int largest = tempArray[0];
        
        for(int c=0; c<7; c++)
        {
         if(largest<tempArray[c] )
         largest = tempArray[c];
         
         
        }
        return largest;

    }
    //-----------------------------------F start------------------------------------------------ 
    public void printNumbersFromOneToN(int num){
	for(int c=1; c<=num; c++){
        if(c%3==0 && c%5==0)
            System.out.println("FIZZBUZZ");
            
        else if(c%3==0 && c%5!=0)
            System.out.println("FIZZ"); 
        else if(c%5==0)
            System.out.println("BUZZ");
        else
            System.out.println(c);
        }     
    }
     //-----------------------------------F start------------------------------------------------
    public void checkNumbers(int num){
	
        if(num<0)
            System.out.println("The number is negative");
        else if(num>0)
            System.out.println("The number is positive");
        else 
            System.out.println("The number is a zero");
        
    }
     //-----------------------------------F start------------------------------------------------
    public boolean checkOddOrEvennNumbers(int num){
	boolean isEven=false;
        boolean isOdd=false;
        if(num%2==0)
            return(isEven=true);//System.out.println("The number is even");
        else 
            return(isOdd=true);//System.out.println("The number is odd");
        
    }
     //-----------------------------------F start------------------------------------------------
    public boolean checkForLeapYear(int year){
	boolean isLeapYear = false;
        if((year%4==0) && (year%100!=0))
            isLeapYear=true;//System.out.println("The year is a leap year");
        else 
            isLeapYear=false;//System.out.println("The year is not a leap year");
        return isLeapYear;
    }
     //-----------------------------------F start------------------------------------------------
    
    public static void main(String[] args) {
        // TODO code application logic here
        Conditionsexcercises testProgram = new Conditionsexcercises();
        String solutionsDivisionLine ="--------------------------------------------------------";
        
        System.out.println(solutionsDivisionLine+"FIND LARGEST NUMBER"+solutionsDivisionLine);
        int numA=1123,numB=678,numC=9900;
        System.out.println(testProgram.findLargest(numA,numB,numC));
        
        System.out.println(solutionsDivisionLine+"FIND SECOND LARGEST NUMBER"+solutionsDivisionLine);
        int numAA=1123,numBB=1278,numCC=9900;
        System.out.println(testProgram.findSecondLargest(numAA,numBB,numCC));
        
        System.out.println(solutionsDivisionLine+"FIND LARGEST NUMBER AMONG SEVEN"+solutionsDivisionLine);
        int numAB=1123,numBA=126478,numCB=94900,numDB=11623,numEA=126578,numFB=9970,numGB=99030;
        System.out.println(testProgram.findLargestAmongSeven(numAB,numBA,numCB,numDB,numEA,numFB,numGB));
        
        System.out.println(solutionsDivisionLine+"PRINT NUMBERS FROM 1 TO N"+solutionsDivisionLine);
        int numGA=15;
        testProgram.printNumbersFromOneToN(numGA);
        
        System.out.println(solutionsDivisionLine+"CHECK NUMBERS"+solutionsDivisionLine);
        int numGC=0;
        testProgram.checkNumbers(numGC);
        
        System.out.println(solutionsDivisionLine+"CHECK ODD&EVEN NUMBERS"+solutionsDivisionLine);
        int numEO=132;
        System.out.println(testProgram.checkOddOrEvennNumbers(numEO));
        
        System.out.println(solutionsDivisionLine+"CHECK FOR LEAP YEAR"+solutionsDivisionLine);
        int year=2019;
        System.out.println(testProgram.checkForLeapYear(year));
    }
    
}
