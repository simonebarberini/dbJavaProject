//  CREATE TABLE Product (
//     product_id INT AUTO_INCREMENT PRIMARY KEY,
//     user_id INT NOT NULL,
//     name VARCHAR(100) NOT NULL,
//     description TEXT,
//     price DECIMAL(10, 2) NOT NULL,
//     stock INT NOT NULL,
//     created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
//     FOREIGN KEY (user_id) REFERENCES User(user_id) ON DELETE CASCADE
// ); 

package com.test.model;

public class Prodotto {
    private int product_id;
    private int user_id;
    private String name;
    private String description;
    private double price;
    private int stock;

    public Prodotto(int product_id, int user_id, String name, String description, double price, int stock) {
        this.product_id = product_id;
        this.user_id = user_id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stock = stock;
    }

    public String getDescription() {
        return description;
    }

    public int getProduct_id() {
        return product_id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getProduct() {
        return "Prodotto{" +
                "id=" + product_id +
                ", user id='" + user_id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price='" + price + '\'' +
                ", stock='" + stock + '\'' +
                '}';
    }

}
