# 🛒 OOP E-Commerce System Challenge

This project is a **console-based Object-Oriented Programming (OOP)** implementation of an e-commerce system in **Java**. It simulates a mini‑storefront with product listings, cart management, checkout logic, and error handling.

---

## 🚀 Problem Statement

Design an e-commerce system that includes:

1. **Product Management**

   * Each product has a `name`, `price`, and `quantity`.
   * Some products may expire (e.g., Cheese, Biscuits), others do not (e.g., TV, Mobile).
   * Some products require shipping (e.g., Cheese, TV) and must have a **weight**.
   * Some products do **not** require shipping (e.g., Mobile scratch cards).

2. **Customer Actions**

   * Add items to a cart with a **specific quantity**, ensuring it’s not more than available stock.
   * Proceed to **checkout** if:

     * Cart is not empty
     * All products are valid (not expired, in stock)
     * Customer has enough balance

3. **Checkout Output**

   * Subtotal (sum of item prices × quantity)
   * Shipping fees (computed by `ShippingService`)
   * Total amount paid

4. **Error Handling**

   * Empty cart
   * Insufficient balance
   * Expired product or out-of-stock item

---

## 🧠 My Approach

This implementation uses a **service class** for shipping logic and keeps all product behavior in a single `Products` class.

* **`Products`**

  * Fields:

    * `name`
    * `expirationDuration` (nullable)
    * `quantity`
    * `price`
    * `weight`
  * Methods: standard getters/setters and quantity updates

* **`ShippingService`**

  * Constructor takes the list of shippable `Products`
  * `getShippingFees()`: returns `12.8 * numberOfShippableItems`

* **`Cart`**

  * Holds:

    * `Products[] productsArray` (available stock)
    * `List<Products> shippableItems` (items added that have weight)
  * Methods:

    * `add(String productName, int quantity)`: validates and adds or prints errors
    * `getOrderSubtotal()`, `getShipFees()`, `isCartEmpty()`, `getShippableItems()`

* **`Customer`**

  * Fields: `name`, `address`, `balance`
  * Standard getters/setters

* **`app.Main`**

  * Seeds sample products and a customer
  * Demonstrates edge‑case `add()` calls
  * Runs `checkout()`: validates balance/cart, prints shipment notice and receipt

---

## 📂 Project Structure

```text
app/
├─ Cart.java
├─ Customer.java
├─ Products.java
├─ ShippingService.java
└─ Main.java      # Entry point

README.md
```

---

### 🧪 Sample Console Output


Please find below a sample console output. *(You can insert your screenshot below this section.)*

![Console Output Screenshot](https://github.com/user-attachments/assets/e276a385-8ebf-4072-b2e1-ff847833d2d3)



---

## 📌 Technologies Used

* Java (console application)
* Core OOP principles (encapsulation, composition)
* No external libraries or frameworks

---

## 🙋 Author

**Abdalla Mohamed**
3rd Year CS Student | Aspiring Android Developer

Let’s connect on [LinkedIn](https://linkedin.com) 
