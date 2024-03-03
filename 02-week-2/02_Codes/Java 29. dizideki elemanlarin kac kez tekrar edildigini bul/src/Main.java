public class Main {
    public static void main(String[] args) {
        int[] dizi = {10, 20, 20, 10, 10, 20, 5, 20};

        // Elemanların frekanslarını tutmak için diziyi tarayan bir döngü
        for (int i = 0; i < dizi.length; i++) {
            int eleman = dizi[i];
            int frekans = 1;

            // Daha önce kontrol edilmiş elemanları tekrar kontrol etmemek için -1 yapılır
            if (eleman != -1) {
                // Aynı elemanın diğer indekslerini kontrol etmek için iç içe bir döngü
                for (int j = i + 1; j < dizi.length; j++) {
                    if (eleman == dizi[j]) {
                        frekans++;
                        // Frekansını bulduğumuz elemanı işlem dışı bırak
                        dizi[j] = -1;
                    }
                }

                // Elemanın frekansını ekrana yazdır
                System.out.println(eleman + " sayısı " + frekans + " kere tekrar edildi.");
            }
        }
    }
}