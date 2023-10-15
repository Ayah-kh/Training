package builder2;

public class MealChoice {
    public static void main(String[] args) {
        Meal compo1= new Meal();
        compo1.addItem(new VegBurger()).addItem(new ChickenBurger())
                .addItem(new Coke()).addItem(new Pepsi());
        System.out.println("compo1.getCost() = " + compo1.getCost());
        compo1.showItems();
    }
}
