package SellTickets;

public class SellTicketText {
    public static void main(String[] args) {
        SellTicketDemo sellTicketDemo = new SellTicketDemo();

        Thread w1 = new Thread(sellTicketDemo, "window01");
        Thread w2 = new Thread(sellTicketDemo, "window02");
        Thread w3 = new Thread(sellTicketDemo, "window03");
        w1.start();
        w2.start();
        w3.start();
    }
}
