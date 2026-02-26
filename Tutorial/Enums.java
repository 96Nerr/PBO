class FreshJuice {
   enum FreshJuiceSize{ SMALL, MEDIUM, LARGE }
   FreshJuiceSize size;
}

public class FreshJuiceTest {

   public static void main(String args[]) {
      FreshJuice juice = new FreshJuice();
      juice.size = FreshJuice.FreshJuiceSize.MEDIUM ;
      System.out.println("Size: " + juice.size);
   }
}

//Enums can be declared as their own or inside a class. Methods, variables, constructors can be defined inside enums as well.

//*Di Java, enum (singkatan dari enumeration) adalah tipe data khusus
// yang digunakan untuk mendefinisikan sekumpulan konstanta yang tetap dan terbatas.
// Misalnya, jika kita ingin menyimpan hari dalam seminggu, kita bisa membuat enum bernama
// Hari dengan nilai SENIN, SELASA, RABU, …. Dengan enum, kode menjadi lebih terstruktur, aman, dan mudah dibaca
// karena kita tidak lagi menggunakan angka atau string secara bebas untuk mewakili nilai tertentu. Selain itu,
// enum juga bisa memiliki atribut, metode, dan konstruktor sendiri, sehingga fungsinya lebih fleksibel daripada sekadar daftar konstanta biasa.