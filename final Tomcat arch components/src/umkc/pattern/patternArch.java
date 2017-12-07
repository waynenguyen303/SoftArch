package umkc.pattern;


import edu.uci.isr.myx.fw.AbstractMyxSimpleBrick;
import edu.uci.isr.myx.fw.IMyxName;
import edu.uci.isr.myx.fw.MyxUtils;

import org.apache.catalina.Host;

import umkc.Ipattern;

public class patternArch extends AbstractMyxSimpleBrick implements Ipattern
{
    public static final IMyxName msg_Ipattern = MyxUtils.createName("umkc.Ipattern");


	private IpatternImp _imp;

    public patternArch (){
		_imp = getImplementation();
		if (_imp != null){
			_imp.setArch(this);
		} else {
			System.exit(1);
		}
	}
    
    protected IpatternImp getImplementation(){
        try{
			return new patternImp();    
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
		if (arg0.equals(msg_Ipattern)){
			return this;
		}        
		return null;
	}
  
    //To be imported: Host
    public void sendhostTopattern (Host host)   {
		_imp.sendhostTopattern(host);
    }    
}