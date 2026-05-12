
        
        int [][]matris={ {3,4,2,7},
                         {8,2,6,2},
                         {0,5,2,9} };
        
        int max=matris[0][0];
        for(int i=0; i<matris.length; i++){
            for(int j=0; j<matris[0].length; j++){
                if(matris[i][j]>max){
                    max=matris[j][i];
                }
            }
        }
        System.out.println(max);
        
        /*
        
         int [][]matris={ {3,4,2,7},
                         {8,2,6,2},
                         {0,5,2,9} };
        
        for(int i=0; i<matris.length; i++){
            int toplam=0;
            for(int j=0; j<matris[i].length; j++){
                toplam+=matris[i][j];
            }
            System.out.println(toplam);
        }
        */
        
     
        /*
        
        int [][]matris={ {3,4,2,7},
                         {8,2,6,2},
                         {0,5,2,9} };
        
        for(int i=0; i<matris[0].length; i++){
            int toplam=0;
            for(int j=0; j<matris.length; j++){
                toplam+=matris[j][i];
            }
            System.out.println(toplam);
        }
        */
        
        
        /*
        
        int [][]matris={ {3,4,2,7},
                         {8,2,6,1},
                         {0,5,2,9} };
        
        Scanner girdi=new Scanner(System.in);
        
        System.out.println("Sayi Gir");
        int sayi=girdi.nextInt();
        
        int sayac=0;
        for(int i=0; i<matris.length; i++){
            for(int j=0; j<matris[i].length; j++){
                if(sayi==matris[i][j]){
                    sayac++;
                }
            }
        }
        System.out.println("Girdiginiz Sayi "+sayac+" Kez"+" Gecmistir");
        */
        
        
        /*
        
        int [][]matris={ {3,4,6,7},
                         {8,2,6,1},
                         {0,5,2,9} };
        
        Scanner girdi=new Scanner(System.in);
        
        System.out.println("Sayi Gir: ");
        int sayi=girdi.nextInt();
        
        int sayac=0;
        
        for(int i=0; i<matris.length; i++){
            for(int j=0; j<matris[i].length; j++){
                if(sayi==matris[i][j]){
                    System.out.println("Bulundu! Satir: " + i + " Sutun: " + j);
                    sayac++;
                }
            }
        }
        if(sayac==0){
        System.out.println("Aranan Deger Yok");
        }
        */
        
        
        /*
        
        int [][]matris={ {3,4,6,7},
                         {8,2,6,1},
                         {0,5,2,9} };
        
        int enbuyuk=matris[0][0];
        for(int i=0; i<matris.length; i++){
            for(int j=0; j<matris[i].length; j++){
                if(matris[i][j]>enbuyuk){
                    enbuyuk=matris[i][j];
                }
            }
        }
        System.out.println(enbuyuk);
        */
        
        
        /*
        
        int [][]matris={ {3,4,6,7},
                         {8,2,6,1},
                         {0,5,2,9} };
        
        int ciftsayi=0;
        for(int i=0; i<matris.length; i++){
            for(int j=0; j<matris.length; j++){
                if(matris[i][j]%2==0){
                    ciftsayi=matris[i][j];
                    System.out.print(ciftsayi+" ");
                }
            }
        }
        */
        
        /*
        
        int [][]matris={ {3,4,6,7},
                         {8,2,6,1},
                         {0,5,2,9} };
        
        int toplam=0;
        double ortalama=0;
        for(int i=0; i<matris.length; i++){
            for(int j=0; j<matris[i].length; j++){
                toplam+=matris[i][j];
                ortalama=(double)toplam/matris.length;
            }
        }
        System.out.println(ortalama);
        */
        
        
        /*
        
        int [][]matris={ {3,4,6,7},
                         {8,2,6,1},
                         {0,5,2,9} };
        
        int toplam=0;
        for(int i=0; i<matris.length; i++){
            for(int j=0; j<matris[i].length; j++){
                
                if(matris[i][j]%2==1){
                    toplam+=matris[i][j];
                }
            }
        }
        System.out.println("Toplam: "+toplam);
        */
        
        
        /*
        
        int [][]matris={ {-3,5,6,7},
                         {8,-2,6,-1},
                         {0,-5,2,9} };
        
        int toplam=0;
        for(int i=0; i<matris.length; i++){
            for(int j=0; j<matris[i].length; j++){
                
                if(matris[i][j]<0){
                    toplam+=matris[i][j];
                }
            }
        }
        System.out.println("Toplam: "+toplam);
        */      