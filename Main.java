import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        System.out.print("身長(cm)を入力してください");
        double height = stdIn.nextDouble();
        System.out.print("体重(kg)を入力してください");
        double weight = stdIn.nextDouble();

        double bmi = weight / (height * height) *10000;

        BigDecimal bd = new BigDecimal(bmi);
        bd = bd.setScale(2, RoundingMode.DOWN);
        System.out.println("BMI値は" + bd + "です。");
    }
}
