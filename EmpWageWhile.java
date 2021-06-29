public class EmpWageWhile {
       //Constants
      public static final int IS_PART_TIME = 1;
       public static final int IS_FULL_TIME = 2;
       public static final int EMP_RATE_PER_HOUR = 20 ;
       public static final int NUM_OF_WORKING_DAYS = 2;
       public static final int MAX_HRS_IN_MONTH = 10;

         public static void main(String args[])  {
           //variables
           int empHours = 0 , empWages = 0 ,TotalEmpHours = 0 , totalEmpWage = 0 ,TotalWorkingDays =0;
                   //Computation
            while  (TotalEmpHours  <=  MAX_HRS_IN_MONTH  &&
                TotalWorkingDays  <  NUM_OF_WORKING_DAYS) {
                  TotalWorkingDays++;
           int empCheck =(int) Math.floor(Math.random() * 10) % 3;
              switch  (empCheck) {
                  case IS_FULL_TIME:
                  empHours =8;
                     break;
             case IS_PART_TIME:
                    empHours = 4;
                     break;
               default :
                     empHours = 0;
              }
              TotalEmpHours  +=  empHours;
             empWages = empHours * EMP_RATE_PER_HOUR;
             totalEmpWage += empWages;
             System.out.println("Emp Wages: " + empWages );
         }
               System.out.println("Total Emp Wage: " + totalEmpWage );
    }
  }

