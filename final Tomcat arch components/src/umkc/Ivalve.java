package umkc;

import org.apache.catalina.Pipeline;

public interface Ivalve {
	
	public void sendpipeTovalve(Pipeline pl);

}
