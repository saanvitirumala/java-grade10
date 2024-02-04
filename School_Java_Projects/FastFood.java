package School_Java_Projects;

public class FastFood {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Representing a single fast food order using arrays and a single variable

        // Array to store item descriptions and prices as separate arrays
        String[] itemDescriptions = {
            "Spicy Chicken Sandwich","Large Fries","Large Soda","Medium Frosty" // Add more item descriptions as needed
        };
        double[] itemPrices = {
            2.99,1.89 // Add more item prices corresponding to the descriptions
        };

        // Variable to store the total for the order
        double orderTotal = 0;

        // Displaying the order items and calculating the total
        System.out.println("Fast Food Order:");
        for (int i = 0; i < itemDescriptions.length; i++) {
            System.out.println(itemDescriptions[i] + " - $" + itemPrices[i]);
            orderTotal += itemPrices[i];
        }

        System.out.println("Total: $" + orderTotal);
    }
}


