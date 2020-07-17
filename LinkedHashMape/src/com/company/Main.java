package com.company;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LinkedHashMap lhm = new LinkedHashMap();
        lhm.put("Zoran", new Double(3434.34));
        lhm.put("Milan", new Double(123.22));
        lhm.put("Anderj", new Double(1378.00));
        lhm.put("Dejan", new Double(99.22));
        lhm.put("Lazar", new Double(-19.08));

        // Uzimamo elemente mape
        Set set = lhm.entrySet();
        // Uzimamo iterator
        Iterator i = set.iterator();
        //Prikazujemo elemente
        while (i.hasNext()) {
            Map.Entry me = (Map.Entry) i.next();
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();
        // Dodajemo zari 1000 dinara
        double balance = ((Double) lhm.get("Zara")).doubleValue();
        lhm.put("Zara", new Double(balance + 1000));
        System.out.println("Zarino novo stanje je: "
                + lhm.get("Zara"));
    }
    }

