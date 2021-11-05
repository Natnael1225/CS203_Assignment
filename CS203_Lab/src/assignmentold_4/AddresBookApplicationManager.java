package assignmentold_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddresBookApplicationManager {

	private List<Contacts> addressbook = new ArrayList<>();
	private List<Person> person = new ArrayList<>();

	public AddresBookApplicationManager(List<Contacts> addressbook) {
		this.addressbook = addressbook;
	}

	public static int findIndexName(String s, List<Contacts> address) {
		if (address == null) {
			return -1;
		}
		int length = address.size();
		int i = 0;
		while (i < length) {
			if (address.get(i).getFname().equalsIgnoreCase(s)) {
				return i;
			} else {
				i++;
			}
		}
		return -1;
	}

	public static int findIndex(List<Contacts> arr, Contacts addres) {
		if (arr == null) {
			return -1;
		}
		int len = arr.size();
		int i = 0;
		while (i < len) {
			if (arr.get(i) == addres) {
				return i;
			} else {
				i++;
			}
		}
		return -1;
	}

	public void BusinessSorted() {
		ArrayList<Bussiness> busines = new ArrayList<>();

		for (int i = 0; i < addressbook.size(); i++) {

			if (addressbook.get(i) instanceof Bussiness) {
				Contacts a = addressbook.get(i);
				Bussiness b = (Bussiness) a;
				busines.add(b);
			}
		}
		AddressNameSort ans = new AddressNameSort();
		Collections.sort(busines, ans);
		for (Bussiness b : busines) {
			System.out.println(b);
		}
	}

	public void personOny() {
		for (Person c : person) {
			if (c instanceof Person) {
				System.out.println(c);
			}
		}
	}

	public void addPerson(Person person) {
		addressbook.add(person);
	}

	public void addBussiness(Bussiness bussiness) {
		addressbook.add(bussiness);
	}

	public void editPersonName(String name, Person person) {

		int x = findIndex(addressbook, person);
		if (x >= 0) {
			Contacts address = addressbook.get(x);
			Person p = (Person) address;
			p.setFname(name);
			addressbook.set(x, p);
		} else {
			return;
		}
	}

	public void editBussiness(String a, Bussiness b) {
		for (int i = 0; i < addressbook.size(); i++) {
			if (addressbook.get(i).equals(a)) {
				addressbook.set(i, b);
			}
		}
	}

	public void removePerson(Person person) {
		int postion = findIndex(addressbook, person);
		if (postion >= 0) {
			addressbook.remove(postion);
		} else {
			return;
		}
	}

	public void removeBusiness(Bussiness business) {

		int postion = findIndex(addressbook, business);
		if (postion >= 0) {
			addressbook.remove(postion);
		} else
			return;

	}
}
