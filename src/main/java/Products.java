import java.util.InputMismatchException;
import java.util.Scanner;

public class Products {
    static String strProducts = "";
    static double sum = 0;
    static double productPrice;
    static void productCount() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Хотите добавить товар?");
            String addProduct = scanner.next();
            switch (addProduct.toLowerCase()) {
                case "да":
                    while (true) {
                        System.out.println("Введите название товара.");
                        String productName = scanner.next();
                        strProducts = strProducts.concat("\n").concat(productName);
                        while (true) {
                            System.out.println("Введите стоимость товара.");
                            try {
                                productPrice = scanner.nextDouble();
                            }catch (InputMismatchException b){
                                System.out.println("Не целое число");
                                scanner.nextLine();
                            }
                            if (productPrice > 0) {
                                break;
                            } else if (productPrice < 0) {
                                System.out.println("Стоимость не может быть отрицательной!");
                            }
                        }
                        System.out.println("Товар добавлен!");
                        sum = sum + productPrice;
                        System.out.println("Хотите добавить еще товар? (Введите \"Завершить\" ,чтобы завершить процесс добавления товаров.)");
                        String addProduct2 = scanner.next();
                        switch (addProduct2.toLowerCase()) {
                            case "да":
                                break;
                            case "нет":
                                return;
                            case "завершить":
                                return;
                            default:
                                while (true) {
                                    System.out.println("Введите да или Завершить!");
                                    String addProduct3 = scanner.next();
                                    if (addProduct3.equalsIgnoreCase("да")) {
                                        break;
                                    } else if (addProduct3.equalsIgnoreCase("Завершить")) {
                                        return;
                                    } else {
                                    }
                                }
                        }
                    }
                case "нет":
                    return;
                default:
                    System.out.println("Введите да или нет!");
            }
        }
    }
}
