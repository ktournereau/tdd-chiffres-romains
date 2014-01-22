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

        // Décomposition de la valeur
        int unit = this.valeur % 10;
        int diz = (this.valeur/10) % 10;
        int cent = (this.valeur/100) % 10;
        int mil = (this.valeur/1000) % 10;

        return this.getMil(mil)+this.getCent(cent)+this.getDiz(diz)+this.getUnit(unit);
    }

    private String getUnit(int val){
        ArrayList<String> convertTab = new ArrayList<String>();
        convertTab.add(0,"");
        convertTab.add(1,"I");
        convertTab.add(2,"II");
        convertTab.add(3,"III");
        convertTab.add(4,"IV");
        convertTab.add(5,"V");
        convertTab.add(6,"VI");
        convertTab.add(7,"VII");
        convertTab.add(8,"VIII");
        convertTab.add(9,"IX");

        return convertTab.get(val);
    }

    private String getDiz(int val){
        ArrayList<String> convertTab = new ArrayList<String>();
        convertTab.add(0,"");
        convertTab.add(1,"X");
        convertTab.add(2,"XX");
        convertTab.add(3,"XXX");
        convertTab.add(4,"XL");
        convertTab.add(5,"L");
        convertTab.add(6,"LX");
        convertTab.add(7,"LXX");
        convertTab.add(8,"LXXX");
        convertTab.add(9,"XC");

        return convertTab.get(val);
    }

    private String getCent(int val){
        ArrayList<String> convertTab = new ArrayList<String>();
        convertTab.add(0,"");
        convertTab.add(1,"C");
        convertTab.add(2,"CC");
        convertTab.add(3,"CCC");
        convertTab.add(4,"CD");
        convertTab.add(5,"D");
        convertTab.add(6,"DC");
        convertTab.add(7,"DCC");
        convertTab.add(8,"DCCC");
        convertTab.add(9,"CM");

         return convertTab.get(val);
    }

    private String getMil(int val){
        ArrayList<String> convertTab = new ArrayList<String>();
        convertTab.add(0,"");
        convertTab.add(1,"M");
        convertTab.add(2,"MM");
        convertTab.add(3,"MMM");

         return convertTab.get(val);
    }
}
