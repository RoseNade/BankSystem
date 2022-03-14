package BankSystem.beans;

public class RegularClient extends Client {

    public RegularClient(int idClient, String lastName, String firstName) {
        super(idClient, lastName, firstName, 3.0, 0.1);
    }

//    public RegularClient(int idClient, String lastName, String firstName, double commissionRate, double interestRate) {
//        super(idClient, lastName, firstName, 3.0, 0.1);
//    }

    @Override
    public void draw() {
        System.out.println("" +
                "██████╗ ███████╗ ██████╗ ██╗   ██╗██╗      █████╗ ██████╗ \n" +
                "██╔══██╗██╔════╝██╔════╝ ██║   ██║██║     ██╔══██╗██╔══██╗\n" +
                "██████╔╝█████╗  ██║  ███╗██║   ██║██║     ███████║██████╔╝\n" +
                "██╔══██╗██╔══╝  ██║   ██║██║   ██║██║     ██╔══██║██╔══██╗\n" +
                "██║  ██║███████╗╚██████╔╝╚██████╔╝███████╗██║  ██║██║  ██║\n" +
                "╚═╝  ╚═╝╚══════╝ ╚═════╝  ╚═════╝ ╚══════╝╚═╝  ╚═╝╚═╝  ╚═╝\n" +
                "                                                          \n" +
                " ██████╗██╗     ██╗███████╗███╗   ██╗████████╗            \n" +
                "██╔════╝██║     ██║██╔════╝████╗  ██║╚══██╔══╝            \n" +
                "██║     ██║     ██║█████╗  ██╔██╗ ██║   ██║               \n" +
                "██║     ██║     ██║██╔══╝  ██║╚██╗██║   ██║               \n" +
                "╚██████╗███████╗██║███████╗██║ ╚████║   ██║               \n" +
                " ╚═════╝╚══════╝╚═╝╚══════╝╚═╝  ╚═══╝   ╚═╝               \n" +
                "                                                          ");
    }

    @Override
    public String toString() {
        return "RegularClient{" +
                "commissionRate=" + commissionRate +
                ", interestRate=" + interestRate +
                "} " + super.toString();
    }
}
