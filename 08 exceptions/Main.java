public class Main {
    public static void main(String[] args) {
        try {
            RF rf1 = new RF(1,2);
            //просто код с исключением
            String s = null;
            boolean p = s.isEmpty();
        }
        catch (ArithmeticException e) {
            RF rf1 = new RF();
            System.out.println("Нельзя нулевой знаменатель. " +
                    "Создал вместо этого дробь 0/1");
        }
        catch (NullPointerException e ){
            System.out.println("Как-то обработали NullPointerException");
        }
        finally {
            System.out.println("Я выполняюсь всегда");
        }

        System.out.println("Продолжим");
    }
}
