/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mystore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author Jaxca
 */
//Våra Arraylistor, innehåller produkterna och kundvagnens innehåll
public class ProductManager {
    private ArrayList<Product> products = new ArrayList<Product>();
    private ArrayList<Product> cart = new ArrayList<Product>();
    
    private Store store;
    private int currentProductIndex;
    
     //Samling (index) av våra produkter. innehåller id, mängd, namn, ursprung, pris, vikt, om det är i kilopris och om det är ekologiskt.
    public ProductManager(Store store){
        this.store = store;
        products.add(new Product(30, 10, "Banana", "Costa rica", 4, 0.079, false, true));  
        products.add(new Product(2, 30, "Apple", "France", 1.2, 0.1, false, false)); 
        products.add(new Product(3, 23, "Apricots", "Turkey", 6, 0.05, false, true)); 
        products.add(new Product(4, 15, "Avocado", "Mexico", 4, 0.069, false, false)); 
        products.add(new Product(5, 0, "Blackberries", "Sweden", 279, 0.002, true, false)); 
        products.add(new Product(6, 0, "Blueberries", "Sweden", 199, 5, true, true)); 
        products.add(new Product(7, 5, "Cantaloupe", "Spain", 35, 1.1, false, true)); 
        products.add(new Product(8, 0, "Cherries", "Hungary", 359, 10, true, false)); 
        products.add(new Product(9, 0, "Clementine", "Spain", 29, 50, true, true)); 
        products.add(new Product(10, 0, "Cranberries", "U.S.A", 319, 20, true, false)); 
        products.add(new Product(11, 3, "Durian", "Borneo", 59, 0.6, false, true)); 
        products.add(new Product(12, 7, "Grapes", "Spain", 12, 0.004, false, false)); 
        products.add(new Product(13, 49, "Lemon", "Spanien", 8, 0.099, false, true)); 
        products.add(new Product(14, 51, "Lime", "Brazil", 6, 0.085, false, false)); 
        products.add(new Product(15, 31, "Kiwifruit", "Italy", 9, 0.07, false, true)); 
        products.add(new Product(16, 0, "Kumquat", "China", 129, 13, true, false)); 
        products.add(new Product(17, 0,"Mandarin", "Spain", 29, 45, true, false)); 
        products.add(new Product(18, 13, "Mango", "Brazil", 19, 0.7, false, false)); 
        products.add(new Product(19, 0, "Nectarine", "South Africa", 29, 0.09, true, false)); 
        products.add(new Product(20, 0, "Orange", "Spain", 26, 2, true, true)); 
        products.add(new Product(21, 17, "Papaya", "Brazil", 39, 0.1, false, false)); 
        products.add(new Product(22, 0, "Peaches", "China", 54, 3, true, false)); 
        products.add(new Product(23, 0, "Pear", "Netherlands", 33, 9, true, true)); 
        products.add(new Product(24, 6, "Pineapple", "Costa Rica", 24, 0.95, false, true)); 
        products.add(new Product(25, 0, "Plums", "Romania", 46, 51, true, true)); 
        products.add(new Product(26, 2, "Pomegranate", "Turkey", 12, 0.35, false, false)); 
        products.add(new Product(27, 0, "Raspberries", "Colombia", 239, 12, true, true)); 
        products.add(new Product(28, 0, "Rhubarb", "Sweden", 145, 0, true, false)); 
        products.add(new Product(29, 0, "Strawberries", "Morocco", 63, 0.89, true, false)); 
        products.add(new Product(1, 1, "Watermelon", "Brazil", 29, 1.7, false, true));  
    }
    
