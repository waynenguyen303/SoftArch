package umkc.pattern;


import org.apache.catalina.Host;

import umkc.pattern.patternArch;

public interface IpatternImp 
{

	/*
	  Getter and Setter of architecture reference
	*/
    public void setArch (patternArch arch);
	public patternArch getArch();
	
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
    public void sendhostTopattern (Host host)  ;        
}