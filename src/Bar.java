public class Bar {
    public static void main(String[] args) {
        Drink malibu = new Drink();
        malibu.drinkName = "Malibu";
        malibu.drinkPrize = 15.29;
        malibu.noAlcohol = true;
        malibu.ingredient = new Ingredients();

        malibu.ingredient.ingredient1 = "Liqueur Malibu";
        malibu.ingredient.ingredient2 = "Orange Juice";
        malibu.ingredient.ingredient3 = "Vodka";
        malibu.ingredient.volume1 = 40;
        malibu.ingredient.volume2 = 100;
        malibu.ingredient.volume3 = 30;
        int sum = malibu.ingredient.volume1 + malibu.ingredient.volume2 + malibu.ingredient.volume3;

        System.out.printf("Nazwa drinka: %s\n",malibu.drinkName);
        System.out.printf("Cena drinka: %s\n",malibu.drinkPrize);
        System.out.printf("Drink alkoholowy?: %s \n",malibu.noAlcohol);
        System.out.printf("Składniki drinka:\n %s\n %s\n %s\n",malibu.ingredient.ingredient1, malibu.ingredient.ingredient2, malibu.ingredient.ingredient3);
        System.out.printf("W ilościach odpowiednio:\n %s\n %s\n %s\n",malibu.ingredient.volume1, malibu.ingredient.volume2, malibu.ingredient.volume3);
        System.out.printf("Cała objętość drinka to:\n %s", sum);

    }
}