    //knapp för att visa arraylistan "cart"s innehåll
    public void ShowCart(){
        int cost = 0;
        String output = "";
        
        for(Product product : cart){
            output += product.GetID() + " : " + product.GetName() +"\n";
            //Visar olika information beroende på om produkten är i kilopris
            if(product.IsPricePerKilo()){
                output +=  product.GetWeight() + "kg\nPrice: " + (product.GetPrice() * product.GetWeight()) +"\n";
            }
            else{
                output += "Quantity: " + product.GetQuantity() +
                        "\nPrice: " + (product.GetPrice() * product.GetQuantity()) +"kr\n";
            }
            output += "------------------------\n";
        }
        
        for(Product product : cart){
            if(product.IsPricePerKilo()){
                cost += product.GetPrice() * product.GetWeight();
            }
            else{
                cost += product.GetPrice() * product.GetQuantity();
            }
        }
        output += "Total cost: " + cost + "kr";
        
        store.UpdateOutput(output);
    }
    //Används för att bläddra mellan produkterna
    public void Increment(){
        currentProductIndex++;
        store.UpdateOutput(GetCurrentProductInfo());
    }
    public void Decrement(){
        currentProductIndex--;
        store.UpdateOutput(GetCurrentProductInfo());
    }
    //Knapp som låter en söka på det lägsta priset på en produkt
    public void SearchLowestPrice(double highest){
        String output = "";
        for(Product product : products){
            if(product.GetPrice() < highest){
                output += GetAllInfoFromProduct(product) + "\n"+
                        "-------------\n";
            }
        }
        store.UpdateOutput(output);
    }
    //Visar alla varor som har ecological = true
    public void ShowAllEcological(){
        String output = "";
        for(Product product : products){
            if(product.GetEcological()){
                output += GetAllInfoFromProduct(product) + "\n"+
                        "-------------\n";
            }
        }
        store.UpdateOutput(output);
        
    }
    public void AddProductToCart(int quantity, double weight){
        //Check if the product is a price per kilo one
        if(GetCurrentProduct().IsPricePerKilo()){
            //Check if there's enough fruits in store
            if(GetCurrentProduct().GetWeight() >= weight){
                
                for(int i = 0; i < cart.size(); i++){
                    
                    if(cart.get(i).GetID() == GetCurrentProduct().GetID()){
                        
                        GetCurrentProduct().AddWeight(-weight);
                        cart.get(i).AddWeight(weight);
                        store.UpdateOutput((GetCurrentProduct().GetName() + " added to cart!"));
                        return;
                    }
                }  
                
                cart.add(new Product(GetCurrentProduct(), weight));
                store.UpdateOutput((GetCurrentProduct().GetName() + " added to cart!"));
            }
            else{
                store.UpdateOutput("Not enough fruits in store, \nthere's only " + GetCurrentProduct().GetWeight() + "kg of " + GetCurrentProduct().GetName());
            }
        }
        else{
            //Check if there's enough fruits in store
            if(GetCurrentProduct().GetQuantity() >= quantity){
                
                for(int i = 0; i < cart.size(); i++){
                    
                    if(cart.get(i).GetID() == GetCurrentProduct().GetID()){
                        
                        GetCurrentProduct().AddQuantity(-quantity);
                        cart.get(i).AddQuantity(quantity);
                        store.UpdateOutput((GetCurrentProduct().GetName() + " added to cart!"));
                        return;
                    }
                }  
                cart.add(new Product(GetCurrentProduct(), quantity));
                store.UpdateOutput((GetCurrentProduct().GetName() + " added to cart!"));
            }
            else{
                store.UpdateOutput("Not enough fruits in store, \nthere's only " + GetCurrentProduct().GetWeight() + " of " + GetCurrentProduct().GetName());
            }
        }
        
    }
    public void GetRandomProduct() { 
        currentProductIndex = new Random().nextInt(products.size()-1);   
        store.UpdateOutput(GetCurrentProductInfo());
        if(GetCurrentProduct().IsPricePerKilo()){
            store.WeightLayout();
        }
        else {
            store.SingelLayout();
        }
        
    } 
    public void GetProductByID(int id){
        boolean exists = false;
        for(int i = 0; i < products.size(); i++){
            if(products.get(i).GetID() == id){
                currentProductIndex = i;
                exists = true;
                break;
            }
        }
        if(exists){
           store.UpdateOutput(GetCurrentProductInfo()); 
        }
        else{
            store.UpdateOutput("That product does not exist!");
        }
        if(GetCurrentProduct().IsPricePerKilo()){
            store.WeightLayout();
        }
        else {
            store.SingelLayout();
        }
    }
    public void GetProductByName(String name){
        boolean exists = false;
        for(int i = 0; i < products.size(); i++){
            if(products.get(i).GetName().toLowerCase().equals(name.toLowerCase())){
                currentProductIndex = i;
                exists = true;
                break;
            }
        }
        if(exists){
           store.UpdateOutput(GetCurrentProductInfo()); 
        }
        else{
            store.UpdateOutput("That product does not exist!");
        }
        if(GetCurrentProduct().IsPricePerKilo()){
            store.WeightLayout();
        }
        else {
            store.SingelLayout();
        }

        
    }
    public void Sort(){
        Collections.sort(products,new SortById());
        ShowAllProducts();
    }
    public void ShowAllProducts(){
        String output = "";
        for(Product product : products){
            output += product.GetID() + " : " + product.GetName() + "\n";
        }
        store.UpdateOutput(output);
    }
    public void AddProduct( int id, double quantity, String name, String heritage, double price, double weight, boolean isPricePerKilo, boolean ecological){

        
        for(Product product : products){
            if(product.GetID() == id){
                store.UpdateOutput("That product ID already exists!");
                return;
            }
            if(product.GetName().equals(name)){
                store.UpdateOutput("That product name already exists!");
                return;
            }
        }
        
        products.add(new Product(id, quantity, name, heritage, price, weight, isPricePerKilo, ecological));  
        
        currentProductIndex = products.size() -1;
        
        UpdateEcoNumbers();
        store.UpdateOutput(GetCurrentProductInfo());
    }
    public void UpdateEcoNumbers(){
        int eco = 0, non = 0;
        
        for(Product product : products){
            if(product.GetEcological()){
                eco++;
            }
            else{
                non++;
            }
        }
        
        store.UpadeEcoLabels(eco, non);
    }
    public void RemoveProduct(int id){
        
        for(int i = 0; i < products.size(); i++){
            if(products.get(i).GetID() == id){
                currentProductIndex = i;
                break;
            }
        }
        store.UpdateOutput("Product=id "+ GetCurrentProduct().GetID() + " had been deleted!");
        products.remove(currentProductIndex);
        
        
    }
    public String GetAllInfoFromProduct(Product product){
        String output = product.GetID() + 
                " : " + product.GetName() +
                "\n Price : " + product.GetPrice() +
                "\n Quantity : " + product.GetQuantity() +
                "\n Weight : " + product.GetWeight() +
                "\n Heritage : " + product.GetHeritage() +
                "\n Is price per kilo : " + product.IsPricePerKilo() +
                "\n Ecological : " + product.GetEcological();
        return output;
    }
    public String GetCurrentProductInfo(){
        String output = GetCurrentProduct().GetID() + 
                " : " + GetCurrentProduct().GetName() +
                "\n Price : " + GetCurrentProduct().GetPrice() +
                "\n Quantity : " + GetCurrentProduct().GetQuantity() +
                "\n Weight : " + GetCurrentProduct().GetWeight() +
                "\n Heritage : " + GetCurrentProduct().GetHeritage() +
                "\n Is price per kilo : " + GetCurrentProduct().IsPricePerKilo() +
                "\n Ecological : " + GetCurrentProduct().GetEcological();
        return output;
    }
    public Product GetCurrentProduct(){
        return products.get(currentProductIndex);
    }
    public void TotalAmountOfProducts(){
        int amountOfProducts = 0;
         for(Product product : products){  
            if(product.IsPricePerKilo()){
                amountOfProducts += product.GetWeight();
            }
            else{
                amountOfProducts += product.GetQuantity();
            }
        }
        store.TotalStorageSize(amountOfProducts);
    } 
    public void TotalCostOfStorage(){
        int cost = 0;
        for(Product product : products){  
            if(product.IsPricePerKilo()){
                cost += product.GetWeight() * product.GetPrice();
            }
            else{
                cost += product.GetQuantity() * product.GetPrice();
            }
        }
        
        store.TotalCostOfStorage(cost);
    }
}
