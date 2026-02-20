package behavioral.design.pattern.template;

abstract class Recipe {
    final void prepare(){
        System.out.println();
        getIngredients();
        cuttingAndPreparing();
        cooking();
        serving();
    }
    void cuttingAndPreparing(){
        System.out.println("Start cutting all the vegatables and prepare to cook");
    }
    void serving(){
        System.out.println("Serving the prepared Dish");
    }
    abstract void getIngredients();
    abstract void cooking();
}
