package praktek02;

public class HandphoneAksi {
    public static void main(String[] args) {
        handphone r1 = new handphone();

        r1.harga_handphone = 4000000;
        r1.jumlah_handphone = 2;
        
        r1.CetakInfo();
        System.out.println("total = "+r1.hitungtotal());
         r1.cetaktotal();
    }
}
