package dao;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import entity.Customer;

public interface HotelRepo {
	//data access object--->DAO
	ArrayList<Customer> A1=new ArrayList<Customer>();
	LinkedHashMap<Integer,Customer> cm=new LinkedHashMap<Integer,Customer>();
	LinkedHashMap<Integer,Customer> sm=new LinkedHashMap<Integer,Customer>();
	LinkedHashMap<Integer,Customer> dm=new LinkedHashMap<Integer,Customer>();
	void AvailableRooms();
	void CheckRoom(LinkedHashMap<Integer, Customer> l1);

}
