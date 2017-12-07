package umkc.cookieprocessor;


import org.apache.catalina.Context;
import org.apache.tomcat.util.http.CookieProcessor;

public class cookieprocessorImp implements IcookieprocessorImp
{
	private cookieprocessorArch _arch;
	
	CookieProcessor CP;

    public cookieprocessorImp (){
    }

	public void setArch(cookieprocessorArch arch){
		_arch = arch;
	}
	public cookieprocessorArch getArch(){
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
		
		CP = context.getCookieProcessor();
		context.setCookieProcessor(CP);
		
	}

	/*
  	  Implementation primitives required by the architecture
	*/
  
 
}