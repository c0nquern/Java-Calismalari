
        /*
        double sayi1=10;
        double sayi2=5;
        double toplam=sayi1+sayi2;
        double fark=sayi1-sayi2;
        double çarpým=sayi1*sayi2;
        double bölüm=sayi1/sayi2;
        
        System.out.println("toplamý:"+toplam);
        System.out.println("farký:"+fark);
        System.out.println("çarpýmý:"+çarpým);
        System.out.println("bölüm:"+bölüm);
        */
        
        /*
        double gram1=40;
        double fiyat1=80;
        double gram2=60;
        double fiyat2=90;
        double ürün1=gram1/fiyat1;
        double ürün2=gram2/fiyat2;
        if(ürün1>ürün2)
        {
        System.out.println("1.ürün daha avantajlý");
        }
        else if(ürün2>ürün1)
        {
        System.out.println("2.ürün daha avantajlý");
        }
        */
        
        
       /*
        int sayi1=-5;
        int sayi2=3;
        int sayi3=7;
        
        if(sayi1<sayi2 && sayi1<sayi3)
        {
        System.out.println("artan");
        }
        else if(sayi1>sayi2 && sayi1>sayi3)
        {
        System.out.println("azalan");
        }
        else
        {
        System.out.println("sýrasýz");
        }        
        */

        
        
       /* 
     int sayi1=3;
     int sayi2=8;
     int sayi3=5;
     if(sayi1<sayi2 && sayi1<sayi3)
         if(sayi2<sayi3)
         {
         System.out.println(sayi1+","+sayi2+","+sayi3);
         }
     else
         {
         System.out.println(sayi1+","+sayi3+","+sayi2);
         }
     if(sayi2<sayi1 && sayi2<sayi3)
         if(sayi1<sayi3)
         {
         System.out.println(sayi2+","+sayi1+","+sayi3);
         }
     else
         {
         System.out.println(sayi2+","+sayi3+","+sayi1);
         }
     if(sayi3<sayi1 && sayi3<sayi2)
         if(sayi1<sayi2)
         {
         System.out.println(sayi3+","+sayi1+","+sayi2);
         }
     else
         {
         System.out.println(sayi3+","+sayi2+","+sayi1);
         }
        */
  
         

        /*
        int sayi=1;
        int sayi2=4;
        int sayi3=5;
        if(sayi+sayi2>=sayi3 && sayi+sayi3>=sayi2 && sayi3+sayi>=sayi2 && sayi3+sayi2>=sayi)
        {
        System.out.println("üçgen oluþur");
        }
        else
        {
        System.out.println("üçgen oluþmaz");
        }
        */
        
        
        /*
        int gun=22;
        int hesap=gun*10;
        int hesap2=gun*15+100;
        int hesap3=gun*20+300;
        if(gun<=7 && gun>=1)
        {
        System.out.println("Ceza Tutarýn:"+hesap+"Tl");
        }
        else if(gun<=21 && gun>=8)
        {
        System.out.println("Ceza Tutarýn:"+hesap2+"Tl");
        }
        else if(gun>21)
        {
        System.out.println("Ceza Tutarýn:"+hesap3+"Tl");
        }
        else
        {
        System.out.println("hata");
        }
        */
        
        
        /*
        String cinsiyet="erkek";
        String medeni="bekar";
        int yas=29;
        if(medeni=="evli")
        {
        System.out.println("sigorta yapýlýr");
        }
        else if(medeni=="bekar" && cinsiyet=="erkek" && yas>=30)
        {
        System.out.println("sigorta yapýlýr");
        }
        else if(medeni=="bekar" && cinsiyet=="kadýn" && yas>=25)
        {
        System.out.println("sigorta yapýlýr");
        }
        else
        {
        System.out.println("ÇALÝÞ ÇALÝÞ SÝGORTA SÝGORTA YOKK");
        }
        */          
        
        
        /*
        int maas=1000;
        int yil=35;
        int x=maas*20/100+maas;
        int y=maas*25/100+maas;
        int z=maas*30/100+maas;
        if(yil<=5 && yil>=0)
        {
        System.out.println("yeni maaþýnýz:"+x);
        }
        else if(yil>=6 && yil<=10)
        {
        System.out.println("yeni maaþýnýz:"+y);
        }
        else if(yil>=11)
        {
        System.out.println("yeni maaþýnýz:"+z);
        }
        else
        {
        System.out.println("hata");
        }
        */
        
        /*
        int sayi=17;
        int sayi2=16;
        int birler1=sayi%10;
        int birler2=sayi2%10;
        if(birler1>birler2)
        {
        System.out.println(birler1);
        }
        else if(birler1<birler2)
        {
        System.out.println(birler2);
        }
        else
        {
        System.out.println("hata");
        }
        */
        
        /*
        
        int rakam=10;
        switch(rakam)
        {
        case 0:
            System.out.println("sifir");
            break;
        case 1:
            System.out.println("bir");
            break;
        case 2:
            System.out.println("iki");
            break;
        case 3:
            System.out.println("uc");
            break;
        case 4:
            System.out.println("dort");
            break;
        case 5:
            System.out.println("bes");
            break;
        case 6:
            System.out.println("alti");
            break;
        case 7:
            System.out.println("yedi");
            break;
        case 8:
            System.out.println("sekiz");
            break;
        case 9:
            System.out.println("dokuz");
            break;
        default:
                    {
                    System.out.println("Bu bir rakam degildir");
                    }
        }
        
        */
        
        /*
        int fiyat=10;
        int yenifiyat=10;
        double zam=yenifiyat-fiyat/100*100;
        double indirim=fiyat-yenifiyat/100*100;
        if(yenifiyat>fiyat)
        {
        System.out.println("bu ürüne %"+zam+" zam gelmiþtir");
        }
        else if(yenifiyat<fiyat)
        {
        System.out.println("bu ürüne %"+indirim+" indirim gelmiþtir");
        }
        else if(fiyat==yenifiyat)
        {
        System.out.println("bu ürünün fiyatý deðiþmemiþtir");
        }
        else
        {
        System.out.println("hata");
        }
        */

        
     
        
        
        /*
        char A,B,C,D,E;
        String not="A";
        if(not=="A")
        {
        System.out.println("cok iyi");
        }
        else if(not=="B")
        {
        System.out.println("iyi");
        }
        else if(not=="C")
        {
        System.out.println("Orta");
        }
        else if(not=="D")
        {
        System.out.println("Kotu");
        }
        else if(not=="E")
        {
        System.out.println("Cok kotu");
        }
        else
        {
        System.out.println("Hata");
        }
        */
        
            
        
        
        
        /*
        
        double gano=3.4;
        if(3.5<=gano && gano<=4.0)
        {
        System.out.println("A");
        }
        else if(3.0<=gano && gano<=3.5)
        {
        System.out.println("B");
        }
          else if(2.5<=gano && gano<=3.0)
        {
        System.out.println("C");
        }
          else if(2.0<=gano && gano<=2.5)
        {
        System.out.println("D");
        }
          else if(1.5<=gano && gano<=2.0)
        {
        System.out.println("E");
        }
          else if(1.0<=gano && gano<=1.5)
        {
        System.out.println("F");
        }
        else
          {
          System.out.println("Hata");
          }
        
        */
        
        
        /*
       
        int vize=80;
        int odev=72;
        int fýnal=64;
        double donemsonunotu=0.3*vize+0.2*odev+0.5*fýnal;
        if(donemsonunotu>=70)
        {
        System.out.println("Gecti");
        }
        else if(donemsonunotu<70)
        {
        System.out.println("kaldi");
        }
        else
        {
        System.out.println("Hata");
        }
        
        */
        
        
        /*
        
        int sayi=5;
        int sayi2=-3;
        int sayi3=12;
        if(sayi<sayi2 && sayi<sayi3)
        {
        System.out.println("En kucuk deger:"+sayi);
        }
        else if(sayi2<sayi && sayi2<sayi3)
        {
        System.out.println("En kucuk deger"+sayi2);
        }
        else if(sayi3<sayi && sayi3<sayi2)
        {
        System.out.println("En kucuk deger:"+sayi3);
        }
        else
        {
        System.out.println("Hata");
        }
        
        */
        
        /*
        
        int sayi=5;
        int sayi2=-3;
        int sayi3=12;
        if(sayi>sayi2 && sayi>sayi3)
        {
        System.out.println("En buyuk deger:"+sayi);
        }
        else if(sayi2>sayi && sayi2>sayi3)
        {
        System.out.println("En buyuk deger:"+sayi2);
        }
        else if(sayi3>sayi && sayi3>sayi2)
        {
        System.out.println("En buyuk deger:"+sayi3);
        }
        else
        {
        System.out.println("Hata");
        }
        
        */
       
    
        
        /*
        
      int sayi=3;
      int sayi2=4;
      int sayi3=5;
      if(sayi+sayi2>sayi3 && sayi3+sayi2>sayi)
      {
      System.out.println("ucgen olusur");
      }
      else
      {
      System.out.println("ucgen olusmaz");
      }
        */
        
        /*
        int hiz=140;
        int sonhiz=120;
        if(hiz>sonhiz)
        {
        System.out.println("hýzlanýyor");
        }
        else if(hiz<sonhiz)
        {
        System.out.println("yavaþlýyor");
        }
        else if(hiz==sonhiz)
        {
        System.out.println("sabit hýzda");
        }
        else
        {
        System.out.println("hata");
        }
        */  

      
        
       /*
        
        int derece=200;
        if(derece<=0)
        {
            System.out.println("Buz");
        }
        else if(derece>0 && derece<=100)
        {
            System.out.println("Sivi");
        }
        else if(derece>100)
        {
            System.out.println("Gaz");
        }
        else
        {
         System.out.println("Hata");
        }
        
         */
        
        
       
        /*
        
        int sayi=5;
        if(sayi>0)
        {
            System.out.println("Bu sayý pozitif");
            
        }
        else if(sayi<0)
        {
            System.out.println("Bu sayý negatif");
        
        }
         else if(sayi==0)
        {
            System.out.println("Bu sayý nötr");
        
        }
        else
         {
             System.out.println("Hata");
         
         }
        
         */
        
