package umkc.servletResponse;


import javax.servlet.ServletResponse;


public class servletResponseImp implements IservletResponseImp
{
	private servletResponseArch _arch;

    public servletResponseImp (){
    }

	public void setArch(servletResponseArch arch){
		_arch = arch;
	}
	public servletResponseArch getArch(){
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
	public void sendresToServletres(ServletResponse res) {
		// TODO Auto-generated method stub
		
	}


	/*
  	  Implementation primitives required by the architecture
	*/

}