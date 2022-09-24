public class Main {
    public static void main(String[] args) {
        String mesaj = "bugun hava cok guzel";
        String yeniMesaj = sehirVer();
        System.out.println(yeniMesaj);
        int sayi = topla(7, 8);
        System.out.println(sayi);
        int toplam = topla2( 2,3,4,5,6,10);
        System.out.println(toplam);
    }

    public static void ekle() {
        System.out.println("eklendi");
    }

    public static void sil() {
        System.out.println("silindi");
    }

    public static void güncelle() {
        System.out.println("güncellendi");
    }

    public static int topla(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }

    public static String sehirVer() {
        return "ankara";
    }

    public  static  int topla2(int... sayilar){
        int toplam=0;
        for( int sayi : sayilar){
            toplam+=sayi;
        }
        return  toplam;
    }
}