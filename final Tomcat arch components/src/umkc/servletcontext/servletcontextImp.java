package umkc.servletcontext;


import javax.servlet.ServletContext;

import org.apache.catalina.Context;

public class servletcontextImp implements IservlercontextImp
{
	private servletcontextArch _arch;
	
	ServletContext SC;

    public servletcontextImp (){
    }

	public void setArch(servletcontextArch arch){
		_arch = arch;
	}
	public servletcontextArch getArch(){
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
		
		SC = context.getServletContext();
	
		
	}

	/*
  	  Implementation primitives required by the architecture
	*/
  
  
}