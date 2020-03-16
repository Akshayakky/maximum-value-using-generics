public class FindMaximum<U extends Comparable> {
    U firstValue;
    U secondValue;
    U thirdValue;

    public FindMaximum(U firstValue, U secondValue, U thirdValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.thirdValue = thirdValue;
    }

    public U testMaximum() {
        return testMaximum(firstValue, secondValue, thirdValue);
    }

    public static <U extends Comparable> U testMaximum(U firstValue, U secondValue, U thirdValue) {
        U maximumValue = firstValue;
        if (secondValue.compareTo(maximumValue) > 0)
            maximumValue = secondValue;
        if (thirdValue.compareTo(maximumValue) > 0)
            maximumValue = thirdValue;
        return maximumValue;
    }

    public static void main(String[] args) {
        System.out.println("Welcome To Find Maximum Problem Using Generics");
    }
}