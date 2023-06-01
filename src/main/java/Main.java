import java.util.Scanner;

public class Main {
    static int floor;
    Products PC = new Products();
    static double sumMain = 0;
    static String strProductsMain = "";
    static int humans ;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("На сколько человек необходимо разделить счет?\nВведите целое число");


        while (true) {
            if (scanner.hasNextInt()) {
                humans = scanner.nextInt();
            }
            if (humans > 1)
                break;
            if (humans == 1) {
                System.out.println("Нет смысла ничего считать и делить :-)");
                return;
            } else {
                System.out.println("Некорректное значение для подсчёта!\nВведите целое число.");
            }

        }
        Products.productCount();
        strProductsMain += Products.strProducts;
        System.out.println("Добавленные товары: " + strProductsMain);
        sumMain += Products.sum;
        sumMain = sumMain / humans;
        String result = String.format("%.2f", sumMain);
        int floor = (int) Math.floor(sumMain);
        String a = null;
        if (floor%100==11) {
            a = "рублей";
        }else if (floor%100==12){
            a = "рублей";
        }else if (floor%100==13) {
            a = "рублей";
        }else if (floor%100==14){
            a = "рублей";
        }else if (floor%10==1) {
            a = "рубль";
        }else if (floor%10==2){
            a = "рубля";
        }else if (floor%10==3) {
            a = "рубля";
        }else if (floor%10==4) {
            a = "рубля";//
        }else if (floor%10==5) {
            a = "рублей";
        }else if (floor%10==6){
            a = "рублей";
        }else if (floor%10==7) {
            a = "рублей";
        }else if (floor%10==8){
            a = "рублей";
        }else if (floor%10==9) {
            a = "рублей";
        }else if (floor%10==0) {
            a = "рублей";}
        System.out.println("Всем необходиомо заплатить по " + result +" " + a +".");

    }
}
