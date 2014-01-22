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

		if(this.valeur == "X") return 10;
		if(this.valeur == "XX") return 20;
		if(this.valeur == "XXX") return 30;
		if(this.valeur == "XL") return 40;
		if(this.valeur == "L") return 50;
		if(this.valeur == "LX") return 60;
		if(this.valeur == "LXX") return 70;
		if(this.valeur == "LXXX") return 80;	
		if(this.valeur == "XC") return 90;

		if(this.valeur == "C") return 100;
		if(this.valeur == "CC") return 200;
		if(this.valeur == "CCC") return 300;
		if(this.valeur == "CD") return 400;
		if(this.valeur == "D") return 500;
		if(this.valeur == "DC") return 600;
		if(this.valeur == "DCC") return 700;
		if(this.valeur == "DCCC") return 800;	
		if(this.valeur == "CM") return 900;

		return 0;	
	}

}
