import javax.xml.stream.events.StartDocument;

public class Main {
    public static void main(String[] args) {
        int[] coins = new int[]{10,5,2,1};

        int target = 41;
        int sum = target;
        int[] count = new int[coins.length];
        for(int i=0;i<coins.length;i++){
            count[i]=sum/coins[i];
            sum = sum%coins[i];
        }
        if(sum!=0){
            System.out.println(-1);
            System.exit(0);
        }

        for(int i=0;i<count.length;i++){
            if(count[i]!=0){
                System.out.printf("%2d x %1d = %d\n",coins[i],count[i],coins[i]*count[i]);
            }
        }
        System.out.println("Total = "+target);

    }
}
