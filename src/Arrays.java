public class Arrays {
    public static void main(String[] args){
        int[] prices={12,13};


        try {
            System.out.println("First element of array is " + prices[0]);
            System.out.println("Second element of array is " + prices[1]);
            System.out.println("Average is " + calculateAverage(prices[0], prices[1]));
            System.out.println("Third value of array is " + prices[2]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("You are trying to display an element of array that does not exist");
        }
    }

    public static float calculateAverage(int firstProductPrice, int secondProductPrice){
        return (float) (firstProductPrice + secondProductPrice)/2;
    }
}
