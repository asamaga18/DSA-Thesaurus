import java.util.*;

public class Thesaurus
{
  // stores (word, synonym set) pairs as (String, Set of Strings)
  private Map<String, HashSet<String>> wordMap;

  // Constructor for Thesaurus
  public Thesaurus() {
    // Declares Map object for Thesaurus
    wordMap = new HashMap<String, HashSet<String>>();
  }

  // adds sSyn to the set of synonyms associated with sWord
  // if sWord is not a key, creates a new entry
  public void addSynonym(String sWord, String sSyn) {
    // Adds to map if the key already exists
    if(wordMap.containsKey(sWord)){
      wordMap.get(sWord).add(sSyn);
    }
    // If key does not exist, create new set and adds to it
    else{
      HashSet<String> hSet = new HashSet<String>();
      hSet.add(sSyn);
      wordMap.put(sWord, hSet);
    }
  }

  // removes word sSyn from each synonym set in this Thesaurus
  // returns a set of words (keys) whose associated synonym sets
  // originally contained sSyn in their synonym list
  // returns empty set if sSyn was not in any synonym set
  
  public Set removeSynonym (String sSyn) {
    // Creates set of keys that contain the word 
    Set<String> affectedWords = new HashSet<String>();
    // Loop through keys
    for (String key : wordMap.keySet())
    {
      // Remove word and add key to set
      if(wordMap.get(key).remove(sSyn)){
        affectedWords.add(key);
      }
    }
    return affectedWords;
  }

  // // returns a set of words that map to the given synonym
  public Set synWords (String sSyn) {
    // Creates set of keys that contain the word
    Set<String> mapKeys = new HashSet<String>();
    // Loop through keys
    for (String key : wordMap.keySet())
    {
      // Adds key to set if contains word
      if(wordMap.get(key).contains(sSyn)){
        mapKeys.add(key);
      }
    }
    return mapKeys;
  }

  // prints entire Thesaurus map in an easy to read format
  public void Print() {
      // Loop through keys and print each set
      for (String key : wordMap.keySet())
        System.out.println(key + wordMap.get(key));
      System.out.println();
  }
}
