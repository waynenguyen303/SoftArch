package umkc.securityconstraint;


import org.apache.catalina.Context;
import org.apache.tomcat.util.descriptor.web.SecurityConstraint;

public class securityconstraintImp implements IsecurityconstraintImp
{
	private securityconstraintArch _arch;
	
	SecurityConstraint[] SC;

    public securityconstraintImp (){
    }

	public void setArch(securityconstraintArch arch){
		_arch = arch;
	}
	public securityconstraintArch getArch(){
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
		
		SC = context.findConstraints();
		
	}

	/*
  	  Implementation primitives required by the architecture
	*/
  

}