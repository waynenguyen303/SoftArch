package umkc.JspConfigDescriptor;


import umkc.JspConfigDescriptor.JspConfigDescriptorArch;

public interface IJspConfigDescriptorImp 
{

	/*
	  Getter and Setter of architecture reference
	*/
    public void setArch (JspConfigDescriptorArch arch);
	public JspConfigDescriptorArch getArch();
	
	/*
  	  Myx Lifecycle Methods: these methods are called automatically by the framework
  	  as the bricks are created, attached, detached, and destroyed respectively.
	*/	
	public void init();	
	public void begin();
	public void end();
	public void destroy();

	/*
  	  Implementation primitives required by the architecture
	*/
}