package umkc.pipeline;

import org.apache.catalina.Container;
import org.apache.catalina.Pipeline;

public class pipelineImp implements IpipelineImp
{
	private pipelineArch _arch;
	
	Pipeline pl;

    public pipelineImp (){
    }

	public void setArch(pipelineArch arch){
		_arch = arch;
	}
	public pipelineArch getArch(){
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
	public void sendconTopipe(Container con) {
		// TODO Auto-generated method stub
		
		pl = con.getPipeline();
		
		_arch.OUT_Ivalve.sendpipeTovalve(pl);
		
	}

	/*
  	  Implementation primitives required by the architecture
	*/
}