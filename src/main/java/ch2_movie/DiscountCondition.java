package ch2_movie;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}
