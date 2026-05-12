
        
        /*
        
        int []diziler={5,7,2,1,0,6,3};
        
        for(int i=0; i<diziler.length-1; i++){
          int temp=diziler[i];
          diziler[i]=diziler[diziler.length-1];
          diziler[diziler.length-1]=temp;
        }
        System.out.print("Dizinin Son Hali: [");
        for(int i=0; i<diziler.length; i++){
            System.out.print(diziler[i]);
            
             if(i+1<diziler.length){
                 System.out.print(",");
             }
        }
        System.out.print("]");
        */
        
        
        /*
        
        int []diziler={3,5,2,7,1};
        
        for(int i=0; i<diziler.length/2; i++){
            int temp=diziler[i];
            diziler[i]=diziler[diziler.length-1-i];
            diziler[diziler.length-1-i]=temp;
        }
        System.out.print("Dizinin Ters Hali: [");
           for (int i = 0; i < diziler.length; i++) {
               System.out.print(diziler[i]);
               if(i<diziler.length-1){
                   System.out.print(", ");
               }
           }     
           System.out.print("]");
        */
        
        
        /*
        
        int []diziler={3,6,2,2,2,2,3,3,5,5,5,3,3,3,3,3};
       
        int sayac=1;
        int maxsayac=1;
        int enCokTekrarEden=diziler[0];
        for(int i=1; i<diziler.length; i++){
            
            if(diziler[i]==diziler[i-1]){
                sayac++;
            }
            else{
                
                if(sayac>maxsayac){
                    maxsayac=sayac;
                    enCokTekrarEden=diziler[i-1];
                }
                sayac=1;
            }
        }
        if(sayac > maxsayac){
        maxsayac = sayac;
        enCokTekrarEden = diziler[diziler.length - 1];
        }
        System.out.println(enCokTekrarEden+" Değeri "+maxsayac+" Kez Art Arda Tekrarlanmıştır.");
        */
        
        
        /*
        
        int []diziler={1,5,2,8,9,5,12,0,5,21,4};
        
        Scanner girdi=new Scanner(System.in);
        
        System.out.println("Sayi Giriniz:");
        int sayi=girdi.nextInt();
        
        int sayac=0;
        for(int i=0; i<diziler.length; i++){
            if(sayi==diziler[i]){
                sayac++;
            }
        }
        System.out.println("Girdiğiniz Sayi "+sayac+" Kez Geçti.");
        */
        
        
         /*
        int[] diziler = {1, 45, 31, 58, 39, 8, 2};

        Scanner girdi = new Scanner(System.in);

        System.out.println("Sayi Giriniz:");
        int sayi = girdi.nextInt();
        boolean varmi=false;
        for (int i = 0; i < diziler.length; i++) {
            if (sayi == diziler[i]) {
             varmi=true;
             
            } 
        }
        if ( varmi == true)
            System.out.println("Aranan Eleman Dizide Var");
        else
            System.out.println("Aranan Eleman Dizide yok");
        */
        

        /*
        
         int []diziler={-4, 8, 5, 67, -2, 8, 58, -4, 12, 23, 8, 2};
         for (int i = 0; i < diziler.length; i++) {
             
             int sayac=0;
             for (int j = 0; j < diziler.length; j++) {
                 if(diziler[i]==diziler[j]){
                     sayac++;
                 }
             }
             if(sayac==1){
                 System.out.println(diziler[i]);
             }
        }
         */
        
 /*
        
        int []diziler={-4, 31, 5, 67, -2, 8, 58};
        
        int min=diziler[0];
        if (diziler[0]<0)
            min *= -1;
        
        for (int i = 0; i < diziler.length; i++) {
            int mutlak = diziler[i];
            if(diziler[i]<0){
                mutlak = diziler[i]*-1;
            }
            if(mutlak<min){
                min = mutlak;
            }
        }
        System.out.println(min);
         */
 /*
        
        double toplam=0;
        double []diziler={3.2,7.3,1.8,5.0,4.8,2.5};
        for (int i = 0; i < diziler.length; i++) {
            toplam+=diziler[i];
        }     
        double ortalama=toplam/diziler.length;
        for (int i = 0; i < diziler.length; i++) {
             if(ortalama>diziler[i]){
             System.out.println("Ortalamadan Kucuk Dizi Elemanlari: "+diziler[i]);
             }
        }
         */
 /*
        int max = 0;
        int[] diziler = {3, 1, 67, 3, 8};
        for (int i = 0; i < diziler.length - 1; i++) {
            int fark = diziler[i] - diziler[i + 1];
            if(fark<0){
                fark=fark*-1;
            }
            if (fark > max) {
                max = fark;
            }
        }
        System.out.println(max);
         */
 /*
        
        int []diziler={7,8,5,3,9,6};
        int max=diziler[0];
        int min=diziler[0];
        int fark=0;
            for(int i=0; i<diziler.length; i++){
                if(diziler[i]>max){
                    max=diziler[i];
                }
                if(diziler[i]<min){
                    min=diziler[i];
                }
            } fark=max-min;
            System.out.println("En Büyük: "+max);
            System.out.println("En Küçük: "+min);
            System.out.println("Farkı: "+fark);
         */
 /*
        
        int []diziler={3,7,2,6,5,8};
        int []yenidizi={};
        for(int i=0; i<diziler.length; i++){
            if(diziler[i]%2==1){
                System.out.print(diziler[i]+1+" ");
            }
            else if(diziler[i]%2==0){
                System.out.print(diziler[i]-2+" ");
            }
        }
         */
         /*
        
        int karesi=0;
        int []diziler={2,6,8,5,10};
        for(int i=0; i<diziler.length; i++){
            karesi=diziler[i]*diziler[i];
            System.out.print(karesi+" ");
        }
        */