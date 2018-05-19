public class Methods {
    /*line1
    line2     */
    public static void main(String[] args) {
        float average1 = calculateAverage(3, 5);
        float average2 = calculateAverage(4, 7);
        float average3 = calculateAverage(13, 11);

        System.out.println("First average is " + average1);
        System.out.println("Second average is  " + average2);
        System.out.println("Third average is " + average3);

        if (average1 > average2) {
            System.out.println("First average is greater than second average");
        }
        else {
            System.out.println("Second average is greater than first average");
        }
    }
    /**calculate Average method*/
    public static float calculateAverage(int firstPrice, int secondPrice) {
        return (float) (firstPrice + secondPrice) / 2;
    }
}
