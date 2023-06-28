package stringActividad;

public class StringManipulator {
	
	public String trimAndConcat(String string1, String string2)	{
		return string1.trim() + string2.trim();	
	} 
	public int getIndexOrNull(String string, char letter){
		return string.indexOf(letter);		
	}
	public int getIndexOrNull(String string, String subString){
		return string.indexOf(subString);	
	}
	public String concatSubstring(String string1, int inicio, int termino, String string2){
		return string1.substring(inicio,termino) + string2;
	}
}

