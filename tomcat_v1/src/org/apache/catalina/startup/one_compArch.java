package org.apache.catalina.startup;


import edu.uci.isr.myx.fw.AbstractMyxSimpleBrick;
import edu.uci.isr.myx.fw.IMyxName;

public class one_compArch extends AbstractMyxSimpleBrick
{


	private Ione_compImp _imp;

    public one_compArch (){
		_imp = getImplementation();
		if (_imp != null){
			_imp.setArch(this);
		} else {
			System.exit(1);
		}
	}
    
    protected Ione_compImp getImplementation(){
        try{
			return new one_compImp();    
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
		return null;
	}
}