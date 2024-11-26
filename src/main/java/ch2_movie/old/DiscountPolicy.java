package ch2_movie.old;

import ch2_movie.Money;
import ch2_movie.Screening;

public interface DiscountPolicy {
    Money calculateDiscountAmount(Screening screening);
}
