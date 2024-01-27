import java.util.Scanner;
public class PersonalIncomeTax {
//    static void printTax (int taxCal,int minus,int check,double calculator,char otherIncome){
//        double per,last;
//          if(taxCal<=150000){
//            System.out.println("Tax is 0% \n");
//            System.out.println("Your Tax = Free Tax");
//        }else if(taxCal<=300000 && taxCal>=150001 ){
//            System.out.println("Tax is 5%");
//            minus = taxCal - 150000;
//            calculator = minus * 0.5;
//            if(check == 1){
//                System.out.println("Step 2");
//                System.out.println("Call Tax "+ taxCal + "- 150000 = " + minus + " * 5% = " + (int)calculator);
//            }else{
//                System.out.println("Call Tax "+ taxCal + "- 150000 = " + minus + " * 5% = " + (int)calculator);
//                System.out.println("Your Tax = "+ (int)calculator + "BTH");
//            }
//            if(otherIncome == 'Y' || otherIncome == 'y'){
//                System.out.println("Step 1");
//                per = 150000 * 0.05;
//                last = per + calculator;
//                System.out.println("Call Tax 150000 * 5% = "+ (int)per);
//                System.out.printf("Your Tax = "+ (int)last + "BTH");
//            }
//        }
//        else if(taxCal<=500000 && taxCal>=300001 ){
//            System.out.println("Tax is 10% \n");
//            minus = taxCal - 300000;
//            calculator = minus * 0.1;
//            if(check == 1){
//                System.out.println("Step 2");
//                System.out.println("Call Tax "+ taxCal + "- 150000 = " + minus + " * 5% = " + (int)calculator);
//            }else{
//                System.out.println("Call Tax "+ taxCal + "- 150000 = " + minus + " * 5% = " + (int)calculator);
//                System.out.println("Your Tax = "+ (int)calculator + "BTH");
//            }
//            if(check == 1){
//                System.out.println("Step 1");
//                per = 150000 * 0.05;
//                last = per + calculator;
//                System.out.println("Call Tax 150000 * 5% = "+ (int)per);
//                System.out.printf("Your Tax = "+ (int)last + "BTH");
//            }
//        }
//        else if(taxCal<=750000 && taxCal>=500001 ){
//            System.out.println("Tax is 15% \n");
//            minus = taxCal - 500000;
//            calculator = minus * 0.15;
//            if(check == 1){
//                System.out.println("Step 2");
//                System.out.println("Call Tax "+ taxCal + "- 150000 = " + minus + " * 5% = " + (int)calculator);
//            }else{
//                System.out.println("Call Tax "+ taxCal + "- 500000 = " + minus + " * 15% = " + (int)calculator);
//                System.out.println("Your Tax = "+ (int)calculator + "BTH");
//            }
//            if(check == 1){
//                System.out.println("Step 1");
//                per = 150000 * 0.05;
//                last = per + calculator;
//                System.out.println("Call Tax 150000 * 5% = "+ (int)per);
//                System.out.printf("Your Tax = "+ (int)last + "BTH");
//            }
//        }
//        else if(taxCal<=1000000 && taxCal>=750001 ){
//            System.out.println("Tax is 20% \n");
//            minus = taxCal - 750000;
//            calculator = minus * 0.2;
//            if(check == 1){
//                System.out.println("Step 2");
//                System.out.println("Call Tax "+ taxCal + "- 150000 = " + minus + " * 5% = " + (int)calculator);
//            }else{
//                System.out.println("Call Tax "+ taxCal + "- 750000 = " + minus + " * 20% = " + (int)calculator);
//                System.out.println("Your Tax = "+ (int)calculator + "BTH");
//            }
//            if(check == 1){
//                System.out.println("Step 1");
//                per = 150000 * 0.05;
//                last = per + calculator;
//                System.out.println("Call Tax 150000 * 5% = "+ (int)per);
//                System.out.printf("Your Tax = "+ (int)last + "BTH");
//            }
//        }
//        else if(taxCal<=2000000 && taxCal>=1000001 ){
//            System.out.println("Tax is 25% \n");
//            minus = taxCal - 1000000;
//            calculator = minus * 0.25;
//            if(check == 1){
//                System.out.println("Step 2");
//                System.out.println("Call Tax "+ taxCal + "- 2000000 = " + minus + " * 30% = " + (int)calculator);
//            }else{
//                System.out.println("Call Tax "+ taxCal + "- 1000000 = " + minus + " * 25% = " + (int)calculator);
//                System.out.println("Your Tax = "+ (int)calculator + "BTH");
//            }
//            if(check == 1){
//                System.out.println("Step 1");
//                per = 150000 * 0.05;
//                last = per + calculator;
//                System.out.println("Call Tax 150000 * 5% = "+ (int)per);
//                System.out.printf("Your Tax = "+ (int)last + "BTH");
//            }
//        }
//        else if(taxCal<=5000000 && taxCal>=2000001 ){
//            System.out.println("Tax is 30% \n");
//            minus = taxCal - 2000000;
//            calculator = minus * 0.3;
//            if(check == 1){
//                System.out.println("Step 2");
//                System.out.println("Call Tax "+ taxCal + "- 2000000 = " + minus + " * 30% = " + (int)calculator);
//            }else{
//                System.out.println("Call Tax "+ taxCal + "- 2000000 = " + minus + " * 30% = " + (int)calculator);
//                System.out.println("Your Tax = "+ (int)calculator + "BTH");
//            }
//            if(check == 1){
//                System.out.println("Step 1");
//                per = 150000 * 0.05;
//                last = per + calculator;
//                System.out.println("Call Tax 150000 * 5% = "+ (int)per);
//                System.out.printf("Your Tax = "+ (int)last + "BTH");
//            }
//        }
//        else if(taxCal>=5000001 ){
//            System.out.println("Tax is 35% \n");
//            minus = taxCal - 5000000;
//            calculator = minus * 0.35;
//            if(check == 1){
//                System.out.println("Step 2");
//                System.out.println("Call Tax "+ taxCal + "- 5000000 = " + minus + " * 35% = " + (int)calculator);
//            }else{
//                System.out.println("Call Tax "+ taxCal + "- 5000000 = " + minus + " * 35% = " + (int)calculator);
//                System.out.println("Your Tax = "+ (int)calculator + "BTH");
//
//            }
//            if(check == 1){
//                System.out.println("Step 1");
//                per = 150000 * 0.05;
//                last = per + calculator;
//                System.out.println("Call Tax 150000 * 5% = "+ (int)per);
//                System.out.printf("Your Tax = "+ last + "BTH");
//            }
//        }
//    }
    public static void main(String[] args) {
        int  calIncome,sumTax,income,finalSumtax=0;
        int taxValue=0,range=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Salary:");
        int salary = sc.nextInt();
        System.out.print("Enter Year cost:");
        int yearCost = sc.nextInt();
        System.out.print("Enter Tax deduction:");
        int taxDeduction = sc.nextInt();
        System.out.print("You have other income? ");
        char otherIncome = sc.next().charAt(0);

        calIncome = (salary*12) - yearCost - taxDeduction;

        if(otherIncome == 'N' || otherIncome == 'n'){
            if(calIncome >= 0 && calIncome <= 150000){
                taxValue=0;
                range=0;
            }
            else if(calIncome >= 150001 && calIncome <= 300000){
                range = 150000;
                taxValue=5;
            }
            else if(calIncome >= 300001 && calIncome <= 500000){
                range = 300000;
                taxValue=10;
            }
            else if(calIncome >= 500001 && calIncome <= 750000){
                range = 500000;
                taxValue=15;
            }
            else if(calIncome >= 750001 && calIncome <= 1000000){
                range = 750000;
                taxValue=20;
            }
            else if(calIncome >= 1000001 && calIncome <= 2000000){
                range = 1000000;
                taxValue=25;
            }
            else if(calIncome >= 2000001 && calIncome <= 5000000){
                range = 2000000;
                taxValue=30;
            }
            else if(calIncome >= 5000001 && calIncome <= 1000000000){
                range = 5000000;
                taxValue=35;
            }
            finalSumtax = (calIncome-range)*taxValue/100;
            System.out.printf("Income : (%dx12) - %d - %d  = %d \n",salary,yearCost,taxDeduction,calIncome);
            System.out.printf("Tax is %d %%\n",taxValue);
            if(taxValue != 0){
                System.out.printf("\nCal Tax %d - %d = %d * %d%% = %d",calIncome,range,calIncome-range,taxValue,finalSumtax);
            }
            else{
                System.out.printf(" ");
            }
        }

        if(otherIncome == 'Y' || otherIncome == 'y'){
            System.out.print("Input other income: ");
            income = sc.nextInt();
            calIncome = (salary*12) - yearCost - taxDeduction + income;
            if(calIncome >= 0 && calIncome <= 150000){
                taxValue=0;
                range=0;
            }
            else if(calIncome >= 150001 && calIncome <= 300000){
                range = 150000;
                taxValue=5;
            }
            else if(calIncome >= 300001 && calIncome <= 500000){
                range = 300000;
                taxValue=10;
            }
            else if(calIncome >= 500001 && calIncome <= 750000){
                range = 500000;
                taxValue=15;
            }
            else if(calIncome >= 750001 && calIncome <= 1000000){
                range = 750000;
                taxValue=20;
            }
            else if(calIncome >= 1000001 && calIncome <= 2000000){
                range = 1000000;
                taxValue=25;
            }
            else if(calIncome >= 2000001 && calIncome <= 5000000){
                range = 2000000;
                taxValue=30;
            }
            else if(calIncome >= 5000001 && calIncome <= 1000000000){
                range = 5000000;
                taxValue=35;
            }
            sumTax = (calIncome-range)*taxValue/100;
            System.out.printf("Income : (%dx12) - %d - %d + %d = %d \n",salary,yearCost,taxDeduction,calIncome,sumTax);
            System.out.printf("Tax is %d %%\n",taxValue);
            System.out.print("\nStep 2");
            System.out.printf("\nCal Tax %d - %d = %d - %d = %d * %d%% = %d",calIncome,range/2,calIncome-(range/2),range/2,calIncome-range,taxValue,sumTax);
            System.out.print("\nStep 1");
            System.out.printf("\nCal Tax %d * %d%% = %d",150000,5,150000*5/100);
            finalSumtax = sumTax+(150000*5/100);

        }if(taxValue != 0){
            System.out.println("\nYour Tax = "+ finalSumtax + " BTH");
        }
        else{
            System.out.printf("\nYour Tax = Free Tax");
        }

    }
}
