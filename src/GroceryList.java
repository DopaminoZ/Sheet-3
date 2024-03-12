import java.util.ArrayList;

public class GroceryList {
    ArrayList<GroceryItemOrder> orders = new ArrayList<>();
    public GroceryList(){
    }
    public void add(GroceryItemOrder item) {
        if (orders.size() < 10) {
            orders.add(item);
        }
    }
    public double getTotalCost(){
        double sum=0;
        for(int i=0;i<orders.size();i++){
            sum+=(double) orders.get(i).getCost();
        }
        return sum;
    }
}
