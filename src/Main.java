public class Main {
    public static void main(String[] args) {
       short banana = 5;
       short weightOneBanana = 80;
       short milk = 200;
       short weigh100MlMilk = 105;
       short iceCreamSundae = 2;
       short weightOneBriquetteIceCream = 100;
       short egg = 4;
       short weightOneEgg = 70;

       float weightBreakfast = (banana * weightOneBanana + milk * weigh100MlMilk/100 + iceCreamSundae * weightOneBriquetteIceCream +
               egg * weightOneEgg)/1000f;
        System.out.println("Вес одного спорт-завтрака " + weightBreakfast + " кг");






    }
}



