package ch2_movie;

public class NoneDiscountPolicy extends DefaultDiscountPolicy {
        @Override
    protected Money getDiscountAmount(Screening screening) {
        return Money.ZERO;
    }

    /*
    Movie starWars = new Movie("스타워즈",
        Duration.ofMinutes(210),
        Money.wons(10000),
        new NoneDiscountPolicy());
     */
}
