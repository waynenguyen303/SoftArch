package umkc.server;


import org.apache.catalina.Container;

import org.apache.catalina.startup.Catalina;

import umkc.server.serverArch;

public interface IserverImp 
{

	/*
	  Getter and Setter of architecture reference
	*/
    public void setArch (serverArch arch);
	public serverArch getArch();
	
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
  
    //To be imported: Catalina
    public void sendCatToServer (Catalina cat)  ;        
  
    //To be imported: Container
    public void sendcontainer (Container container)  ;        
}