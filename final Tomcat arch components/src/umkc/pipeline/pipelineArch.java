package umkc.pipeline;


import edu.uci.isr.myx.fw.AbstractMyxSimpleBrick;
import edu.uci.isr.myx.fw.IMyxName;
import edu.uci.isr.myx.fw.MyxUtils;

import org.apache.catalina.Container;

import umkc.Ipipeline;
import umkc.Ivalve;

public class pipelineArch extends AbstractMyxSimpleBrick implements Ipipeline
{
    public static final IMyxName msg_Ipipeline = MyxUtils.createName("umkc.Ipipeline");
    public static final IMyxName msg_Ivalve = MyxUtils.createName("umkc.Ivalve");

    public Ivalve OUT_Ivalve;

	private IpipelineImp _imp;

    public pipelineArch (){
		_imp = getImplementation();
		if (_imp != null){
			_imp.setArch(this);
		} else {
			System.exit(1);
		}
	}
    
    protected IpipelineImp getImplementation(){
        try{
			return new pipelineImp();    
        } catch (Exception e){
            System.err.println(e.getMessage());
            return null;
        }
    }

    public void init(){
        _imp.init();
    }
    
    public void begin(){
        OUT_Ivalve = (Ivalve) MyxUtils.getFirstRequiredServiceObject(this,msg_Ivalve);
        if (OUT_Ivalve == null){
 			System.err.println("Error: Interface umkc.Ivalve returned null");
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
		if (arg0.equals(msg_Ipipeline)){
			return this;
		}        
		return null;
	}
  
    //To be imported: Container
    public void sendconTopipe (Container con)   {
		_imp.sendconTopipe(con);
    }    
}