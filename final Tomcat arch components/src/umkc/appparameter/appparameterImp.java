package umkc.appparameter;


import org.apache.catalina.Context;
import org.apache.tomcat.util.descriptor.web.ApplicationParameter;

public class appparameterImp implements IappparameterImp
{
	private appparameterArch _arch;

	
	ApplicationParameter[] AP;
	
    public appparameterImp (){
    }

	public void setArch(appparameterArch arch){
		_arch = arch;
	}
	public appparameterArch getArch(){
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
		
		AP = context.findApplicationParameters();
		
	}

	/*
  	  Implementation primitives required by the architecture
	*/
  
 
}