package Homework.Task06_25;

@FunctionalInterface
public interface Account<T> {
    T balance(T t);
}
