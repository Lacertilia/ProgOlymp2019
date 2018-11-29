import java.util.Scanner;

public class U3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Behöver antal?");
        int need = scan.nextInt();
        System.out.println("Har antal?");
        int has = scan.nextInt();
        int[] needList = new int[need];
        int[] hasList = new int[has];
        for(int i = 0; i<need; i++){
            System.out.println("Behöver längd?");
            needList[i] = scan.nextInt();
        }
        for(int i = 0; i<has; i++){
            System.out.println("Har längd?");
            hasList[i] = scan.nextInt();
        }
        for(int i = 0; i<needList.length; i++){
            for(int k = 0; k<hasList.length; k++){
                if(needList[i] == hasList[k]){
                    need--;
                    needList[i] = 0;
                }
            }
        }
        if(needList.length-has<need){
            int c;
            int cP = 0;
            int n = 0;
            do{
                for(int i = 0; i<needList.length; i++){
                    c=1000;
                    for(int k = 0; k<hasList.length; k++){
                        if(needList[i]<hasList[k] && hasList[k] <= c){
                            if(needList[i]>n){
                                n = needList[i];
                                c = hasList[k];
                                cP = i;
                            }
                        }
                    }
                }
                needList[cP] = 0;
                need--;
            }while(needList.length-has<need);
        }


        System.out.println("Antal: " + need);
        System.out.print("Längder: ");
        for(int i = 0; i<needList.length; i++){
            if(needList[i] !=0){
                System.out.print(needList[i] + " ");
            }
        }
    }
}
