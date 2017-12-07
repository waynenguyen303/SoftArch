package umkc.pipeline2;


import org.apache.catalina.Context;

import umkc.pipeline2.pipeline2Arch;

public interface Ipipeline2Imp 
{

	/*
	  Getter and Setter of architecture reference
	*/
    public void setArch (pipeline2Arch arch);
	public pipeline2Arch getArch();
	
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
  
    //To be imported: Context
    public void sendcontextTopipe2 (Context con)  ;        
}