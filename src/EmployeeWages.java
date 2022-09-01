public class EmployeeWages {
    public static int workingHours = 30;
    public static int numberOfDays = 20;
    public static final int fullTimeHour = 8;
    public static final int partTimeHour = 4;
    public static int wagePerHour = 15;


    public static void calcEmployeeWage() {
        int totalWorkingDays = 0;
        int totalWorkingHours = 0;
        int totalWages = 0;
        int AbsentWage = 0;
        while (totalWorkingHours < workingHours && totalWorkingDays < numberOfDays) {
            int employeeCheck = (int) (Math.random() * ((2 + 0) + 1));
            totalWorkingDays++;
            switch (employeeCheck) {
                case 2:
                    totalWorkingHours = totalWorkingHours + fullTimeHour;
                    totalWages = totalWages + fullTimeHour * wagePerHour;
                    System.out.println("Employee is present full time for the day : " + totalWorkingDays);
                    break;
                case 1:
                    totalWorkingHours = totalWorkingHours + partTimeHour;
                    totalWages = totalWages + partTimeHour * wagePerHour;
                    System.out.println("Employee is present Half time for the day : " + totalWorkingDays);

                    break;
                default:
                    System.out.println(
                            "Employee is absent on the day " + totalWorkingDays + " So his wages are " + AbsentWage);
            }

        }
        System.out.println("Total Working hours of the employee is " + totalWorkingHours);

        System.out.println("Total Working days of the employee is " + totalWorkingDays);

        System.out.println("Total Wages of employee is " + totalWages);


    }

    public static void main(String[] args) {
        calcEmployeeWage();


    }

}


