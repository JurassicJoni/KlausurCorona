package GUISchicht1;

import java.util.ArrayList;

import BusinessLogik.Person;
import GuiSchicht.GUISession;
import GuiSchicht.PersonenListData;

public class WebSession implements GUISession{

	@Override
	public PersonenListData getPersonenList() {
		ArrayList<Person> personen = bl.getAllPerson();
		PersonenListDataBean bean = new PersonenListDataBean();
		for (Person person : personen) {
			bean.addPersonData(person);
		}
		return bean;
	}
}
