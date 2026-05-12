 static boolean elemanVarmi(int []diziler,int aranansayi){
         
         boolean varmi=false;
         for(int i=0; i<diziler.length; i++){
             
            if(aranansayi==diziler[i]){
            }
            return true;
        }
        return false;
    }
    
    static int sayiBul(int []diziler,int aranansayi){
        
        for(int i=0; i<diziler.length; i++){
            
            if(aranansayi==diziler[i]){
                return i;
            }
        }
        return -1;
    }
    
    static int sayiKacKezGecti(int []diziler,int aranansayi){
        
        int sayac=0;
        for(int i=0; i<diziler.length; i++){
            if(aranansayi==diziler[i]){
               sayac++;
            }
        }
        return sayac;
    }
    
    static boolean palindromeDizisi(int []diziler){
        
        boolean palinmi=false;
        for(int i=0; i<diziler.length; i++){
            if(diziler[i]!=diziler[diziler.length-1-i]){
                return false;
            }
        }
        return true;
    }
    
    static int enBuyukDeger(int []diziler){
        
        int sayac=1;
        int maxsayi=diziler[0];
        for(int i=1; i<diziler.length; i++){
            
            if(diziler[i]>maxsayi){
                maxsayi=diziler[i];
                sayac=1;
            }
            else if(maxsayi==diziler[i]){
                sayac++;
            }
        }
        return sayac;
    }
    
    static boolean diziKucukMu(int []diziler){
        
        boolean kucukmu=false;
        for(int i=0; i<diziler.length-1; i++){
            
            if(diziler[i]>diziler[i+1]){
                return false;
            }
        }
        return true;
        
    }
    
    public static void main(String[] args) {
       
        //SORU8
        
        
        /*
        //SORU7(diziKucukMu)
        
        int []sayilarim={2, 3, 4, 5};
        boolean sonuc=diziKucukMu(sayilarim);
        System.out.println(sonuc);
        */
        
        
        /*
        //SORU6(enBuyukDeger)
        
        int []sayilarim={10, 10, 20, 20};
        int sonuc=enBuyukDeger(sayilarim);
        System.out.println(sonuc);
        */
        
        /*
        //SORU5(palindromeDizisi)
        
        int []sayilarim={2, 7, 12, 42, 12, 7, 2};
        boolean sonuc=palindromeDizisi(sayilarim);
        System.out.println(sonuc);
        */
        
        /*
        //SORU4(sayiKacKezGecti)
        
        int []sayilarim={2, 7, 2, 3, 22, 10, 48, 6, 32, 2, 28, 31};
        int sonuc=sayiKacKezGecti(sayilarim,2);
        System.out.println(sonuc);
        */
        
        
        /*
        //SORU3(sayiBul)
        
        int []sayilarim={2, 7, 2, 3, 22, 10, 48, 6, 32, 2, 28, 31};
        int sonuc=sayiBul(sayilarim,7);
        System.out.println(sonuc);
        */
        
        
        /*
        //SORU2(elemanVarmi)
        
        int []sayilarim={2, 7, 16, 22, 10, 48, 6, 58};
        boolean sonuc=elemanVarmi(sayilarim,7);
        System.out.println(sonuc);
        */
        
        /*
        //SORU1
        
        int []diziler={8,23,9,4,12,39,6,7,18};
        
        int sayac=0;
        int toplam=0;
        int ortalama=0;
        for(int i=0; i<diziler.length; i++){
            if(diziler[i]%3==0 && diziler[i]%2==1){
                sayac++;
                
                toplam+=diziler[i];
                ortalama=toplam/sayac;
            }
        }
        System.out.println("3 'ün Katı Olupta 2 'nin Katı Olmayan Eleman Sayisi: "+sayac);
        System.out.println("Elemanların Ortalaması: "+ortalama);
        */
        