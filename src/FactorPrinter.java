public class FactorPrinter {

    public static void printFactors(int number){
        if(number >= 1){

            for(int i = 1; i <= number ; i++){
                int container = number % i;
                if(container == 0){
                    System.out.println(i);
                }
            }

        }else{
            System.out.println("Invalid Value");
        }
    }
}
