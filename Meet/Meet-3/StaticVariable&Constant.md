# Static Variable dan Constant dalam Java

## 📌 **Definisi**

### **Static Variable**
**Static variable** adalah variabel yang:
- Dimiliki oleh **class**, bukan oleh objek individual
- **Dibagi bersama** oleh semua instance (objek) dari class tersebut
- Hanya ada **satu salinan** di memori, terlepas dari berapa banyak objek yang dibuat
- Diakses menggunakan nama class, bukan nama objek
- Disimpan di **memory area** yang berbeda dari instance variable

### **Constant (Konstanta)**
**Constant** adalah variabel yang:
- Nilainya **tidak dapat diubah** setelah ditetapkan (immutable)
- Menggunakan keyword `final`
- Umumnya dikombinasikan dengan `static` → `static final`
- Konvensi penamaan menggunakan **HURUF_KAPITAL_SEMUA**

---

## 🔧 **Sintaks dan Penggunaan**

### **Static Variable**
```java
public class NamaClass {
    // Static variable
    public static int jumlahObjek = 0;
    private static String namaSekolah = "Universitas ABC";
    
    // Instance variable (untuk perbandingan)
    public String nama;
    
    // Constructor
    public NamaClass(String nama) {
        this.nama = nama;
        jumlahObjek++; // Menambah counter setiap objek dibuat
    }
}
```

### **Constant**
```java
public class MatematikaKonstanta {
    // Constant - static final
    public static final double PI = 3.14159265359;
    public static final int HARI_DALAM_MINGGU = 7;
    public static final String NAMA_APLIKASI = "Sistem Akademik";
    
    // Final variable (non-static) - harus diinisialisasi
    public final long waktuDibuat = System.currentTimeMillis();
}
```

---

## 📝 **Contoh Implementasi Lengkap**

### **Contoh 1: Static Variable untuk Counter**
```java
public class Mahasiswa {
    // Static variable untuk menghitung jumlah mahasiswa
    public static int totalMahasiswa = 0;
    public static String namaUniversitas = "Universitas Indonesia";
    
    // Instance variables
    private String nama;
    private String nim;
    
    // Constructor
    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
        totalMahasiswa++; // Increment setiap objek baru dibuat
    }
    
    // Static method untuk mengakses static variable
    public static int getTotalMahasiswa() {
        return totalMahasiswa;
    }
    
    // Method untuk menampilkan info
    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Total Mahasiswa: " + totalMahasiswa);
        System.out.println("Universitas: " + namaUniversitas);
    }
}
```

### **Contoh 2: Constant untuk Nilai Tetap**
```java
public class PerhitunganMatematika {
    // Constants
    public static final double PI = 3.14159265359;
    public static final double E = 2.71828182846;
    public static final int DETIK_PER_MENIT = 60;
    public static final int MENIT_PER_JAM = 60;
    
    // Method menggunakan constant
    public static double hitungLuasLingkaran(double radius) {
        return PI * radius * radius;
    }
    
    public static double hitungKelilingLingkaran(double radius) {
        return 2 * PI * radius;
    }
    
    public static int konversiJamKeDetik(int jam) {
        return jam * MENIT_PER_JAM * DETIK_PER_MENIT;
    }
}
```

### **Contoh Testing:**
```java
public class TestStaticDanConstant {
    public static void main(String[] args) {
        // Testing Static Variable
        System.out.println("=== TESTING STATIC VARIABLE ===");
        System.out.println("Total awal: " + Mahasiswa.getTotalMahasiswa());
        
        Mahasiswa mhs1 = new Mahasiswa("Alice", "001");
        Mahasiswa mhs2 = new Mahasiswa("Bob", "002");
        Mahasiswa mhs3 = new Mahasiswa("Charlie", "003");
        
        System.out.println("Setelah membuat 3 objek:");
        mhs1.tampilkanInfo();
        System.out.println("---");
        mhs3.tampilkanInfo();
        
        // Testing Constant
        System.out.println("\n=== TESTING CONSTANT ===");
        double radius = 5.0;
        System.out.println("Radius: " + radius);
        System.out.println("Luas lingkaran: " + 
            PerhitunganMatematika.hitungLuasLingkaran(radius));
        System.out.println("Keliling lingkaran: " + 
            PerhitunganMatematika.hitungKelilingLingkaran(radius));
        
        int jam = 2;
        System.out.println(jam + " jam = " + 
            PerhitunganMatematika.konversiJamKeDetik(jam) + " detik");
    }
}
```

---

## ⚖️ **Perbandingan**

| Aspek | Instance Variable | Static Variable | Constant |
|-------|------------------|-----------------|----------|
| **Kepemilikan** | Objek individual | Class | Class |
| **Memory** | Per objek | Satu untuk semua objek | Satu untuk semua objek |
| **Akses** | `objek.variable` | `Class.variable` | `Class.CONSTANT` |
| **Inisialisasi** | Constructor/method | Saat class dimuat | Saat deklarasi |
| **Dapat diubah** | ✅ Ya | ✅ Ya | ❌ Tidak |

---

## 🎯 **Kapan Menggunakan?**

### **Gunakan Static Variable ketika:**
- Perlu **berbagi data** antar semua objek
- Membuat **counter** atau **tracker**
- Menyimpan **konfigurasi global**
- Data yang **tidak bergantung** pada objek tertentu

### **Gunakan Constant ketika:**
- Nilai **tidak boleh berubah** sepanjang program
- **Konfigurasi tetap** seperti PI, URL, path file
- **Magic numbers** yang sering digunakan
- **Standar** atau **spesifikasi** yang tetap

---

## ⚠️ **Best Practices**

### **Static Variable:**
1. **Minimalisasi penggunaan** - karena sulit di-debug
2. **Thread-safe** - gunakan `synchronized` jika diperlukan
3. **Memory conscious** - static variable tidak di-garbage collect
4. **Clear naming** - nama yang jelas dan deskriptif

### **Constant:**
1. **NAMING_CONVENTION** - selalu gunakan HURUF_KAPITAL
2. **Dokumentasi** - jelaskan arti dan sumber constant
3. **Grouping** - kelompokkan constant terkait dalam satu class
4. **Public final static** - urutan modifier yang benar

---

## 🚨 **Kesalahan Umum**

### **Static Variable:**
```java
// ❌ SALAH - mengakses static variable via objek
Mahasiswa mhs = new Mahasiswa("Alice", "001");
System.out.println(mhs.totalMahasiswa); // Bisa jalan tapi tidak disarankan

// ✅ BENAR - akses via class name
System.out.println(Mahasiswa.totalMahasiswa);
```

### **Constant:**
```java
// ❌ SALAH - constant harus diinisialisasi
public static final int NILAI; // Compilation error!

// ❌ SALAH - mencoba mengubah constant
PI = 3.14; // Compilation error!

// ✅ BENAR
public static final int NILAI = 100;
```

---

## 🎉 **Kesimpulan**

- **Static variable** memungkinkan berbagi data antar objek dan menghemat memory
- **Constant** memastikan nilai tidak berubah dan meningkatkan reliability code
- Keduanya diakses melalui **nama class**, bukan nama objek
- **Kombinasi static final** sering digunakan untuk konstanta global
- Gunakan dengan **bijak** untuk menghindari kompleksitas yang tidak perlu

> 💡 **Tips:** Static variable dan constant adalah fondasi penting untuk memahami konsep yang lebih advanced seperti Singleton Pattern, Factory Pattern, dan design patterns lainnya!
