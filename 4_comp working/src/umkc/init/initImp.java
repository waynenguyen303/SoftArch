package umkc.init;


import org.apache.catalina.startup.Bootstrap;

public class initImp implements IinitImp
{
	private initArch _arch;

    public initImp (){
    }

	public void setArch(initArch arch){
		_arch = arch;
	}
	public initArch getArch(){
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

	
	/*
	  Implementation primitives required by the architecture
	*/


	@Override
	public void sendinit(Bootstrap b) {
		// TODO Auto-generated method stub
		
		try {
			
			b.init();
			
			if (b.log.isDebugEnabled()) {
	            _arch.OUT_Ilog.sendlog(b);}
			else{
					System.out.println("Log Debug not enabled, but loggin debug in log component anyways");
					_arch.OUT_Ilog.sendlog(b);
				}
			
			
			_arch.OUT_Istart.sendstart(b);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}