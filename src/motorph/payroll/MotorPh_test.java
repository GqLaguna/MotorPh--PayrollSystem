/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package motorph.payroll;

/**
 *
 * @author Administrator
 */
public class MotorPh_test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String EMPID;
        String EMPNAME;
        String EMPDOB;
        Integer Worked_hours_weekly;
        Double Daily_Salary;
        Double govt_sss;
        Double govt_philhealth;    
        Double govt_birtax;
        Double combined_govt;
        Double gross_income;
        Double net_pay;

        EMPID = "10001";
        EMPNAME = "Manuel III Garcia";
        EMPDOB = "10-11-1983";
        Worked_hours_weekly = 40;
        Daily_Salary = 535.71;
        gross_income = (Daily_Salary * Worked_hours_weekly);
        govt_sss = (gross_income * 0.05);

        if (gross_income >= 1000 && gross_income <= 1500) {
        } else if (gross_income > 1500) {
        } else {
        }
       
        govt_philhealth = 0.00;
        if (gross_income <= 10000) {
            govt_philhealth = 0.03 * gross_income;
        } else if (gross_income >= 10000.01 && gross_income <= 59999.99) {
            govt_philhealth = 0.03 * gross_income;
        } else if (gross_income >= 60000.00) {
            govt_philhealth = 0.03 * gross_income;
        }

        govt_birtax = 0.00;
        if (gross_income <= 20832.00) {
            govt_birtax = 0.00;
        } else if (gross_income >= 20833.00 && gross_income <= 33333.00) {
            govt_birtax = 0.20 * (gross_income - 20833);
        } else if (gross_income >= 33333 && gross_income <= 66667) {
            govt_birtax = ((0.25 * (gross_income - 33333)) + 2500);
        } else if (gross_income >= 66667 && gross_income <= 166667) {
            govt_birtax = ((0.30 * (gross_income - 66667)) + 10833);
        } else if (gross_income >= 166667 && gross_income <= 666667) {
            govt_birtax = ((0.32 * (gross_income - 166667)) + 40833.33);
        } else if (gross_income >= 666667) {
            govt_birtax = ((0.35 * (gross_income - 666667)) + 200833.33);
        }


        combined_govt = (govt_sss + govt_philhealth + govt_birtax);
        net_pay = (gross_income - combined_govt);

        System.out.println(" -----------------------------  ");
        System.out.println(("Employee Number: " + EMPID) + " | " +("Employee Name: " + EMPNAME) + " | " + ("Employee Date of Birth: " + EMPDOB));
        System.out.println(" ----------------------------- ");
        System.out.println("Employee Timesheet");
        System.out.println("No. of Hours worked for the week: " + Worked_hours_weekly + " hours");
        System.out.println("Gross Weekly Salary: " + gross_income + " Pesos");
        System.out.println("Govt Deductions: " + combined_govt+ " Pesos");
        System.out.println("Net Weekly Salary: " + net_pay+ " Pesos");
        System.out.println(" -----------------------------  ");
    }
    
}
