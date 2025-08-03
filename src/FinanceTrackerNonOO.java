import java.util.Arrays;

public class FinanceTrackerNonOO{ 
    public static void main(String[] args) 
    {
        String[] transactionDescription = new String[4];
        Double amountBalance = 0.0;

        //create income
        transactionDescription[0] = "Penerimaan Gaji sebesar IDR 5,000,000,-";
        amountBalance += 5000000.0;

        //create expense
        transactionDescription[1] = "Bayar voucher listrik sebesar IDR 500,000,-";
        amountBalance -= 500000.0;

        //check balance
        System.out.printf("Current balance: %.2f\n",amountBalance);

        //print transaction
        System.out.printf("Transaction history: %s\n", Arrays.toString(transactionDescription));

    }
}