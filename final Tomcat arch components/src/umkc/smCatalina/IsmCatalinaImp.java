package umkc.smCatalina;


import org.apache.catalina.startup.Catalina;

import umkc.smCatalina.smCatalinaArch;

public interface IsmCatalinaImp 
{

	/*
	  Getter and Setter of architecture reference
	*/
    public void setArch (smCatalinaArch arch);
	public smCatalinaArch getArch();
	
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
    public void sendToCatalinaSM (Catalina cat)  ;        
}