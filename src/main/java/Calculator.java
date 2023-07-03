public class Calculator {
    String productNameAndPrice = "Добавленные товары:\n";
    double productPrice = 0;
    public double finalPrice = 0;

    //Основная логика калькулятора
    public void toCount(){
        while (true) {
            System.out.println("Введите название товара :");
            String name = Main.scanner.next();
            System.out.println("Введите стоимость в формате рубли.копейки :");
            double price;
            //Проверка ввода
            do {
                try {
                    String checkPrice = Main.scanner.next();
                    price = Double.parseDouble(checkPrice);
                    if (price > 0){
                        break;
                    }
                    else {
                        System.out.println("Введено отрицательное значение. Повторите ввод:");
                    }
                }
                catch (Exception e){
                    System.out.println("Введено некоректное значение. Повторите ввод:");
                }
            } while(true);
            toList(name,price);
            toCheck(price);
            System.out.println("Хотите добавить еще один товар? Введите \"Завершить\" для итогового подсчета.");
            String confirm = Main.scanner.next();
            if(confirm.equalsIgnoreCase("завершить")){
                break;
            }
        }
        System.out.println(productNameAndPrice);
        perPersonCheck();
    }
    //Список всех товаров
    public void toList(String name, double price){
        Formatter formatter = new Formatter();
        productNameAndPrice =  productNameAndPrice.concat(name.trim()).concat(" - " + price + formatter.formatPrice(price) + "\n");
        System.out.println("Товар успешно добавлен.");
    }
    //Подсчет общей суммы заказа
    public void toCheck(double price){
        productPrice += price;
    }
    //Расчет на каждого гостя
    public void perPersonCheck(){
        Formatter formatter = new Formatter();
        finalPrice = productPrice / Main.guestCounter;
        System.out.println("Итоговая сумма на кажлого человека: " + String.format("%.2f", finalPrice) + formatter.formatPrice(finalPrice));
    }

}
