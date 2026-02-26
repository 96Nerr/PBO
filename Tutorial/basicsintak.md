# **Basic Syntax**
1. **Case Sensitivity** Java adalah bahasa pemrograman yang sensitif terhadap huruf besar/kecil, artinya identifikasi Hello dan hello akan memiliki arti yang berbeda dalam Java.

2. **Class Names** Untuk semua nama kelas, huruf pertama harus ditulis dengan huruf besar. Jika beberapa kata digunakan untuk membentuk nama kelas, huruf pertama setiap kata di dalamnya harus ditulis dengan huruf besar.
Contoh − class MyFirstJavaClass

3. **Method Names** Semua nama metode harus dimulai dengan huruf kecil. Jika beberapa kata digunakan untuk membentuk nama metode, maka huruf pertama setiap kata di dalamnya harus huruf besar.
Contoh − public void myMethodName()

4. **Program File Name** Nama berkas program harus persis sama dengan nama kelas. Saat menyimpan berkas, Anda harus menyimpannya menggunakan nama kelas (Ingat, Java sensitif terhadap huruf besar/kecil) dan menambahkan ‘.java’ di akhir nama (jika nama berkas dan nama kelas tidak cocok, program Anda tidak akan dikompilasi). Namun, harap diperhatikan bahwa jika tidak ada kelas publik dalam berkas, nama berkas dapat berbeda dari nama kelas. Tidak wajib memiliki kelas publik dalam berkas. Contoh − Asumsikan ‘MyFirstJavaProgram’ adalah nama kelas. Maka berkas harus disimpan sebagai ‘MyFirstJavaProgram.java’

5. **public static void main(String args[])**, Pemrosesan program Java dimulai dari metode main(), yang merupakan bagian wajib dari setiap program Java.

# **Java Identifiers**

Semua identifikasi harus dimulai dengan huruf (A hingga Z atau a hingga z), karakter mata uang ($), atau garis bawah (_).

Setelah karakter pertama, identifikasi dapat terdiri dari kombinasi karakter apa pun.

Sebuah kata kunci tidak boleh digunakan sebagai identifikasi.  

Yang paling penting, identifikasi bersifat peka huruf besar-kecil.  

Contoh identifikasi yang sah: age, $salary, _value, __1_value.  

Contoh identifikasi yang tidak sah: 123abc, -salary.

# **Java Modifiers**

Seperti bahasa pemrograman lainnya, dimungkinkan untuk memodifikasi kelas, metode, dan sebagainya, dengan menggunakan modifikator. Ada dua kategori modifikator

Access Modifiers − default, public, protected, private
Non-access Modifiers − final, abstract, strictfp

Kami akan membahas lebih detail tentang modifikator pada bagian berikutnya.

# **Java Variables**

Berikut adalah jenis-jenis variabel dalam Java: 
Local Variables
Class Variables (Static Variables)
Instance Variables (Non-static Variables)

# **Java Arrays**

Array adalah objek yang menyimpan beberapa variabel dengan tipe yang sama. Namun, array itu sendiri adalah objek yang berada di heap. Kita akan membahas cara mendeklarasikan, membuat, dan menginisialisasi array dalam bab-bab berikutnya.

# Java Enums
Enums diperkenalkan dalam Java 5.0. Enums membatasi variabel untuk memiliki salah satu dari beberapa nilai yang telah didefinisikan sebelumnya. Nilai-nilai dalam daftar enumerasi ini disebut enums.

Dengan menggunakan enums, Anda dapat mengurangi jumlah bug dalam kode Anda.

Misalnya, jika kita mempertimbangkan aplikasi untuk toko jus segar, kita dapat membatasi ukuran gelas menjadi kecil, sedang, dan besar. Hal ini akan memastikan bahwa tidak ada yang dapat memesan ukuran selain kecil, sedang, atau besar.

Contoh: 
[[helloworld.java]]