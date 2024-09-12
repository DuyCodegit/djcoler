//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class baitap1 {
    public static void main(String[] args) {
        Scanner test= new Scanner(System.in);
        System.out.print("hay nhap mot so : ");
        double n=test.nextDouble();
        double sinValue=Math.sin(n);
        double cosValue=Math.cos(n);
        System.out.println("ket qua ham sin("+n+")="+sinValue);
        System.out.println("ket qua ham cos("+n+")="+cosValue);

    }
}