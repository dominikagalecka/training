public class Arrays {
    public static void main(String[] args){
        int[] prices={12,13};

        try {
            System.out.println(calculateAverage(prices[0], prices[1]));
            System.out.println(prices[0]);
            System.out.println(prices[1]);
            System.out.println(prices[2]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("You are trying to display a value that does not exist");
        }
    }

    public static float calculateAverage(int firstProductPrice, int secondProductPrice){
        return (float) (firstProductPrice + secondProductPrice)/2;
    }
}
