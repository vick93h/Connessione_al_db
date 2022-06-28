import Model.Studente;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DaoStudente implements IDao{
    @Override
    public List<Studente> getStudente() {
        List<Studente> studenti=new ArrayList<Studente>();
      String sql="SELECT * FROM testdb.Studente";
      try(Connection conn= DriverManager.getConnection(DbAdress,User,Password))
      {
          PreparedStatement pr=conn.prepareStatement(sql);
          ResultSet rs=pr.executeQuery();
          while(rs.next())
          {
              studenti.add(new Studente(rs.getString("Matricola"),rs.getString("Nome"),rs.getString("Cognome"),rs.getInt("Età"),rs.getDate("DataPrimaImmatricolazione")));

          }
          rs.close();
      }
      catch(Exception ex)
      {
          ex.printStackTrace();
      }
        return studenti;

    }
}
