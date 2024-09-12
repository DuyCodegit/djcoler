import java.util.Scanner;
public class baitap3 {
    public static void main(String[] args) {
        Scanner test= new Scanner(System.in);
        System.out.print("nhap chieu dai:");
        double dai =test.nextDouble();
        System.out.print("nhap chiru rong:");
        double rong =test.nextDouble();
        double dientich=dai*rong;
        double chuvi=(dai+rong)*2;
        System.out.println("chu vi hinh chu nhat la:"+chuvi);
        System.out.println("dien tich hinh chu nhat la:"+dientich);

    }
}
