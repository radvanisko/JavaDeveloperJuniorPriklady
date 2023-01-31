package ulohy.zamestnanci;

import ulohy.zamestnanci.model.Zamestnanec;

public  class ZamestnanciEvidencia {


    public static void main(String[] args) {

        Zamestnanec zamestnanec1 = new Zamestnanec();
        zamestnanec1.setMeno("Anna");
        zamestnanec1.setPriezvisko("Sikovna");


        Zamestnanec zamestnanec2 =new Zamestnanec("Ivan","Mrkva",'m',2005);
        Zamestnanec zamestnanec3= new Zamestnanec("Eva", "Pekna",'f',2000);
        Zamestnanec uchadzac=new Zamestnanec( "Petra","Mudra");


        System.out.println(" Vsetky Udaje zamestnanca cez toString");
        System.out.println(zamestnanec2);



    }



}

