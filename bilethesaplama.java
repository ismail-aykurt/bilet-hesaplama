import java.util.Scanner;

public class bilethesaplama {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double mesafe=2.1,fiyat,yasindirimi=0,biletindirim;
        int yas,yolculukTipi,km;
        System.out.println("Merhabalar İSMAİL TURİZM o bilet sayfasına hoşgeldiniz.\nLÜtfen aşağıdaki yerleri doldurunuz");
        System.out.print("Lütfen gideceğiniz yerin mesafesini(KM)olarak giriniz:");
        km=input.nextInt();
        System.out.print("Lütfen yaşınızı giriniz:");
        yas=input.nextInt();

        System.out.print("Lütfen yolculuk tipini seçiniz--(1=gidiş 2=gidiş-geliş:)");
        yolculukTipi=input.nextInt();

        if(km>0 && yas>0 && (yolculukTipi==1 || yolculukTipi==2 )) {
            fiyat=km * mesafe;
            if(yas<12  ) {
                yasindirimi=fiyat * 0.5;
                fiyat-=yasindirimi;


            }else if(yas>12 && yas<24) {
                yasindirimi=fiyat * 0.10;
                fiyat-=yasindirimi;
            }else if(yas>=65) {
                yasindirimi*=0.30;
                fiyat-=yasindirimi;
            }else{
                yasindirimi=0;
                fiyat-=yasindirimi;
            }if(yolculukTipi==2) {
                biletindirim=fiyat * 0.20;
                fiyat=(fiyat-biletindirim)*2;

            }
            System.out.println("Bilet tutarınız="+fiyat+"TL'dir.\nBizleri tercih ettiğiniz için teşekkür eder iyi günler dileriz:)");

        }else{
            System.out.println("Hatalı tuslama yaptınız lütfen daha sonra tekrar deneyiniz..");
        }

    }
}
