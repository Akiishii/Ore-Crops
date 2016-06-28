package net.orecrops.utils;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import net.orecrops.lib.OreCropsLib;

public class OreCropsUpdate {

	private static final String UPDATE_URL = "https://www.dropbox.com/s/i4qzqnr3lbg6j43/OreCrops%20-%20Changelog.txt?dl=1";
	
	private static boolean newVersionAvailable = false;
	
	public static void checkForUpdates(){
		
		new Thread("Update-Checker"){
			
			public void run(){
				try {
					URL url = new URL(UPDATE_URL);
					Scanner scanner = new Scanner(url.openStream());
					String latestVersion = scanner.nextLine();
					scanner.close();
					
					if(!OreCropsLib.VERSION.equals(latestVersion)){
						
						setNewVersionAvailable();
						
					}
					
				} catch (MalformedURLException e) {
					System.err.println("Wrong URL");
				} catch (IOException e) {
					e.printStackTrace();
				}
			};
			
		}.start();
		
	}
	
	public static synchronized void setNewVersionAvailable(){
		newVersionAvailable = true;
	}
	
	public static synchronized boolean isNewVersionAvailable(){
		
		return newVersionAvailable;
		
	}
	
}
