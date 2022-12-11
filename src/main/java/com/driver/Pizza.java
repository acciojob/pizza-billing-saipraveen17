package com.driver;

public class Pizza {
    
    private int price;
    private Boolean isVeg;
    private String bill;

    //Prices of extra add-Ons
    private int  extraCheesePrice;
    private int extraToppingPrice;
    private int takeAwayPrice;

    //To check the particular add-Ons added
    private boolean isCheeseAdded;
    private boolean isToppingAdded;
    private boolean isPaperBagAdded;
    private boolean isBillGenerated;


    public Pizza(Boolean isVeg){

        //Initialising the variables
        isCheeseAdded = false;
        isToppingAdded = false;
        isPaperBagAdded = false;
        isBillGenerated = false;

        extraCheesePrice = 80;
        takeAwayPrice = 20;

        this.isVeg = isVeg;

        //Toppings prices changes with isVeg option
        if(isVeg==true){
            price = 300;
            extraToppingPrice = 70;

        }
        else{
            price = 400;
            extraToppingPrice = 120;
        }

        bill = "Base Price Of The Pizza: "+price + "\n";

    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){

        if(isCheeseAdded==false){

            price = price + extraCheesePrice;
            isCheeseAdded = true; //To avoid adding multiple times
        }
    }

    public void addExtraToppings(){

        if(isToppingAdded==false){
            price += extraToppingPrice;
            isToppingAdded = true;  //To avoid adding multiple times
        }
    }

    public void addTakeaway(){

        if(isPaperBagAdded==false){
            price += takeAwayPrice;
            isPaperBagAdded = true; //To avoid adding multiple times
        }
    }

    public String getBill(){

        if(isBillGenerated==false) {

            isBillGenerated = true; //To avoid billing multiple times

            if (isCheeseAdded == true) {
                bill += "Extra Cheese Added: " + extraCheesePrice + "\n";
            }
            if (isToppingAdded == true) {
                bill += "Extra Toppings Added: " + extraToppingPrice + "\n";
            }
            if (isPaperBagAdded == true) {
                bill += "Paperbag Added: " + takeAwayPrice + "\n";
            }
            bill += "Total Price: "+ price + "\n";
        }
        return bill;
    }
}