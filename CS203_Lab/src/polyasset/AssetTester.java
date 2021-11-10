package polyasset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import assignment_5.Student;

public class AssetTester {

	
	public static void main(String[] args) {

		Assets  asset1 = new Assets(1254,"Electronic appliances",20 );
		
		Assets  asset2 = new Assets(2563,"Automobileslopki",50 );
		Assets  asset3 = new Assets(5864,"Furniture",56 );
		Assets  asset4 = new Assets(6935,"Compact disks",89 );
		Assets  asset5 = new Assets(6935,"Laptop ",89 );
		
		
		AssetTrackingProgram ap = new AssetTrackingProgram();
		
		List<Assets> assetsCatagories = new ArrayList<>();
		assetsCatagories.add(asset1);
		assetsCatagories.add(asset2);
		assetsCatagories.add(asset3);
		assetsCatagories.add(asset4);
		
		
		Collections.sort(assetsCatagories);
		for(Assets answer: assetsCatagories) {
			System.out.println("After Sorting by Catagory:  "+answer);
		}
		
		ap.addAsset(asset1);
		ap.addAsset(asset2);
		ap.addAsset(asset3);
		ap.addAsset(asset4);
		System.out.println(ap.toString());
		
		System.out.println( ap.searchSerialNumber(2563));
		System.out.println( ap.searchSerialNumber(5283));
		
		ap.searchBySerialNumber(1254);
		System.out.println( );
		
		ap.deleteAsset(asset4);
		//System.out.println(ap.toString());
		
		ap.setAsset(asset2);
		System.out.println(ap.toString());
		
//		for(Assets  answer: list ) {
//			System.out.println(answer);
//		}
	}

}
