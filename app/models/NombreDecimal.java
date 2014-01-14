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

    	ArrayList<String> convert = new ArrayList<String>();

    	convert.add(0,"");
    	convert.add(1,"I");
    	convert.add(2,"II");
    	convert.add(3,"III");
    	convert.add(4,"IV");

    	return convert.get(this.valeur);

/*
		if(this.valeur==1){	return "I";}
		else if(this.valeur ==2){ return "II";}
		else if(this.valeur == 3){ return "III";}
		else if(this.valeur == 4){ return "IV";}
		else{ return "";}
*/
    }
}