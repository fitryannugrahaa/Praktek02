package praktek02;

public class handphone {
    int harga_handphone;
    int jumlah_handphone;

    public handphone() {
        harga_handphone=2000000;
        jumlah_handphone=4;
    }

    void CetakInfo () {
        System.out.println("=============================");
        System.out.println("harga_handphone      :"+harga_handphone);
        System.out.println("jumlah_handpone     :"+jumlah_handphone);
        System.out.println("=============================");
        }
    int hitungtotal(){
        int total;
        total=harga_handphone*jumlah_handphone;
        return total;
    }
    void cetaktotal(){
        System.out.println("Totalnya adalah: "+hitungtotal());
     }
}   