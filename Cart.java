import java.util.ArrayList;
import java.util.Objects;

public class Cart {

    private final Products[] productsArray; // Products Samples For Testing
    private final ArrayList<Products> shippableItems = new ArrayList<>();
    private Double sumOfItemsPrices = 0.0;

    Cart( Products[] productsArray) {

        this.productsArray = productsArray;
    }

    public void add(String productName, int quantity) {

        boolean productNotFound = true;
        Products tempProduct ;

        if (quantity < 0) {
            System.out.println("Error Try Again Quantity Must be Positive");
            return;

        }
        for (Products product : productsArray) {

            tempProduct = product;
            // check the name of products and make sure that both balance and quantity are available and sufficient for adding the product
            if (Objects.equals(product.getName().toLowerCase(), productName.toLowerCase()) && quantity <= product.getQuantity()) {

                productNotFound = false;

                sumOfItemsPrices += (product.getPrice()*quantity);

                product.setQuantity(product.getQuantity() - quantity); //to update the quantity of product each time

                tempProduct.setQuantity(quantity);

                if (product.getWeight() > 0) {

                    shippableItems.add(tempProduct);

                }

                break;
            } else if (Objects.equals(product.getName().toLowerCase(), productName.toLowerCase()) && quantity > product.getQuantity()) {
                System.out.println("Error this Products is Out of Stock Or Expired");
productNotFound = false;
            }
        }

        if (productNotFound ) {
            System.out.println("Product NOT Found");
        }
    }

    private final ShippingService ship = new ShippingService(shippableItems); // sent only the shipped items

    public ArrayList<Products> getShippableItems() {
        return shippableItems;
    }

    public boolean isCartEmpty() {

        return shippableItems.isEmpty();
    }

    public Double getOrderSubtotal() {

        return this.sumOfItemsPrices;

    }


    public Double getShipFees() {
        return ship.getShippingFees();
    }


}