//Atualizado 31/01/2023 13:08
package atividade1_2;

public class Quarto 
{
    private int id;
    private String disp;
    private Hospede hospede;
        
    public Quarto(int id)
    {
        this.id = id;
    }
    
    public void setHospede(Hospede hospede)
    {
        this.hospede = hospede;
    }
    
    public int getId()
    {
        return id;
    }
    
    public Hospede getHospede()
    {
        return hospede;
    }
    
    public String checaDisp()
    {
        if(hospede != null)
        {
            disp = "Ocupado.";
        }
        else
        {
            disp = "Livre.";
        }
        
        return disp;
    }
    
    public String checaDesconto(int idadeHospede)
    {
        if(idadeHospede >= 60)
        {
            return " Com desconto de 40% ";
        }
        else
        {
            return "";
        }
    }
}
