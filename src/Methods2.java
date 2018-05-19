public class Methods2 {
    public static void main(String[] args){
        float average1 = calculateAverage(6, 5);
        float average2 = calculateAverage(6, 6);
        float average3 = calculateAverage(6 ,7);

        System.out.println("Average1 is " + average1);
        System.out.println("Average2 is " + average2);
        System.out.println("Average3 is " + average3);

        if ((average1 >= average2) & (average1 >=average3)) {
            System.out.println("Average1 is greater than Average2 and Average3");
        }
        else{
                if ((average2 >= average1) & (average2 >= average3)){
                    System.out.println("Average2 is greater than Average1 and Average3");
                }
                else{
                System.out.println("Average3 is greater than Average1 and Average2");
            }
            }
        }

    public static float calculateAverage(int firstPrice, int secondPrice){
        return (float) (firstPrice + secondPrice)/2;
    }
}
