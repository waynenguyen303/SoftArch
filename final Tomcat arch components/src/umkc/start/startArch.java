package umkc.start;


import edu.uci.isr.myx.fw.AbstractMyxSimpleBrick;
import edu.uci.isr.myx.fw.IMyxName;
import edu.uci.isr.myx.fw.MyxUtils;

import org.apache.catalina.startup.Bootstrap;

import umkc.IloadCatalina;
import umkc.Istart;

public class startArch extends AbstractMyxSimpleBrick implements Istart
{
    public static final IMyxName msg_Istart = MyxUtils.createName("umkc.Istart");
    public static final IMyxName msg_IloadCatalina = MyxUtils.createName("umkc.IloadCatalina");

    public IloadCatalina OUT_IloadCatalina;

	private IstartImp _imp;

    public startArch (){
		_imp = getImplementation();
		if (_imp != null){
			_imp.setArch(this);
		} else {
			System.exit(1);
		}
	}
    
    protected IstartImp getImplementation(){
        try{
			return new startImp();    
        } catch (Exception e){
            System.err.println(e.getMessage());
            return null;
        }
    }

    public void init(){
        _imp.init();
    }
    
    public void begin(){
        OUT_IloadCatalina = (IloadCatalina) MyxUtils.getFirstRequiredServiceObject(this,msg_IloadCatalina);
        if (OUT_IloadCatalina == null){
 			System.err.println("Error: Interface umkc.IloadCatalina returned null");
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
		if (arg0.equals(msg_Istart)){
			return this;
		}        
		return null;
	}
  
    //To be imported: Bootstrap
    public void sendstart (Bootstrap b)   {
		_imp.sendstart(b);
    }    
}