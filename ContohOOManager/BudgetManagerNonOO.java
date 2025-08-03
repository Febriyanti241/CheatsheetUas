import java.util.ArrayList;

public class BudgetManagerNonOO {
    public static double budget = 750000.0;
    public static ArrayList<String> usageHistory = new ArrayList<>();

    public static boolean addUsage(double amount, String description) {
        if (amount > budget) {
            return false;
        } else {
            budget -= amount;
            usageHistory.add(description);
            return true;
        }
    }

    public static double getRemainingBudget() {
        return budget;
    }

    public static ArrayList<String> getHistory() {
        return usageHistory;
    }

    public static String getUsageAt(int index) {
        if (index < 0 || index >= usageHistory.size()) {
            return "Invalid index";
        }
        return usageHistory.get(index);
    }
}