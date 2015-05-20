//Damit der Server weiss was los ist
public class RequestType {
private String typ;
private String inhalt;
private int id;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getTyp() {
	return typ;
}
public void setTyp(String typ) {
	this.typ = typ;
}
public String getInhalt() {
	return inhalt;
}
public void setInhalt(String inhalt) {
	this.inhalt = inhalt;
}
}
