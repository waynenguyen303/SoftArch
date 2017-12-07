package umkc.hostLife;


import edu.uci.isr.myx.fw.AbstractMyxSimpleBrick;
import edu.uci.isr.myx.fw.IMyxName;
import edu.uci.isr.myx.fw.MyxUtils;

import org.apache.catalina.Host;

import umkc.IhostLife;

public class hostLifeArch extends AbstractMyxSimpleBrick implements IhostLife
{
    public static final IMyxName msg_IhostLife = MyxUtils.createName("umkc.IhostLife");


	private IhostLifeImp _imp;

    public hostLifeArch (){
		_imp = getImplementation();
		if (_imp != null){
			_imp.setArch(this);
		} else {
			System.exit(1);
		}
	}
    
    protected IhostLifeImp getImplementation(){
        try{
			return new hostLifeImp();    
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
		if (arg0.equals(msg_IhostLife)){
			return this;
		}        
		return null;
	}
  
    //To be imported: Host
    public void sendhostTolife (Host host)   {
		_imp.sendhostTolife(host);
    }    
}