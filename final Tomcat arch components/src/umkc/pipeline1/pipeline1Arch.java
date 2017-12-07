package umkc.pipeline1;


import edu.uci.isr.myx.fw.AbstractMyxSimpleBrick;
import edu.uci.isr.myx.fw.IMyxName;
import edu.uci.isr.myx.fw.MyxUtils;

import org.apache.catalina.Host;

import umkc.Ipipeline1;
import umkc.Ivalve1;

public class pipeline1Arch extends AbstractMyxSimpleBrick implements Ipipeline1
{
    public static final IMyxName msg_Ipipeline1 = MyxUtils.createName("umkc.Ipipeline1");
    public static final IMyxName msg_Ivalve1 = MyxUtils.createName("umkc.Ivalve1");

    public Ivalve1 OUT_Ivalve1;

	private Ipipeline1Imp _imp;

    public pipeline1Arch (){
		_imp = getImplementation();
		if (_imp != null){
			_imp.setArch(this);
		} else {
			System.exit(1);
		}
	}
    
    protected Ipipeline1Imp getImplementation(){
        try{
			return new pipeline1Imp();    
        } catch (Exception e){
            System.err.println(e.getMessage());
            return null;
        }
    }

    public void init(){
        _imp.init();
    }
    
    public void begin(){
        OUT_Ivalve1 = (Ivalve1) MyxUtils.getFirstRequiredServiceObject(this,msg_Ivalve1);
        if (OUT_Ivalve1 == null){
 			System.err.println("Error: Interface umkc.Ivalve1 returned null");
			return;       
        }
        _imp.begin();
    }
    
    public void end(){
        _imp.end();
    }
    
    public void destroy(){
        _imp.destroy();
    }
    
	public Object getServiceObject(IMyxName arg0) {
		if (arg0.equals(msg_Ipipeline1)){
			return this;
		}        
		return null;
	}
  
    //To be imported: Host
    public void sendhostTopipe (Host host)   {
		_imp.sendhostTopipe(host);
    }    
}