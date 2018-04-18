public class TypesConversion {
    public static void main (String[] args) {
        String firstFormmText = "12";
        String secondFormmText = "13";
        int productPrice1 = Integer.valueOf(firstFormmText);
        int productPrice2 = Integer.valueOf(secondFormmText);

        System.out.println("first product price is " + productPrice1);
        System.out.println("second product price is " + productPrice2);
        System.out.println("average is " + calculateAverage(productPrice1,productPrice2));
    }

    public static float calculateAverage(int firstPrice, int secondPrice){
        return (float) (firstPrice + secondPrice)/2;
    }
}
