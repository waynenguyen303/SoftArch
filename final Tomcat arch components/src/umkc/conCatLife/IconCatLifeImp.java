package umkc.conCatLife;


import org.apache.catalina.Container;

import umkc.conCatLife.conCatLifeArch;

public interface IconCatLifeImp 
{

	/*
	  Getter and Setter of architecture reference
	*/
    public void setArch (conCatLifeArch arch);
	public conCatLifeArch getArch();
	
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
  
    //To be imported: Container
    public void sendcontainerTohost (Container container)  ;        
}