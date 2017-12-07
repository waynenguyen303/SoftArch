package umkc.errorpage;


import org.apache.catalina.Context;
import org.apache.tomcat.util.descriptor.web.ErrorPage;

public class errorpageImp implements IerrorpageImp
{
	private errorpageArch _arch;
	
	ErrorPage[] EP;

    public errorpageImp (){
    }

	public void setArch(errorpageArch arch){
		_arch = arch;
	}
	public errorpageArch getArch(){
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
		
		EP = context.findErrorPages();
		
	}

	/*
  	  Implementation primitives required by the architecture
	*/
  

}