public class FoodActivity extends Activity {
    private double calories;

    public FoodActivity(double calories, String description) {
        super(description);
        this.calories = calories;
    }

    @Override
    public double apply(double currentCalories) {
        return currentCalories+calories;
    }

    @Override
    public double getCalories() {
        return calories;
    }
}
