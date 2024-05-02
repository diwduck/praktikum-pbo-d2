package modul_a;

public class Coercion {
	
	public static void soal1(){
        int output = 'a'; 
        System.out.println(output);
     // Menjadi kode ASCII dari karakter 'a', yaitu 97
    }

    public static void soal2(){
        // double x = 15.5;
        // int output = x; 
        // System.out.println(output);
    // Tidak bisa melakukan koersi dari double menjadi integer
    }

    public static void soal3(){
        int y = 25;
        double output = y; 
        System.out.println(output);
     // Mengubah integer menjadi double, dengan koma menjadi 25.0
    }

    public static void soal4(){
        int z = 78;
        char output = (char) z; 
        System.out.println(output);
     // Melakukan casting dari integer menjadi char, dengan kode ASCII menjadi karakter 'N'
    }

    public static void soal5(){
        char a = 'a';
        double output = a; 
        System.out.println(output);
     // Melakukan coercion dari karakter 'a', menjadi double yaitu 97.0
    }

    public static void main(String[] args) {
        soal1();
        soal2();
        soal3();
        soal4();
        soal5();
     // Mennjalankan semua soal
    }
}
