
package atividade1_2;

public class Quarto 
{
    char id;
    String disp;
    Hospede hospede;
    
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
