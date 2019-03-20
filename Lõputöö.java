import java.util.Scanner;
import java.util.Random;


public class Lõputöö {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mängija_scoor = 0;
        int vastase_scoor = 0;
        System.out.println("Mis on teie nimi? ");
        String nimi = scanner.nextLine();
        System.out.println("Teretulemast arvutamismängu " + nimi + ", palun valige tehetes kasutatav märk (+/-).");
        String märk = scanner.nextLine();
        System.out.println("Olete valinud " + märk + " märgiga tehted, kõige madalam arv on 1, valige kui suured võivad arvud olla (10,100,1000) ");
        int min_number = 1;
        int max_number = scanner.nextInt();
        System.out.println("Hästi, olete valinud arvud 1-" + max_number + ", nüüd valige vastase raskus kas (1-kerge), (2-keskmine) või (3-raske).");
        int vastase_raskus = scanner.nextInt();
        int vastase_arvutaja1 = 0;
        int vastase_arvutaja2 = 0;
        int vastase_arvutaja3 = 0;
        Random random = new Random();
        int max_raskus = 10;
        int min_raskus = 1;
        if (vastase_raskus == 1) {
            vastase_arvutaja1 = 4;
        }
        if (vastase_raskus == 2){
            vastase_arvutaja2 = 6;
        }
        if (vastase_raskus == 3){
            vastase_arvutaja3 = 8;
        }
        int tehe1arv1 = random.nextInt( max_number + 1 - min_number) + min_number;
        int tehe1arv2 = random.nextInt( max_number + 1 - min_number) + min_number;
        int vastus1_pos = arvutus_pos(tehe1arv1, tehe1arv2);
        int vastus1_neg = arvutus_neg(tehe1arv1, tehe1arv1);
        int vastus1 = 0;
        int vastus11 = 0;
        int vastane1 = 0;
        int vastane11 = 0;
        int vastane111 = 0;
        int randomvastane1 = random.nextInt( max_raskus + 1 - min_raskus) + min_raskus;
        System.out.println("Esimene tehe: " + tehe1arv1 + märk + tehe1arv2);
        if (märk.equals("+")) {
            vastus1 = vastus1_pos;
            if (scanner.nextInt() == vastus1) {
                System.out.println("Õige vastus");
                mängija_scoor++;
            }else{
                System.out.println("Vale vastus, õige vastus on: " + vastus1);
                mängija_scoor--;
            }
        }
        if (märk.equals("-")){
            vastus11 = vastus1_neg;
            if (scanner.nextInt() == vastus11){
                System.out.println("Õige vastus");
                mängija_scoor++;
            }else{
                System.out.println("Vale vastus, õige vastus on: " + vastus11);
                mängija_scoor--;
            }
        }
        if (vastase_arvutaja1 == 4){
            vastane1 = 4;
            if (randomvastane1 < vastane1){
                vastase_scoor++;
            }else{
                vastase_scoor--;
            }
        }
        if (vastase_arvutaja2 == 6){
            vastane11 = 6;
            if (randomvastane1 < vastane11){
                vastase_scoor++;
            }else{
                vastase_scoor--;
            }
        }
        if (vastase_arvutaja3 == 8){
            vastane111 = 8;
            if (randomvastane1 < vastane111){
                vastase_scoor++;
            }else{
                vastase_scoor--;
            }
        }
        System.out.println("Järgmine tehe, sinu scoor: " + mängija_scoor + " ja vastase scoor on : "+ vastase_scoor);
        int tehe2arv1 = random.nextInt( max_number + 1 - min_number) + min_number;
        int tehe2arv2 = random.nextInt( max_number + 1 - min_number) + min_number;
        int vastus2_pos = arvutus_pos(tehe2arv1, tehe2arv2);
        int vastus2_neg = arvutus_neg(tehe2arv1, tehe2arv1);
        int vastus2 = 0;
        int vastus22 = 0;
        int vastane2 = 0;
        int vastane22 = 0;
        int vastane222 = 0;
        int randomvastane2 = random.nextInt( max_raskus + 1 - min_raskus) + min_raskus;
        System.out.println("Teine tehe: " + tehe2arv1 + märk + tehe2arv2);
        if (märk.equals("+")) {
            vastus2 = vastus2_pos;
            if (scanner.nextInt() == vastus2) {
                System.out.println("Õige vastus");
                mängija_scoor++;
            }else{
                System.out.println("Vale vastus, õige vastus on: " + vastus2);
                mängija_scoor--;
            }
        }
        if (märk.equals("-")){
            vastus22 = vastus2_neg;
            if (scanner.nextInt() == vastus22){
                System.out.println("Õige vastus");
                mängija_scoor++;
            }else{
                System.out.println("Vale vastus, õige vastus on: " + vastus22);
                mängija_scoor--;
            }
        }
        if (vastase_arvutaja1 == 4){
            vastane2 = 4;
            if (randomvastane2 < vastane2){
                vastase_scoor++;
            }else{
                vastase_scoor--;
            }
        }
        if (vastase_arvutaja2 == 6){
            vastane22 = 6;
            if (randomvastane2 < vastane22){
                vastase_scoor++;
            }else{
                vastase_scoor--;
            }
        }
        if (vastase_arvutaja3 == 8){
            vastane222 = 8;
            if (randomvastane2 < vastane222){
                vastase_scoor++;
            }else{
                vastase_scoor--;
            }
        }
        System.out.println("Järgmine tehe, sinu scoor: " + mängija_scoor + " ja vastase scoor: " + vastase_scoor);
        int tehe3arv1 = random.nextInt( max_number + 1 - min_number) + min_number;
        int tehe3arv2 = random.nextInt( max_number + 1 - min_number) + min_number;
        int vastus3_pos = arvutus_pos(tehe2arv1, tehe2arv2);
        int vastus3_neg = arvutus_neg(tehe2arv1, tehe2arv1);
        int vastus3 = 0;
        int vastus33 = 0;
        int vastane3 = 0;
        int vastane33 = 0;
        int vastane333 = 0;
        int randomvastane3 = random.nextInt( max_raskus + 1 - min_raskus) + min_raskus;
        System.out.println("Kolmas tehe: " + tehe3arv1 + märk + tehe3arv2);
        if (märk.equals("+")) {
            vastus3 = vastus3_pos;
            if (scanner.nextInt() == vastus3) {
                System.out.println("Õige vastus");
                mängija_scoor++;
            }else{
                System.out.println("Vale vastus, õige vastus on: " + vastus3);
                mängija_scoor--;
            }
        }
        if (märk.equals("-")){
            vastus33 = vastus3_neg;
            if (scanner.nextInt() == vastus33){
                System.out.println("Õige vastus");
                mängija_scoor++;
            }else{
                System.out.println("Vale vastus, õige vastus on: " + vastus33);
                mängija_scoor--;
            }
        }
        if (vastase_arvutaja1 == 4){
            vastane3 = 4;
            if (randomvastane3 < vastane3){
                vastase_scoor++;
            }else{
                vastase_scoor--;
            }
        }
        if (vastase_arvutaja2 == 6){
            vastane33 = 6;
            if (randomvastane3 < vastane33){
                vastase_scoor++;
            }else{
                vastase_scoor--;
            }
        }
        if (vastase_arvutaja3 == 8){
            vastane333 = 8;
            if (randomvastane3 < vastane333){
                vastase_scoor++;
            }else{
                vastase_scoor--;
            }
        }
        System.out.println("Järgmine tehe, sinu scoor: " + mängija_scoor + " ja vasrase scoor: " + vastase_scoor);
        int tehe4arv1 = random.nextInt( max_number + 1 - min_number) + min_number;
        int tehe4arv2 = random.nextInt( max_number + 1 - min_number) + min_number;
        int vastus4_pos = arvutus_pos(tehe2arv1, tehe2arv2);
        int vastus4_neg = arvutus_neg(tehe2arv1, tehe2arv1);
        int vastus4 = 0;
        int vastus44 = 0;
        int vastane4 = 0;
        int vastane44 = 0;
        int vastane444 = 0;
        int randomvastane4 = random.nextInt( max_raskus + 1 - min_raskus) + min_raskus;
        System.out.println("Neljas tehe: " + tehe4arv1 + märk + tehe4arv2);
        if (märk.equals("+")) {
            vastus4 = vastus4_pos;
            if (scanner.nextInt() == vastus4) {
                System.out.println("Õige vastus");
                mängija_scoor++;
            }else{
                System.out.println("Vale vastus, õige vastus on: " + vastus4);
                mängija_scoor--;
            }
        }
        if (märk.equals("-")){
            vastus44 = vastus4_neg;
            if (scanner.nextInt() == vastus44){
                System.out.println("Õige vastus");
                mängija_scoor++;
            }else{
                System.out.println("Vale vastus, õige vastus on: " + vastus44);
                mängija_scoor--;
            }
        }
        if (vastase_arvutaja1 == 4){
            vastane4 = 4;
            if (randomvastane4 < vastane4){
                vastase_scoor++;
            }else{
                vastase_scoor--;
            }
        }
        if (vastase_arvutaja2 == 6){
            vastane44 = 6;
            if (randomvastane4 < vastane44){
                vastase_scoor++;
            }else{
                vastase_scoor--;
            }
        }
        if (vastase_arvutaja3 == 8){
            vastane444 = 8;
            if (randomvastane4 < vastane444){
                vastase_scoor++;
            }else{
                vastase_scoor--;
            }
        }
        System.out.println("Järgmine tehe, sinu scoor: " + mängija_scoor + " ja vastase scoor: " + vastase_scoor);
        int tehe5arv1 = random.nextInt( max_number + 1 - min_number) + min_number;
        int tehe5arv2 = random.nextInt( max_number + 1 - min_number) + min_number;
        int vastus5_pos = arvutus_pos(tehe5arv1, tehe5arv2);
        int vastus5_neg = arvutus_neg(tehe5arv1, tehe5arv1);
        int vastus5 = 0;
        int vastus55 = 0;
        int vastane5 = 0;
        int vastane55 = 0;
        int vastane555 = 0;
        int randomvastane5 = random.nextInt( max_raskus + 1 - min_raskus) + min_raskus;
        System.out.println("Viies tehe: " + tehe5arv1 + märk + tehe5arv2);
        if (märk.equals("+")) {
            vastus4 = vastus5_pos;
            if (scanner.nextInt() == vastus5) {
                System.out.println("Õige vastus");
                mängija_scoor++;
            }else{
                System.out.println("Vale vastus, õige vastus on: " + vastus5);
                mängija_scoor--;
            }
        }
        if (märk.equals("-")){
            vastus55 = vastus5_neg;
            if (scanner.nextInt() == vastus55){
                System.out.println("Õige vastus");
                mängija_scoor++;
            }else{
                System.out.println("Vale vastus, õige vastus on: " + vastus55);
                mängija_scoor--;
            }
        }
        if (vastase_arvutaja1 == 4){
            vastane5 = 4;
            if (randomvastane5 < vastane5){
                vastase_scoor++;
            }else{
                vastase_scoor--;
            }
        }
        if (vastase_arvutaja2 == 6){
            vastane55 = 6;
            if (randomvastane5 < vastane55){
                vastase_scoor++;
            }else{
                vastase_scoor--;
            }
        }
        if (vastase_arvutaja3 == 8){
            vastane555 = 8;
            if (randomvastane5 < vastane555){
                vastase_scoor++;
            }else{
                vastase_scoor--;
            }
        }
        System.out.println("Järgmine tehe, sinu scoor: " + mängija_scoor + " ja vastase scoor: " + vastase_scoor);
        int tehe6arv1 = random.nextInt( max_number + 1 - min_number) + min_number;
        int tehe6arv2 = random.nextInt( max_number + 1 - min_number) + min_number;
        int vastus6_pos = arvutus_pos(tehe6arv1, tehe6arv2);
        int vastus6_neg = arvutus_neg(tehe6arv1, tehe6arv1);
        int vastus6 = 0;
        int vastus66 = 0;
        int vastane6 = 0;
        int vastane66 = 0;
        int vastane666 = 0;
        int randomvastane6 = random.nextInt( max_raskus + 1 - min_raskus) + min_raskus;
        System.out.println("Kuues tehe: " + tehe6arv1 + märk + tehe6arv2);
        if (märk.equals("+")) {
            vastus6 = vastus6_pos;
            if (scanner.nextInt() == vastus6) {
                System.out.println("Õige vastus");
                mängija_scoor++;
            }else{
                System.out.println("Vale vastus, õige vastus on: " + vastus6);
                mängija_scoor--;
            }
        }
        if (märk.equals("-")){
            vastus66 = vastus6_neg;
            if (scanner.nextInt() == vastus66){
                System.out.println("Õige vastus");
                mängija_scoor++;
            }else{
                System.out.println("Vale vastus, õige vastus on: " + vastus66);
                mängija_scoor--;
            }
        }
        if (vastase_arvutaja1 == 4){
            vastane6 = 4;
            if (randomvastane6 < vastane6){
                vastase_scoor++;
            }else{
                vastase_scoor--;
            }
        }
        if (vastase_arvutaja2 == 6){
            vastane66 = 6;
            if (randomvastane6 < vastane66){
                vastase_scoor++;
            }else{
                vastase_scoor--;
            }
        }
        if (vastase_arvutaja3 == 8){
            vastane666 = 8;
            if (randomvastane6 < vastane666){
                vastase_scoor++;
            }else{
                vastase_scoor--;
            }
        }
        System.out.println("Järgmine tehe, sinu scoor: " + mängija_scoor + " ja vastase scoor: " + vastase_scoor);
        int tehe7arv1 = random.nextInt( max_number + 1 - min_number) + min_number;
        int tehe7arv2 = random.nextInt( max_number + 1 - min_number) + min_number;
        int vastus7_pos = arvutus_pos(tehe7arv1, tehe7arv2);
        int vastus7_neg = arvutus_neg(tehe7arv1, tehe7arv1);
        int vastus7 = 0;
        int vastus77 = 0;
        int vastane7 = 0;
        int vastane77 = 0;
        int vastane777 = 0;
        int randomvastane7 = random.nextInt( max_raskus + 1 - min_raskus) + min_raskus;
        System.out.println("Seitsmes tehe: " + tehe7arv1 + märk + tehe7arv2);
        if (märk.equals("+")) {
            vastus7 = vastus7_pos;
            if (scanner.nextInt() == vastus7) {
                System.out.println("Õige vastus");
                mängija_scoor++;
            }else{
                System.out.println("Vale vastus, õige vastus on: " + vastus7);
                mängija_scoor--;
            }
        }
        if (märk.equals("-")){
            vastus77 = vastus7_neg;
            if (scanner.nextInt() == vastus77){
                System.out.println("Õige vastus");
                mängija_scoor++;
            }else{
                System.out.println("Vale vastus, õige vastus on: " + vastus77);
                mängija_scoor--;
            }
        }
        if (vastase_arvutaja1 == 4){
            vastane7 = 4;
            if (randomvastane7 < vastane7){
                vastase_scoor++;
            }else{
                vastase_scoor--;
            }
        }
        if (vastase_arvutaja2 == 6){
            vastane77 = 6;
            if (randomvastane7 < vastane77){
                vastase_scoor++;
            }else{
                vastase_scoor--;
            }
        }
        if (vastase_arvutaja3 == 8){
            vastane777 = 8;
            if (randomvastane7 < vastane777){
                vastase_scoor++;
            }else{
                vastase_scoor--;
            }
        }
        System.out.println("Järgmine tehe, sinu scoor: " + mängija_scoor + " ja vastase scoor: " + vastase_scoor);
        int tehe8arv1 = random.nextInt( max_number + 1 - min_number) + min_number;
        int tehe8arv2 = random.nextInt( max_number + 1 - min_number) + min_number;
        int vastus8_pos = arvutus_pos(tehe8arv1, tehe8arv2);
        int vastus8_neg = arvutus_neg(tehe8arv1, tehe8arv1);
        int vastus8 = 0;
        int vastus88 = 0;
        int vastane8 = 0;
        int vastane88 = 0;
        int vastane888 = 0;
        int randomvastane8 = random.nextInt( max_raskus + 1 - min_raskus) + min_raskus;
        System.out.println("Kaheksas tehe: " + tehe8arv1 + märk + tehe8arv2);
        if (märk.equals("+")) {
            vastus8 = vastus8_pos;
            if (scanner.nextInt() == vastus8) {
                System.out.println("Õige vastus");
                mängija_scoor++;
            }else{
                System.out.println("Vale vastus, õige vastus on: " + vastus8);
                mängija_scoor--;
            }
        }
        if (märk.equals("-")){
            vastus88 = vastus8_neg;
            if (scanner.nextInt() == vastus88){
                System.out.println("Õige vastus");
                mängija_scoor++;
            }else{
                System.out.println("Vale vastus, õige vastus on: " + vastus88);
                mängija_scoor--;
            }
        }
        if (vastase_arvutaja1 == 4){
            vastane8 = 4;
            if (randomvastane8 < vastane8){
                vastase_scoor++;
            }else{
                vastase_scoor--;
            }
        }
        if (vastase_arvutaja2 == 6){
            vastane88 = 6;
            if (randomvastane8 < vastane88){
                vastase_scoor++;
            }else{
                vastase_scoor--;
            }
        }
        if (vastase_arvutaja3 == 8){
            vastane888 = 8;
            if (randomvastane8 < vastane888){
                vastase_scoor++;
            }else{
                vastase_scoor--;
            }
        }
        System.out.println("Järgmine tehe, sinu scoor: " + mängija_scoor + " ja vastase scoor: " + vastase_scoor);
        int tehe9arv1 = random.nextInt( max_number + 1 - min_number) + min_number;
        int tehe9arv2 = random.nextInt( max_number + 1 - min_number) + min_number;
        int vastus9_pos = arvutus_pos(tehe9arv1, tehe9arv2);
        int vastus9_neg = arvutus_neg(tehe9arv1, tehe9arv1);
        int vastus9 = 0;
        int vastus99 = 0;
        int vastane9 = 0;
        int vastane99 = 0;
        int vastane999 = 0;
        int randomvastane9 = random.nextInt( max_raskus + 1 - min_raskus) + min_raskus;
        System.out.println("Üheksas tehe: " + tehe9arv1 + märk + tehe9arv2);
        if (märk.equals("+")) {
            vastus9 = vastus9_pos;
            if (scanner.nextInt() == vastus9) {
                System.out.println("Õige vastus");
                mängija_scoor++;
            }else{
                System.out.println("Vale vastus, õige vastus on: " + vastus9);
                mängija_scoor--;
            }
        }
        if (märk.equals("-")){
            vastus99 = vastus9_neg;
            if (scanner.nextInt() == vastus99){
                System.out.println("Õige vastus");
                mängija_scoor++;
            }else{
                System.out.println("Vale vastus, õige vastus on: " + vastus99);
                mängija_scoor--;
            }
        }
        if (vastase_arvutaja1 == 4){
            vastane9 = 4;
            if (randomvastane9 < vastane9){
                vastase_scoor++;
            }else{
                vastase_scoor--;
            }
        }
        if (vastase_arvutaja2 == 6){
            vastane99 = 6;
            if (randomvastane9 < vastane99){
                vastase_scoor++;
            }else{
                vastase_scoor--;
            }
        }
        if (vastase_arvutaja3 == 8){
            vastane999 = 8;
            if (randomvastane9 < vastane999){
                vastase_scoor++;
            }else{
                vastase_scoor--;
            }
        }
        System.out.println("Järgmine tehe, sinu scoor: " + mängija_scoor + " ja vastase scoor: " + vastase_scoor);
        int tehe10arv1 = random.nextInt( max_number + 1 - min_number) + min_number;
        int tehe10arv2 = random.nextInt( max_number + 1 - min_number) + min_number;
        int vastus10_pos = arvutus_pos(tehe10arv1, tehe10arv2);
        int vastus10_neg = arvutus_neg(tehe10arv1, tehe10arv1);
        int vastus10 = 0;
        int vastus1010 = 0;
        int vastane10 = 0;
        int vastane1010 = 0;
        int vastane101010 = 0;
        int randomvastane10 = random.nextInt( max_raskus + 1 - min_raskus) + min_raskus;
        System.out.println("Kümnes tehe: " + tehe4arv1 + märk + tehe4arv2);
        if (märk.equals("+")) {
            vastus10 = vastus10_pos;
            if (scanner.nextInt() == vastus10) {
                System.out.println("Õige vastus");
                mängija_scoor++;
            }else{
                System.out.println("Vale vastus, õige vastus on: " + vastus10);
                mängija_scoor--;
            }
        }
        if (märk.equals("-")){
            vastus1010 = vastus10_neg;
            if (scanner.nextInt() == vastus1010){
                System.out.println("Õige vastus");
                mängija_scoor++;
            }else{
                System.out.println("Vale vastus, õige vastus on: " + vastus1010);
                mängija_scoor--;
            }
        }
        if (vastase_arvutaja1 == 4){
            vastane10 = 4;
            if (randomvastane10 < vastane10){
                vastase_scoor++;
            }else{
                vastase_scoor--;
            }
        }
        if (vastase_arvutaja2 == 6){
            vastane1010 = 6;
            if (randomvastane10 < vastane1010){
                vastase_scoor++;
            }else{
                vastase_scoor--;
            }
        }
        if (vastase_arvutaja3 == 8){
            vastane101010 = 8;
            if (randomvastane10 < vastane101010){
                vastase_scoor++;
            }else{
                vastase_scoor--;
            }
        }
        System.out.println("Tehted said otsa, sinu scoor: " + mängija_scoor + " ja vastase scoor: " + vastase_scoor);
        if (mängija_scoor < vastase_scoor){
            System.out.println("Kahjuks oli vastasne parem, proovige järgmine kord paremini!");
        }
        if (mängija_scoor > vastase_scoor){
            System.out.println("Väga hästi! Olite vastsest parem, jätkake samas vaimus!");
        }

        scanner.close();
    }
    public static int arvutus_pos(int num1, int num2){
        return num1 + num2;
    }
    public static int arvutus_neg(int num1, int num2){
        return num1 - num2;
    }

}


