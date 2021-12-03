package Object;

import java.util.ArrayList;

public class LapTopArrayList {
	ArrayList<LapTop> LapList = new ArrayList<>();

	public LapTopArrayList() {
	}

	public LapTopArrayList(ArrayList<LapTop> lapList) {
		LapList = lapList;
	}

	public ArrayList<LapTop> getLapList() {
		return LapList;
	}

	public void setLapList(ArrayList<LapTop> lapList) {
		LapList = lapList;
	}
	
	public void add(LapTop l) {
		this.LapList.add(l);
	}
	
	public void show() {
		if(this.LapList.size()==0) {
			System.out.println("Chua co Laptop nao");
		}
		for(int i=0; i<this.LapList.size(); i++) {
			System.out.println(this.LapList.get(i).toString());
		}
	}
	
	public void priceForSaleGreater20() {
		boolean flag = true;
		for(int i=0; i<this.LapList.size(); i++) {
			if(this.LapList.get(i).priceForSale()>20) {
				System.out.println(this.LapList.get(i).toString());
				flag = false;
			}
		if(flag)
			System.out.println("Khong co LapTop nao co PriceForSale lon hon 20.");
		}
	}
	
	public int NumberOfLapTop() {
		return this.LapList.size();
	}
}











