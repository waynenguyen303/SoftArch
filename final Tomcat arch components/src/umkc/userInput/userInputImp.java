package umkc.userInput;



public class userInputImp implements IuserInputImp
{
	private userInputArch _arch;
	
	

    public userInputImp (){
    }

	public void setArch(userInputArch arch){
		_arch = arch;
	}
	public userInputArch getArch(){
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
		
		String message = null;
		senduserInput(message);
	}
	public void end(){
		//TODO Auto-generated method stub
	}
	public void destroy(){
		//TODO Auto-generated method stub
	}

	/*
  	  Implementation primitives required by the architecture
	*/
	
	public void senduserInput(String message) {
		_arch.OUT_Iuserinput.senduserinput(message);
		
	}
	
}