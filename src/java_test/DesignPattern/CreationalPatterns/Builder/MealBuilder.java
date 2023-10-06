package java_test.DesignPattern.CreationalPatterns.Builder;

public class MealBuilder {
    public Meal makeVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Cola());
        return meal;
    }

    public Meal makeMeatMeal(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }

}
