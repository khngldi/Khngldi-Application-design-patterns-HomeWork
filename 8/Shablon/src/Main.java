public class Main {
    public static void main(String[] args) {
        Beverage tea = new Tea(true);
        System.out.println("Приготовление чая:");
        tea.prepareRecipe();

        System.out.println();

        Beverage coffee = new Coffee("миндальное", true);
        System.out.println("Приготовление кофе с миндальным молоком:");
        coffee.prepareRecipe();

        System.out.println();

        Beverage hotChocolate = new HotChocolate(false);
        System.out.println("Приготовление горячего шоколада:");
        hotChocolate.prepareRecipe();
    }
}
