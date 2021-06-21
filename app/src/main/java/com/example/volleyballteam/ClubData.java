package com.example.volleyballteam;

import java.util.ArrayList;

public class ClubData {
    private static String [] clubName = {
            "belogorie",
            "cska",
            "dynamo",
            "lube",
            "modenavolley",
            "olympiacos",
            "palavollo",
            "panathinaikos",
            "treviso",
            "zenit"
    };

    private static String [] clubDescription = {
            "VC Belogorie Belgorod (Russian: ВК Белогорье) is a Russian professional volleyball club based in Belgorod, which is participating in the Russian Volleyball Super League. VC Belogorie won the Russian Championship and the Russian Cup eight times each. The club is also a three-times CEV Champions League champion. Belogorie is the second most successful Russian club behind Zenit Kazan.",
            "VC CSKA Moscow (Russian: ВК ЦСКА Москва) was a Russian volleyball club. They played in the Russian Super League, winning the competition three times. The club is the most titled volleyball team in the Soviet Union / Russia and in Europe with 13 CEV Champions Leagues. In 2009, VC CSKA Moscow was disbanded due to financial problems.",
            "VC Dynamo Moscow (ВК Динамо Москва) is a Russian professional men's volleyball team based in Moscow which is playing in the Super League. Dynamo Moscow won the title of Russian Championionship twice (2006, 2008). The club won a silver and two bronze medals at the CEV Champions League.",
            "Associazione Sportiva Volley Lube is a professional volleyball team based in Treia, Italy. Since 1995 the club has been playing in the Serie A of the Italian Volleyball League. It won the Italian Championship five times, the Italian Cup five times, and the Italian SuperCup three-times.",
            "Modena Volley is a professional volleyball team based in Modena, Italy. It has played in the highest level of the Italian Volleyball League without interruption since 1968. It is the most successful Italian club, having won the national league twelve times and the national cup as well. The club is one of the most prominent and prestigious in Europe too, having won thirteen European trophies including four CEV Champions League.",
            "Olympiacos Men's Volleyball (Greek: Ολυμπιακός, [olimbiaˈkos]), commonly referred to as Olympiacos, Olympiacos Piraeus or with its full name as Olympiacos CFP, is the men's volleyball department of the major Greek multi-sport club, Olympiacos CFP, based in Piraeus, Attica. The department was founded in 1926 and their home ground is the Melina Mercouri Indoor Hall in Agios Ioannis Rentis, Piraeus.",
            "Former Antonveneta Padova is a professional volleyball team of Pallavolo Padova (till 1999 Petrarca Volley, till 2009 Sempre Volley), based in Padua, Italy. It plays in Italian Volleyball League. Since 2009 it is named Pallavolo Padova and it plays Italian SuperLega in 2016–17, the highest level of Italian volleyball. It won a CEV Cup in 1994.",
            "Panathinaikos V.C. (Greek: ΤΑΑ Παναθηναϊκός Α.Ο.), also known simply as Panathinaikos, or with its full name Panathinaikos A.O. (Greek: Παναθηναϊκός Αθλητικός Όμιλος, transliterated Panathinaikos Athlitikos Omilos, Panathenaic Athletic Club) is the professional volleyball team of the major Athens based multi-sport club Panathinaikos A.O.. Founded in 1919, it is one of the oldest and most successful volleyball clubs in Greece.",
            "Volley Treviso is a professional volleyball team based in Treviso (between 1987 and 2011) and then in 2011-12 in Belluno, Italy, and again in Treviso from 2012 to today. The team playing on Serie B.",
            "VC Zenit-Kazan (Russian: Зенит-Казань), until 2008 known as Dinamo Tattransgaz Kazan (Russian: Динамо-Таттрансгаз), is a professional men's volleyball team based in Kazan, Russia. It plays in the Super League (10-time champion). The team won the 2007–08, 2011–12, 2014–15, 2015-16, 2016-17, and 2017-18 CEV Champions League titles, thus being the most-titled club in its new history."
    };

    private static int[] clubImage = {
            R.drawable.belogorie,
            R.drawable.cska,
            R.drawable.dynamo,
            R.drawable.lube,
            R.drawable.modenavolley,
            R.drawable.olympiacos,
            R.drawable.palavolo,
            R.drawable.panathinaikos,
            R.drawable.treviso,
            R.drawable.zenit
    };

    static ArrayList<Club> getListData(){
        ArrayList<Club> list = new ArrayList<>();
        for (int position = 0; position <clubName.length; position++){
            Club club = new Club();
            club.setName(clubName[position]);
            club.setDescription(clubDescription[position]);
            club.setPhoto(clubImage[position]);
            list.add(club);
        }
        return list;
    }
}