package modul_b.Sewa;

public class Vehicle {
	void callRent(int distance, float price){
        float fare = distance * price;
        System.out.println("Vehicle Price = " + fare);
    }
}
