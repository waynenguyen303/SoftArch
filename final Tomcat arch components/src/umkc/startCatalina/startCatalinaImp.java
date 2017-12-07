package umkc.startCatalina;


import org.apache.catalina.startup.Catalina;

public class startCatalinaImp implements IstartCatalinaImp
{
	private startCatalinaArch _arch;
	
	String m= null;

    public startCatalinaImp (){
    }

	public void setArch(startCatalinaArch arch){
		_arch = arch;
	}
	public startCatalinaArch getArch(){
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
		
		System.out.println("In StartCatalina component");
		
		if(m=="start") {
			cat.start();
			
			_arch.OUT_IserverCatalina.sendCatToServer(cat);
		}
		_arch.OUT_IserverCatalina.sendCatToServer(cat);
	}

	@Override
	public void senduserinput(String message) {
		// TODO Auto-generated method stub
		m=getmessage(message);
	}

	/*
  	  Implementation primitives required by the architecture
	*/
  
	public String getmessage(String message) {
		return message;
	}
}