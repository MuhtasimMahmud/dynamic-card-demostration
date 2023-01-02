package com.dynamic_cards.dynamic.card.demostration.model;


import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class products {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int productID;
    private String productName;
    private String productDetail;


    public products(){

    }

    public products(int productID, String productName, String productDetail) {
        this.productID = productID;
        this.productName = productName;
        this.productDetail = productDetail;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDetail() {
        return productDetail;
    }

    public void setProductDetail(String productDetail) {
        this.productDetail = productDetail;
    }
}
