import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap can nang : ");
        float weight = scanner.nextFloat();
        System.out.println("Nhap chieu cao : ");
        float height = scanner.nextFloat();
        float bmi = weight / (height * height);

        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if ((bmi >= 18.5) && (bmi < 25.0)) {
            System.out.println("Normal");

        } else if ((bmi >= 25) && (bmi < 30.0)) {
            System.out.println("Overweight");
        }else
        {
            System.out.println("Obese");
        }
    }
}
