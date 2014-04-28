package models.dto;

import java.util.ArrayList;
import java.util.List;

import models.buses.BusState;
import models.places.Landmark;


public class BusStoryDTO{

	public String polyline;
	public String busId;
	public List<LandmarkDTO> landmarks;
	public String buslat;
	public String busLong;
	

	public BusStoryDTO(String ref, String buslat, String busLong) {
		super();		
		this.busId = ref;		
		this.buslat = buslat;
		this.busLong = busLong;		
		landmarks = new ArrayList<LandmarkDTO>();
		//this.polyline = "{eixF~|gbM@?JNd@RbBf@\\JzBd@z@PvAZvCj@v@L~ATpC`@|@Lt@JZBbCLX@vCNvBtAbElCl@^fCbBvClBz@j@~@n@|BzAp@b@hAt@zBzAt@d@fAr@zBzAdBhATN|BzAdC`B`GzD|BzAp@b@hAv@|BxAzBzA|BzAzBxAzBxA~AfAf@ZdC~AzBzA|BzAzBxAzBzAr@d@fAr@tBnB|BzAxBxAfC~AY~@gC`IOb@Qb@JjALb@b@n@d@^xBxA|BzAzBxAvFtD~CpBvA~BVd@n@j@`@VvF`CfGjCbAT|@D`@AX?vAB`@Db@JRJ\\TrCjBnH|EPLDBJLtAfBLJp@j@jAr@VN`B`ApBbATHFBrAj@RHrD|AlAj@`DnBTP`F`DZTpFnDb@X~@j@`BnChArAf@b@tCbCbAp@|@`@j@NZDd@@dBKf@Bv@ZDDp@v@jCdF?@VfAx@n@f@\\FBrAl@lAXl@HfCDlAJJHJH\\Tv@v@Xh@LVbAjDLXVl@`@j@\\Z|B|AfC`Bj@`@zA`AZNdATr@Bl@BrBJzCNl@DF?ZD^L^Ph@^lAnAb@d@vAzAxB~BrBxBbB`BNJTL??vBp@jCz@lA^~@XtAd@d@HZLdBoF`@sAbDaKDOr@LpBLZ@bCB`DD`DD`DD`DBdA?bBA^Ax@?hAA`DEbDCdDEhDAbBAR`@RNXDFAHAf@a@RODIHc@AcA[k@IIb@wAzCqJbFyOJ]lEiNN]f@}AP]zBxAhCbBdC`BhBlARL|BzAzBxA|BzAzBzA|@l@~@l@zBxA|BzA|BxAzBzA|BzAzBxA|BzAdC`BbBfA`@XzBxAzBxAzBxAxBxAzBxAzBxAdC~AbC`Bz@j@~@l@zBxAxBxAzBxAzBxAzBxAxBxAZNn@d@r@b@\\LxAdA|@l@JBz@p@lAz@v@f@xBxAtBtAtBtArBrAtBtArBtA~BzAhCbB`An@fAr@~B|A~BzAvBvAtBtAtBvAf@}AzA{E~@uC`A}CdAgDfBvAbBrAh@b@fAz@tBdBvB`B|@v@x@p@hCpBz@p@rC|BVRv@n@hDnCr@j@|D`Dj@b@zBfBlAbA~D~CrDxCv@n@r@j@n@h@vAhAPLvBdBp@h@`Av@pB`BvBdB~ApAFDfBvAxAjATPbBrAD?nAbAXTnB|ArAdARPjBvAxBbBNLrAlAZV`Ax@PLlA`AXT`CnBfAz@`BnAlBzAl@b@LJ~BhBHDpDtCn@l@DBbBpAlAf@^Zh@AtC\\VBf@DRAh@M~@i@x@mAGmC";
	}


	public BusStoryDTO(BusState bus) {
		busId = bus.vehicleRef;
		buslat = bus.locations.peekLast().getLatitude().toString();
		busLong = bus.locations.peekLast().getLongitude().toString();
		landmarks = new ArrayList<LandmarkDTO>();
	}

	public void addLandmarks(Landmark landmark) {
		LandmarkDTO lm = new LandmarkDTO(landmark.latitude.toString(), landmark.longitude.toString(), landmark.name);
		landmarks.add(lm);
	}

	public void addStories(String name, String stories) {
		for(LandmarkDTO lm : landmarks) {
			if(lm.name.equalsIgnoreCase(name)) {
				lm.story = stories;
				break;
			}
		}
	}




}
