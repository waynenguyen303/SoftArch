package umkc.userInput;


import edu.uci.isr.myx.fw.AbstractMyxSimpleBrick;
import edu.uci.isr.myx.fw.IMyxName;
import edu.uci.isr.myx.fw.MyxUtils;

import umkc.Iuserinput;

public class userInputArch extends AbstractMyxSimpleBrick
{
    public static final IMyxName msg_Iuserinput = MyxUtils.createName("umkc.Iuserinput");

    public Iuserinput OUT_Iuserinput;

	private IuserInputImp _imp;

    public userInputArch (){
		_imp = getImplementation();
		if (_imp != null){
			_imp.setArch(this);
		} else {
			System.exit(1);
		}
	}
    
    protected IuserInputImp getImplementation(){
        try{
			return new userInputImp();    
        } catch (Exception e){
            System.err.println(e.getMessage());
            return null;
        }
    }

    public void init(){
        _imp.init();
    }
    
    public void begin(){
        OUT_Iuserinput = (Iuserinput) MyxUtils.getFirstRequiredServiceObject(this,msg_Iuserinput);
        if (OUT_Iuserinput == null){
 			System.err.println("Error: Interface umkc.Iuserinput returned null");
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