
import models.loader.DataLoader;
import models.places.Places;
import play.Application;
import play.GlobalSettings;



public class Global extends GlobalSettings {

	@Override
	public void onStart(Application app) {
		if(Places.landmarks.size()==0) {
			DataLoader.loadData();
		}
	}
}
