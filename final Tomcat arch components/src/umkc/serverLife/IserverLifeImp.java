package umkc.serverLife;


import org.apache.catalina.Server;

import umkc.serverLife.serverLifeArch;

public interface IserverLifeImp 
{

	/*
	  Getter and Setter of architecture reference
	*/
    public void setArch (serverLifeArch arch);
	public serverLifeArch getArch();
	
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
  
    //To be imported: Server
    public void sendToServerLife (Server serve)  ;        
}