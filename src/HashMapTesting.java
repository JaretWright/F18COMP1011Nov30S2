import java.util.ArrayList;
import java.util.HashMap;

public class HashMapTesting {

    public static void main(String[] args)
    {
        HashMap<Customer, ArrayList<Order>> sales = new HashMap<>();

        Customer customer1 = new Customer("John","Smith");
        Customer customer2 = new Customer("Anita","Job");
        Customer customer3 = new Customer("Austin","Powers");

        sales.put(customer1, new ArrayList<Order>());
        sales.put(customer2, new ArrayList<Order>());
        sales.put(customer3, new ArrayList<Order>());

        sales.get(customer1).add(new Order("Audi RS5",95000.19,2));
        sales.get(customer1).add(new Order("Coffee",1.89,3));
        sales.get(customer1).add(new Order("Dog Walker",198.23,1));
        sales.get(customer2).add(new Order("Gift Cards",1000,1));
        sales.get(customer3).add(new Order("Gift Cards",1800,1));
        sales.get(customer3).add(new Order("Gift Cards",200,10));

        //Show how much $ each customer spent
        for (Customer customer:sales.keySet())
        {
            System.out.printf("%s spent a total of $%.2f%n",customer, getTotal(customer, sales));
            System.out.printf("%s spent a total of $%.2f%n",customer, getAmountSpentStreamV(customer, sales));
        }

        //display the top customer
        Customer topCustomer = getTopCustomer(sales);
        System.out.printf("The top customer is %s, spending a total of $%.2f", topCustomer,
                                        getAmountSpentStreamV(topCustomer, sales));
    }

    public static Customer getTopCustomer(HashMap<Customer, ArrayList<Order>> sales)
    {
        //Loop over the customers and compare their spending info
        Customer topCustomer = null;
        for (Customer customer:sales.keySet())
        {
            if (topCustomer==null)
                topCustomer=customer;
            else if (getTotal(topCustomer, sales) < getTotal(customer, sales))
                topCustomer=customer;
        }
        return topCustomer;

    }


    /**
     * This method will return the total amount spent by a given customer
     */
    public static double getTotal(Customer customer, HashMap<Customer, ArrayList<Order>> sales)
    {
        double total = 0;
        //the old way using a loop
        for (Order order: sales.get(customer))
            total += order.getOrderTotal();

        return total;
    }

    public static double getAmountSpentStreamV(Customer customer, HashMap<Customer, ArrayList<Order>> sales)
    {
        return sales.get(customer).stream()
                .mapToDouble(order -> order.getOrderTotal())
                .sum();
    }

}
