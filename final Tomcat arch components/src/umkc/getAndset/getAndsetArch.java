package umkc.getAndset;


import edu.uci.isr.myx.fw.AbstractMyxSimpleBrick;
import edu.uci.isr.myx.fw.IMyxName;
import edu.uci.isr.myx.fw.MyxUtils;

import org.apache.catalina.Host;

import umkc.IgetAndsetHost;

public class getAndsetArch extends AbstractMyxSimpleBrick implements IgetAndsetHost
{
    public static final IMyxName msg_IgetAndsetHost = MyxUtils.createName("umkc.IgetAndsetHost");


	private IgetAndsetImp _imp;

    public getAndsetArch (){
		_imp = getImplementation();
		if (_imp != null){
			_imp.setArch(this);
		} else {
			System.exit(1);
		}
	}
    
    protected IgetAndsetImp getImplementation(){
        try{
			return new getAndsetImp();    
        } catch (Exception e){
            System.err.println(e.getMessage());
            return null;
        }
    }

    public void init(){
        _imp.init();
    }
    
    public void begin(){
        _imp.begin();
    }
    
    public void end(){
        _imp.end();
    }
    
    public void destroy(){
        _imp.destroy();
    }
    
	public Object getServiceObject(IMyxName arg0) {
		if (arg0.equals(msg_IgetAndsetHost)){
			return this;
		}        
		return null;
	}
  
    //To be imported: Host
    public void sendhostTogetandset (Host host)   {
		_imp.sendhostTogetandset(host);
    }    
}