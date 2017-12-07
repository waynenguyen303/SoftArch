package umkc.filerdef;


import org.apache.catalina.Context;
import org.apache.tomcat.util.descriptor.web.FilterDef;

public class filterdefImp implements IfilterdefImp
{
	private filterdefArch _arch;
	
	FilterDef[] FD;

    public filterdefImp (){
    }

	public void setArch(filterdefArch arch){
		_arch = arch;
	}
	public filterdefArch getArch(){
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
		
		FD = context.findFilterDefs();
		
	}

	/*
  	  Implementation primitives required by the architecture
	*/

}