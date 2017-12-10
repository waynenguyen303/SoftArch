package tomcat.service;


import org.apache.catalina.Engine;
import org.apache.catalina.Server;

import tomcat.service.serviceArch;

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
  
    //To be imported: Server
    public Server serverToservice (Server server)  ;        
  
    //To be imported: Engine
    public void engineToservice (Engine engine)  ;        
}