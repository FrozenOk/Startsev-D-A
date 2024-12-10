// Класс Заказ
class Order {
    private int orderId; // Идентификатор заказа
    private String products; // Список продуктов (пока одной строкой)
    private String deliveryAddress; // Адрес доставки
    private double totalCost; // Итоговая стоимость

    // Приватный конструктор
    private Order(OrderBuilder builder) {
        this.orderId = builder.orderId;
        this.products = builder.products;
        this.deliveryAddress = builder.deliveryAddress;
        this.totalCost = builder.totalCost;
    }

    // Метод для отображения информации о заказе
    public void displayOrderInfo() {
        System.out.println("Заказ №" + orderId);
        System.out.println("Продукты: " + products);
        System.out.println("Адрес доставки: " + deliveryAddress);
        System.out.println("Стоимость: " + totalCost);
    }

    // Вложенный класс Builder
    public static class OrderBuilder {
        private int orderId;
        private String products;
        private String deliveryAddress;
        private double totalCost;

        // Методы для установки параметров
        public OrderBuilder setOrderId(int orderId) {
            this.orderId = orderId;
            return this;
        }

        public OrderBuilder setProducts(String products) {
            this.products = products;
            return this;
        }

        public OrderBuilder setDeliveryAddress(String deliveryAddress) {
            this.deliveryAddress = deliveryAddress;
            return this;
        }

        public OrderBuilder setTotalCost(double totalCost) {
            this.totalCost = totalCost;
            return this;
        }

        // Метод для создания объекта Order
        public Order build() {

            return new Order(this);
        }
    }
}

// Главный класс для проверки
public class Main {
    public static void main(String[] args) {
        // Создаем заказ через Builder
        Order order = new Order.OrderBuilder()
                .setOrderId(1)
                .setProducts("Книга, Телефон, Наушники")
                .setDeliveryAddress("г. Москва, ул. Пушкина, д. 10")
                .setTotalCost(12345.67)
                .build();


        order.displayOrderInfo();


    }
}
