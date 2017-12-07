package umkc.digester;


import org.apache.catalina.startup.Catalina;

import umkc.digester.digesterArch;

public interface IdigesterImp 
{

	/*
	  Getter and Setter of architecture reference
	*/
    public void setArch (digesterArch arch);
	public digesterArch getArch();
	
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
    public void sendTodigester (Catalina cat)  ;        
}