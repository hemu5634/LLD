package behavioral.design.pattern.template;

public class KadhaiPaneer extends Recipe{
    @Override
    void getIngredients() {
        System.out.println("Getting all the ingredient for Kadhai Paneer");
    }

    @Override
    void cooking() {
        System.out.println("Cooking Kadhai Paneer");
    }
}
