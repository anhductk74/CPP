package Object;


import java.util.Scanner;

import Interface.ILapTop;

public class LapTop implements ILapTop{
	private int id;
	private String name;
	private double price;
	
	public LapTop() {
	}

	public LapTop(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	public boolean checkID(int id, LapTopArrayList L) {
		for(int i=0; i< L.LapList.size(); i++) {
			if(L.LapList.get(i).getId()==id) {
				return false;
			}
		}
		return true;
	}
	
	public void input(LapTopArrayList L) {
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		do {
			System.out.print("Nhap ID: ");
            this.id = sc.nextInt();
            check = checkID(this.id, L);
            if(check==false) {
            	System.out.println("ID da ton taij, vui long nhap ID khac");
            }
		}while (check==false);
		sc.nextLine();
		System.out.print("Nhap Name: ");
        this.name = sc.nextLine();
        System.out.print("Nhap Price: ");
        this.price = sc.nextDouble();
	}
	

	@Override
	public String toString() {
		return "LapTop [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

	@Override
	public double priceForSale() {
		// TODO Auto-generated method stub
		return 0;
	}

	


	
	
	
}
