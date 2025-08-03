import java.util.ArrayList;
import java.util.List;

public class ActivityTracker {
    private double netCalories;
    private List<Activity> activityList;

    public ActivityTracker(double initialCalories) {
        // TODO: Inisialisasi netCalories dan activityList
        this.netCalories = 1000.0;
        this.activityList = new ArrayList<>();
    }

    public boolean addActivity(Activity activity) {
        // TODO:
        // 1. Gunakan activity.apply() untuk menghitung netCalories baru
        // 2. Jika hasil negatif (misal olahraga melebihi net calories), kembalikan false
        // 3. Jika valid, update netCalories dan tambahkan ke activityList

        double updatedCalories = activity.apply(netCalories);
        if(updatedCalories == -1) return false;
        netCalories = updatedCalories;
        activityList.add(activity);
        return true;
    }

    public double getNetCalories() {
        return netCalories;
    }

    public List<String> getHistory() {
        // TODO: Kembalikan list deskripsi aktivitas dari activityList
        List<String> result = new ArrayList<>();
        for (Activity a : activityList) {
            result.add(a.getDescription());
        }
        return result;
    }

    public String getActivityAt(int index) {
        // TODO: Validasi index, jika valid kembalikan deskripsi, jika tidak return "Invalid index"
        if(index<0 || index >= activityList.size()) return "invalid index";

        return activityList.get(index).getDescription();
    }
}