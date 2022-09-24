public class Main {
    public static void main(String[] args) {

sayiBulmaca();
    }

    // camel casing
    public static void sayiBulmaca(){
        int[] sayilar = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int aranacak = 55;
        boolean varMı = false;

        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                varMı = true;
            }
        }
        String mesaj="";
        if (varMı) {
            mesaj ="sayı mevcuttur:" + aranacak;
            mesajVer(mesaj);
        } else {
            mesajVer("sayı mevcut değildir:" + aranacak);
        }
    }

    public static void mesajVer(String mesaj){
        System.out.println(mesaj);
    }
}