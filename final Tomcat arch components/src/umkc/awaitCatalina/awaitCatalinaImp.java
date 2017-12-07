package umkc.awaitCatalina;


import org.apache.catalina.startup.Catalina;

public class awaitCatalinaImp implements IawaitCatalinaImp
{
	private awaitCatalinaArch _arch;
	
	String m = null;

    public awaitCatalinaImp (){
    }

	public void setArch(awaitCatalinaArch arch){
		_arch = arch;
	}
	public awaitCatalinaArch getArch(){
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
	public void sendstopcatalina(Catalina cat) {
		// TODO Auto-generated method stub
		
		System.out.println("In awaitCatalina component");
		
		if (m =="await") {
			cat.await();
			
			_arch.OUT_IserverCatalina.sendCatToServer(cat);
		}
		
		_arch.OUT_IserverCatalina.sendCatToServer(cat);
		
	}

	@Override
	public void senduserinput(String message) {
		// TODO Auto-generated method stub
		m = getmessage(message);
	}

	/*
  	  Implementation primitives required by the architecture
	*/
  
	public String getmessage(String message) {
		return message;
	}
}