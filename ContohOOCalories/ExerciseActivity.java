public class ExerciseActivity extends Activity {
    private double calories;

    public ExerciseActivity(double calories, String description) {
        // TODO: Panggil konstruktor superclass dengan parameter yang sesuai
        super(description);
        this.calories = calories;
    }

    @Override
    public double apply(double currentCalories) {
        // TODO:
        // Jika kalori olahraga lebih besar dari currentCalories, return -1
        // Jika tidak, kurangi currentCalories dan return hasilnya
        if(this.calories>currentCalories){
            return -1;
        }
        else{
            return currentCalories - calories;
        }
    }

    @Override
    public double getCalories() {
        return -calories;
    }
}