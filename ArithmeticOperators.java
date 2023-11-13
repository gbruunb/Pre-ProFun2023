public class ArithmeticOperators {
    public static void main(String[] args) {
        int score = 50;
        System.out.println("score = " + score);

        score += 10; //score = 50 + 10 = 60
        score *= 20; //score = 60 * 20 = 1200
        System.out.println("score = " + score); //1200

        score %= 12; //score = 1200 % 12 = 0
        System.out.println("score = " + score); //0

        // System.out.println("score = " + score++); //50
        // System.out.println("score = " + score); //51
        // System.out.println("score = " + ++score); //52
        // System.out.println("score = " + score--); //52
        // System.out.println("score = " + --score); //50


    }
}
