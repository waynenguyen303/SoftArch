package umkc.boot;

import org.apache.catalina.startup.Bootstrap;

public class bootImp implements IbootImp
{
	private bootArch _arch;
	
	Bootstrap boot = new Bootstrap();

    public bootImp (){
    }

	public void setArch(bootArch arch){
		_arch = arch;
	}
	public bootArch getArch(){
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
		
		sendboot(boot);
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
	
	public void sendboot(Bootstrap b) {
	_arch.OUT_Iinit.sendinit(b);
	System.out.println("boot comp started");
	
	}
	
	
}