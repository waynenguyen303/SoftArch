package umkc.init;


import org.apache.catalina.startup.Bootstrap;

import umkc.init.initArch;

public interface IinitImp 
{

	/*
	  Getter and Setter of architecture reference
	*/
    public void setArch (initArch arch);
	public initArch getArch();
	
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
  
    //To be imported: Bootstrap
    public void sendinit (Bootstrap b)  ;        
}