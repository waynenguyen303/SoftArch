package umkc.stopserverCatalina;


import org.apache.catalina.startup.Catalina;

import umkc.stopserverCatalina.stopserverCatalinaArch;

public interface IstopserverCatalinaImp 
{

	/*
	  Getter and Setter of architecture reference
	*/
    public void setArch (stopserverCatalinaArch arch);
	public stopserverCatalinaArch getArch();
	
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
    public void sendstopcatalina (Catalina cat)  ;        
  
    
    public void senduserinput (String message)  ;        
}