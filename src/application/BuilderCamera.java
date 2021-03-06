package application;

public class BuilderCamera {
	
	private CameraNormala camera=null;

	public BuilderCamera(String nume,String suprafata) throws Exception {
		super();
		if(nume != null && suprafata != null)
			this.camera = new CameraNormala(nume, suprafata, 25, false,false,false, false);
		else
			throw new Exception("Nu se accepta null");
	}
	
	public CameraNormala build()
	{
		return this.camera;
	}
	
	public BuilderCamera AreGaze()
	{
		this.camera.setSursaGaze(true);
		return this;
	}
	
	public BuilderCamera AreSursaDeApa()
	{
		this.camera.setSursaApa(true);
		return this;
	}
	
	public BuilderCamera AprindeLumina() throws ExceptieLipsaCurent
	{
		this.camera.DeschideLumina();
		return this;
	}
	
	
	
	

}
