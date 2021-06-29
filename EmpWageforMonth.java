public class EmpWageforMonth {
       //Constants
      public static final int IS_PART_TIME = 1;
       public static final int IS_FULL_TIME = 2;
       public static final int EMP_RATE_PER_HOUR = 20 ;
       public static final int NUM_OF_WORKING_DAYS = 2;

         public static void main(String args[])  {
           //variables
           int empHours = 0 , empWages = 0 , totalEmpWage = 0;
                   //Computation
          for (int day = 0; day < NUM_OF_WORKING_DAYS; day++) {
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
             empWages = empHours * EMP_RATE_PER_HOUR;
             totalEmpWage += empWages;
             System.out.println("Emp Wages: " + empWages );
         }
               System.out.println("Total Emp Wage: " + totalEmpWage );
    }
  }

