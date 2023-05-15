package ForumWeek9;

import java.util.LinkedList;

public class SalesPerson {
    // each object contains details of one salesperson
    private String id;
    private LinkedList<Sales> salesHistory = new LinkedList<>(); // details of the different sales
    private int count = 0; // number of sales made

    //constructor for a new salesperson
    public SalesPerson(String id){
        // code missing
        this.id = id;
    }

    // constructor for a salesperson transferred (together with their sales details) from another branch
    public SalesPerson(String id, Sales[] s, int c){
        // code missing
    }

    public int getCount(){
        return count;
    }

    public String getId(){
        return id;
    }

    public void setSalesHistory(Sales s){

        salesHistory.add(s);

        count = count +1;

    }

    public Sales getSalesHistory(int i){
        return salesHistory.get(i);
    }


    public double calcTotalSales(){

        // calculates total sales for the salesperson
        double sum = 0.00;

        for (Sales sale : salesHistory){
            sum += sale.getValue() * sale.getQuantity();
        }

        return sum;
    }



    public Sales largestSale(){
        // calculates the sale with the largest value

        if (count == 0){
            return null;
        }

        Sales highest = getSalesHistory(0);

        for (Sales sale : this.salesHistory){
            if (sale.getValue() * sale.getQuantity() > highest.getValue() * highest.getQuantity()) {
                highest = sale;
            }
        }
        return highest;
    }
}
