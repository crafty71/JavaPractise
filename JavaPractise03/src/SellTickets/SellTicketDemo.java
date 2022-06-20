package SellTickets;

public class SellTicketDemo implements Runnable {
    int ticket = 100;
    Boolean bool = true;
    final Object obj = new Object();

    @Override
    public void run() {
        while (bool) {
            synchronized (this) {
                if (ticket % 2 == 0) {
                    sellTicket();
                } else {
                    sellTicket();
                }
            }
        }
    }

    public void sellTicket() {
        if (ticket > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+ " " + "is sailing" + " " + +ticket + " " + "ticket");
            ticket--;
        } else {
            bool = false;
        }
    }
}
