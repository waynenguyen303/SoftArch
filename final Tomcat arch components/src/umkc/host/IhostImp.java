package umkc.host;


import org.apache.catalina.Container;

import org.apache.catalina.connector.Connector;

import umkc.host.hostArch;

public interface IhostImp 
{

	/*
	  Getter and Setter of architecture reference
	*/
    public void setArch (hostArch arch);
	public hostArch getArch();
	
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
    public void sendconToHost (Connector con)  ;        
  
    //To be imported: Container
    public void sendcontainerTohost (Container container)  ;        
}