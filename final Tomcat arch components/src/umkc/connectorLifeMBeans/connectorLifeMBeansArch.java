package umkc.connectorLifeMBeans;


import edu.uci.isr.myx.fw.AbstractMyxSimpleBrick;
import edu.uci.isr.myx.fw.IMyxName;
import edu.uci.isr.myx.fw.MyxUtils;

import org.apache.catalina.connector.Connector;

import umkc.IconMBeans;

public class connectorLifeMBeansArch extends AbstractMyxSimpleBrick implements IconMBeans
{
    public static final IMyxName msg_IconMBeans = MyxUtils.createName("umkc.IconMBeans");


	private IconnectorLifeMBeansImp _imp;

    public connectorLifeMBeansArch (){
		_imp = getImplementation();
		if (_imp != null){
			_imp.setArch(this);
		} else {
			System.exit(1);
		}
	}
    
    protected IconnectorLifeMBeansImp getImplementation(){
        try{
			return new connectorLifeMBeansImp();    
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
		if (arg0.equals(msg_IconMBeans)){
			return this;
		}        
		return null;
	}
  
    //To be imported: Connector
    public void extendconToMBeans (Connector con)   {
		_imp.extendconToMBeans(con);
    }    
}