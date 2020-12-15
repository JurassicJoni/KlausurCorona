package GUISchicht2;

import java.util.ArrayList;

import BusinessLogik.Person;
import GuiSchicht.GUISession;
import GuiSchicht.PersonenListData;

public class IOSSession implements GUISession {

	@Override
	public PersonenListData getPersonenList() {
		ArrayList<Person> person = bl.getAllPerson();
		PersonenListData data = new PersonenListDataMaps();
		for (Person p : person) {
			data.addPersonData(p);
		}
		return data;
	}
}
