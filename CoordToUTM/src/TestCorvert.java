import java.util.HashMap;
import java.util.List;

public class TestCorvert {

	public static void main(String[] args) {
		
		ConvertToUTM converter = new ConvertToUTM();
		
		String UTM = converter.DMStoUTM(37.718590,-97.426758);
		
		HashMap<String,Double> latlong = converter.UTMtoDMS("14 S 638657 4175758");
		
		System.out.println(UTM);
		System.out.println(latlong.values());
		
	}

}
