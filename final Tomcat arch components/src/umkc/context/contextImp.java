package umkc.context;


import org.apache.catalina.Context;
import org.apache.catalina.Host;
import org.apache.catalina.Pipeline;

public class contextImp implements IcontextImp
{
	private contextArch _arch;
	
	Context context;

    public contextImp (){
    }

	public void setArch(contextArch arch){
		_arch = arch;
	}
	public contextArch getArch(){
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
		
		_arch.OUT_IcontextOut.sendcontextToOut(context);
		
		
		
	}
	public void end(){
		//TODO Auto-generated method stub
	}
	public void destroy(){
		//TODO Auto-generated method stub
	}

	@Override
	public void sendhostTocontext(Host host) {
		// TODO Auto-generated method stub
		
		 host.addChild(context);
		
	}




	/*
  	  Implementation primitives required by the architecture
	*/
}
