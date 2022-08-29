public class Main {
    public static void main(String[] args) {
        byte eegs = 12;
        System.out.println("Значение переменной eegs с типом byte равно " + eegs + " шт.");

        int dog = 10;
        System.out.println("Значение переменной dog с типом int равно " + dog + " шт.");

        short cat = 5;
        System.out.println("Значение переменной cat с типом short равно " + cat + " шт.");

        long yearDays = 365L;
        System.out.println("Значение переменной yearDays с типом long равно " + yearDays + " дней");

        float paper = 32.65f;
        System.out.println("Значение переменной paper с типом float равно " + paper + " шт.");

        double frog = 2.75;
        System.out.println("Значение переменной frog с типом double равно " + frog + " шт.");

//Задача 2

        float a = 27.12f;
        long b = 987_678_965_549L;
        double c = 2.786;
        boolean dogIsAdult = dog > 15;
        System.out.println(dogIsAdult);
        short e = 569;
        short f = -159;
        int g = 27897;
        byte h = 67;


//Задача 3

        byte ludmilaPavlovna = 23;
        byte annaSergeevna = 27;
        byte ekaterbnaAndreevna = 30;
        int totalPupils = ludmilaPavlovna + annaSergeevna + ekaterbnaAndreevna;
        System.out.println("Всего " + totalPupils + " учеников");
        int papersList = 480;
        int papersPupil = 480 / totalPupils;
        System.out.println("На каждого ученика рассчитано " + papersPupil + " листов бумаги");


//Задача 4

    byte bottle = 16;
    byte oneMinuts = 16 / 2;
    int twentyMinuts = oneMinuts * 20;
        System.out.println("За 20 минут работы машины произвела бутылок " + twentyMinuts + " штук");
    int day = oneMinuts * 60 * 24;
        System.out.println("За сутки работы машины произвела бутылок " + day + " штук");
    int threeDay = day * 3;
        System.out.println("За три дня работы машины произвела бутылок " + threeDay + " штук");
    int oneMonth = threeDay * 10;
        System.out.println("За один месяц работы машины произвела бутылок " + oneMonth + " штук");

//Задача 5

    int paints = 120;
    int classOneBroune = 4;
    int classOneWhite = 2;
    int totalClassOne = classOneBroune + classOneWhite;
        System.out.println("Всего на один класс " + totalClassOne + " банок");
    int totalClass = paints / totalClassOne;
        //System.out.println("Всего классов " + totalClass + " школе");
    int totalBroune = totalClass * 4;
    int totalWhite = totalClass * 2;
       // System.out.println("Всего коричневой краски нужно " + totalBroune + " школе");
        System.out.println("В школе, где " + totalClass + " классов, нужно " + totalWhite + " банок белой краски и " + totalBroune + " банок коричневой краски");


//Задача 6

    int bananas = 5 * 80;
    int milk = 2 * 105;
    int iceCream = 2 * 100;
    int eeg = 4 * 70;
    float totalWeight = bananas + milk + iceCream + eeg;
        System.out.println("Спорт-завтрак весит " + totalWeight + " грамм");
    float weight = totalWeight / 1000;
        System.out.println("Спорт-завтрак весит " + weight + " кг!");

//Задача 7

    float totallWeight = 7.0f;
    float weightOne = 0.25f;
    float weightTwo = 0.5f;
    float totalDaysOne = totallWeight / weightOne;
        System.out.println("Спортсмен сбросит семь кг. за " + totalDaysOne + " дней, если ежедневно будет сбрасывать по 250 гр.");
    float  totalDaysTwo = totallWeight / weightTwo;
        System.out.println("Спортсмен сбросит семь кг. за " + totalDaysTwo + " дней, если ежедневно будет сбрасывать по 500 гр.");
    float totalDaysTree = (totalDaysOne + totalDaysTwo) / 2;
        System.out.println( + totalDaysTree + " дней в среднем может потребоваться, чтоб добиться результата");


//Задача 8.

        //зарплата до повышения
    int employeeMasha = 67760;
    int employeeDenis = 83690;
    int employeeKristina = 76230;
    //зарплата после повышения
    double wageMasha = employeeMasha * 1.1;
    double wageDenis = employeeDenis * 1.1;
    double wageKristina = employeeKristina * 1.1;
    //Зарпата за год до повышения
    int totalMasha = employeeMasha * 12;
    int totalDenis = employeeDenis * 12;
    int totalKristina = employeeKristina * 12;
    //зарплата за год после повышения
    double totalMashaOne = wageMasha * 12;
    double totalDenisOne = wageDenis * 12;
    double totalKristinaOne =wageKristina * 12;
    //Разница между годовой зарплатой
    double totalWageMasha = totalMashaOne - totalMasha;
    double totalWageDenis = totalDenisOne - totalDenis;
    double totalWageKristina = totalKristinaOne - totalKristina;

        System.out.println("Маша теперь получает " + wageMasha + " рублей. Годовой доход вырос на " + totalWageMasha + " рублей");
        System.out.println("Денис теперь получает " + wageDenis + " рублей. Годовой доход вырос на " + totalWageDenis + " рублей");
        System.out.println("Кристина теперь получает " + wageKristina + " рублей. Годовой доход вырос на " + totalWageKristina + " рублей");







    }
}