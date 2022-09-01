public class EmployeeWages {
    public static void main(String[] args) {

        {

            int Wage_per_Hour = 20;
            int Full_Day_Hour = 8;
            double empCheck = Math.floor(Math.random() * 10) % 2;
            if (empCheck == 1) {
                System.out.println("Daily Wages are : " + Wage_per_Hour * Full_Day_Hour);
            } else
                System.out.println("Employee is Absent No wages were given");

        }

    }
}
