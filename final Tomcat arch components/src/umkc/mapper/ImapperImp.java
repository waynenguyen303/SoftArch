package umkc.mapper;


import org.apache.catalina.Service;

import umkc.mapper.mapperArch;

public interface ImapperImp 
{

	/*
	  Getter and Setter of architecture reference
	*/
    public void setArch (mapperArch arch);
	public mapperArch getArch();
	
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
  
    //To be imported: Service
    public void sendserviceTomapper (Service service)  ;        
}