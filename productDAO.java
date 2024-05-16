/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import lab_2.Product;
import util.DbConnection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Informatica7
 */
public class productDAO {

    //instansio los tipos de datos que voy a usar
    DbConnection connection;
    PreparedStatement preparedStatement;
    String query;

    //creo el metodo save en la clase productDAO
    public void save(Product product) {
        //creo el insert que voy a mandar a la base de datos
        query = "INSERT INTO products(name, price) VALUES ( ? , ?);";
        //conecto con la db
        DbConnection connection = new DbConnection();

        try {
            //uso el metodo preparedStatement que sirve para poder guardar informacion en la base de datos 
            preparedStatement = connection.getConnection().prepareStatement(query); //me conecto con el metodo getConnection y con el metodo prepareStatement envio la consulta
            preparedStatement.setString(1, product.getName()); //agrego el dato del name
            preparedStatement.setDouble(2, product.getPrice()); //agrego el dato del price
            preparedStatement.executeUpdate();  //actualizo la data q envie
            System.out.print("se agrego el producto");
        } catch (SQLException ex) {
        }
    }

    public void delete(int id) {
        query = "DELETE FROM products WHERE id_product = (?);";
        DbConnection connection = new DbConnection();
        try {
            preparedStatement = connection.getConnection().prepareStatement(query); //
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();  //actualizo la data q envie
            System.out.print("se elimino el producto");
        } catch (SQLException ex) {
            System.out.println("error " + ex.getMessage());
        }
    }

    public void update(Product product) {
        query = "UPDATE products SET name = (?), price = (?) WHERE id_product = (?);";
        DbConnection connection = new DbConnection();
        try{
           preparedStatement = connection.getConnection().prepareStatement(query);
           preparedStatement.setString(1, product.getName());
           preparedStatement.setDouble(2, product.getPrice());
           preparedStatement.setLong(3, product.getIdProduct());
           preparedStatement.executeUpdate();
           System.out.print("se actualizo");
        }
        catch (SQLException ex) {
        }
    }

}
