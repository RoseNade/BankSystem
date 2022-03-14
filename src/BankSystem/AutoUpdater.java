package BankSystem;

import BankSystem.beans.Client;

import java.util.List;

public class AutoUpdater implements Runnable {
    private List<Client> clients;

    public AutoUpdater(List<Client> clients) {
        this.clients = clients;
    }

    public void run() {
        while (true) {
//            for (int i = 0; i < clients.size(); i++) {
//                clients.get(i).autoUpdateAccount();
//            }
            for (Client client : clients) {
                client.autoUpdateAccount();
            }
            try {
                Thread.sleep(1000 * 10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
