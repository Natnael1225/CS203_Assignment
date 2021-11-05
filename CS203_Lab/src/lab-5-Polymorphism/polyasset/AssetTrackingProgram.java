package polyasset;

import java.util.ArrayList;
import java.util.List;

public class AssetTrackingProgram {

	
	List<Assets> assets = new ArrayList<>();
		     
	public  void addAsset(Assets asset) {
		
		assets.add(asset);
	}
	
	public void setAsset(int serialnumber, Assets asset) {
		
		assets.set( serialnumber, asset);
	}
	
  public void deleteAsset(Assets asset) {
	  assets.remove(asset);
		
	}
  public boolean searchSerialNumber(int serialnumber) {
		 for(int i =0 ; i< assets.size();i++) {
			 if(assets.get(i).getSerialNumber() == serialnumber ) {
				 return true;
			 }
		 }
		 return false;
	 }
  
  public void searchBySerialNumber(int serialnumber) {
	  Assets result = null;
      for( Assets asset : assets){
          if(asset.getSerialNumber() == serialnumber){
        	  result = asset;
          }
      }

      if( result  == null)
          System.out.println("No asset found with the given serial number");
      else
          System.out.println( result );
  
  }

@Override
public String toString() {
	return  assets.toString() ;
}

    
}
