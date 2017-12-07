package umkc.digester;

import org.apache.tomcat.util.digester.Digester;
import org.apache.tomcat.util.digester.Rule;
import org.apache.tomcat.util.digester.RuleSet;
import org.apache.catalina.startup.Catalina;

public class digesterImp implements IdigesterImp
{
	private digesterArch _arch;
	
	Digester digStart = new Digester();
	Digester digStop = new Digester();
	Digester dig = new Digester();
	
    public digesterImp (){
    }

	public void setArch(digesterArch arch){
		_arch = arch;
	}
	public digesterArch getArch(){
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
	public void sendTodigester(Catalina cat) {
		// TODO Auto-generated method stub
		
		digStart = cat.createStartDigester();
		digStop = cat.createStopDigester();
		
		_arch.OUT_IdigesterOut.senddigesterTocontainer(cat);
		
	}

	/*
  	  Implementation primitives required by the architecture
	*/
  

}