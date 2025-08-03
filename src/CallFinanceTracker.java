public class CallFinanceTracker {
    public static void main(String[] args)
    {

        FinanceTracker finTracker1 = new FinanceTracker(0.0);
        
        finTracker1.addIncome(5000000.0,"Gaji bulan Mei");
        System.out.printf("Balance: %.2f\n",finTracker1.getAmount());
        System.out.println(finTracker1.addExpense(500000.0, "Bayar Listrik"));
        System.out.printf("Balance: %.2f\n",finTracker1.getAmount());
        System.out.println(finTracker1.toString());

        System.out.println(finTracker1.addExpense(12000000.0, "Beli iPhone Pro Max Super Mega Ultra"));
        System.out.println(finTracker1.toString());
        System.out.println("Transaksi pada index ke - 1: "+finTracker1.getDescription(1));


    }
}
