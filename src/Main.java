import java.lang.reflect.Array;
import java.util.*;
public class Main {
    public static Integer Max(ArrayList<Integer> list){
        if(list == null || list.isEmpty()){
            return null;
        }
        else{
            Integer max = list.get(0);
            for(Integer i=0;i<list.size();i++){
                max=Math.max(max,list.get(i));
            }
            return max;
        }

    }
    public static void sort(ArrayList<Integer> list){
        int size = list.size();
        for(int j =1; j<size;j++){
            for(int i=0;i<size-j;i++){
                if(list.get(i) > list.get(i+1)){
                    int temp = list.get(i);
                    list.set(i,list.get(i+1));
                    list.set(i+1,temp);
                }
            }
        }

    }
    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<>();
        x.add(6);
        x.add(3);
        x.add(2);
        x.add(0);
        System.out.println("Unsorted array: ");
        for(int i=0;i<x.size();i++){
            System.out.print(x.get(i) + " ");
        }
        sort(x);
        System.out.println();
        System.out.println("Sorted array: ");
        for(int i=0;i<x.size();i++){
            System.out.print(x.get(i) + " ");
        }
        System.out.println();
        Integer j = Max(x);
        System.out.println("Maximum element: ");
        System.out.println(j);
        GroceryList g = new GroceryList();
        g.add(new GroceryItemOrder("Spiro", 3, 10));
        g.add(new GroceryItemOrder("Milk", 1, 20));
        g.add(new GroceryItemOrder("Rice", 5, 20));
        double totalCost = g.getTotalCost();
        System.out.println("Total cost of the cart: ");
        System.out.println("$"+totalCost);
    }
}