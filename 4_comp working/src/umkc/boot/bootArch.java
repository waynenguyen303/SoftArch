package umkc.boot;


import edu.uci.isr.myx.fw.AbstractMyxSimpleBrick;
import edu.uci.isr.myx.fw.IMyxName;
import edu.uci.isr.myx.fw.MyxUtils;

import umkc.Iinit;

public class bootArch extends AbstractMyxSimpleBrick
{
    public static final IMyxName msg_Iinit = MyxUtils.createName("umkc.Iinit");

    public Iinit OUT_Iinit;

	private IbootImp _imp;

    public bootArch (){
		_imp = getImplementation();
		if (_imp != null){
			_imp.setArch(this);
		} else {
			System.exit(1);
		}
	}
    
    protected IbootImp getImplementation(){
        try{
			return new bootImp();    
        } catch (Exception e){
            System.err.println(e.getMessage());
            return null;
        }
    }

    public void init(){
        _imp.init();
    }
    
    public void begin(){
        OUT_Iinit = (Iinit) MyxUtils.getFirstRequiredServiceObject(this,msg_Iinit);
        if (OUT_Iinit == null){
 			System.err.println("Error: Interface umkc.Iinit returned null");
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
		return null;
	}
}