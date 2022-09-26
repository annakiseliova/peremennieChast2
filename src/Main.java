public class Main {
    public static void main(String[] args) {
        byte allCansOfPaint = 120;
        byte cansOfPaintWhite = 2;
        byte cansOfPaintBrown = 4;
        int amountOfClasses = allCansOfPaint/(cansOfPaintWhite+cansOfPaintBrown);
        int allCansOfPaintWhite = cansOfPaintWhite * amountOfClasses;
        int allcansOfPaintBrown = cansOfPaintBrown * amountOfClasses;
        System.out.println("В школе где " + amountOfClasses + " классов, нужно " + allCansOfPaintWhite
                + " банок белой краски и " + allcansOfPaintBrown + " банок коричневой краски");




    }
}



