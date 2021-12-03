package Object;

import java.util.Scanner;

public class LapTopOut extends LapTop{
	private String orgin;
	private double extraOut;
	
	public LapTopOut() {
	}

	public LapTopOut(String orgin, double extraOut) {
		this.orgin = orgin;
		this.extraOut = extraOut;
	}

	public String getOrgin() {
		return orgin;
	}

	public void setOrgin(String orgin) {
		this.orgin = orgin;
	}

	public double getExtraOut() {
		return extraOut;
	}

	public void setExtraOut(double extraOut) {
		this.extraOut = extraOut;
	}
	
	public void input(LapTopArrayList L) {
		Scanner sc = new Scanner(System.in);
		super.input(L);
        System.out.print("Nhap Orgin: ");
        this.orgin = sc.nextLine();
        System.out.print("Nhap ExtraOut: ");
        this.extraOut = sc.nextDouble();
	}
	public double priceForSale() {
        return this.getPrice() + this.getExtraOut() + 0.1 * this.getExtraOut();
    }

	@Override
	public String toString() {
		return "LapTopOut [ID=" + this.getId() + ", Name=" + this.getName() + ", Price=" + this.getPrice() + ", PriceForSale=" + this.priceForSale() + ", Orgin=" + this.orgin + ", ExtraIn=" + this.extraOut + "]";

	}
	
	
}
