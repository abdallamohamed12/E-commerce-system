public class app {


    public static void main(String[] args) {


        Customer customer = new Customer("abdalla", "Alex", 10000.0);

        Products sample = new Products("TV", null, 5, 2000.00, 600.32);
        Products sample1 = new Products("Cheese", "7/12/2025", 13, 200.00, 10.32);


        Products sample2 = new Products("Mobile", null, 15, 800.00, 50.32);
        Products sample3 = new Products("Cup", null, 20, 90.00, 30.22);

        Products sample4 = new Products("Mobile Scratch Cards", "7/8/2025", 13, 10.00, 0.0);

        Products[] product = {sample, sample1, sample2, sample3, sample4};


        Cart cart = new Cart(product);

        cart.add("Cup", 1);
        cart.add("mobile", 3);
        cart.add("TV", 2);

        cart.add("cards", 0);

        cart.add("TV", 6);

        cart.add("Cheese", 13);
        cart.add("tv", -2);

        cart.add("Mobile Scratch Cards", 2);
        cart.add("", 2);
        cart.add(" ", 200);

        checkout(customer, cart);

    }


    public static void checkout(Customer customer1, Cart cart) {

        Double totalWeight = 0.0, totalAmount = cart.getShipFees() + cart.getOrderSubtotal(), productWeight, productPrice;

        int sizeOfProducts = cart.getShippableItems().size();

        String productName;
        int productQuantity;

        if (customer1.getBalance() < totalAmount) {

            System.out.println("Customer's balance is insufficient.");
            return;
        }

        if (cart.isCartEmpty()) {
            System.out.println("Cart is empty");
            return;
        }


        System.out.println("** Shipment Notice **");
        for (int i = 0; i < sizeOfProducts; i++) {
            productQuantity = cart.getShippableItems().get(i).getQuantity();
            productWeight = cart.getShippableItems().get(i).getWeight();
            productName = cart.getShippableItems().get(i).getName();
            totalWeight += productWeight;
            System.out.println(productQuantity + "X" + " "
                    +productName+ "\t " + productWeight + "g");
        }
        if (totalWeight >= 1000) {
            System.out.println("Total package weight " + totalWeight / 1000 + "Kg\n");
        } else {
            System.out.println("Total package weight " + totalWeight + "g\n");
        }

        System.out.println("** Checkout receipt **");
        for (int i = 0; i < cart.getShippableItems().size(); i++) {
            productQuantity = cart.getShippableItems().get(i).getQuantity();
            productPrice = cart.getShippableItems().get(i).getPrice();
            productName = cart.getShippableItems().get(i).getName();

            System.out.println(productQuantity + "X" + " "
                    + productName + "\t " + productQuantity * productPrice);
        }

        System.out.println("---------------------------------");

        System.out.println("SubTotal \t " + cart.getOrderSubtotal());
        System.out.println("Shipping \t " + cart.getShipFees());
        System.out.println("Amount \t " + totalAmount);

    }

}

