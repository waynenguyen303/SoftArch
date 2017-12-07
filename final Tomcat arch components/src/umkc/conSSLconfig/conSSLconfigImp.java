package umkc.conSSLconfig;

import org.apache.catalina.connector.Connector;
import org.apache.tomcat.util.net.SSLHostConfig;

public class conSSLconfigImp implements IconSSLconfigImp
{
	private conSSLconfigArch _arch;
	
	SSLHostConfig ssl;

    public conSSLconfigImp (){
    }

	public void setArch(conSSLconfigArch arch){
		_arch = arch;
	}
	public conSSLconfigArch getArch(){
		return _arch;
	}

	/*
  	  Myx Lifecycle Methods: these methods are called automatically by the framework
  	  as the bricks are created, attached, detached, and destroyed respectively.
	*/	
	public void init(){
	    //TODO Auto-generated method stub
	}
	public void begin(){
		//TODO Auto-generated method stub
	}
	public void end(){
		//TODO Auto-generated method stub
	}
	public void destroy(){
		//TODO Auto-generated method stub
	}

	@Override
	public void sendconToSSL(Connector con) {
		// TODO Auto-generated method stub
		
		con.addSslHostConfig(ssl);
		
		
	}

	/*
  	  Implementation primitives required by the architecture
	*/
}