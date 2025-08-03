import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class testFinanceTracker {
    
    FinanceTracker finTracker1 = new FinanceTracker(0.0);
    @Test
    public void testFinanceTracker()
    {
        //TODO
        // Contoh test case: assertEquals(5000000.0, finTracker1.getAmount(),0.01);
        finTracker1.addIncome(5000000.0,"Gaji bulan Mei");
        assertEquals(5000000.0, finTracker1.getAmount(),0.01);
        finTracker1.addExpense(500000.0, "Bayar Listrik");
        assertEquals(4500000.0, finTracker1.getAmount(),0.01);
        finTracker1.addExpense(12000000.0, "Beli iPhone Pro Max Super Mega Ultra");


    }
    //method toString tidak perlu dibuatkan test case
    // Anda dipersilahkan untuk menambahkan method test jika dibutuhkan
}
