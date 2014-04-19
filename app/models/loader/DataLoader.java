package models.loader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import models.places.Places;

public enum DataLoader {

	INSTANCE;

	final private static String landM = "historical_landmarks.txt"; 
	final private static String movieM = "movies_locations.txt";

	public static void loadData() {
		loadMovies();
		try {
			loadLandmarks();
		} catch (IOException e) {
			System.out.println("failed to load data");
			e.printStackTrace();
		} catch (ParseException e) {
			System.out.println("failed to parse date");
			e.printStackTrace();
		}
	}

	private static void loadLandmarks() throws IOException, ParseException {
		File f = new File("logs/historical_landmarks.txt");
		if(f!=null && f.exists()) {
			BufferedReader br = new BufferedReader(new FileReader(f));
			String line = null;
			int i = 0;
			while((line = br.readLine()) != null) {
				i++;
				String[] elems = line.split("\t");
				String[] loc = elems[2].split(";");
				if(loc[0].contains("N/A") || loc[1].contains("N/A")) continue;
				SimpleDateFormat sdf = new SimpleDateFormat("MMMMMMMMM dd, YYYY");
				Places.addLandmark(elems[0], sdf.parse(elems[1]) , new BigDecimal(loc[0].trim()), new BigDecimal(loc[1].trim()), elems[3], elems[4]);
				
			}
			br.close();
			
		}
		

	}

	private static void loadMovies() {
		// TODO Auto-generated method stub

	}
}
