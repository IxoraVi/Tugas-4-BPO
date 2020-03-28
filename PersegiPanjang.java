import java.util.Scanner;
public class PersegiPanjang {
	public static void LuasPersegi(){
	int panjang , lebar ;
       int Luas;
	Luas = panjang * lebar;
   }
	public static void KelilingPersegi(){
	int panjang, lebar ;
       int Keliling ;
	 Keliling = 2*(panjang + lebar);
   }
	
    public static void main (String [] args) {
          Scanner nilai = new Scanner (System.in);
          int panjang , lebar ;
          System.out.print("Masukan panjang = ");
          panjang = nilai.nextInt();
          System.out.print("Masukan lebar = ");
          lebar = nilai.nextInt();
          
          System.out.println("Luas Persegi Panjang = "+LuasPersegi());
          System.out.println("Keliling Persegi Panjang = "+KelilingPersegi());
    }
}