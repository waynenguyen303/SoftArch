package umkc.containerCatalina;


import org.apache.catalina.Container;
import org.apache.catalina.Pipeline;
import org.apache.catalina.startup.Catalina;

public class containerCatalinaImp implements IcontainerCatalinaImp
{
	private containerCatalinaArch _arch;
	
	Container container = null;

    public containerCatalinaImp (){
    }

	public void setArch(containerCatalinaArch arch){
		_arch = arch;
	}
	public containerCatalinaArch getArch(){
		return _arch;
	}

	/*
  	  Myx Lifecycle Methods: these methods are called automatically by the framework
  	  as the bricks are created, attached, detached, and destroyed respectively.
	*/	
	public void init(){
	    //TODO Auto-generated method stub
	}
	public void begin(){
		//TODO Auto-generated method stub
	}
	public void end(){
		//TODO Auto-generated method stub
	}
	public void destroy(){
		//TODO Auto-generated method stub
	}

	@Override
	public void senddigesterTocontainer(Catalina cat) {
		// TODO Auto-generated method stub

		ClassLoader parent = cat.getParentClassLoader();
		
		container = (Container) cat.createStartDigester().peek();
		container.setParentClassLoader(parent);
		
		_arch.OUT_Icontainer.sendcontainer(container);
		
		_arch.OUT_Iengine.sendcontainerTohost(container);
	}



	/*
  	  Implementation primitives required by the architecture
	*/
  

}