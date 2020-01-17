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
//deklarationer av variabler
public class Product  {
    
    private int ID;
    private double quantity; 
    private String name;
    private String heritage;  
    private double price;
    private double weight;
    private boolean isPricePerKilo;
    private boolean ecological;
   
    //Metod som hänvisar till den lokala klassens variabel
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
    //-II-
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
    
      //Konstruktor för hela programmet
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
    //returnar IDs värde
    public int GetID(){
        return this.ID;
    }
    //returnar Quantitys värde
    public double GetQuantity(){
        return quantity;
    } 
    //returnar Names värde
    public String GetName(){
        return this.name;
    }
    //returnar Heritages värde
    public String GetHeritage(){
        return this.heritage;
    }
    //returnar Prices värde
    public double GetPrice(){
        return this.price;
    }
    //returnar Weights värde
    public double GetWeight(){
        return this.weight;
    }
    //returnar IsPricePerKilos värde
    public boolean IsPricePerKilo(){
        return this.isPricePerKilo;
    }
    //returnar Ecologicals värde
    public boolean GetEcological(){
        return this.ecological;
    }
    //Metod för att förandra Weights värde
    public void AddWeight(double weight){
        this.weight += weight;
    }
    //Metod för att förändra Quantitys värde
    public void IncrementQuantity(){
        this.quantity++;
    }
    //Metod för att förändra Quantitys värde
    public void AddQuantity(int quantity){
        this.quantity += quantity;
    }

}

