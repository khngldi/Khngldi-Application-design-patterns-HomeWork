public class Coffee extends Beverage {
    private String milkType;
    private boolean ingredientsAvailable;

    public Coffee(String milkType, boolean ingredientsAvailable) {
        this.milkType = milkType;
        this.ingredientsAvailable = ingredientsAvailable;
    }

    @Override
    protected void brew() {
        System.out.println("Заваривание кофе...");
    }

    @Override
    protected void addCondiments() throws Exception {
        if (!ingredientsAvailable) {
            throw new Exception("Отсутствуют необходимые ингредиенты (сахар или молоко).");
        }
        System.out.println("Добавление сахара и " + milkType + " молока...");
    }

    @Override
    protected boolean customerWantsCondiments() {
        return true;
    }
}
