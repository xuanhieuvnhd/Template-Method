public abstract class Meal {

    // phương thức mẫu
    public final void doMeal() {
        prepareIngredients();
        cook();
        eat();
        cleanUp();
    }

    public abstract void prepareIngredients();

    public abstract void cook();

    public void eat() {
        System.out.println("Mmm, vậy là tốt");
    }

    public abstract void cleanUp();

}
