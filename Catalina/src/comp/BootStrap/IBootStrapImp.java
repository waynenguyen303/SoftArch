package comp.BootStrap;


import comp.BootStrap.BootStrapArch;

public interface IBootStrapImp 
{

	/*
	  Getter and Setter of architecture reference
	*/
    public void setArch (BootStrapArch arch);
	public BootStrapArch getArch();
	
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
}