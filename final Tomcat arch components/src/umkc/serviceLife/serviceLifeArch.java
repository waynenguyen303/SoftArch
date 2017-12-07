package umkc.serviceLife;


import edu.uci.isr.myx.fw.AbstractMyxSimpleBrick;
import edu.uci.isr.myx.fw.IMyxName;
import edu.uci.isr.myx.fw.MyxUtils;

import org.apache.catalina.Service;

import umkc.IserviceLife;

public class serviceLifeArch extends AbstractMyxSimpleBrick implements IserviceLife
{
    public static final IMyxName msg_IserviceLife = MyxUtils.createName("umkc.IserviceLife");


	private IserviceLifeImp _imp;

    public serviceLifeArch (){
		_imp = getImplementation();
		if (_imp != null){
			_imp.setArch(this);
		} else {
			System.exit(1);
		}
	}
    
    protected IserviceLifeImp getImplementation(){
        try{
			return new serviceLifeImp();    
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
		if (arg0.equals(msg_IserviceLife)){
			return this;
		}        
		return null;
	}
  
    //To be imported: Service
    public void sendServiceToLife (Service service)   {
		_imp.sendServiceToLife(service);
    }    
}