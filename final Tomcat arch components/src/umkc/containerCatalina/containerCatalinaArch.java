package umkc.containerCatalina;


import edu.uci.isr.myx.fw.AbstractMyxSimpleBrick;
import edu.uci.isr.myx.fw.IMyxName;
import edu.uci.isr.myx.fw.MyxUtils;

import org.apache.catalina.startup.Catalina;

import umkc.Icontainer;
import umkc.IdigesterOut;
import umkc.Iengine;
import umkc.Ipipeline;

public class containerCatalinaArch extends AbstractMyxSimpleBrick implements IdigesterOut
{
    public static final IMyxName msg_IdigesterOut = MyxUtils.createName("umkc.IdigesterOut");
    public static final IMyxName msg_Icontainer = MyxUtils.createName("umkc.Icontainer");
    public static final IMyxName msg_Iengine = MyxUtils.createName("umkc.Iengine");
    public static final IMyxName msg_Ipipeline = MyxUtils.createName("umkc.Ipipeline");

    public Icontainer OUT_Icontainer;
    public Iengine OUT_Iengine;
    public Ipipeline OUT_Ipipeline;

	private IcontainerCatalinaImp _imp;

    public containerCatalinaArch (){
		_imp = getImplementation();
		if (_imp != null){
			_imp.setArch(this);
		} else {
			System.exit(1);
		}
	}
    
    protected IcontainerCatalinaImp getImplementation(){
        try{
			return new containerCatalinaImp();    
        } catch (Exception e){
            System.err.println(e.getMessage());
            return null;
        }
    }

    public void init(){
        _imp.init();
    }
    
    public void begin(){
        OUT_Icontainer = (Icontainer) MyxUtils.getFirstRequiredServiceObject(this,msg_Icontainer);
        if (OUT_Icontainer == null){
 			System.err.println("Error: Interface umkc.Icontainer returned null");
			return;       
        }
        OUT_Iengine = (Iengine) MyxUtils.getFirstRequiredServiceObject(this,msg_Iengine);
        if (OUT_Iengine == null){
 			System.err.println("Error: Interface umkc.Iengine returned null");
			return;       
        }
        OUT_Ipipeline = (Ipipeline) MyxUtils.getFirstRequiredServiceObject(this,msg_Ipipeline);
        if (OUT_Ipipeline == null){
 			System.err.println("Error: Interface umkc.Ipipeline returned null");
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
		if (arg0.equals(msg_IdigesterOut)){
			return this;
		}        
		return null;
	}
  
    //To be imported: Catalina
    public void senddigesterTocontainer (Catalina cat)   {
		_imp.senddigesterTocontainer(cat);
    }    
}