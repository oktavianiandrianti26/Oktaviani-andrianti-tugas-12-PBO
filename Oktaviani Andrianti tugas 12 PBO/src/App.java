public class App {
    public static void main(String[] args) {
        TransaksiPembelian transaksi1 = new Pembeli(); // Objek Produk sebagai DetailTransaksi menggunakan polimorfisme
        TransaksiPembelian transaksi2 = new Produk();  // Memanggil metode sesuai dengan perilaku yang bervariasi

        System.out.println("Tanggal Pembelian: " + transaksi1.getTanggalPembelian());
        System.out.println();
        transaksi1.tampilkanData(); 
        System.out.println();

        System.out.println("Tanggal Pembelian: " + transaksi2.getTanggalPembelian());
        System.out.println();
        transaksi2.tampilkanData(); 
        System.out.println();
        
    }
}
