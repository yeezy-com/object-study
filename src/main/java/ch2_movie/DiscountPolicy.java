package ch2_movie;

public interface DiscountPolicy {
    Money calculateDiscountAmount(Screening screening);
}
