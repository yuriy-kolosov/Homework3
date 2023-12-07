public class Main {
    public static void main(String[] args)
    {
        System.out.println("Домашнее задание 3");
        System.out.println("          Задача 1");
        int i = 45;
        byte b = 7;
        short s = -322;
        long l = 207275L;
        float f = -534.67f;
        double d = 12843.026;
        System.out.println("Значение переменной i с типом int равно " + i);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной s с типом short равно " + s);
        System.out.println("Значение переменной l с типом long равно " + l);
        System.out.println("Значение переменной f с типом float равно " + f);
        System.out.println("Значение переменной d с типом double равно " + d);
        System.out.println("          Задача 2");
        f = 27.12f;
        l = 987_678_965_549L;
        float f2 = 2.786f;
        s = 569;
        short s2 = -159;
        short s3 = 27897;
        b = 67;
        System.out.println("f = " + f);
        System.out.println("l = " + l);
        System.out.println("f2 = " + f2);
        System.out.println("s = " + s);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);
        System.out.println("b = " + b);
        System.out.println("          Задача 3");
        short schoolClassLpNum = 23;
        short schoolClassAsNum = 27;
        short schoolClassEaNum = 30;
        short schoolPaperSum = 480;
        int schoolClassAllNum;
        int pupilPaperSum;
        schoolClassAllNum = schoolClassLpNum + schoolClassAsNum + schoolClassEaNum;
        pupilPaperSum = schoolPaperSum / schoolClassAllNum;
        System.out.println("На каждого ученика рассчитано " + pupilPaperSum + " листов бумаги");
        System.out.println("          Задача 4");
        byte bottlePerfMin2 = 16;
        int bottlePerfMin20;
        int bottlePerfDay;
        int bottlePerfDay3;
        int bottlePerfDay30;
        bottlePerfMin20 = bottlePerfMin2 / 2 * 20;
        bottlePerfDay = bottlePerfMin2 / 2 * 60 * 24;
        bottlePerfDay3 = bottlePerfDay * 3;
        bottlePerfDay30 = bottlePerfDay * 30;
        System.out.println("За 20 минут машина произвела " + bottlePerfMin20 + " бутылок");
        System.out.println("За сутки машина произвела " + bottlePerfDay + " бутылок");
        System.out.println("За 3 дня машина произвела " + bottlePerfDay3 + " бутылок");
        System.out.println("За 1 месяц машина произвела " + bottlePerfDay30 + " бутылок");
        System.out.println("          Задача 5");
        byte inkPotSchoolNum = 120;
        byte inkPotWhiteClassNum = 2;
        byte inkPotBrownClassNum = 4;
        int inkPotWhiteNum;
        int inkPotBrownNum;
        int schoolClassNum;
        schoolClassNum = inkPotSchoolNum / ( inkPotWhiteClassNum + inkPotBrownClassNum );
        inkPotWhiteNum = inkPotWhiteClassNum * schoolClassNum;
        inkPotBrownNum = inkPotBrownClassNum * schoolClassNum;
        System.out.println("В школе, где "
                + schoolClassNum + " классов, нужно "
                + inkPotWhiteNum + " банок белой краски и "
                + inkPotBrownNum + " банок коричневой краски");
        System.out.println("          Задача 6");
        byte bananWeightPiece = 80;
        byte milkWeight100Ml = 105;
        byte icecreamWeightPiece = 100;
        byte eggWeightPiece = 70;
        byte bananPortion = 5;
        byte milkPortion = 2;
        byte icecreamPortion = 2;
        byte eggPortion = 4;
        int breakfastWeightG;
        float breakfastWeightKg;
        breakfastWeightG = bananWeightPiece * bananPortion
                + milkWeight100Ml * milkPortion
                + icecreamWeightPiece * icecreamPortion
                + eggWeightPiece * eggPortion;
        breakfastWeightKg = (float) breakfastWeightG / 1000;
        System.out.println("Вес спортивного завтрака: " + breakfastWeightG + "г (" + breakfastWeightKg + "кг)");
        System.out.println("          Задача 7");
        byte weightLossKg = 7;
        int weightLossG;
        int weightLossDayVar1G = 250;
        int weightLossDayVar2G = 500;
        int weightLossDayVar1Num;
        int weightLossDayVar2Num;
        int weightLossDayAverageNum;
        weightLossG = weightLossKg * 1000;
        weightLossDayVar1Num = weightLossG / weightLossDayVar1G;
        weightLossDayVar2Num = weightLossG / weightLossDayVar2G;
        weightLossDayAverageNum = ( weightLossDayVar1Num + weightLossDayVar2Num ) / 2;
        System.out.println("Дней на похудение: " + weightLossDayVar1Num + " (быстрый вариант)");
        System.out.println("Дней на похудение: " + weightLossDayVar2Num + " (медленный вариант)");
        System.out.println("Дней на похудение: " + weightLossDayAverageNum + " (в среднем)");
        System.out.println("          Задача 8");
        int employeeSalaryMary = 67760;
        int employeeSalaryDenis = 83690;
        int employeeSalaryChristina = 76230;
        float employeeSalaryMaryNew;
        float employeeSalaryDenisNew;
        float employeeSalaryChristinaNew;
        float employeeSalaryMaryDiff;
        float employeeSalaryDenisDiff;
        float employeeSalaryChristinaDiff;
        employeeSalaryMaryNew = employeeSalaryMary * 1.1f;
        employeeSalaryDenisNew = employeeSalaryDenis * 1.1f;
        employeeSalaryChristinaNew = employeeSalaryChristina * 1.1f;
        employeeSalaryMaryDiff = employeeSalaryMaryNew - employeeSalaryMary;
        employeeSalaryDenisDiff = employeeSalaryDenisNew - employeeSalaryDenis;
        employeeSalaryChristinaDiff = employeeSalaryChristinaNew - employeeSalaryChristina;
        System.out.println("Маша теперь получает " + employeeSalaryMaryNew +
                " рублей. Годовой доход вырос на " + employeeSalaryMaryDiff + " рублей");
        System.out.println("Денис теперь получает " + employeeSalaryDenisNew +
                " рублей. Годовой доход вырос на " + employeeSalaryDenisDiff + " рублей");
        System.out.println("Кристина теперь получает " + employeeSalaryChristinaNew +
                " рублей. Годовой доход вырос на " + employeeSalaryChristinaDiff + " рублей");
    }
}