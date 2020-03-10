package modules;

import org.apache.log4j.Logger;

public class TestLoger {


    public static void main(String[] args) {
        doOrder();
    }

    private static final Logger log = Logger.getLogger(Main.class);

    public static void doOrder() {
        // какае-то логика
        System.out.println("Заказ оформлен!");
        // логируем инфо
        log.info("Это информационное сообщение!");
        addToCart();
    }

    private static void addToCart() {
        // добавление товара в корзину
        System.out.println("Товар добавлен в корзину");
        // логируем ошибку
        log.error("Это сообщение ошибки");
    }
}
