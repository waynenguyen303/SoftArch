package umkc.conRequest;


import org.apache.catalina.connector.Connector;

import umkc.conRequest.conRequstArch;

public interface IconRequestImp 
{

	/*
	  Getter and Setter of architecture reference
	*/
    public void setArch (conRequstArch arch);
	public conRequstArch getArch();
	
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
    public void sendconToRequest (Connector con)  ;        
}