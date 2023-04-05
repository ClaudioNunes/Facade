public class ControleTV extends ControleRemoto {
    private int canal;
    private int volume;


    public  void MudarCanal(int canal)
    {

    }

    public  void AumentarVolume()
    {
    }

    public  void DiminuirVolume()
    {

    }


    @Override
    public String toString() {
        if ( this.getLigado())
        {
            return  "A TV esta ligada";
        }
        else
        {
            return  "A TV esta desligada";
        }
    }



}
