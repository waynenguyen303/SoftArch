package umkc.service;


import org.apache.catalina.Server;

import org.apache.catalina.startup.Catalina;

import org.apache.coyote.Adapter;

import umkc.service.serviceArch;

public interface IserviceImp 
{

	/*
	  Getter and Setter of architecture reference
	*/
    public void setArch (serviceArch arch);
	public serviceArch getArch();
	
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
  
    //To be imported: Server,Catalina
    public void sendToService (Server serve)  ;        
    public void sendCatToService (Catalina cat)  ;        
  
    //To be imported: Adapter
    public void sendadapterToservice (Adapter adapter)  ;        
}