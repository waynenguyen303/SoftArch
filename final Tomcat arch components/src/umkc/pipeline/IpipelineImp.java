package umkc.pipeline;


import org.apache.catalina.Container;

import umkc.pipeline.pipelineArch;

public interface IpipelineImp 
{

	/*
	  Getter and Setter of architecture reference
	*/
    public void setArch (pipelineArch arch);
	public pipelineArch getArch();
	
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
    public void sendconTopipe (Container con)  ;        
}