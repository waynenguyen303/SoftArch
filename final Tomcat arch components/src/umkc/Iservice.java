package umkc;

import org.apache.catalina.Server;
import org.apache.catalina.startup.Catalina;

public interface Iservice {
	
	public void sendToService(Server serve);
	
	public void sendCatToService (Catalina cat);

}
