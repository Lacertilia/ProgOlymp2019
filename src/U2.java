import java.util.Scanner;

public class U2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rows = 0;
        int cols = 0;
        String crypt = "";
        do{
        System.out.println("Antal rader ? ");
        rows = scan.nextInt();}while(rows<2 || rows >20);

        do{
        System.out.println("Antal kolumner ? ");
        cols = scan.nextInt();} while(cols<2 || cols>20);

        do{System.out.println("Krypterad text ? ");
        crypt = scan.next();}while(crypt.length() >30 || crypt.length() == 0);

        String deCrypt = "";
        if(rows>=crypt.length()){
            deCrypt = crypt;
        }else{
            for(int i = 0; i<crypt.length(); i++){
                if(rows !=2){
                    /*if(i%rows == 0){
                        deCrypt += crypt.charAt(i/rows);
                    }else if(){

                    }*/
                    for(int k = 1; k<rows; k++){
                        if(i%rows == 0){
                            deCrypt += crypt.charAt(i/rows);
                        }else if(i/rows == k){
                           // deCrypt += crypt.charAt(i+());
                        }
                    }
                }else{
                    if(i%2 == 0){
                        deCrypt += crypt.charAt(i/2);
                    }else{
                        deCrypt += crypt.charAt(i+(6-i/2));
                    }
                }
            }
        }

        System.out.println(deCrypt);
    }
}
