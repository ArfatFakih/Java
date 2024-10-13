public class TypeCasting {
    public static void main(String[] args) {
        
        //Type Casting
        float number1 = 99.999f;
        int number2 = (int) number1;

        System.out.println(number2);


        char ch = 'a';
        int number = ch;
        System.out.println(number);

        //Type conversion
        // byte > short > int > float > long > double
        int a = 25;
        float b = a;
        System.out.println(b);

        int num1 = 240;
        long num2 = num1;
        System.out.println(num2);
    }
}