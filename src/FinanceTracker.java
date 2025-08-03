//TODO: silahkan import library yang dibutuhkan

import java.util.ArrayList;

public class FinanceTracker {
    //TODO 
    //Note: gunakan ArrayList untuk menampung Description
    // INGAT DI SINI ITU ATRIBUTE
    private Double balance;
    private ArrayList<String> description;

    public FinanceTracker(Double initalBalance)
    {
        //TODO DI SINI CONSTRUCTOR
        this.balance = initalBalance;
        this.description = new ArrayList<>();
    }
    public void addIncome(Double amountIncome, String Description)
    {
       //TODO menambahkan balance
       this.balance += amountIncome;
       this.description.add(Description);
    }
    public Boolean addExpense(Double amountExpense, String Description)
    {
        //TODO 
        //Notes: Jika balance < amountExpense, return false. 
        if(balance < amountExpense) return false;
        this.balance -= amountExpense;
        this.description.add(Description);
        return true;
    }
    public Double getAmount()
    {
         //TODO kembalikan saldo saat ini
        return this.balance;
    }
    public String getDescription(Integer indexDescription)
    {
        if(indexDescription < 0 || indexDescription>description.size()){
            return "invalid index";
        }
        return description.get(indexDescription);
    }

    @Override
    public String toString() {
        return "Transaction history: " + description.toString();
    }
}
