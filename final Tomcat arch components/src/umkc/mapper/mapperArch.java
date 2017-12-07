package umkc.mapper;


import edu.uci.isr.myx.fw.AbstractMyxSimpleBrick;
import edu.uci.isr.myx.fw.IMyxName;
import edu.uci.isr.myx.fw.MyxUtils;

import org.apache.catalina.Service;

import umkc.Imapper;

public class mapperArch extends AbstractMyxSimpleBrick implements Imapper
{
    public static final IMyxName msg_Imapper = MyxUtils.createName("umkc.Imapper");


	private ImapperImp _imp;

    public mapperArch (){
		_imp = getImplementation();
		if (_imp != null){
			_imp.setArch(this);
		} else {
			System.exit(1);
		}
	}
    
    protected ImapperImp getImplementation(){
        try{
			return new mapperImp();    
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
		if (arg0.equals(msg_Imapper)){
			return this;
		}        
		return null;
	}
  
    //To be imported: Service
    public void sendserviceTomapper (Service service)   {
		_imp.sendserviceTomapper(service);
    }    
}