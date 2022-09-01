public class EmployeeWages {
    public static void main(String[] args) {
        {

            int Wage_per_Hour = 20;
            int Full_Time = 8;
            int Half_Time = 4;

            double empCheck = Math.floor(Math.random() * 10) % 2;

            if (empCheck == 1) {
                System.out.println("Employee is Full time his wages are : " + Wage_per_Hour * Full_Time);
            } else
                System.out.println("Employee is Part time his wages are : " + Wage_per_Hour * Half_Time);

        }

    }
}