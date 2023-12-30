package conroller;

import java.util.Scanner;
import service.HotelService;
import serviceimpl.HotelServiceImpl;

public class HotelApp {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		HotelService h1 = new HotelServiceImpl();
		System.out.println("******WELCOME TO URL palace*****");
		while (true) {
			System.out.println("--------------Menu------------");
			System.out.println("Pick Your Option:");
			System.out.println("1.SHOW ROOMS\n2.AVAILABLE ROOMS\n3.R00MS ALLOCATION\n4.CHECK OUT\n5.EXIT");
			int op = input.nextInt();
			switch (op) {
			case 1:
				h1.roomInfo();
				break;
			case 2:
				h1.AvailableRooms();
				break;
			case 3:
				h1.allocateRoom();
				break;
			case 4:
				h1.checkOut();
				break;

			case 5:
				System.out.println("Thank You Visit Again");
				System.exit(0);

			}

		}

	}
}
