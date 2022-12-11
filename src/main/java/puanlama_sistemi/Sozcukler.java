package puanlama_sistemi;
public class Sozcukler {

    public static void main(String[] args) {

        String cumle ="Puanlama Sistemi sorusu beni biraz Zorladi.";

        String []cumleA= cumle.replaceAll("\\p{Punct}","").replaceAll("[0-9]","").trim().split(" ");

        String enYuksekPuanli="";

        for(String w: cumleA){

            int puanToplam = 0;

            for (int i = 0; i <w.length() ; i++) {

                int sum = 0;
                char ch = w.toLowerCase().charAt(i);

                sum+=(ch-'a'+1);

                if (sum>puanToplam){
                    enYuksekPuanli=w;
                    puanToplam=sum;
                }
            }
        }
        System.out.println(enYuksekPuanli);

    }// main



}
