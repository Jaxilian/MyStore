/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mystore;
/**
 *
 * @author Jaxca
 */
public class Product  {
    
    private int ID;
    private double quantity; 
    private String name;
    private String heritage;  
    private double price;
    private double weight;
    private boolean isPricePerKilo;
    private boolean ecological;
   
    
    public Product( Product copy, int quantity){
        this.ID = copy.ID;
        this.quantity = quantity;
        this.name = copy.name;
        this.heritage =copy.heritage;
        this.price = copy.price;
        this.weight = 0;
        this.isPricePerKilo = copy.isPricePerKilo;
        this.ecological = copy.ecological;
    };
     public Product( Product copy, double weight){
        this.ID = copy.ID;
        this.quantity = 0;
        this.name = copy.name;
        this.heritage =copy.heritage;
        this.price = copy.price;
        this.weight = weight;
        this.isPricePerKilo = copy.isPricePerKilo;
        this.ecological = copy.ecological;
    };
    
    
    public Product( int id, double quantity, String name, String heritage, double price, double weight, boolean isPricePerKilo, boolean ecological){
        this.ID = id;
        this.quantity = quantity;
        this.name = name;
        this.heritage = heritage;
        this.price = price;
        this.weight = weight;
        this.isPricePerKilo = isPricePerKilo;
        this.ecological = ecological;
    }
    public int GetID(){
        return this.ID;
    }
    public double GetQuantity(){
        return quantity;
    } 
    public String GetName(){
        return this.name;
    }  
    public String GetHeritage(){
        return this.heritage;
    }
    public double GetPrice(){
        return this.price;
    }
    public double GetWeight(){
        return this.weight;
    }
    public boolean IsPricePerKilo(){
        return this.isPricePerKilo;
    }
    public boolean GetEcological(){
        return this.ecological;
    }
    public void AddWeight(double weight){
        this.weight += weight;
    }
    public void AddQuantity(int quantity){
        this.quantity += quantity;
    }

}
