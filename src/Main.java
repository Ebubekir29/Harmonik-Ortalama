public class Main {

    public static void main(String[] args) {
	    int[] dizi = {5,9,6,4,8,5,2,7};
        int toplam = 1;
        for(int i =0;i<dizi.length;i++)
        {
            toplam += dizi[i];
        }
        System.out.println("Toplam : "+toplam/dizi.length);
    }
}
