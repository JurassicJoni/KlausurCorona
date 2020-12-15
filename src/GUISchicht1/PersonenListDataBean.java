package GUISchicht1;

import java.util.ArrayList;

import BusinessLogik.Person;
import GuiSchicht.PersonenListData;

public class PersonenListDataBean extends PersonenListData {

	@Override
	public void addPersonData(Person p) {
		if (personen == null)
			personen = new ArrayList<Object>();
		PersonenInfo info = new PersonenInfo(p.getId(), p.getName());
		personen.add(info);
	}
}
