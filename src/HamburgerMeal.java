public class HamburgerMeal extends Meal {

    @Override
    public void prepareIngredients() {
        System.out.println("Nhận bánh mì kẹp thịt, bánh mì và khoai tây chiên");
    }

    @Override
    public void cook() {
        System.out.println("Nấu bánh mì kẹp thịt trên bếp nướng và khoai tây chiên trong lò");
    }

    @Override
    public void cleanUp() {
        System.out.println("Vứt bỏ đĩa giấy");
    }

}