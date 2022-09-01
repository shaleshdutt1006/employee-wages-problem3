public class EmployeeWages {
    public static void main(String[] args) {
        int wagePerHour = 20;
        int fullTimeHour = 8;
        int partTimeHour = 4;
        int totalWorkingDays = 0;
        int totalHour = 0;
        int FullTimeWage = 0;
        int HalfTimeWage = 0;
        int AbsentWage = 0;
        while (totalHour < 100 && totalWorkingDays < 20) {
            int employeeCheck = (int) (Math.random() * ((2 + 0) + 1));
            totalWorkingDays++;
            switch (employeeCheck) {
                case 2:
                    totalHour = totalHour + fullTimeHour;
                    FullTimeWage = FullTimeWage + fullTimeHour * wagePerHour;
                    System.out.println("Employee is present full time for the day : " + totalWorkingDays);
                    break;
                case 1:
                    totalHour = totalHour + partTimeHour;
                    HalfTimeWage = HalfTimeWage + partTimeHour * wagePerHour;
                    System.out.println("Employee is present Half time for the day : " + totalWorkingDays);

                    break;
                default:
                    System.out.println(
                            "Employee is absent on the day " + totalWorkingDays + " So his wages are " + AbsentWage);
            }

        }
        System.out.println(
                "Employee Total Working Days are: " + totalWorkingDays + " And Total Working Hours are: " + totalHour);
        System.out.println("Employee full time Wages are :" + FullTimeWage);
        System.out.println("Employee half time Wages are : " + HalfTimeWage);

        System.out.println("Employee total wage for the month is: " + (FullTimeWage + HalfTimeWage));
    }

}
