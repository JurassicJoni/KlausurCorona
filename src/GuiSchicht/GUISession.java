package GuiSchicht;

import BusinessLogik.BLSession;

public interface GUISession{

	BLSession bl = new BLSession();
	public PersonenListData getPersonenList();
}
