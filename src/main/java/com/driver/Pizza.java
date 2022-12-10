package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int base, cheese, toppings, paperBag;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        cheese = 0;
        toppings = 0;
        paperBag = 0;
        if(isVeg) {
            base = 300;
            price = base;
        }
        else {
            base = 400;
            price = base;
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(cheese>0) return;
        cheese += 80;
        price += cheese;
    }

    public void addExtraToppings(){
        if(toppings>0) return;
        if(isVeg) {
            toppings += 70;
            price += toppings;
        }
        else {
            toppings += 120;
            price += toppings;
        }
    }

    public void addTakeaway(){
        if(paperBag>0) return;
        paperBag += 20;
        price += paperBag;
    }

    public String getBill(){
        String basePrice  = "Base Price Of The Pizza: "+base;
        String cheesePrice = "Extra Cheese Added: "+cheese;
        String toppingsPrice = "Extra Toppings Added: "+toppings;
        String paperPrice = "Paperbag Added: "+paperBag;
        String totalPrice = "Total Price: "+price;
        if(cheese>0&&toppings>0&&paperBag>0) {
            return basePrice+'\n'+cheesePrice+'\n'+toppingsPrice+'\n'+paperPrice+'\n'+totalPrice;
        }
        else if(cheese>0&&toppings>0) {
            return basePrice+'\n'+cheesePrice+'\n'+toppingsPrice+'\n'+totalPrice;
        }
        else if(toppings>0&&paperBag>0) {
            return basePrice+'\n'+toppingsPrice+'\n'+paperPrice+'\n'+totalPrice;
        }
        else {
            return basePrice+'\n'+cheesePrice+'\n'+paperPrice+'\n'+totalPrice;
        }
    }
}
