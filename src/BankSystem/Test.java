package BankSystem;

public class Test {
    public static void main(String[] args) {
        Bank bank = Bank.getInstance();

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

        Client gold1 = new GoldClient(211, "Neri", "Berrie");
        gold1.addAccount(a15);
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
//        System.out.println("---------------");
//        bank.viewLogs();

    }
}
