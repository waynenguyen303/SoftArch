package umkc.pipeline1;

import org.apache.catalina.Host;
import org.apache.catalina.Pipeline;

public class pipeline1Imp implements Ipipeline1Imp
{
	private pipeline1Arch _arch;
	
	Pipeline pl;

    public pipeline1Imp (){
    }

	public void setArch(pipeline1Arch arch){
		_arch = arch;
	}
	public pipeline1Arch getArch(){
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
	public void sendhostTopipe(Host host) {
		// TODO Auto-generated method stub
		
		pl = host.getPipeline();
		
		_arch.OUT_Ivalve1.sendpipeTovalve1(pl);
		
	}

	/*
  	  Implementation primitives required by the architecture
	*/
}