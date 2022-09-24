public class Main {
    public static void main(String[] args) {

        OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
        TarimKrediManager tarimKrediManager = new TarimKrediManager();

        tarimKrediManager.hesapla();
        ogretmenKrediManager.hesapla();

        KrediUI krediUI= new KrediUI();
        krediUI.KrediHesapla(new AskerKredisi());
    }
}