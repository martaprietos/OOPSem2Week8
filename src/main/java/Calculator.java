public class Calculator {
    public int add(int firstNum, int secondNum) {
        long result = (long)firstNum + (long)secondNum;
        if(result > Integer.MAX_VALUE){
            throw new IllegalArgumentException("Your values are too large");
        }
        return (int)result;
    }

    public int sub(int firstNum, int secondNum){
        long result = (long)firstNum - (long)secondNum;
        if(result < Integer.MIN_VALUE){
            throw new IllegalArgumentException("Your values are too small");
        }
        return (int)result;
    }

    public int mul(int firstNum, int secondNum){
        long result = (long)firstNum * (long)secondNum;
        if(result > Integer.MAX_VALUE){
            throw new IllegalArgumentException("Your values are too large");
        }
        return (int)result;
    }
}
