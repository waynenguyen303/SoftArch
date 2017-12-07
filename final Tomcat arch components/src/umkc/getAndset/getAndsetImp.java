package umkc.getAndset;


import org.apache.catalina.Host;

public class getAndsetImp implements IgetAndsetImp
{
	private getAndsetArch _arch;

    public getAndsetImp (){
    }

	public void setArch(getAndsetArch arch){
		_arch = arch;
	}
	public getAndsetArch getArch(){
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
	public void sendhostTogetandset(Host host) {
		// TODO Auto-generated method stub
		
		host.setCreateDirs(host.getCreateDirs());
		host.setAutoDeploy( host.getAutoDeploy());
		host.setDeployOnStartup(host.getDeployOnStartup());
		host.setUndeployOldVersions(host.getUndeployOldVersions());
		
	}

	/*
  	  Implementation primitives required by the architecture
	*/
  
 
}