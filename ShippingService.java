import java.util.ArrayList;

public class ShippingService {



    private  ArrayList<Products> shippedItems = new ArrayList<>();

    public ShippingService(ArrayList<Products> shippedItems ) {

        this.shippedItems = shippedItems;
    }

    public Double getShippingFees() {

        return 12.8 * shippedItems.size();

    }


}