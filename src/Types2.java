public class Types2 {
    public static void main(String[] args) {
        int productPrice1 = 3;
        int productPrice2 = 5;
        float average2 = (float) (productPrice1 + productPrice2) / 2;
        System.out.println("Average for both products is " + average2);

        boolean higherThan4 = average2 >=4;
        System.out.println("Average is higher than 4 " + higherThan4);

        int productPrice3 = 4;
        int productPrice4 = 7;
        float average4 =  (float) (productPrice1 + productPrice2 + productPrice3 + productPrice4)/4;
        System.out.println("Average for four product is " +  average4);

        boolean equalTo4Point75 = average4 == 4.75;
        System.out.println("Average for four product is 4.75 "+ equalTo4Point75);

    }
}

