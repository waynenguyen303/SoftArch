package bootstrap;

import org.apache.catalina.startup.*;

public class bootstrapImp implements IImp
{
	private bootstrapArch _arch;

    public bootstrapImp (){
    	

    	
    }

	public void setArch(bootstrapArch arch){
		_arch = arch;
	}
	public bootstrapArch getArch(){
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
		
    	//Bootstrap b = new Bootstrap();
    	//String[] arg = {"start"};
    	//b.main(arg);
		
	}
	public void end(){
		//TODO Auto-generated method stub
	}
	public void destroy(){
		//TODO Auto-generated method stub
	}

	/*
  	  Implementation primitives required by the architecture
	*/
}