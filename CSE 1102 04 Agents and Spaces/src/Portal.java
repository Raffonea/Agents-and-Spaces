
public class Portal {
	private String _name, _direction;
	private Space _destination;
	
	public void setName(String name){
		this._name = name;
	}
	public String getName(){
		return _name;
	}
	public void setDirection(String direction){
		this._direction = direction;
	}
	public String getDirection(){
		return _direction;
	}
	public void setDestination(Space sidewalk){
		this._destination = sidewalk;
	}
	public Space getDestination(){
		return _destination;
	}
	public String toString(){
		return _name + " that goes " + _direction;
	}
	public String toStringLong(){
		return _name + " that goes " + _direction + " to " + _destination;
 	}
	public void transport(Agent student){
		
	}
}
