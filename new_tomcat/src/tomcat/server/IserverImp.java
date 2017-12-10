package tomcat.server;


import org.apache.catalina.Service;

import tomcat.server.serverArch;

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
  
    //To be imported: Service
    public void serviceToserver (Service service)  ;        
}