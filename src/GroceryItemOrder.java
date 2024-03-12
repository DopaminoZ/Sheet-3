public class GroceryItemOrder {
    String itemName;
    int itemQuantity;
    double pricePerUnit;
    public GroceryItemOrder(String name,int quantity, double price){
        pricePerUnit=price;
        itemName = name;
        itemQuantity = quantity;
    }
    public double getCost(){
        return itemQuantity*pricePerUnit;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }
}
