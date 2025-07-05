public class Products {

    private String name, expirationDuration;
    private Double  price, weight;
private int quantity ;

    public Products(String name, String expirationDuration, int quantity, Double price, Double weight) {
        this.name = name;
        this.expirationDuration = expirationDuration;
        this.quantity = quantity;
        this.price = price;
        this.weight = weight;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExpirationDuration() {
        return expirationDuration;
    }

    public void setExpirationDuration(String expirationDuration) {
        this.expirationDuration = expirationDuration;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getWeight() {


        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }
}