package GUISchicht2;

import java.util.ArrayList;
import java.util.HashMap;

import BusinessLogik.Person;
import GuiSchicht.PersonenListData;

public class PersonenListDataMaps extends PersonenListData {

	@Override
	public void addPersonData(Person p) {
		if (personen == null)
			personen = new ArrayList<Object>();
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(Integer.valueOf(p.getId()), p.getName());
		personen.add(map);
	}
}
