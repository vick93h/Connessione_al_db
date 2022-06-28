import Model.Studente;

import java.util.List;

public interface IDao
{
    public final static String DbAdress="jdbc:mysql://localhost:3306/testdb";
    public final static String User="root";
    public final static String Password="Pianoforte1!";
    public List<Studente> getStudente();

}
