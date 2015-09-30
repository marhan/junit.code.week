package junit.code.week;

public class FizzBuzz {

    private Whizz whizz;

    public FizzBuzz() {
        this.whizz = null;
    }

    public FizzBuzz(Whizz whizz) {
        this.whizz = whizz;
    }

    public String say(int number) {

        if (number % 3 == 0) {
            return "Fizz";
        }

        if (number % 5 == 0) {
            return "Buzz";
        }

        if (number % 7 == 0) {
            if (whizz != null) {
                return whizz.sayWhizz();
            }
        }

        return String.valueOf(number);
    }

}
