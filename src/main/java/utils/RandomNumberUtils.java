package utils;

public class RandomNumberUtils {

    public static int createRandomNumber(int max, int min){
        if(min > max){
            throw new IllegalArgumentException("최소 범위가 최대 범위보다 큽니다.");
        }
        return (int) (Math.random()*(max-min)) + min;
    }
}
