package models.loader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import models.places.Landmark;
import models.places.Places;

public enum DataLoader {

	INSTANCE;

	final private static String landM = "logs/historical_landmarks.txt"; 
	final private static String movieM = "logs/movies_locations.txt";
	final private static String landDesct  = "logs/landmark_descriptions.txt";
	final private static String landRelev = "logs/lamdmark_search_results.txt";

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
			addDescriptions(landDesct);
			addRelevancy(landRelev);
			
		}
		

	}

	private static void addRelevancy(String fileLocation) throws IOException, ParseException {
		File f = new File(fileLocation);
		if(f!=null && f.exists()) {
			BufferedReader br = new BufferedReader(new FileReader(f));
			String line = null;
			
			while((line = br.readLine()) != null) {
			
				String[] elems = line.split("\t");
				Landmark lm = Places.findByName(elems[0].trim());
				if(lm!=null) {
					lm.relevance = Integer.parseInt(elems[1].trim());
				}
				
			}
			br.close();
			
			
		}
		
	}

	private static void addDescriptions(String fileLocation) throws IOException, ParseException {
		File f = new File(fileLocation);
		if(f!=null && f.exists()) {
			BufferedReader br = new BufferedReader(new FileReader(f));
			String line = null;
		
			while((line = br.readLine()) != null) {
				
				String[] elems = line.split("\t");
				Landmark lm = Places.findByName(elems[0]);
				if(lm!=null) {
					lm.longDescription = elems[1];
				}
				
			}
			br.close();
			
			
		}
		
	}

	private static void loadMovies() {
		// TODO Auto-generated method stub

	}
}
