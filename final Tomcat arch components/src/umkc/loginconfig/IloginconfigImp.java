package umkc.loginconfig;


import org.apache.catalina.Context;

import umkc.loginconfig.loginconfigArch;

public interface IloginconfigImp 
{

	/*
	  Getter and Setter of architecture reference
	*/
    public void setArch (loginconfigArch arch);
	public loginconfigArch getArch();
	
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
    public void sendcontextToOut (Context context)  ;        
}