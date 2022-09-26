public class Main {
    public static void main(String[] args) {
       byte classLudmilaPavlovna = 23;
       byte classAnnaSergeevna = 27;
       byte classEkaterinaAndreevna = 30;
       short allSheetsOfPaper = 480;
       int sheetOfPaperPerOneStudent = allSheetsOfPaper/(classLudmilaPavlovna + classAnnaSergeevna + classEkaterinaAndreevna);
        System.out.println("На каждого ученика рассчитано " + sheetOfPaperPerOneStudent + " листов бумаги");
    }
}