package umkc.loginconfig;


import org.apache.catalina.Context;
import org.apache.tomcat.util.descriptor.web.LoginConfig;

public class loginconfigImp implements IloginconfigImp
{
	private loginconfigArch _arch;

	LoginConfig LC;
	
    public loginconfigImp (){
    }

	public void setArch(loginconfigArch arch){
		_arch = arch;
	}
	public loginconfigArch getArch(){
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
		
		LC = context.getLoginConfig();
		
	}

	/*
  	  Implementation primitives required by the architecture
	*/
  

}