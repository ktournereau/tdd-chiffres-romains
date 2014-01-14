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

    	ArrayList<String> convertTab = new ArrayList<String>();

    	convertTab.add(0,"");
    	convertTab.add(1,"I");
    	convertTab.add(2,"II");
    	convertTab.add(3,"III");

    	convertTab.add(4,"IV");

    	convertTab.add(5,"V");

    	convertTab.add(6,"VI");

    	return convertTab.get(this.valeur);
    }
}
