import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pin,inputpin;
        pin = 124432;
        System.out.print("Masukkan PIN: ");
        inputpin = sc.nextInt();     
        while (inputpin != pin){
            System.out.println("PIN SALAH! Masukkan PIN: ");
            inputpin = sc.nextInt();
            }
        System.out.println("PIN BENAR \n");
        
        int inputangka;
        System.out.print("Masukkan Angka: ");inputangka = sc.nextInt();
        for (int i = 1;i <= 12;++i){
            int hitung = inputangka*i;
            System.out.println(inputangka+"x"+i+"= "+hitung);
            }
        System.out.println("");
        LoopShape.createRectangle(5,4);
        System.out.println("");
        LoopShape.createTriangle(5);
    }
}











public class LoopShape {
    
    static void createRectangle(int width, int height){
        for (int k=1;k<=height;k++){
            for (int l=1;l<=width;l++){
                if (k == 1 || k == height){
                    System.out.print("*");
                } else {
                    if (l == 1 || l == width){
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                        }
                    }
            }
        System.out.println("");
        }
    }
    
    static void createTriangle(int leg){
        for (int i=1;i<=leg;i++){
            for (int j=1;j<=i;j++){
                if (i == leg){
                    System.out.print("x");
                }else {
                    if (j == 1 || j == i){
                       System.out.print("x"); 
                    }else{
                       System.out.print(" ");
                        }
                    }    
                }
            System.out.println("");    
            } 
        
        
    }
}