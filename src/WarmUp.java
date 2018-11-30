import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;

public class WarmUp {
    public static void main(String[] args)
    {
        TreeMap<String, Double> giftsIWant = new TreeMap<>(Comparator.reverseOrder());


        giftsIWant.put("Change the time of the class", 29.99);
        giftsIWant.put("Apple anything", 100000.28);
        giftsIWant.put("Audi RS5", 95000.29);
        giftsIWant.put("House cleaning", 289.99);

        for (String gift:giftsIWant.keySet())
            System.out.printf("%s costs $%.2f%n",gift, giftsIWant.get(gift));
    }
}
