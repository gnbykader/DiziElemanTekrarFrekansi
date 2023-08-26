import java.util.Arrays;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		int[] dizi = {10,23,4,10,23,20,10,56,4};
		int count = 1;
		System.out.println("Dizi: "+Arrays.toString(dizi));
		System.out.println("Tekrar Sayilar");
		Arrays.sort(dizi);

		for (int i = 0; i < dizi.length; i++) {
			if (i == 0) {
				for (int j = 0; j < dizi.length; j++) {
					if (i!=j && dizi[i] == dizi[j]) {
						count++;						
					}
				}
				System.out.println(dizi[i]+" Sayisi "+count+" Kere Tekrar Edildi.");	
			}
			else if (dizi[i] != dizi[i-1]) {
				for (int j = 0; j < dizi.length; j++) {
					if (i!=j && dizi[i] == dizi[j]) {
						count++;						
					}
				}
				System.out.println(dizi[i]+" Sayisi "+count+" Kere Tekrar Edildi.");				
			}
			count = 1;
		}							
	}
}

