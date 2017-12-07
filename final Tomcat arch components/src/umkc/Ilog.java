package umkc;

import org.apache.catalina.startup.Bootstrap;
import org.apache.catalina.startup.Catalina;

public interface Ilog {
	
	public void sendlog(Bootstrap b);
	
	public void sendcatlog(Catalina cat);

}
