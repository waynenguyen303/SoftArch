package umkc.serviceLife;


import org.apache.catalina.Service;

import umkc.serviceLife.serviceLifeArch;

public interface IserviceLifeImp 
{

	/*
	  Getter and Setter of architecture reference
	*/
    public void setArch (serviceLifeArch arch);
	public serviceLifeArch getArch();
	
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
    public void sendServiceToLife (Service service)  ;        
}