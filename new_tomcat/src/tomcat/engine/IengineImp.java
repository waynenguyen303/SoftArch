package tomcat.engine;


import org.apache.catalina.Service;

import tomcat.engine.engineArch;

public interface IengineImp 
{

	/*
	  Getter and Setter of architecture reference
	*/
    public void setArch (engineArch arch);
	public engineArch getArch();
	
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
    public void serviceToengine (Service service)  ;        
}