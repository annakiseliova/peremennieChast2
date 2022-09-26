public class Main {
    public static void main(String[] args) {
        int machinePerfomance = 16;
        short time = 2;
        int machinePerfomanceInOneMinute = machinePerfomance / time;
        machinePerfomance = machinePerfomanceInOneMinute * 20;
        System.out.println("За 20 минут машина произвела бутылок " + machinePerfomance +" штук");
        machinePerfomance = machinePerfomanceInOneMinute * 24 * 60;
        System.out.println("За сутки машина произвела бутылок " + machinePerfomance +" штук");
        machinePerfomance = machinePerfomanceInOneMinute * 24 * 60 * 3;
        System.out.println("За 3 дня машина произвела бутылок " + machinePerfomance +" штук");
        machinePerfomance = machinePerfomanceInOneMinute * 24 * 60 * 30;
        System.out.println("За месяц машина произвела бутылок " + machinePerfomance +" штук");
    }
}



