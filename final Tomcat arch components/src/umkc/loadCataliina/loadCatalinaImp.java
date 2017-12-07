package umkc.loadCataliina;

import org.apache.tomcat.util.digester.*;
import org.apache.tomcat.util.digester.Rule;
import org.apache.tomcat.util.digester.RuleSet;
import org.apache.catalina.startup.Catalina;

public class loadCatalinaImp implements IloadCatalinaImp
{
	private loadCatalinaArch _arch;
	
	
	String m = null;

    public loadCatalinaImp (){
    }

	public void setArch(loadCatalinaArch arch){
		_arch = arch;
	}
	public loadCatalinaArch getArch(){
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
	public void sendCatalinatoLoad(Catalina cat) {
		// TODO Auto-generated method stub
		
		
		
		if(m =="load") {
			cat.load();
			
		}
		cat.load();
		
		_arch.OUT_Istop.sendstopcatalina(cat);
		_arch.OUT_ICatalinaStringManager.sendToCatalinaSM(cat);
		_arch.OUT_Ilog.sendcatlog(cat);
		_arch.OUT_Idigester.sendTodigester(cat);
		
		
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