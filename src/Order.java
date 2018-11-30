public class Order {

    //this variable is used to "mimic" the behaviour of AUTO_INCREMENT in the DB
    private static int nextOrderID=100001;

    private int orderID;
    private double pricePerUnit;
    private String productName;
    private int unitsOrdered;

    public Order(String productName, double pricePerUnit, int unitsOrdered) {
        setPricePerUnit(pricePerUnit);
        setProductName(productName);
        setUnitsOrdered(unitsOrdered);
        setOrderID(nextOrderID++);
    }

    public int getOrderID() {
        return orderID;
    }

    public double getOrderTotal()
    {
        return pricePerUnit*unitsOrdered;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getUnitsOrdered() {
        return unitsOrdered;
    }

    public void setUnitsOrdered(int unitsOrdered) {
        this.unitsOrdered = unitsOrdered;
    }
}
