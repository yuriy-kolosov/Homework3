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
        short schoolClass_LP_Num = 23;
        short schoolClass_AS_Num = 27;
        short schoolClass_EA_Num = 30;
        short schoolPaperSum = 480;
        int schoolClass_All_Num;
        int pupilPaperSum;
        schoolClass_All_Num = schoolClass_LP_Num + schoolClass_AS_Num + schoolClass_EA_Num;
        pupilPaperSum = schoolPaperSum / schoolClass_All_Num;
        System.out.println("На каждого ученика рассчитано " + pupilPaperSum + " листов бумаги");
        System.out.println("          Задача 4");
        byte bottlePerf_Min2 = 16;
        int bottlePerf_Min20;
        int bottlePerf_Day;
        int bottlePerf_Day3;
        int bottlePerf_Day30;
        bottlePerf_Min20 = bottlePerf_Min2 / 2 * 20;
        bottlePerf_Day = bottlePerf_Min2 / 2 * 60 * 24;
        bottlePerf_Day3 = bottlePerf_Day * 3;
        bottlePerf_Day30 = bottlePerf_Day * 30;
        System.out.println("За 20 минут машина произвела " + bottlePerf_Min20 + " бутылок");
        System.out.println("За сутки машина произвела " + bottlePerf_Day + " бутылок");
        System.out.println("За 3 дня машина произвела " + bottlePerf_Day3 + " бутылок");
        System.out.println("За 1 месяц машина произвела " + bottlePerf_Day30 + " бутылок");
        System.out.println("          Задача 5");
        byte inkPot_School_Num = 120;
        byte inkPot_White_Class_Num = 2;
        byte inkPot_Brown_Class_Num = 4;
        int inkPot_White_Num;
        int inkPot_Brown_Num;
        int schoolClass_Num;
        schoolClass_Num = inkPot_School_Num / ( inkPot_White_Class_Num + inkPot_Brown_Class_Num );
        inkPot_White_Num = inkPot_White_Class_Num * schoolClass_Num;
        inkPot_Brown_Num = inkPot_Brown_Class_Num * schoolClass_Num;
        System.out.println("В школе, где "
                + schoolClass_Num + " классов, нужно "
                + inkPot_White_Num + " банок белой краски и "
                + inkPot_Brown_Num + " банок коричневой краски");
        System.out.println("          Задача 6");
        byte bananWeight_Piece = 80;
        byte milkWeight_100ml = 105;
        byte icecreamWeight_Piece = 100;
        byte eggWeight_Piece = 70;
        byte banan_Portion = 5;
        byte milk_Portion = 2;
        byte icecream_Portion = 2;
        byte egg_Portion = 4;
        int breakfastWeight_G;
        float breakfastWeight_Kg;
        breakfastWeight_G = bananWeight_Piece * banan_Portion
                + milkWeight_100ml * milk_Portion
                + icecreamWeight_Piece * icecream_Portion
                + eggWeight_Piece * egg_Portion;
        breakfastWeight_Kg = (float) breakfastWeight_G / 1000;
        System.out.println("Вес спортивного завтрака: " + breakfastWeight_G + "г (" + breakfastWeight_Kg + "кг)");
        System.out.println("          Задача 7");
        byte weightLoss_Kg = 7;
        int weightLoss_G;
        int weightLossDay_Var1_G = 250;
        int weightLossDay_Var2_G = 500;
        int weightLossDay_Var1_Num;
        int weightLossDay_Var2_Num;
        int weightLossDay_Average_Num;
        weightLoss_G = weightLoss_Kg * 1000;
        weightLossDay_Var1_Num = weightLoss_G / weightLossDay_Var1_G;
        weightLossDay_Var2_Num = weightLoss_G / weightLossDay_Var2_G;
        weightLossDay_Average_Num = ( weightLossDay_Var1_Num + weightLossDay_Var2_Num ) / 2;
        System.out.println("Дней на похудение: " + weightLossDay_Var1_Num + " (быстрый вариант)");
        System.out.println("Дней на похудение: " + weightLossDay_Var2_Num + " (медленный вариант)");
        System.out.println("Дней на похудение: " + weightLossDay_Average_Num + " (в среднем)");
        System.out.println("          Задача 8");
        int employeeSalary_Mary = 67760;
        int employeeSalary_Denis = 83690;
        int employeeSalary_Christina = 76230;
        float employeeSalary_Mary_New;
        float employeeSalary_Denis_New;
        float employeeSalary_Christina_New;
        float employeeSalary_Mary_Diff;
        float employeeSalary_Denis_Diff;
        float employeeSalary_Christina_Diff;
        employeeSalary_Mary_New = employeeSalary_Mary * 1.1f;
        employeeSalary_Denis_New = employeeSalary_Denis * 1.1f;
        employeeSalary_Christina_New = employeeSalary_Christina * 1.1f;
        employeeSalary_Mary_Diff = employeeSalary_Mary_New - employeeSalary_Mary;
        employeeSalary_Denis_Diff = employeeSalary_Denis_New - employeeSalary_Denis;
        employeeSalary_Christina_Diff = employeeSalary_Christina_New - employeeSalary_Christina;
        System.out.println("Маша теперь получает " + employeeSalary_Mary_New +
                " рублей. Годовой доход вырос на " + employeeSalary_Mary_Diff + " рублей");
        System.out.println("Денис теперь получает " + employeeSalary_Denis_New +
                " рублей. Годовой доход вырос на " + employeeSalary_Denis_Diff + " рублей");
        System.out.println("Кристина теперь получает " + employeeSalary_Christina_New +
                " рублей. Годовой доход вырос на " + employeeSalary_Christina_Diff + " рублей");
    }
}