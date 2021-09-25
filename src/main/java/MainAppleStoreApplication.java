import com.msanzar87.practice.store.AppleStore;
import com.msanzar87.practice.store.Customer;

public class MainAppleStoreApplication {


    public static void main(String[] args) {
        //Create an apple store and fill all the parameters with values

        AppleStore as = new AppleStore("Buzz's delicious green granny's",500,.75);
        //Create 3 customers and fill all the parameters with values
        Customer c1 = new Customer("Munir",100);
        Customer c2 = new Customer("Christian",50);
        Customer c3 = new Customer("Frank", 1);



        //Part 1
        System.out.println(c1.getCustomerName() + " came into " + as.getStoreName() + " and purchased "
                + c1.getApplesPurchased() + " apples for $" + (as.getCostOfApple() * c1.getApplesPurchased()));

        //update store's stock, customer count, apples sold and profit
        as.setNumOfCustomers(as.getNumOfCustomers() + 1);
        as.setAppleStock(as.getAppleStock() - c1.getApplesPurchased());
        as.setApplesSold(as.getApplesSold() + c1.getApplesPurchased());
        as.setTotalProfit(as.getTotalProfit() + (as.getCostOfApple() * c1.getApplesPurchased()));


        //print the stores updated stock, customer count and profit


        System.out.println("Buzz changed the price of his apples to $1 each for " + c2.getCustomerName());
        as.setCostOfApple(1);
        //Part 2
        System.out.println(c2.getCustomerName() + " came into " + as.getStoreName() + " and purchased "
                + c2.getApplesPurchased() + " Apples for $" +(as.getCostOfApple() * c2.getApplesPurchased()));

        //update store's stock, customer count and profit
        as.setNumOfCustomers(as.getNumOfCustomers() + 1);
        as.setAppleStock(as.getAppleStock() - c2.getApplesPurchased());
        as.setApplesSold(as.getApplesSold() + c2.getApplesPurchased());
        as.setTotalProfit(as.getTotalProfit() + (as.getCostOfApple() * c2.getApplesPurchased()));

        //print the stores updated stock, customer count and profit


        System.out.println("Buzz changed the price of his apples to $25 each for " + c3.getCustomerName());
        as.setCostOfApple(25);



        //Part 3
        System.out.println(c3.getCustomerName() + " came into " + as.getStoreName() + " and purchased "
                + c3.getApplesPurchased() + " Apples for " + " $" + (as.getCostOfApple() * c3.getApplesPurchased()));

        //update store's stock, customer count and profit
        as.setNumOfCustomers(as.getNumOfCustomers() + 1);
        as.setAppleStock(as.getAppleStock() - c3.getApplesPurchased());
        as.setApplesSold(as.getApplesSold() + c3.getApplesPurchased());
        as.setTotalProfit(as.getTotalProfit() + (as.getCostOfApple() * c3.getApplesPurchased()));

        //print the stores updated stock, customer count and profit




        //THE END
        System.out.println(as.getNumOfCustomers() + " customers bought a total of " + as.getApplesSold() + " apples.");
        System.out.println(as.getStoreName()+ " made a total profit of $" + as.getTotalProfit() + " and has " +as.getAppleStock()
                + " apples left over for donation");




        /*
        Have each customer come in and purchase an apple. Print the customer name, the number of apples they bought.

        Separately print the updated values of the store after each customer makes a purchase
         */

    }
}
