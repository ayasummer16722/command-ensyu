import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner stdIn1 = new Scanner(System.in);
        Scanner stdIn2 = new Scanner(System.in);

        System.out.println("身長(cm)を入力してください");
        System.out.println("身長(cm)を入力してください");

        double height1 = stdIn1.nextDouble();
        double height2 = stdIn2.nextDouble();

        System.out.println("体重(kg)を入力してください");
        System.out.println("体重(kg)を入力してください");

        double weight1 = stdIn1.nextDouble();
        double weight2 = stdIn2.nextDouble();

        double bmi1 = weight1 / (height1 * height1) *10000;
        double bmi2 = weight2 / (height2 * height2) *10000;

        BigDecimal bd1 = new BigDecimal(bmi1);
        BigDecimal bd2 = new BigDecimal(bmi2);

        bd1 = bd1.setScale(2, RoundingMode.DOWN);
        System.out.println("BMI値は" + bd1 + "です。");

        bd2 = bd2.setScale(2, RoundingMode.DOWN);
        System.out.println("BMI値は" + bd2 + "です。");
    }
}

