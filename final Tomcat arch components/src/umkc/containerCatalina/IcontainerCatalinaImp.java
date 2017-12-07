package umkc.containerCatalina;


import org.apache.catalina.startup.Catalina;

import umkc.containerCatalina.containerCatalinaArch;

public interface IcontainerCatalinaImp 
{

	/*
	  Getter and Setter of architecture reference
	*/
    public void setArch (containerCatalinaArch arch);
	public containerCatalinaArch getArch();
	
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
    public void senddigesterTocontainer (Catalina cat)  ;        
}