package Inheritance;

public class Boxweight extends Box{
    double weight;


     Boxweight(Boxweight other){
    super(other);
    this.weight=other.weight;
}
    static void greeting(){
        System.out.println("I am in Box weight, greeting!");
    }
    public Boxweight(double l, double w, double h, double weight) {
        super(l, w, h);//what is this? it actually calls the parent class constructor
                       //to initialise values present in the parent class.
        this.weight = weight;
    }

    public Boxweight(){
       this.weight=1;
    }
    Boxweight(double side,double weight){
         super(side);
         this.weight=weight;
    }
}
