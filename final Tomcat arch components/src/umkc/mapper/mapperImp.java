package umkc.mapper;


import org.apache.catalina.Service;
import org.apache.catalina.mapper.*;

public class mapperImp implements ImapperImp
{
	private mapperArch _arch;
	
	Mapper map;

    public mapperImp (){
    }

	public void setArch(mapperArch arch){
		_arch = arch;
	}
	public mapperArch getArch(){
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
	public void sendserviceTomapper(Service service) {
		// TODO Auto-generated method stub
		
		map = service.getMapper();
		
	}

	/*
  	  Implementation primitives required by the architecture
	*/
  

}