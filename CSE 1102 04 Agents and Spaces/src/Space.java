
public class Space {
	private String _name, _description;
	private Portal _portal;
	
	public void setName(String name){
		this._name = name;
	}
	public String getName(){
		return _name;
	}
	public void setDescription(String description){
		this._description = description;
	}
	public String getDescription(){
		return _description;
	}
	public void setPortal(Portal portal){
		this._portal = portal;
	}
	public Portal getPortal(){
		return _portal;
	}
	public String toString(){
		return _name;
	}
	public  String toStringLong(){
		if(_portal != null){
			return _name + ": " + _description + " with a " + _portal.toStringLong();
		}
		else{
			return _name + ": " + _description;
		}
	}
}
