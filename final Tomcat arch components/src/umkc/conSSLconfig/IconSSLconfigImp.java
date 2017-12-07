package umkc.conSSLconfig;


import org.apache.catalina.connector.Connector;

import umkc.conSSLconfig.conSSLconfigArch;

public interface IconSSLconfigImp 
{

	/*
	  Getter and Setter of architecture reference
	*/
    public void setArch (conSSLconfigArch arch);
	public conSSLconfigArch getArch();
	
	/*
  	  Myx Lifecycle Methods: these methods are called automatically by the framework
  	  as the bricks are created, attached, detached, and destroyed respectively.
	*/	
	public void init();	
	public void begin();
	public void end();
	public void destroy();

	/*
  	  Implementation primitives required by the architecture
	*/
  
    //To be imported: Connector
    public void sendconToSSL (Connector con)  ;        
}