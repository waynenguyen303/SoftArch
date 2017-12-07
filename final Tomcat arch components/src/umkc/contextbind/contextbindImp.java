package umkc.contextbind;


import org.apache.catalina.Context;
import org.apache.tomcat.ContextBind;

public class contextbindImp implements IcontextbindImp
{
	private contextbindArch _arch;
	
	ContextBind CB;

    public contextbindImp (){
    }

	public void setArch(contextbindArch arch){
		_arch = arch;
	}
	public contextbindArch getArch(){
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

	@Override
	public void sendcontextToOut(Context context) {
		// TODO Auto-generated method stub
		
		
	}

	/*
  	  Implementation primitives required by the architecture
	*/
  

}