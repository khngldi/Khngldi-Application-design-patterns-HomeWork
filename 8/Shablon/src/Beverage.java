public abstract class Beverage {
    public void prepareRecipe() {
       try { boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    } catch (Exception e) {
        System.out.println("Ошибка при приготовлении напитка: " + e.getMessage());
    }
}

    private void boilWater() {
        System.out.println("Кипячение воды...");
    }

    private void pourInCup() {
        System.out.println("Наливание в чашку...");
    }

    protected abstract void brew();
    protected abstract void addCondiments() throws Exception;

    protected boolean customerWantsCondiments() {
        return true;
    }
}
