package academy.learnprogramming;

import java.util.Scanner;

class HealthyBurger extends Hamburger{
    public HealthyBurger() {
        super("Brown rye bread roll",20);
    }
}

class DeluxeBurger extends Hamburger{
    private int chips;
    private int drinks;
    private int price;
    public DeluxeBurger(){
        super("Normal bread",25);
        this.chips = 0;
        this.drinks = 0;
    }

    public double addChips(int chips){
        double price = chips * 3;
        return price;
    }

    public double addDrinks(int drinks){
        double price = drinks * 2;
        return price;
    }

    @Override
    public double total() {
        double total = addChips(chips) + addDrinks(drinks) + 25;
        System.out.println("Your total is $ "+ total);
        return total;
    }
}
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        while (true){
            System.out.println("What Hamburger do u want to order ?" + "\n" + "1. Normal Hamburger\n" + "2. Healthy Hamburger\n" + "3. Deluxe Hamburger\n" );
            int order = scan.nextInt();
            scan.nextLine();
            if(order == 1){
                Hamburger burger = new Hamburger("Normal Bread",15);
                for(int i = 0; i <=4; i++){
                    System.out.println("What additional things u want to add ?\n" + "1. Meat\n" + "2. Lettuce\n" + "3. Tomato\n" + "4. Carrot\n");
                    int add = scan.nextInt();
                    scan.nextLine();
                    if(add == 1){
                        System.out.println("How many meat ?\n");
                        boolean addMeat = scan.hasNextInt();
                        int addMeatNum = scan.nextInt();
                        scan.nextLine();
                        if(addMeat){
                            if(addMeatNum > 0 && addMeatNum <=4){
                                burger.addMeat(addMeatNum);
                                i += addMeatNum;
                                continue;
                            }
                        }else{
                            System.out.println("Please enter a Number");
                            break;
                        }

                    }else if(add == 2){
                        System.out.println("How many lettuce ?\n");
                        boolean addLettuce = scan.hasNextInt();
                        int addLettuceNum = scan.nextInt();
                        scan.nextLine();
                        if(addLettuce){
                            if(addLettuceNum > 0 && addLettuceNum <=4){
                                burger.addMeat(addLettuceNum);
                                i += addLettuceNum;
                                continue;
                            }
                        }else{
                            System.out.println("Please enter a Number");
                            break;
                        }
                    }else if(add == 3){
                        System.out.println("How many tomato ?\n");
                        boolean addTomato = scan.hasNextInt();
                        int addTomatoNum = scan.nextInt();
                        scan.nextLine();
                        if(addTomato){
                            if(addTomatoNum > 0 && addTomatoNum <=4){
                                burger.addMeat(addTomatoNum);
                                i += addTomatoNum;
                                continue;
                            }
                        }else{
                            System.out.println("Please enter a Number");
                            break;
                        }
                    }else if(add == 4){
                        System.out.println("How many carrot ?\n");
                        boolean addCarrot = scan.hasNextInt();
                        int addCarrotNum = scan.nextInt();
                        scan.nextLine();
                        if(addCarrot){
                            if(addCarrotNum > 0 && addCarrotNum <=4){
                                burger.addMeat(addCarrotNum);
                                i += addCarrotNum;
                                continue;
                            }
                        }else{
                            System.out.println("Please enter a Number");
                            break;
                        }
                    }
                }
                burger.total();
                break;

            }else if(order == 2){
                HealthyBurger healthyBurger = new HealthyBurger();
                for(int i = 0; i <=6; i++){
                    System.out.println("What additional things u want to add ?\n" + "1. Meat\n" + "2. Lettuce\n" + "3. Tomato\n" + "4. Carrot\n");
                    int add = scan.nextInt();
                    scan.nextLine();
                    if(add == 1){
                        System.out.println("How many meat ?\n");
                        boolean addMeat = scan.hasNextInt();
                        int addMeatNum = scan.nextInt();
                        scan.nextLine();
                        if(addMeat){
                            if(addMeatNum > 0 && addMeatNum <=4){
                                healthyBurger.addMeat(addMeatNum);
                                i += addMeatNum;
                                continue;
                            }
                        }else{
                            System.out.println("Please enter a Number");
                            break;
                        }

                    }else if(add == 2){
                        System.out.println("How many lettuce ?\n");
                        boolean addLettuce = scan.hasNextInt();
                        int addLettuceNum = scan.nextInt();
                        scan.nextLine();
                        if(addLettuce){
                            if(addLettuceNum > 0 && addLettuceNum <=4){
                                healthyBurger.addMeat(addLettuceNum);
                                i += addLettuceNum;
                                continue;
                            }
                        }else{
                            System.out.println("Please enter a Number");
                            break;
                        }
                    }else if(add == 3){
                        System.out.println("How many tomato ?\n");
                        boolean addTomato = scan.hasNextInt();
                        int addTomatoNum = scan.nextInt();
                        scan.nextLine();
                        if(addTomato){
                            if(addTomatoNum > 0 && addTomatoNum <=4){
                                healthyBurger.addMeat(addTomatoNum);
                                i += addTomatoNum;
                                continue;
                            }
                        }else{
                            System.out.println("Please enter a Number");
                            break;
                        }
                    }else if(add == 4){
                        System.out.println("How many carrot ?\n");
                        boolean addCarrot = scan.hasNextInt();
                        int addCarrotNum = scan.nextInt();
                        scan.nextLine();
                        if(addCarrot){
                            if(addCarrotNum > 0 && addCarrotNum <=4){
                                healthyBurger.addMeat(addCarrotNum);
                                i += addCarrotNum;
                                continue;
                            }
                        }else{
                            System.out.println("Please enter a Number");
                            break;
                        }
                    }
                }
                healthyBurger.total();
                break;

            }else if(order == 3){
                DeluxeBurger deluxeBurger = new DeluxeBurger();
                for(int i = 0; i <=1; i++){
                    System.out.println("What additional things u want to add ?\n" + "1. Chips\n" + "2. Drinks\n");
                    int add = scan.nextInt();
                    scan.nextLine();
                    if(add == 1){
                        deluxeBurger.addChips(i);
                        break;
                    }else if(add == 2){
                        deluxeBurger.addDrinks(i);
                        break;
                    }else{
                        System.out.println("Please enter choose between both");
                        continue;
                    }
                }
                deluxeBurger.total();
                break;
            }
            else{
                System.out.println("Please re enter a number betweeen 1 - 3");
                continue;
            }
        }

    }
}
