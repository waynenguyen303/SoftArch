package comp.Catalina;



public class CatalinaImp implements ICatalinaImp
{
	private CatalinaArch _arch;

    public CatalinaImp (){
    }

	public void setArch(CatalinaArch arch){
		_arch = arch;
	}
	public CatalinaArch getArch(){
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