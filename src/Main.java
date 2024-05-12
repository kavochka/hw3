public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
      int a = 1122122;
      byte b = 12;
      short c = 12121;
      long d = 121222211111222222L;
      float e = 112.122f;
      double f = 12.7123;
        System.out.println("Значение переменной a с типом int равно" + " " + a);
        System.out.println("Значение переменной b с типом byte равно" + " " + b);
        System.out.println("Значение переменной c с типом short равно" + " " + c);
        System.out.println("Значение переменной d с типом long равно" + " " + d);
        System.out.println("Значение переменной e с типом float равно" + " " + e);
        System.out.println("Значение переменной f с типом double равно" + " " + f);

        System.out.println("Задание 2");
        float fl = 27.12f;
        long ln = 987_678_549L;
        float fl2 = 2.786f;
        int nt  = 569;
        short sh = -159;
        short sh2 = 27897;
        byte bt = 67;

        System.out.println("Задание 3");
        int ludmilaClass = 23;
    int annaClass = 27;
            int ekaterinaClass = 30;

            int paper = 480;
            int allStuds = ludmilaClass + annaClass + ekaterinaClass;

            int paperPerStud = paper / allStuds;
        System.out.println("На каждого ученика рассчитано" + " " + paperPerStud + " " + "листов бумаги");

        System.out.println("Задание 4");
        int machineWorkPerMin = 16 / 2;
        int machineWorkPerTwentyMin = 16 * 20;
        int minsInOneDay = 60 * 24;
        int machineWorkPerOneDay = minsInOneDay * machineWorkPerMin;
        int machineWorkPerThreeDays = machineWorkPerOneDay * 3;
        int machineWorkPerMonth = machineWorkPerOneDay * 30;
        System.out.println("За 20 минут машина произвела " + machineWorkPerTwentyMin + " штук бутылок");
        System.out.println("За сутки машина произвела " + machineWorkPerOneDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + machineWorkPerThreeDays + " штук бутылок");
        System.out.println("За месяц машина произвела " + machineWorkPerMonth + " штук бутылок");

        System.out.println("Задание 5");
        int allAmount = 120;
        int whiteAmountPerClass = 2;
        int brownAmountPerClass = 4;
        int amountOfClasses = allAmount / (whiteAmountPerClass + brownAmountPerClass);
        int whiteAmount = amountOfClasses * whiteAmountPerClass;
        int brownAmount = amountOfClasses * brownAmountPerClass;
        System.out.println("В школе, где " + amountOfClasses + " классов, нужно " + whiteAmount + " банок белой краски и " + brownAmount + " банок коричневой краски");

        System.out.println("Задание 6");
        int oneBananaWeight = 80;
        int oneMilkWeight = 105;
        int oneIceCreamWeight = 100;
        int oneEggWeight = 70;

        int bananas = 5;
        int milk = 2;
        int iceCream = 2;
        int eggs = 4;

        int allBananaWeight = bananas * oneBananaWeight;
        int allMilkWeight = milk * oneMilkWeight;
        int allIceCreamWeight = iceCream * oneIceCreamWeight;
        int allEggsWeight = eggs * oneEggWeight;

        int summaryWeight = allBananaWeight + allMilkWeight + allIceCreamWeight + allEggsWeight;

        double summaryWeightInKilos = summaryWeight / 1000.0;
        System.out.println("Завтрак в граммах весит " + summaryWeight + " , в килограммах - " + summaryWeightInKilos);

        System.out.println("Задание 7");
        int targetWeightInKilos = 7;
        int targetWeightInGrams = targetWeightInKilos * 1000;
        double daysAmountWith500 = targetWeightInGrams / 500.0;
        double daysAmountWith250 = targetWeightInGrams / 250.0;
        double averageDaysAmount = (daysAmountWith250 + daysAmountWith500) / 2;

        System.out.println("Количество дней с похудения по 250 грамм " + daysAmountWith250);
        System.out.println("Количество дней с похудения по 500 грамм " + daysAmountWith500);
        System.out.println("Среднее количество дней с похудения " + averageDaysAmount);

        System.out.println("Задание 8");
        double salaryIncreasePercent = 1.1;
        double mashaSalary = 67760;
        double denisSalary = 83690;
        double kristinaSalary = 76230;

        double yearMashaSalary = mashaSalary * 12;
        double yearDenisSalary = denisSalary * 12;
        double yearKristinaSalary = kristinaSalary * 12;

        double newMashaSalary = mashaSalary * salaryIncreasePercent;
        double newDenisSalary = denisSalary * salaryIncreasePercent;
        double newKristinaSalary = kristinaSalary * salaryIncreasePercent;

        double yearNewMashaSalary = newMashaSalary * 12;
        double yearNewDenisSalary = newDenisSalary * 12;
        double yearNewKristinaSalary = newKristinaSalary * 12;
        System.out.printf("Маша теперь получает %s рублей. Годовой доход вырос на %s рублей.%n",
                newMashaSalary,
                yearNewMashaSalary - yearMashaSalary);
        System.out.printf("Денис теперь получает %s рублей. Годовой доход вырос на %s рублей.%n",
                newDenisSalary,
                yearNewDenisSalary - yearDenisSalary);
        System.out.printf("Кристина теперь получает %s рублей. Годовой доход вырос на %s рублей.%n",
                newKristinaSalary,
                yearNewKristinaSalary - yearKristinaSalary);

    }
}