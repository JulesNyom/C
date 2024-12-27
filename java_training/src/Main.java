public class Main {
 
    public static void main(String[] args) {
        Fridge fridge = new Fridge();
       Food food1 = new Food("hamburger");
       Food food2 = new Food("Fries");
       fridge.stock(food1);
       fridge.stock(food2);
    }

}