package umkc.pipeline2;

import org.apache.catalina.Context;
import org.apache.catalina.Pipeline;

public class pipeline2Imp implements Ipipeline2Imp
{
	private pipeline2Arch _arch;
	
	Pipeline pl;

    public pipeline2Imp (){
    }

	public void setArch(pipeline2Arch arch){
		_arch = arch;
	}
	public pipeline2Arch getArch(){
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
	public void sendcontextTopipe2(Context con) {
		// TODO Auto-generated method stub
		
		pl= con.getPipeline();
		_arch.OUT_Ivalve2.sendpipeTovalve2(pl);
		
	}

	/*
  	  Implementation primitives required by the architecture
	*/
}