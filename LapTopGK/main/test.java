package main;


import java.util.Scanner;

import Object.LapTop;
import Object.LapTopArrayList;
import Object.LapTopIn;
import Object.LapTopOut;

public class test {
	public static void displayMenu() {
        System.out.println("+---------------------------- Menu --------------------------------+");
        System.out.println("| 1) Them LapTop vao danh sach gom LapTopIn và LapTopOut              |");
        System.out.println("| 2) In ra danh sach LapTop                                         |");
        System.out.println("| 3) In danh sach LapTopIn va LapTopOut có priceForSale lon hon 20   |");
        System.out.println("| 4) Tinh tong số LapTop co trong danh sach                         |");
        System.out.println("| 5) Thoat                                                         |");
        System.out.println("+------------------------------------------------------------------+");
    }
	
	public static void main(String[] args) {
		LapTopArrayList L = new LapTopArrayList();
		Scanner sc = new Scanner(System.in);
		boolean menu = true;
		int choice1 = 0, choice2 = 0;
		String temp;
		
		while(menu) {
			displayMenu();
			System.out.print("Nhap lua chon cua ban: ");
			temp = sc.nextLine();
			try {
				choice1 = Integer.parseInt(temp);
			}catch (Exception e) {
				System.out.println("Lua chon khong dung");
				continue;
			}
			switch(choice1) {
            case 1:
                System.out.println("+---------------------------- Menu --------------------------------+");
                System.out.println("| 1) Them LapTopIn                                                  |");
                System.out.println("| 2) Them LapTopOut                                                 |");
                System.out.println("+------------------------------------------------------------------+");
                System.out.print("Nhap lua chon cua ban: ");    
                temp = sc.nextLine();
		
			try {
				choice2 = Integer.parseInt(temp);
			}catch (Exception e) {
				System.out.println("Lua chon khong dung");
				continue;
			}
			LapTop l = new LapTop();
			switch (choice2) {
            case 1:
                l = new LapTopIn();
                l.input(L);
                L.add(l);
                break;
            case 2:
                l = new LapTopOut();
                l.input(L);
                L.add(l);
                break;
            default:
                System.out.println("Lua chon khong dung");
                break;
			}
			break;
		case 2:
            L.show();
            break;
        case 3:
            L.priceForSaleGreater20();
            break;
        case 4:
            System.out.println("Number of fruit: " + L.NumberOfLapTop());
            break;
        case 5:
            menu = false;
            break;
        default:
            System.out.println("Lua chon khong dung");
            break;
    }
}
	System.out.println("Ket Thuc");
	}		

}











