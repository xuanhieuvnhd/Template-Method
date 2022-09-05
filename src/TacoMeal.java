public class TacoMeal extends Meal {

    @Override
    public void prepareIngredients() {
        System.out.println("Lấy thịt bò xay và vỏ");
    }

    @Override
    public void cook() {
        System.out.println("Nấu thịt bò xay trong chảo");
    }

    @Override
    public void eat() {
        System.out.println("Bánh tét rất ngon");
    }

    @Override
    public void cleanUp() {
        System.out.println("Làm các món ăn");
    }

}
