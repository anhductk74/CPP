package Object;

import java.util.Scanner;

public class LapTopIn extends LapTop{
	private double extraIn;

	public LapTopIn(double extraIn) {
		this.extraIn = extraIn;
	}

	public LapTopIn() {
	}

	public double getExtraIn() {
		return extraIn;
	}

	public void setExtraIn(double extraIn) {
		this.extraIn = extraIn;
	}
	
	public void input(LapTopArrayList L) {
		Scanner sc = new Scanner(System.in);
		super.input(L);
		System.out.print("Nhap ExtraIn: ");
        this.extraIn = sc.nextDouble();
	}
	public double priceForSale() {
        return this.getPrice() + this.getExtraIn();
    }
	
	@Override
	public String toString() {
		return "LapTopIn  [ID=" + this.getId() + ", Name=" + this.getName() + ", Price=" + this.getPrice() + ", PriceForSale=" + this.priceForSale() + ", ExtraIn=" + this.extraIn + "]";
	}

	
	
	
}
