package arac_kiralama_projesi;

import java.util.Scanner;

public class AlimTeslimGunu {
       static Scanner input = new Scanner(System.in);
        public static void alacagiGun(){
            System.out.println("Lutfen araci teslim alacaginiz gunu giriniz.");
            int gun = input.nextInt();
            System.out.println("Lutfen araci teslim alacaginiz ayi giriniz.");
            int ay = input.nextInt();

            if (ay<0 && ay>12){
                if (ay==2 && gun>29) {
                    System.out.println("Hatali giris yaptiniz.");
                    alacagiGun();
                }
                System.out.println("Hatali giris yaptiniz.");
                alacagiGun();
            }


            if (gun<0 || gun>31){
                System.out.println("Hatali giris yaptiniz.");
                alacagiGun();
            }

        } //method


    public static void teslimGunu(){
        System.out.println("Lutfen araci teslim edeceginiz gunu giriniz.");
        int gun1 = input.nextInt();
        System.out.println("Lutfen araci teslim edeceginiz ayi giriniz.");
        int ay1 = input.nextInt();

        if (ay1==2 && gun1>29) {
            System.out.println("Hatali giris yaptiniz.");
            teslimGunu();
        }
        if (gun1<0 || gun1>31){
            System.out.println("Hatali giris yaptiniz.");
            teslimGunu();
        }

    }


    public static void alacagiSaat(){
        System.out.println("Lutfen araci teslim alacaginiz saati giriniz.");
        int saat = input.nextInt();
        System.out.println("Lutfen araci teslim alacaginiz dakikayi giriniz.");
        int dakika = input.nextInt();

        if (saat<0 && saat >24){
            System.out.println("Hatali giris yaptiniz");
            alacagiSaat();
        }

        if(dakika <0 && dakika >60){
            System.out.println("Hatali giris yaptiniz");
            alacagiSaat();
        }

    }

    public static void teslimSaati(){
        System.out.println("Lutfen araci teslim edeceginiz saati giriniz.");
        int saat = input.nextInt();
        System.out.println("Lutfen araci teslim edeceginiz dakikayi giriniz.");
        int dakika = input.nextInt();

        if (saat<0 && saat >24){
            System.out.println("Hatali giris yaptiniz");
            alacagiSaat();
        }

        if(dakika <0 && dakika >60){
            System.out.println("Hatali giris yaptiniz");
            alacagiSaat();
        }
    }


}
