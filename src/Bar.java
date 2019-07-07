public class Bar {
    public static void main(String[] args) {
        Drink malibu = new Drink();
        malibu.drinkName = "Malibu";
        malibu.drinkPrize = 15.29;
        malibu.noAlcohol = true;
        malibu.nameIngriditiens1 = "Liqueur Malibu";
        malibu.nameIngriditiens2 = "Orange Juice";
        malibu.nameIngriditiens3 = "Vodka";
        malibu.volume1 = 40;
        malibu.volume2 = 100;
        malibu.volume3 = 30;
        int sum = malibu.volume3 + malibu.volume2 + malibu.volume1;

        System.out.printf("Nazwa drinka: %s\n",malibu.drinkName);
        System.out.printf("Cena drinka: %s\n",malibu.drinkPrize);
        System.out.printf("Drink alkoholowy?: %s \n",malibu.noAlcohol);
        System.out.printf("Składniki drinka:\n %s\n %s\n %s",malibu.nameIngriditiens1, malibu.nameIngriditiens2, malibu.nameIngriditiens3);
        System.out.printf("W ilościach odpowiednio:\n %s\n %s\n %s\n",malibu.volume1, malibu.volume2, malibu.volume3);
        System.out.printf("Cała objętość drinka to:\n %s", sum);

    }
}
