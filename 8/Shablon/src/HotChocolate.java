public class HotChocolate extends Beverage {
    private boolean hasMarshmallows;

    public HotChocolate(boolean hasMarshmallows) {
        this.hasMarshmallows = hasMarshmallows;
    }

    @Override
    protected void brew() {
        System.out.println("Смешивание горячего шоколада...");
    }

    @Override
    protected void addCondiments() throws Exception {
        if (!hasMarshmallows) {
            throw new Exception("Маршмеллоу отсутствуют!");
        }
        System.out.println("Добавление маршмеллоу...");
    }
}
