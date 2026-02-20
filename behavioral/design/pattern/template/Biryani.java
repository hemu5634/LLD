package behavioral.design.pattern.template;

public class Biryani extends Recipe{
    @Override
    void getIngredients() {
        System.out.println("Getting all the ingredients for biryani");
    }

    @Override
    void cooking() {
        System.out.println("Cooking Biryani");
    }
}
