package umkc.pattern;


import java.util.regex.Pattern;

import org.apache.catalina.Host;

public class patternImp implements IpatternImp
{
	private patternArch _arch;
	
	Pattern pattern;

    public patternImp (){
    }

	public void setArch(patternArch arch){
		_arch = arch;
	}
	public patternArch getArch(){
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
	public void sendhostTopattern(Host host) {
		// TODO Auto-generated method stub
		
		pattern = host.getDeployIgnorePattern();
		
	}

	/*
  	  Implementation primitives required by the architecture
	*/

}