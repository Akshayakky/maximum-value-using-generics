public class FindMaximum {
    public static void main(String[] args) {
        System.out.println("Welcome To Find Maximum Problem Using Generics");
    }

    public static Integer findMaximumInteger(Integer firstValue, Integer secondValue, Integer thirdValue) {
        Integer maximumValue = firstValue;
        if (secondValue.compareTo(maximumValue) > 0)
            maximumValue = secondValue;
        if (thirdValue.compareTo(maximumValue) > 0)
            maximumValue = thirdValue;
        return maximumValue;
    }
}