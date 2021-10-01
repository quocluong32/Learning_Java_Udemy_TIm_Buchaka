package com.example.awtExample;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        languages.put("Java", "a complied high level, objected-oriented, platform independent language.");
        languages.put("Python", "an interpreted, objected-oriented, high-level propgramming language");
        languages.put("Algol", "an algorithmic language.");
        languages.put("BASIC", "Beginners All Purposes Symbolic Instruction Code");
        languages.put("Lisp", "Therein lies madness.");

        System.out.println(languages.get("Java"));
        languages.put("Java", "this course is about Java.");
        System.out.println(languages.get("Java"));

        if(languages.containsKey("Java")) {
            System.out.println("Java is already in the map");
        } else {
            languages.put("Java", "ahhhah");
        }

        if(languages.remove("Algol", "an algorithmic language.")) {
            System.out.println("ALgol removed");
        } else {
            System.out.println("Algol not removed, key/value pair not found");
        }

        System.out.println(languages.replace("Lisp", "a functional programming language"));

        for (String key: languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }
    }
}
