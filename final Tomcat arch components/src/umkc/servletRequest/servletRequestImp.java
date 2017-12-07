package umkc.servletRequest;


import javax.servlet.ServletRequest;

public class servletRequestImp implements IservletRequestImp
{
	private servletRequestArch _arch;

    public servletRequestImp (){
    }

	public void setArch(servletRequestArch arch){
		_arch = arch;
	}
	public servletRequestArch getArch(){
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
	public void sendreqToservletreq(ServletRequest req) {
		// TODO Auto-generated method stub
		
		
	}

	/*
  	  Implementation primitives required by the architecture
	*/
  

}