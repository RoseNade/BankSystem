package BankSystem.test;

import BankSystem.Bank;
import BankSystem.beans.*;
import BankSystem.exceptions.WithdrawException;

public class Test {
    public static void main(String[] args) {
        // Log l1 = new Log(123, "Money Deposit", 2000);
        // Log l2 = new Log(456, "Money Withdraw", 1500);

        //System.out.println(l1 + " \n" + l2);

        //Logger logger = Logger.getInstance();
//logger.addLog(l1);
//logger.addLog(l2);
        //logger.display();

//
//        Account a1 = new Account(111, 1000);
//        Account a2 = new Account(222, 3000);
//        Account a3 = new Account(333, 2500);
//        Account a4 = new Account(444, 10_000);
//        Account a5 = new Account(555, 6000);
//
//        System.out.println(a1 == a2);
//        System.out.println(a1.equals(a4));
//        System.out.println(a1 + " \n" + a2 + " \n" + a3 + " \n" + a4 + " \n" + a5);
//        System.out.println("------------------------------------------------");
//

//        Client client1 = new Client(123, "Cohen", "Roni", 2.5, 7);
//
//        client1.addAccount(a1);
//        client1.addAccount(a2);
//        client1.addAccount(a3);
//        client1.addAccount(a4);
//        client1.addAccount(a5);
//
//        System.out.println(client1);
//        System.out.println("------------------------------------------------");

        Account a1 = new Account(1001, 1000);
        Account a2 = new Account(1002, 3000);
        Account a3 = new Account(1003, 2500);
        Account a4 = new Account(1004, 10_000);
        Account a5 = new Account(1005, 6000);
        Account a6 = new Account(1006, 1000);
        Account a7 = new Account(1007, 3000);
        Account a8 = new Account(1008, 2500);
        Account a9 = new Account(1009, 10_000);
        Account a10 = new Account(1010, 6000);
        Account a11 = new Account(1011, 1000);
        Account a12 = new Account(1012, 3000);
        Account a13 = new Account(1013, 2500);
        Account a14 = new Account(1014, 10_000);
        Account a15 = new Account(1015, 6000);
        Account a16 = new Account(1016, 1000);
        Account a17 = new Account(1017, 3000);
        Account a18 = new Account(1018, 2500);
        Account a19 = new Account(1019, 10_000);
        Account a20 = new Account(1020, 6000);
        Account a21 = new Account(1021, 1000);
        Account a22 = new Account(1022, 3000);
        Account a23 = new Account(1023, 2500);
        Account a24 = new Account(1024, 10_000);
        Account a25 = new Account(1025, 6000);
        Account a26 = new Account(1026, 1000);
        Account a27 = new Account(1027, 3000);
        Account a28 = new Account(1028, 2500);
        Account a29 = new Account(1029, 10_000);
        Account a30 = new Account(1030, 6000);
        Account a31 = new Account(1031, 1000);
        Account a32 = new Account(1032, 3000);
        Account a33 = new Account(1033, 2500);
        Account a34 = new Account(1034, 10_000);
        Account a35 = new Account(1035, 6000);
        Account a36 = new Account(1036, 1000);
        Account a37 = new Account(1037, 3000);
        Account a38 = new Account(1038, 2500);
        Account a39 = new Account(1039, 10_000);
        Account a40 = new Account(1040, 6000);
        Account a41 = new Account(1041, 1000);
        Account a42 = new Account(1042, 3000);
        Account a43 = new Account(1043, 2500);
        Account a44 = new Account(1044, 10_000);
        Account a45 = new Account(1045, 6000);

//        Client regular1 = new RegularClient(111, "Cohen", "Avi");
//        regular1.addAccount(a1);
//        regular1.addAccount(a2);
//        regular1.addAccount(a3);
//        regular1.addAccount(a4);
//        regular1.addAccount(a5);
//        regular1.fullReport();
//        Client regular2 = new RegularClient(112, "Lombok", "Yakov");
//        regular2.addAccount(a6);
//        regular2.addAccount(a7);
//        regular2.addAccount(a8);
//        regular2.addAccount(a9);
//        regular2.addAccount(a10);
//        regular2.fullReport();
//        Client regular3 = new RegularClient(113, "Tomcat", "Tommy");
//        regular3.addAccount(a11);
//        regular3.addAccount(a12);
//        regular3.addAccount(a13);
//        regular3.addAccount(a14);
//        regular3.addAccount(a15);
//        regular3.fullReport();

        Client gold1 = new GoldClient(211, "Neri", "Berrie");
        gold1.addAccount(a16);
        gold1.addAccount(a17);
        gold1.addAccount(a18);
        gold1.addAccount(a19);
        gold1.addAccount(a20);
        gold1.fullReport();
        Client gold2 = new GoldClient(212, "Meir", "Golda");
        gold2.addAccount(a21);
        gold2.addAccount(a22);
        gold2.addAccount(a23);
        gold2.addAccount(a24);
        gold2.addAccount(a25);
        gold2.fullReport();
        Client gold3 = new GoldClient(213, "Ben Yehuda", "Miri");
        gold3.addAccount(a26);
        gold3.addAccount(a27);
        gold3.addAccount(a28);
        gold3.addAccount(a29);
        gold3.addAccount(a30);
        gold3.fullReport();

        Client platinum1 = new PlatinumClient(311, "Zinger", "Ron");
        platinum1.addAccount(a31);
        platinum1.addAccount(a32);
        platinum1.addAccount(a33);
        platinum1.addAccount(a34);
        platinum1.addAccount(a35);
        platinum1.fullReport();
        Client platinum2 = new PlatinumClient(312, "Ben Ari", "Matan");
        platinum2.addAccount(a36);
        platinum2.addAccount(a37);
        platinum2.addAccount(a38);
        platinum2.addAccount(a39);
        platinum2.addAccount(a40);
        platinum2.fullReport();
        Client platinum3 = new PlatinumClient(313, "Yedid", "Liat");
        platinum3.addAccount(a41);
        platinum3.addAccount(a42);
        platinum3.addAccount(a43);
        platinum3.addAccount(a44);
        platinum3.addAccount(a45);
        platinum3.fullReport();

        Client regular1 = new RegularClient(111, "Cohen", "Avi");
        regular1.addAccount(a1);
        regular1.addAccount(a2);
        regular1.addAccount(a3);
        regular1.addAccount(a4);
        regular1.addAccount(a5);
        regular1.fullReport();
        try {
            regular1.withdraw(a1, 1500);
        } catch (WithdrawException e) {
            e.printStackTrace();
        }
        Client regular2 = new RegularClient(112, "Lombok", "Yakov");
        regular2.addAccount(a6);
        regular2.addAccount(a7);
        regular2.addAccount(a8);
        regular2.addAccount(a9);
        regular2.addAccount(a10);
        regular2.fullReport();
        try {
            regular2.withdraw(a6, 1500);
        } catch (WithdrawException e) {
            e.printStackTrace();
        }
        Client regular3 = new RegularClient(113, "Tomcat", "Tommy");
        regular3.addAccount(a11);
        regular3.addAccount(a12);
        regular3.addAccount(a13);
        regular3.addAccount(a14);
        regular3.addAccount(a15);
        regular3.fullReport();
        try {
            regular3.withdraw(a11, 1500);
        } catch (WithdrawException e) {
            e.printStackTrace();
        }
        Bank bank = Bank.getInstance();
        bank.addClient(regular1);
        bank.addClient(regular2);
        bank.addClient(regular3);
        bank.addClient(gold1);
        bank.addClient(gold2);
        bank.addClient(gold3);
        bank.addClient(platinum1);
        bank.addClient(platinum2);
        bank.addClient(platinum3);

        bank.startAccountUpdater();
        bank.viewLogs();
    }
}
