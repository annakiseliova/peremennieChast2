public class Main {
    public static void main(String[] args) {
       short weightNeedToLoose = 7;
       short looseInDay1 = 250;
       short looseInDay2 = 500;
       int daysLoose250Gram = (weightNeedToLoose * 1000) / looseInDay1;
       int daysLoose500Gram = (weightNeedToLoose * 1000) / looseInDay2;
        System.out.println("Для похудения на 7 кг, при потере 250 грамм веса в день понадобится "
                + daysLoose250Gram + " дней");
        System.out.println("Для похудения на 7 кг, при потере 500 грамм веса в день понадобится "
                + daysLoose500Gram + " дней");
        int daysSred = (daysLoose250Gram +daysLoose500Gram)/2;
        System.out.println("Для похудения на 7 кг, в среднем понадобится "
                + daysSred + " дней");
    }
}



