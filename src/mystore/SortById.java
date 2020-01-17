/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mystore;
import java.util.Comparator;
/**
 *
 * @author Jaxca
 */
//Jämför produkt a och b och returnerar skillnaden så att de sorteras.
public class SortById implements Comparator<Product>{
    public int compare(Product a, Product b){
        return a.GetID() - b.GetID();
    }
    
}
