public class ForLoop {
    public static void main(String[] args){
        int[] prices = {10, 9, 7, 13, 11};

        System.out.println("Length of array is " + prices.length);
        System.out.println("Average for array is " + calculateAverage(prices));
    }

    public static float calculateAverage(int [] prices){
        int sum=0;
        for(int i=0; i<prices.length; i++){
            sum+=prices[i];
            System.out.println(sum);
        }
        return (float) sum /prices.length;
    }
}
