package models;

import java.util.*;
import javax.validation.*;
import play.data.validation.Constraints.*;

public class NombreRomain {
    @Required
    public String valeur;
    public NombreRomain() {}
    public NombreRomain(String r) {
	this.valeur = r;
    }

    public int en_decimal() {
		if(this.valeur == "") return 0;
		if(this.valeur == "I") return 1;
		if(this.valeur == "II") return 2;
		if(this.valeur == "III") return 3;
		if(this.valeur == "IV") return 4;
		if(this.valeur == "V") return 5;
		if(this.valeur == "VI") return 6;
		if(this.valeur == "VII") return 7;
		if(this.valeur == "VIII") return 8;	
		if(this.valeur == "IX") return 9;

		return 0;	
	}

}
