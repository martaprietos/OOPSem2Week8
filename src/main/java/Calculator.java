public class Calculator {
    public int add(int firstNum, int secondNum) {
        long result = (long)firstNum + (long)secondNum;
        if(result > Integer.MAX_VALUE){
            throw new IllegalArgumentException("Your values are too large");
        }
        return (int)result;
    }
}
