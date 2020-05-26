package kata.src.main.java.malnati;

import java.util.Map;

public class Welcome {
    
   private static final String EMPTY_STRING = "";
   public static String IP_ADDRESS_INVALID = "not a valid ipv4 or ipv6 ip address";
   public static String IP_ADDRESS_NOT_FOUND = "ip address not in the database";
   public static String IP_ADDRESS_REQUIRED = "no ip address was supplied";
   
   public static Map<String, String> db = Map.ofEntries(
    Map.entry("english", "Welcome"),
    Map.entry("czech", "Vitejte"),
    Map.entry("danish", "Velkomst"),
    Map.entry("dutch", "Welkom"),
    Map.entry("estonian", "Tere tulemast"),
    Map.entry("finnish", "Tervetuloa"),
    Map.entry("flemish", "Welgekomen"),
    Map.entry("french", "Bienvenue"),
    Map.entry("german", "Willkommen"),
    Map.entry("irish", "Failte"),
    Map.entry("italian", "Benvenuto"),
    Map.entry("latvian", "Gaidits"),
    Map.entry("lithuanian", "Laukiamas"),
    Map.entry("polish", "Witamy"),
    Map.entry("spanish", "Bienvenido"),
    Map.entry("swedish", "Valkommen"),
    Map.entry("welsh", "Croeso")
   );
   
   public static String greet(String language){
     if(language == null || language == EMPTY_STRING) {
       return IP_ADDRESS_REQUIRED;
     } 
     if(db.containsKey(language)) {
       return db.get(language);
     } else {
       return IP_ADDRESS_INVALID;
     }
   }
}