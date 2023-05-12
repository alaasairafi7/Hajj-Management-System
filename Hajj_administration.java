package ALRAHMA1.company;

public interface Hajj_administration {

    public abstract void add_hajj(Health_Information p) ;
    public abstract void display_single(Health_Information p ) ; //
    //public abstract void display_all() ;
    public abstract int search(int Id);
    public abstract void remove_hajj(Hajj_Information P) ;
    public abstract void update_info();
    public abstract boolean equals (Object o);
}
