/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_2;

/**
 *
 * @author Informatica7
 */

public class Product {
    private Long idProduct;
    public String name;
    public Double price;
    
    //constructor producto con todos los datos
    public Product(Long idProduct, String name, Double price){
        this.idProduct = idProduct;
        this.name = name;
        this.price = price;
    }
    //metodo para agregar un producto a la db
    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }
   
    public Long getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Long idProduct) {
        this.idProduct = idProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    
    
    
    
}
