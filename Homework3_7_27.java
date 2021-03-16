package asd;

public class Homework3_7_27 {
	
	public static void main ( String[] args )
    {
        final int SON = 1000;
        final int LINESIZE = 20;

        String sonuc = "The prime numbers between 1 and " + (SON - 1) + " are: \n"; //sonuc adında string değişken tanımlıyorum.
        
        boolean a[] = new boolean[SON];
        int i, j, counter;

        
        for (i = 1; i < SON; i++) 									//Dizinin tüm elemanları true olarak başlatılıyor.
        {					
            a[i] = true;											
        }
        
        for (i = 2; i <= (SON/2); i++) 								//Döngü içerisinde 2,3 ve 5'nin katı olan elemanlar false olarak dönüştürülüyor.
        {       
            for (j = 2*i; j < SON; j += i) 							
            {
                a[j] = false;
            }
        }
        
        counter = 1;   												//counter'den başlattım.
        
        for (i = 1; i < SON; i++) 
        {	        	
            if (a[i] == true)						//Burada sayının bölümünden kalan 0 olursa prime sayı oluyor ve ekrana yazdırıyor.
            {
                if (counter % LINESIZE == 1) 		
                	sonuc += i;
                else if (counter % LINESIZE == 0) 	
                	sonuc += ", " + i + "\n";
                else
                	sonuc += ", " + i;
                counter++;						
            }
        }
        System.out.println( sonuc );				// Çıkan tüm sonuçları ekrana bastırıyorum.
    }

}
