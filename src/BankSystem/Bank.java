package BankSystem;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private static final int MAX_SIZE = 5;
    private final String name = "John Bryce Bank";
    private List<Client> clients = new ArrayList<>();
    private static double totalCommission;
    private static Bank instance = new Bank();

    private Bank() {
    }

    public static Bank getInstance() {
        return instance;
    }

    public String getName() {
        return name;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    public static double getTotalCommission() {
        return totalCommission;
    }

    public static void setTotalCommission(double totalCommission) {
        Bank.totalCommission = totalCommission;
    }

    public void addClient(Client client) {
        if (clients.contains(client)) {
            System.out.println("Client already exists");
            return;
        }
        if (clients.size() < MAX_SIZE) {
            clients.add(client);
            System.out.println("Client added successfully");
            loggerActions("Client added", client);
        } else {
            System.out.println("There is no space for a new client");
        }
    }

    private void loggerActions(String description, Client client) {
        Log log = new Log(client.getIdClient(), description, client.getFortune());
        Logger.getInstance().addLog(log);
    }

    public void removeClient(Client client) {
        if (clients.contains(client)) {
            clients.remove(client);
            System.out.println("Client removed successfully");
            loggerActions("Client removed", client);
        } else {
            System.out.println("Client doesn't exist");
        }
    }

    public Client findClientByID(int id) {
        for (Client client : clients) {
            if (client != null && client.getIdClient() == id) {
                return client;
            }
        }
        return null;
    }

    public void viewLogs() {
        Logger logger = Logger.getInstance();
        logger.display();
    }

    public double getFortune() {
        double result = 0;
        double totalCommission = 0;
        for (Client client : clients) {
            if (client != null) {
                result += client.getFortune();
                totalCommission += client.getFortune() / 100 * client.commissionRate;
            }
        }
        updateTotalCommission(totalCommission);
        return result;
    }

    public void startAccountUpdater() {
        //TODO account updater method
    }

    public static void updateTotalCommission(double commission) {
        totalCommission += commission;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", clients=" + clients +
                '}';
    }
}
