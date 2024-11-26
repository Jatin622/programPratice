package com.programmingPratice.lambda;
@FunctionalInterface
public interface evenLambda {
    void checkEven(int number);
}
class la{
    public static void main(String[]args){
        evenLambda e = (int number) -> {
            if (number % 2 == 0) {
                System.out.println(number + " is even.");
            }
        };

        // Test the lambda expression
        e.checkEven(5);  // Will not print anything since 5 is not even
        e.checkEven(10); // Will print "10 is even."
    }
}