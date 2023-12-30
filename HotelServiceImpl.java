package serviceimpl;

import java.util.LinkedHashMap;
import java.util.Scanner;

import dao.HotelRepo;
import entity.Address;
import entity.Customer;
import service.HotelService;

public class HotelServiceImpl implements HotelService, HotelRepo {
	Scanner input = new Scanner(System.in);
	{
		for (int i = 1; i <= 10; i++) {
			cm.put(i, null);
		}
		for (int i = 1; i <= 8; i++) {
			sm.put(i, null);
		}
		for (int i = 1; i <= 5; i++) {
			dm.put(i, null);
		}
	}

	@Override
	public void roomInfo() {
		System.out.println("=======CLASSIC ROOMS======");
		System.out.println("Hot Water:Available");
		System.out.println("AC:Not Available");
		System.out.println("Tv:Not Available");
		System.out.println("Wifi:Not Available");
		System.out.println("Price: 2,000 /Rs");
		System.out.println("=======STANDARD ROOMS======");
		System.out.println("Hot Water:Available");
		System.out.println("AC:Not Available");
		System.out.println("Tv: Available");
		System.out.println("Wifi:Not Available");
		System.out.println("Price: 2,500 /Rs");
		System.out.println("=======DELUXE ROOMS========");
		System.out.println("Hot Water:Available");
		System.out.println("AC: Available");
		System.out.println("Tv: Available");
		System.out.println("Wifi: Available");
		System.out.println("Price: 3,500 /Rs");

	}

	@Override
	public void CheckRoom(LinkedHashMap<Integer, Customer> l1) {
		boolean flag = false;
		for (Integer ele : l1.keySet()) {
			if (l1.get(ele) == null) {
				System.out.print(ele + " ");
				flag = true;
			}
		}
		System.out.println();
		if (flag == false) {
			System.out.println("NO ROOMS ARE AVAILABLE");
		}

	}

	@Override
	public void AvailableRooms() {
		System.out.println("Available rooms");
		System.out.println("clasic rooms");
		CheckRoom(cm);
		System.out.println("Standard rooms");
		CheckRoom(sm);
		System.out.println("Deluxe Rooms");
		CheckRoom(dm);

	}

	public Customer createCustomer() {
		System.out.println("******Enter Customer Details*****");
		System.out.println("Enter Customer Id:");
		int id = input.nextInt();
		System.out.println("Enter Customer Name:");
		String name = input.next();
		System.out.println("Enter Customer Age:");
		int age = input.nextInt();
		System.out.println("Enter Customer Phone No:");
		long phone = input.nextLong();
		System.out.println("Enter Door No:");
		String doorno = input.next();
		System.out.println("Enter Street:");
		String street = input.next();
		System.out.println("Enter District:");
		String dist = input.next();
		System.out.println("Enter State:");
		String state = input.next();
		System.out.println("Enter Country:");
		String country = input.next();
		System.out.println("Enter Pincode: ");
		int pincode = input.nextInt();
		Address a = new Address(doorno, street, dist, state, country, pincode);
		return new Customer(id, name, age, phone, a);
	}

	public void mapRoom(LinkedHashMap<Integer, Customer> l1, int roomNo, double amt) {
		if (l1.get(roomNo) == null) {
			Customer c = createCustomer();
			A1.add(c);
			l1.put(roomNo, c);
			c.setAmount(amt);
			System.out.println("Room No:" + roomNo + "has been allocated for " + c.getCus_name());

		} else {
			System.out.println("Room Is Not Available");
		}

	}

	@Override
	public void allocateRoom() {
		System.out.println("1.CLASSIC ROOMS\n2.STANDARD ROOMS\n3.DELUXE ROOMS\n4.EXIT");

		System.out.println("Which Type Of Room U Want");
		int room = input.nextInt();
		switch (room) {
		case 1:
			System.out.println("Classic Rooms");
			CheckRoom(cm);
			System.out.println("Coose Your Room No:");
			int r1 = input.nextInt();
			if (r1 >= 1 && r1 <= 10) {
				mapRoom(cm, r1, 2000);
			} else {
				System.out.println("Choose Corect Room Only");
			}
			break;
		case 2:
			System.out.println("Standard Rooms");
			CheckRoom(sm);
			System.out.println("Coose Your Room No:");
			int r2 = input.nextInt();
			if (r2 >= 1 && r2 <= 8) {
				mapRoom(sm, r2, 2500);
			} else {
				System.out.println("Choose Corect Room Only");
			}
			break;
		case 3:
			System.out.println("Deluxe Rooms");
			CheckRoom(dm);
			System.out.println("Coose Your Room No:");
			int r3 = input.nextInt();
			if (r3 >= 1 && r3 <= 5) {
				mapRoom(dm, r3, 3500);
			} else {
				System.out.println("Choose Corect Room Only");
			}
			break;
		default:
			System.out.println("Invalid");
			System.exit(0);

		}

	}

	void unmapRoom(LinkedHashMap<Integer, Customer> l1, int roomNo) {
		if (l1.get(roomNo) != null) {
			Customer c1 = l1.get(roomNo);
			System.out.println(c1);
			System.out.println(c1.getCus_name() + " need To Pay" + c1.getAmount() + " Rs");
			l1.put(roomNo, null);
		} else {
			System.out.println("Invalid RoomNo");
		}
	}

	@Override
	public void checkOut() {
		System.out.println("Choose Your Type Of Room:");
		System.out.println("1.CLASSIC ROOMS\n2.STANDARD ROOMS\n3.DELUXE ROOMS");
		int ch = input.nextInt();
		System.out.println("Enter Your Room NO:");
		int rn = input.nextInt();
		switch (ch) {
		case 1:
			if (rn >= 1 && rn <= 10) {
				unmapRoom(cm, rn);
			} else {
				System.out.println("Invalid Room No......!!!!");
			}
			break;
		case 2:
			if (rn >= 1 && rn <= 8) {
				unmapRoom(sm, rn);
			} else {
				System.out.println("Invalid Room No......!!!!");
			}
			break;
		case 3:
			if (rn >= 1 && rn <= 5) {
				unmapRoom(dm, rn);
			} else {
				System.out.println("Invalid Room No......!!!!");
			}
			break;
		default:
			System.out.println("Invalid Credential");
		}

	}

	@Override
	public void findAllCustomer() {
		if (A1.size() == 0) {
			System.out.println("Database Is Empty....");
		} else {
			for (Customer ele : A1) {
				System.out.println(ele);
			}
		}
	}

	@Override
	public void getCustomerUsingId() {
		boolean flag = false;
		System.out.println("Enter Your Customer Id:");
		int cid = input.nextInt();
		for (Customer ele : A1) {
			if (ele.getCus_id() == cid) {
				System.out.println(ele);
				flag = true;
				break;
			}
		}
		if (flag == false) {
			System.out.println("Invalid Customer Id...!!!!");
		}
	}
}
