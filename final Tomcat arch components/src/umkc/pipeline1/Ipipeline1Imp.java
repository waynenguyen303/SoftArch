package umkc.pipeline1;


import org.apache.catalina.Host;

import umkc.pipeline1.pipeline1Arch;

public interface Ipipeline1Imp 
{

	/*
	  Getter and Setter of architecture reference
	*/
    public void setArch (pipeline1Arch arch);
	public pipeline1Arch getArch();
	
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
  
    //To be imported: Host
    public void sendhostTopipe (Host host)  ;        
}