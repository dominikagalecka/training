public class Exceptions {
    public static void main (String[] args){
        String firstFormText = "12a";
        String secondFormmText = "That string definitely will not be parsed to integer";

        try{
            int productPrice1=Integer.valueOf(firstFormText);
            int productPrice2=Integer.valueOf(secondFormmText);

            System.out.println("first product price is " + productPrice1);
            System.out.println("second product price is " + productPrice2);
            System.out.println("average is " + calculateAverage(productPrice1,productPrice2));
        } catch (NumberFormatException e){
            System.out.println("You tricky one! I cannot parse \"" + firstFormText + "\"  or \"" + secondFormmText + "\" to an integer!");
        }
    }

    public static float calculateAverage(int firstPrice, int secondPrice){
        return (float) (firstPrice + secondPrice)/2;
    }
}
