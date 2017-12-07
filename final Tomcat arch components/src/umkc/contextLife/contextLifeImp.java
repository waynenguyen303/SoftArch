package umkc.contextLife;


import org.apache.catalina.ContainerListener;
import org.apache.catalina.Context;
import org.apache.catalina.LifecycleListener;

public class contextLifeImp implements IcontextLifeImp
{
	private contextLifeArch _arch;
	
	LifecycleListener LL;
	ContainerListener CL;

    public contextLifeImp (){
    }

	public void setArch(contextLifeArch arch){
		_arch = arch;
	}
	public contextLifeArch getArch(){
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
		
		context.addLifecycleListener(LL);
		context.addContainerListener(CL);
		
	}

	/*
  	  Implementation primitives required by the architecture
	*/

}