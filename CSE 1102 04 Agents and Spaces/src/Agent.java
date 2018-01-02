
public class Agent {
	String _name;
	Space _location;
	
	public void setLocation(Space space){
		this._location = space;
	}
	public Space getLocation(){
		return _location;
	}
	public void setName(String string){
		this._name = string;
	}
	public String getName(){
		return _name;
	}
	public String toString(){
		return _name;
	}
	public String toStringLong(){
		return _name + " is in " + _location;
	}
}
