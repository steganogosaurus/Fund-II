import java.util.Scanner;
public class TaxCalculator {
    public static void main(String[] args) {
        int salary,year_cost,deduction,oth_income;
        int income,tax=0,sumtax,final_sumtax=0,range=0;
        char o_check;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Salary: ");
        salary = sc.nextInt();
        System.out.print("Enter Year cost: ");
        year_cost = sc.nextInt();
        System.out.print("Enter Tax deduction: ");
        deduction = sc.nextInt();
        System.out.print("You have other income? ");
        o_check = sc.next().charAt(0);

        if(o_check == 'N'){
            income = (salary*12) - year_cost - deduction;
            if(income >= 0 && income <= 150000){
                tax=0;
                range=0;
            }
            else if(income >= 150001 && income <= 300000){
                range = 150000;
                tax=5;
            }
            else if(income >= 300001 && income <= 500000){
                range = 300000;
                tax=10;
            }
            else if(income >= 500001 && income <= 750000){
                range = 500000;
                tax=15;
            }
            else if(income >= 750001 && income <= 1000000){
                range = 750000;
                tax=20;
            }
            else if(income >= 1000001 && income <= 2000000){
                range = 1000000;
                tax=25;
            }
            else if(income >= 2000001 && income <= 5000000){
                range = 2000000;
                tax=30;
            }
            else if(income >= 5000001 && income <= 1000000000){
                range = 5000000;
                tax=35;
            }
            final_sumtax = (income-range)*tax/100;
            System.out.printf("Income : (%dx12) - %d - %d  = %d \n",salary,year_cost,deduction,income);
            System.out.printf("Tax is %d %%\n",tax);
            if(tax != 0)
                System.out.printf("\nCal Tax %d - %d = %d * %d%% = %d",income,range,income-range,tax,final_sumtax);
            else
                System.out.printf(" ");
        }

        if(o_check == 'Y'){
            System.out.printf("Input other income: ");
            oth_income = sc.nextInt();

            income = (salary*12) - year_cost - deduction + oth_income;
            if(income >= 0 && income <= 150000){
                tax=0;
                range=0;
            }
            else if(income >= 150001 && income <= 300000){
                range = 150000;
                tax=5;
            }
            else if(income >= 300001 && income <= 500000){
                range = 300000;
                tax=10;
            }
            else if(income >= 500001 && income <= 750000){
                range = 500000;
                tax=15;
            }
            else if(income >= 750001 && income <= 1000000){
                range = 750000;
                tax=20;
            }
            else if(income >= 1000001 && income <= 2000000){
                range = 1000000;
                tax=25;
            }
            else if(income >= 2000001 && income <= 5000000){
                range = 2000000;
                tax=30;
            }
            else if(income >= 5000001 && income <= 1000000000){
                range = 5000000;
                tax=35;
            }

            sumtax = (income-range)*tax/100;
            System.out.printf("Income : (%dx12) - %d - %d + %d = %d \n",salary,year_cost,deduction,income,sumtax);
            System.out.printf("Tax is %d %%\n",tax);
            System.out.printf("\nStep 2");
            System.out.printf("\nCal Tax %d - %d = %d * %d%% = %d",income,range,income-range,tax,sumtax);
            System.out.printf("\nStep 1");
            System.out.printf("\nCal Tax %d * %d%% = %d",150000,5,150000*5/100);
            final_sumtax = sumtax+(150000*5/100);
        }
        if(tax != 0)
            System.out.printf("\nYour Tax = %d",final_sumtax);
        else
            System.out.printf("\nYour Tax = Free Tax");

    }
}
