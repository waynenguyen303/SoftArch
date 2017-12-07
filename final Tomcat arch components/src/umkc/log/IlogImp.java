package umkc.log;


import org.apache.catalina.startup.Bootstrap;
import org.apache.catalina.startup.Catalina;

import umkc.log.logArch;

public interface IlogImp 
{

	/*
	  Getter and Setter of architecture reference
	*/
    public void setArch (logArch arch);
	public logArch getArch();
	
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
  
    //To be imported: Bootstrap,Catalina
    public void sendlog (Bootstrap b)  ;        
    public void sendcatlog (Catalina cat)  ;        
}