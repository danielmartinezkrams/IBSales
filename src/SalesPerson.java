public class SalesPerson {

    private String id;
    private Sales[] salesHistory = new Sales[100];
    // details of the different sales
    private int count = 0;
    // number of sales made
    public SalesPerson(String id) {
        //constructor for a new salesperson
        // code missing
        this.id = id;
    }
    // constructor for a salesperson transferred (together with their sales details) from another branch
    public SalesPerson(String id, Sales[] s, int c) {
        this.id = id;
        this.salesHistory = s;
        this.count = c;
    }
    public int getCount(){
        return count;
    }
    public String getId() {
        return id;
    }
    public void setSalesHistory(Sales s) {
        salesHistory[count] = s;
        count++;
    }
    public double calcTotalSales() {
        // calculates total sales for the salesperson
        // code missing
        double totalSales = 0;
        for(int i = 0; i < count; i++){
            totalSales += salesHistory[i].getQuantity() * salesHistory[i].getValue();
        }
        return totalSales;
    }
    public void largestSale() {
        // calculates the sale with the largest value
        //Sales
    }


}
