package org.example;

import org.example.utili.Decodage_TTN_Laird;
import org.example.utili.LectureFichierTexte;

public class Main {
    public static void main(String[] args) {
        LectureFichierTexte fichierTexte=new LectureFichierTexte();
        String json=fichierTexte.lire("json_ttn_v3.json");

        Decodage_TTN_Laird decodeur=new Decodage_TTN_Laird(json);

        System.out.println("Application ID: " + decodeur.getApplicationId());
        System.out.println("Uplink message: " + decodeur.getUplinkMessage());
        System.out.println("Gateway ID: " + decodeur.getGatewayId());
        System.out.println("Spreading Factor: " + decodeur.getSpreading_factor());



    }
}