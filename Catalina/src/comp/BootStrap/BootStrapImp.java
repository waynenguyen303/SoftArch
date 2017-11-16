package comp.BootStrap;



public class BootStrapImp implements IBootStrapImp
{
	private BootStrapArch _arch;

    public BootStrapImp (){
    }

	public void setArch(BootStrapArch arch){
		_arch = arch;
	}
	public BootStrapArch getArch(){
		return _arch;
	}

	/*
  	  Myx Lifecycle Methods: these methods are called automatically by the framework
  	  as the bricks are created, attached, detached, and destroyed respectively.
	*/	
	public void init(){
	    //TODO Auto-generated method stub
	}
	public void begin(){
		//TODO Auto-generated method stub
	}
	public void end(){
		//TODO Auto-generated method stub
	}
	public void destroy(){
		//TODO Auto-generated method stub
	}

	/*
  	  Implementation primitives required by the architecture
	*/
}