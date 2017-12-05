package umkc.init;


import edu.uci.isr.myx.fw.AbstractMyxSimpleBrick;
import edu.uci.isr.myx.fw.IMyxName;
import edu.uci.isr.myx.fw.MyxUtils;

import org.apache.catalina.startup.Bootstrap;

import umkc.Iinit;
import umkc.Ilog;
import umkc.Istart;

public class initArch extends AbstractMyxSimpleBrick implements Iinit
{
    public static final IMyxName msg_Iinit = MyxUtils.createName("umkc.Iinit");
    public static final IMyxName msg_Istart = MyxUtils.createName("umkc.Istart");
    public static final IMyxName msg_Ilog = MyxUtils.createName("umkc.Ilog");

    public Istart OUT_Istart;
    public Ilog OUT_Ilog;

	private IinitImp _imp;

    public initArch (){
		_imp = getImplementation();
		if (_imp != null){
			_imp.setArch(this);
		} else {
			System.exit(1);
		}
	}
    
    protected IinitImp getImplementation(){
        try{
			return new initImp();    
        } catch (Exception e){
            System.err.println(e.getMessage());
            return null;
        }
    }

    public void init(){
        _imp.init();
    }
    
    public void begin(){
        OUT_Istart = (Istart) MyxUtils.getFirstRequiredServiceObject(this,msg_Istart);
        if (OUT_Istart == null){
 			System.err.println("Error: Interface umkc.Istart returned null");
			return;       
        }
        OUT_Ilog = (Ilog) MyxUtils.getFirstRequiredServiceObject(this,msg_Ilog);
        if (OUT_Ilog == null){
 			System.err.println("Error: Interface umkc.Ilog returned null");
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
		if (arg0.equals(msg_Iinit)){
			return this;
		}        
		return null;
	}
  
    //To be imported: Bootstrap
    public void sendinit (Bootstrap b)   {
		_imp.sendinit(b);
    }    
}