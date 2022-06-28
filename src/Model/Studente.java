package Model;

import java.util.Date;

public class Studente {
    public String getMatricola() {
        return Matricola;
    }

    public String getNome() {
        return Nome;
    }

    public String getCognome() {
        return Cognome;
    }

    public Date getDataPrimaImmatricolazione() {
        return DataPrimaImmatricolazione;
    }

    public void setMatricola(String matricola) {
        Matricola = matricola;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public void setCognome(String cognome) {
        Cognome = cognome;
    }

    public void setDataPrimaImmatricolazione(Date dataPrimaImmatricolazione) {
        DataPrimaImmatricolazione = dataPrimaImmatricolazione;
    }

    public Studente(String nome, String cognome, String string, int età, Date dataPrimaImmatricolazione) {
        Nome = nome;
        Cognome = cognome;
        DataPrimaImmatricolazione = dataPrimaImmatricolazione;
    }

    public Studente(String matricola, String nome, String cognome, Date dataPrimaImmatricolazione) {
        Matricola = matricola;
        Nome = nome;
        Cognome = cognome;
        DataPrimaImmatricolazione = dataPrimaImmatricolazione;
    }

    private String Matricola;
    private String Nome;
    private String Cognome;
    private Date DataPrimaImmatricolazione;

    @Override
    public String toString() {
        return "Studente{" +
                "Matricola='" + Matricola + '\'' +
                ", Nome='" + Nome + '\'' +
                ", Cognome='" + Cognome + '\'' +
                ", DataPrimaImmatricolazione=" + DataPrimaImmatricolazione +
                '}';
    }
}
