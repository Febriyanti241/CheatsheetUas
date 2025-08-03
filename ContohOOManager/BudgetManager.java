import java.util.ArrayList;
import java.util.List;

public class BudgetManager {
    private double budget;
    private List<String> usageHistory;

    public BudgetManager(double initialBudget) {
        // TODO: Inisialisasi budget dan usageHistory
        this.budget = initialBudget;
        this.usageHistory = new ArrayList<>();
    }

    public boolean addUsage(double amount, String description) {
        // TODO: Jika amount > budget, return false. Jika tidak, kurangi budget dan tambahkan deskripsi
        if(amount>this.budget) return false;
        this.budget -= amount;
        usageHistory.add(description);
        return true;
    }

    public double getRemainingBudget() {
       return this.budget;
    }

    public List<String> getHistory() {
        // TODO: Kembalikan salinan usageHistory (bukan referensi langsung)
        return new ArrayList<>(usageHistory);

    }

    public String getUsageAt(int index) {
        // TODO: Kembalikan item deskripsi berdasarkan index, jika valid. Jika tidak, return "Invalid index"
        if(index < 0 || index>=usageHistory.size()){
            return "invalid index";
        }
        return usageHistory.get(index);
    }
}