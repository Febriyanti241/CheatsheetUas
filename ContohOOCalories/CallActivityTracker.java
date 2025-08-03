public class CallActivityTracker {
    public static void main(String[] args) {
        ActivityTracker tracker = new ActivityTracker(1000.0);

        System.out.println(tracker.addActivity(new ExerciseActivity(1500, "Sprint 10k")));
        System.out.printf("Net Calorie: %.2f\n", tracker.getNetCalories());

        System.out.println(tracker.addActivity(new FoodActivity(800, "Makan nasi padang pakai rendang")));
        System.out.printf("Net Calorie: %.2f\n", tracker.getNetCalories());

        tracker.addActivity(new ExerciseActivity(500, "Jogging santai 10k"));

        System.out.println("Activity history: " + tracker.getHistory());
        System.out.println(tracker.addActivity(new ExerciseActivity(600, "Renang 1 jam")));
        System.out.println("Activity history: " + tracker.getHistory());

        System.out.println("Aktivitas index ke - 1: " + tracker.getActivityAt(1));
    }
}