public class HomeWorkApp {
    public static void main(String[] args) {
        /*printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();*/
        System.out.println(sumNumbers(5, 7));
        Sum(5);
        PrintStr("Hi!", 2);
        System.out.println(IsYear(1700));
    }

    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 48;
        int b = -34;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 121;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <=100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = 782;
        int b = 233;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static boolean sumNumbers(int a, int b) {
        return (a + b) >=10 && (a + b) <=20;
    }

    public static void Sum(int a) {
        if (a > 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static void PrintStr(String str, int count) {
        for (int j = 1; j <= count; j++) {
            System.out.println(str);
        }
    }

    public static boolean IsYear(long year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
}
