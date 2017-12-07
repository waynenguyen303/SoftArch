package umkc.start;


import org.apache.catalina.startup.Bootstrap;
import org.apache.catalina.startup.Catalina;

public class startImp implements IstartImp
{
	private startArch _arch;
	
	Catalina cat = new Catalina();

    public startImp (){
    }

	public void setArch(startArch arch){
		_arch = arch;
	}
	public startArch getArch(){
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
		
		sendcatalinaload(cat);
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
	public void sendstart(Bootstrap b) {
		// TODO Auto-generated method stub
		
		try {	
			b.start();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void sendcatalinaload(Catalina cat) {
		
		_arch.OUT_IloadCatalina.sendCatalinatoLoad(cat);
	}
	
	
}