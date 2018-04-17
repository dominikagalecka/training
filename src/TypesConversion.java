public class TypesConversion {
    public static void main (String[] args) {
        String firstFromText = "12";
        String secondFromText = "13";
        int productPrice1 = Integer.valueOf(firstFromText);
        int productPrice2 = Integer.valueOf(secondFromText);

        System.out.println("first product price is " + productPrice1);
        System.out.println("second product price is " + productPrice2);
        System.out.println("average is " + calculateAverage(productPrice1,productPrice2));
    }

    public static float calculateAverage(int firstPrice, int secondPrice){
        return (float) (firstPrice + secondPrice)/2;
    }
}
