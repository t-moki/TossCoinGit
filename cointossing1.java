import java.util.Random;

public class cointossing1 {
    public static void main(String[] args) {
        String a[] = new String[5];
       
        int count1 = 0;
        int count2 = 0;

        for(int i=0; i<5; i++){
            int rnd = new Random().nextInt(2);
            if(rnd==0) {
              a[i] = "Heads";
              
              }

            if(rnd==1) {
               a[i] = "Tails";
	       
	       }


       }

       System.out.println("Tossing a coin...");
       for(int i=0; i<3; i++){
            System.out.println("Round "+ i + ":" + a[i+1]);
            if(a[i] == "Heads") count1++;
            if(a[i] == "Tails") count2++;
       }
          
     System.out.println("Heads: " + count1 + ", Tails:" + count2);

      if(count1 > count2) System.out.println("won");
      else System.out.println("lost");   
       

    }
}