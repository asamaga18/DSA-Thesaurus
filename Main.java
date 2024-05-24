import java.util.*;

class Main {
  public static void main(String[] args) {
    Thesaurus th1 = new Thesaurus(); // adding initial keys and words to the thesaurus and prints
    th1.addSynonym("appeal", "bid");
    th1.addSynonym("appeal", "question");
    th1.addSynonym("appeal", "proposal");
    th1.addSynonym("demand", "plea");
    th1.addSynonym("demand", "bid");
    th1.addSynonym("demand", "application");
    th1.addSynonym("command", "proposal");
    
    th1.Print();

    Set affectedWords = th1.removeSynonym("proposal"); // remove synonym that also prints the affected words
    th1.Print();
    System.out.println("Affected Words: " + affectedWords);

    th1.addSynonym("pompous", "bombastic"); // more keys and words
    th1.addSynonym("pompous", "grandiose");
    th1.addSynonym("pompous", "selfish");
    th1.addSynonym("splashy", "sensational");
    th1.addSynonym("splashy", "grandiose");
    th1.addSynonym("splashy", "flashy");
    th1.addSynonym("splashy", "ostentatious");
    th1.addSynonym("blank", "");

    th1.Print();
    Set affectedWords2 = th1.removeSynonym("moonshine"); // removing word in no set
    System.out.println("Affected Words: " + affectedWords2);
    th1.Print();

    System.out.println(th1.synWords("sensational")); // synWords cases including empty
    System.out.println(th1.synWords("bid"));
    System.out.println(th1.synWords("keith"));
    
  }
}