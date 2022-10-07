package EntryTest;

public class SubClass extends Entry{
    String definition;
    int year;

    SubClass(String w){

    }

    SubClass(String w, String d, int y){
        super.word = w;
        this.definition = d;
        this.year = y;
        //Subclass(String w) 호출.
    }

    public void printView(){
        System.out.println("*****약어사전******");
        System.out.println("약어 : " + super.word);
        System.out.println("원어 : " + this.definition);
        System.out.println("시기" + this.year + "년");
    }
    /*
    *****약어사전******
약어 : OOP
원어 : Object Oriented Programming
시기 : 1991년
    * */
}
