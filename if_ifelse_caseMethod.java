
       static int kupBul(int x){
       
          int kup=x*x*x;
          return kup;
       }
    
       
       static int ucTamSayiBul(int x,int y,int z){
         
        int max;
       if(x>y && x>z){
           max =x;
       }
       else if(y>x && y>z){
           max=y;
       }
       else{
           max=z;
       }
       
       return max;
     }    
    
    
       static int nBul(int n){
           
        int sayilar=0;
         for(int i=1; i<=n; i++){
             sayilar+=i;
         }
         return sayilar;
     } 

       static int usBul(int a,int b){
           
           int uslu=1;
           for(int i=1; i<=b; i++){
               uslu=uslu*a;
           }
           return uslu;
       }      
       
       static int yuvarla(int sayi){
       
       int hesap=0;
       int kalan=0;
       kalan=sayi%100;
       hesap=100-kalan;
       if(sayi%100==0){
       hesap=0;
       }
       return hesap;
      }
       
       static int obebBul(int sayi,int sayi2){
           
           int idevir=1;
           int carp=1;
           for(int i=2; i<=sayi2; i++){
               if(sayi%i==0 && sayi2%i==0){
                   
                   idevir=i;
               }
           }
           return idevir;
       }
       
       static int okekBul(int sayi,int sayi2){
           
           int sayac=0;
           int idevir=1;
           for(int i=2; i<=sayi2; i++){
               if(sayi%i==0 && sayi2%i==0){
                   idevir=i;
                   sayac++;
               }
               if(sayac==1){
                   break;
               }
           }
           return idevir;
       }
       
       static boolean asalBul(int sayi){
          
         boolean asalmi=true;  
         
         if(sayi<2){
             asalmi=false;
         }
         for(int i=2; i<sayi; i++){
           if(sayi%i==0){
               asalmi=false;
           }
         }
         return asalmi;
      }
       
      static int rakamTopla(int sayi){
          
          int toplam=0;
          int sonrakam=0;
          while(sayi>0){
              sonrakam=sayi%10;
              sayi/=10;
              toplam+=sonrakam;
           }
          return toplam;
      }
      
      static int hesapla(int sayi,int sayi2,char islem){
          
          int hesap=0;
          if(islem=='+'){
              hesap=sayi+sayi2;
          }
          else if(islem=='-'){
              hesap=sayi-sayi2;
          }
          else if(islem=='*'){
               hesap=sayi*sayi2;
               
          }
          else if(islem=='/'){
              hesap=sayi/sayi2;
          }
          else if(islem=='%'){
               hesap=sayi%sayi2;
          }
          return hesap; 
      }
       
       
    
    public static void main(String[] args) {
      
        /*
        //SORU10(hesapla)
        
        int sonuc=hesapla(5,7,'*');
        System.out.println(sonuc);
        */
        
        
        /*
        //SORU9(rakamTopla)
        
        int sonuc=rakamTopla(2553);
        System.out.println(sonuc);
        */
        
        
        /*
        //SORU8(asalBul)
        
        boolean sonuc=asalBul(2);
        System.out.println(sonuc);
        */
        
        
        /*
        //SORU7(okekBul)
        
        int sonuc=okekBul(120,180);
        System.out.println(sonuc);
        */
        
        
        /*
        //SORU6(obebBul)
        
        int sonuc=obebBul(120,180);
        System.out.println(sonuc);
        */
        
         
        /*
        //SORU5(yuvarla)
        
        int sonuc=yuvarla(200);
        System.out.println("En yakın yüzlüğe yuvarlamak için gereken sayi: "+sonuc);
        */
        
        
        /*
        //SORU4(usBul)
        
        int sonuc=usBul(2,5);
        System.out.println(sonuc);
        */
        
        
        /*
        //SORU3(nBul)
        
        int sonuc=nBul(5);
        System.out.println("Toplami: "+sonuc);
       */
        
        
        /*
        //SORU2(ucTamSayiBul)
        
        int sonuc=ucTamSayiBul(5,3,-2);
        System.out.println("En Buyuk Sayi: "+sonuc);
        */
        
        
       /*
       //SORU1(kupBul)
        
       int sonuc=kupBul(3);
       System.out.println(sonuc);
        */
        
    }
}
