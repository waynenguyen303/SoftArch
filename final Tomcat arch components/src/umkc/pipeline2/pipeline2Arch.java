package umkc.pipeline2;


import edu.uci.isr.myx.fw.AbstractMyxSimpleBrick;
import edu.uci.isr.myx.fw.IMyxName;
import edu.uci.isr.myx.fw.MyxUtils;

import org.apache.catalina.Context;

import umkc.Ipipeline2;
import umkc.Ivalve2;

public class pipeline2Arch extends AbstractMyxSimpleBrick implements Ipipeline2
{
    public static final IMyxName msg_Ipipeline2 = MyxUtils.createName("umkc.Ipipeline2");
    public static final IMyxName msg_Ivalve2 = MyxUtils.createName("umkc.Ivalve2");

    public Ivalve2 OUT_Ivalve2;

	private Ipipeline2Imp _imp;

    public pipeline2Arch (){
		_imp = getImplementation();
		if (_imp != null){
			_imp.setArch(this);
		} else {
			System.exit(1);
		}
	}
    
    protected Ipipeline2Imp getImplementation(){
        try{
			return new pipeline2Imp();    
        } catch (Exception e){
            System.err.println(e.getMessage());
            return null;
        }
    }

    public void init(){
        _imp.init();
    }
    
    public void begin(){
        OUT_Ivalve2 = (Ivalve2) MyxUtils.getFirstRequiredServiceObject(this,msg_Ivalve2);
        if (OUT_Ivalve2 == null){
 			System.err.println("Error: Interface umkc.Ivalve2 returned null");
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
		if (arg0.equals(msg_Ipipeline2)){
			return this;
		}        
		return null;
	}
  
    //To be imported: Context
    public void sendcontextTopipe2 (Context con)   {
		_imp.sendcontextTopipe2(con);
    }    
}