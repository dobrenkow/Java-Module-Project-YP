import java.util.Scanner;

public class Main {
    static int humans;
    Products PC = new Products();
    static double sumMain = 0;
    static String strProductsMain = "";
    public static void main(String[] args) {
        System.out.println("На сколько человек необходимо разделить счет?");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println ("Введите целое число");
            humans = scanner.nextInt();
                if (humans > 1) {
                    break;
                } else if (humans == 1) {
                    System.out.println("Нет смысла ничего считать и делить :-)");
                    return;
                } else {
                    System.out.println("Некорректное значение для подсчёта!");
                }break;
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


}}
