package umkc.loadCataliina;


import org.apache.catalina.startup.Catalina;

import umkc.loadCataliina.loadCatalinaArch;

public interface IloadCatalinaImp 
{

	/*
	  Getter and Setter of architecture reference
	*/
    public void setArch (loadCatalinaArch arch);
	public loadCatalinaArch getArch();
	
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
    public void sendCatalinatoLoad (Catalina cat)  ;        
  
    
    public void senduserinput (String message)  ;        
}