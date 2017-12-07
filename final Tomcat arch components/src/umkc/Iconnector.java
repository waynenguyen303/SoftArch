package umkc;

import org.apache.catalina.Service;

public interface Iconnector {
	
	public void sendToConnector(Service service);

}
