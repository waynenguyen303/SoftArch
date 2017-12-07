package umkc.smCatalina;


import org.apache.catalina.startup.Catalina;


public class smCatalinaImp implements IsmCatalinaImp
{
	private smCatalinaArch _arch;

    public smCatalinaImp (){
    }

	public void setArch(smCatalinaArch arch){
		_arch = arch;
	}
	public smCatalinaArch getArch(){
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
	public void sendToCatalinaSM(Catalina cat) {
		// TODO Auto-generated method stub
		
		System.out.println("Got Catalina instance from loadCatalina component to smCatalina component");
		try {
			
	
			 //cat.sm.getString(null);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	/*
  	  Implementation primitives required by the architecture
	*/
  

}