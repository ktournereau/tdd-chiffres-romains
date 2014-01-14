package models;

import java.util.*;
import javax.validation.*;
import play.data.validation.Constraints.*;

public class NombreDecimal {
    @Required
    public int valeur;
    public NombreDecimal() {}
    public NombreDecimal(int n) {
	this.valeur = n;
    }

    public String en_romain() {
    	if(this.valeur == 1) return "I";
    	if(this.valeur == 2) return "II";
    	if(this.valeur == 3) return "III";
    	
    	if(this.valeur == 4) return "IV";

    	return "";
    }
}
