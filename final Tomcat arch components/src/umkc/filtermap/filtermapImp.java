package umkc.filtermap;


import org.apache.catalina.Context;
import org.apache.tomcat.util.descriptor.web.FilterMap;

public class filtermapImp implements IfiltermapImp
{
	private filtermapArch _arch;
	
	FilterMap[] FM;

    public filtermapImp (){
    }

	public void setArch(filtermapArch arch){
		_arch = arch;
	}
	public filtermapArch getArch(){
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
		
		FM = context.findFilterMaps();
		
	}

	/*
  	  Implementation primitives required by the architecture
	*/
  
}