public abstract class Activity {
    private String deskripsi;

    public Activity(String deskripsi){
        this.deskripsi = deskripsi;
    }

    public String getDescription(){
        return this.deskripsi;
    }

    public abstract double getCalories();

    public abstract double apply(double currentCalories);
    
}