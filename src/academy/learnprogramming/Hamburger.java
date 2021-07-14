package academy.learnprogramming;

public class Hamburger {
    private String breadType;
    private int meat;
    private int lettuce;
    private int tomato;
    private int carrot;
    private int price;

    public Hamburger(String breadType, int price) {
        this.breadType = breadType;
        this.meat = 0;
        this.lettuce = 0;
        this.tomato = 0;
        this.carrot = 0;
        this.price = price;
    }

    public double total(){
        double total = addMeat(meat) + addLettuce(lettuce) + addCarrot(carrot) + addTomato(tomato) + this.price;
        System.out.println("Your total is $ "+ total);
        return total;
    }
    public double addMeat(int meat){
        if(meat > 0){
            this.meat += meat;
            double price = meat * 3;
            return price;
        }else{
            return 0;
        }
    }

    public double addLettuce(int lettuce){
        if(lettuce > 0){
            this.lettuce += lettuce;
            double price = lettuce * 2.5;
            return price;
        }else{
            return 0;
        }
    }

    public double addTomato(int tomato){
        if(tomato > 0){
            this.tomato += tomato;
            double price = tomato * 2.5;
            return price;
        }else{
            return 0;
        }
    }

    public double addCarrot(int carrot){
        if(carrot > 0){
            this.carrot += carrot;
            double price = carrot * 3;
            return price;
        }else{
            return 0;
        }
    }

    public String getBreadType() {
        return breadType;
    }

    public int getMeat() {
        return meat;
    }

    public int getLettuce() {
        return lettuce;
    }

    public int getTomato() {
        return tomato;
    }

    public int getCarrot() {
        return carrot;
    }
}
