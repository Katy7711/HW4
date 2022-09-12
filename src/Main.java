public class Main {
    public static void main(String[] args) {
        int mouse = 246897;
        System.out.println("Значение переменной mouse с типом int равно " + mouse);
        byte flowers = 15;
        System.out.println("Значение переменной flowers с типом byte равно " + flowers);
        short finger = 20;
        System.out.println("Значение переменной finger с типом short равно " + finger);
        long tree = 87565656L;
        System.out.println("Значение переменной tree с типом long равно " + tree);
        float dogWeight = 4.5F;
        System.out.println("Значение переменной dogWeight с типом float равно " + dogWeight);
        double childAge = 1.2;
        System.out.println("Значение переменной childAge с типом double равно " + childAge);
        double saltWeight = 27.12;
        short star = 987;
        short birds = 678;
        int cat = 965;
        int bear = 549;
        byte person = 2;
        short table = 786;
        int age = 30;
        boolean child = age <= 18;
        System.out.println(child);
        int spoon = 569;
        short moneyOnThePhone = - 159;
        int horse = 27897;
        byte widows = 67;

        byte lP = 23;
        byte aS = 27;
        byte eA = 30;
        int allStudents = lP + aS + eA;
        int paperForEachStudent = 480 / allStudents;
        System.out.println("На каждого ученика рассчитано " + paperForEachStudent + " листов бумаги");


        int bottleInAMinute = 16 / 2;
        int bottleInA20Minute = bottleInAMinute * 20;
        int bottleInADay = bottleInA20Minute * 1140;
        int bottleInA3Day = bottleInADay * 3;
        int bottleInA30Day = bottleInA3Day * 10;
        System.out.println("За 20 минут машина произвела бутылок " + bottleInA20Minute + " штук" + ", за сутки машина произвела бутылок " + bottleInADay + " штук" + ", за 3 дня машина произвела бутылок " + bottleInA3Day + " штук" + ", за 1 месяц машина произвела бутылок " + bottleInA30Day + " штук");



        int allJar = 120;
        int study = allJar / 6;
        int whitePaint =  study * 2;
        int brownPaint = study * 4;
        System.out.println("В школе, где " + study + " классов, нужно " + whitePaint + " банок белой краски и " + brownPaint + " банок коричневой краски");



        int bananas = 80 * 5;
        int milk = 105 * 2;
        int icecream = 100 * 2;
        int egg = 70 * 4;
        int allGrams = bananas + milk + icecream + egg;
        System.out.println(allGrams);
        float allKg = allGrams / 1000;
        System.out.println(allKg);


        int allGramms = 7 * 1000;
        int GrInDay250 =  allGramms / 250;
        int GrInDay500 = allGramms / 500;
        int onAverageDay = (GrInDay250 + GrInDay500) / 2;
        System.out.println("если спортсмен будет худеть по 250 гр в день, то, чтобы сбросить 7 кг потребуется " + GrInDay250 + " дней," + " а если он будет худеть по 500 гр в день, то потребуется " + GrInDay500 + " дней, в среднем потребуется " + onAverageDay + " дней");



        int mashaWages = 67760;
        int denisWages = 83690;
        int kristinaWages = 76230;
        int mashaWagesIncrease = mashaWages + 6776;
        int denisWagesIncrease = denisWages + 8369;
        int kristinaWagesIncrease = kristinaWages + 7623;
        int mashaWagesForYearNow = mashaWages * 12;
        int denisWagesForYearNow = denisWages * 12;
        int kristinaWagesForYearNow = kristinaWages * 12;
        int mashaWillEarnInYear = mashaWagesIncrease * 12;
        int denisWillEarnInYear = denisWagesIncrease * 12;
        int kristinaWillEarnInYear = kristinaWagesIncrease * 12;
        int mashaWagesHaveIncreased = mashaWillEarnInYear - mashaWagesForYearNow;
        int denisWagesHaveIncreased = denisWillEarnInYear - denisWagesForYearNow;
        int kristinaWagesHaveIncreased = kristinaWillEarnInYear - kristinaWagesForYearNow;
        System.out.println("Маша теперь получает " + mashaWagesIncrease + " рублей, ее годовой доход вырос на " + mashaWagesHaveIncreased + " рублей, " + "Денис теперь получает " + denisWagesIncrease + " рублей, его годовой доход вырос на " + denisWagesHaveIncreased + " рублей, Кристина теперь получает " + kristinaWagesIncrease + " рублей, ее годовой доход вырос на " + kristinaWagesHaveIncreased + " рублей");





















    }
}