// Класс для выбора мероприятия
class EventSelector {
    public void selectEvent(String eventName) {
        System.out.println("Вы выбрали мероприятие: " + eventName);
    }
}

// Класс для выбора места
class SeatSelector {
    public void selectSeat(String seatNumber) {
        System.out.println("Вы выбрали место: " + seatNumber);
    }
}

// Класс для оплаты билета
class PaymentProcessor {
    public void processPayment(String paymentMethod) {
        System.out.println("Оплата прошла успешно с использованием: " + paymentMethod);
    }
}

// Фасад для системы заказа билетов
class TicketBookingFacade {
    private EventSelector eventSelector;
    private SeatSelector seatSelector;
    private PaymentProcessor paymentProcessor;

    public TicketBookingFacade() {

        this.eventSelector = new EventSelector();
        this.seatSelector = new SeatSelector();
        this.paymentProcessor = new PaymentProcessor();
    }

    public void bookTicket(String eventName, String seatNumber, String paymentMethod) {

        System.out.println("Начинаем процесс бронирования билета...");
        eventSelector.selectEvent(eventName);
        seatSelector.selectSeat(seatNumber);
        paymentProcessor.processPayment(paymentMethod);
        System.out.println("Билет успешно забронирован!");
    }
}

// Класс для тестирования всей системы
public class Main {
    public static void main(String[] args) {
        // Пример использования фасада
        TicketBookingFacade ticketBookingFacade = new TicketBookingFacade();
        ticketBookingFacade.bookTicket("Концерт Imagine Dragons", "A12", "Кредитная карта");

        // Попробуем еще раз с другими данными
        System.out.println("\nЕще один пример:");
        ticketBookingFacade.bookTicket("Театр: Ромео и Джульетта", "B5", "PayPal");
    }
}
