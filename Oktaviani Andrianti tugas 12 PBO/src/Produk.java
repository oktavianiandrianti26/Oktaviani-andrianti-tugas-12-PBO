import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Produk implements TransaksiPembelian {
    private String namaProduk;
    private double hargaProduk;
    private int jumlahProduk;
    private double totalHarga;

    public Produk() {
        inputData();
        calculateTotal();
    }

    @Override
    public String getStringUppercase() {
        return namaProduk.toUpperCase();
    }
       
     @Override
    public String getTanggalPembelian() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        return sdf.format(new Date());
    }

    @Override
    public void inputData() {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nama Produk: ");
        this.namaProduk = scanner.nextLine();
        System.out.println("Harga Produk: ");
        this.hargaProduk = Double.parseDouble(scanner.nextLine());
        boolean jumlah = false;
        while (!jumlah) {
            try {
                    System.out.println("Jumlah Beli: ");
                    this.jumlahProduk = scanner.nextInt();
                    if (jumlahProduk <= 0) throw new Exception();
                    jumlah = true;
            }
            catch (Exception e) {
                System.out.println("Input Data salah");
            }
        }
    }

    private void calculateTotal(){
        this.totalHarga = hargaProduk * jumlahProduk;
    }

    @Override
    public void tampilkanData() {
        System.out.println("=====================================");
        System.out.println("Data Belanja:");
        System.out.println("Nama Produk: " + namaProduk);
        System.out.println("Harga Produk: " + hargaProduk);
        System.out.println("Jumlah Produk: " + jumlahProduk);
        System.out.println("Total : " + totalHarga);
        System.out.println("=====================================");
    }    
}
