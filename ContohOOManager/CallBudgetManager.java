public class CallBudgetManager {
    public static void main(String[] args) {
        BudgetManager bm = new BudgetManager(750000.0);

        System.out.println(bm.addUsage(800000.0, "Beli Laptop")); // false
        System.out.printf("Remaining Budget: %.2f\n", bm.getRemainingBudget()); // 750000.00

        System.out.println(bm.addUsage(200000.0, "Beli Buku")); // true
        System.out.printf("Remaining Budget: %.2f\n", bm.getRemainingBudget()); // 550000.00

        bm.addUsage(0.0, "Bayar WiFi"); // implicitly adds another usage

        System.out.println("Budget usage history: " + bm.getHistory()); // [Beli Buku, Bayar WiFi]
        System.out.println(bm.addUsage(600000.0, "Bayar SPP")); // false
        System.out.println("Budget usage history: " + bm.getHistory()); // [Beli Buku, Bayar WiFi]

        System.out.println("Pengeluaran pada index ke - 1: " + bm.getUsageAt(1)); // Bayar WiFi
    }
}