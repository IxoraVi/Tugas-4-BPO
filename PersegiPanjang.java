import java.util.Scanner;
public class PersegiPanjang {
    public static void main (String [] args) {
          Scanner nilai = new Scanner (System.in);
		int panjang , lebar, pilihan ;
 	  System.out.print("Masukan panjang = ");
          panjang = nilai.nextInt();
          System.out.print("Masukan lebar = ");
          lebar = nilai.nextInt();
	  System.out.print("Masukan Pilihan = ");
          pilihan = nilai.nextInt();
          if (pilihan == 1){
		int Luas;
		Luas = panjang * lebar;
		LuasPersegi();
		System.out.println(+Luas);
	  }else if (pilihan == 2){
		int Keliling;
	 	Keliling = 2*(panjang + lebar);
		KelilingPersegi();
		System.out.println(+Keliling);
	  }else {System.out.println("Maaf Angka tidak terdeteksi");
	  }
    }
		public static void LuasPersegi(){
		System.out.print("Luas Persegi Panjang = ");
   	}
	public static void KelilingPersegi(){
		System.out.print("Keliling Persegi Panjang = ");
   	}
}