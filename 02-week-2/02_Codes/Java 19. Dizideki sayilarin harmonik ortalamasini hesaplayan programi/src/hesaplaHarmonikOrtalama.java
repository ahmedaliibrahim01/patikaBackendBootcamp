public class hesaplaHarmonikOrtalama {
    static double hesaplaHarmonikOrtalama(int[] dizi) {
        double toplamTersler = 0.0;

        for (int i = 0; i < dizi.length; i++) {
            toplamTersler += 1.0 / dizi[i];
        }
        return dizi.length / toplamTersler;
    }
}
