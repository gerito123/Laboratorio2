/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab_2;

import dao.productDAO;
import util.DbConnection;

/**
 *
 * @author Informatica7
 */
public class Lab_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here       
//        DbConnection cn = new DbConnection();
//        cn.getConnection();

//crear un producto y guardarlo en la base de datos con el metodo save
        Product product = new Product("medias", 10.5);
        productDAO pdao = new productDAO();
        //pdao.save(product);
        pdao.update(product);
        
      

    }

}
