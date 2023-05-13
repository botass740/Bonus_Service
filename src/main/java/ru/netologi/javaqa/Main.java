public class Main {

    public static void main(String[] args) {
        BonusService service = new BonusService();


        //shouldCalculateForUnRegisteredAndOverLimit Для Зарегистрированных И С Превышением Лимита
        int expected = 500;
        long actual = service.calculate(1_000_000, false);
        System.out.println("1. " + expected + " == ? == " + actual);


        //
        expected = 50;
        actual = service.calculate(5_000, false);
        System.out.println("2. " + expected + " == ? == " + actual);
    }
}
