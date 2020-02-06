package PrototypePattern;

import java.util.HashMap;
import java.util.Map;

/**
 * Maintains the pool of objects of the types that can be cloned
 */
public class CardPool {
    public static class Repository {
        static Map<String, CardType> repo = new HashMap<>();
        public static void poolInstance(String key, CardType cardType) {
            System.out.println("Registered " + key);
            repo.put(key, cardType);
        }
        public static CardType getInstance(String key) {
            CardType cardType = repo.get(key);
            CardType clonedCard = cardType.clone();
            return clonedCard;
        }
    }
}
