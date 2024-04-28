package org.example;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        Riviste uno = new Riviste("001-22", "RivistaEsempio", 1997, 72, "MENSILE");
        Libri due = new Libri("586-32", "LibroEsempio", 2024, 300, "Willard H. Wright",
                "Mistery");
        Riviste tre = new Riviste("111-11", "Esempio3", 2020, 30, "SEMESTRALE");

        System.out.println(due);

        }
    }
