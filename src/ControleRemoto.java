public class ControleRemoto {

    private boolean ligado;

    public boolean getLigado() {
        return ligado;
    }


    public  void Ligar()
    {
        this.ligado = true;
    }

    public void Desligar()
    {
        this.ligado = false;
    }

    public ControleRemoto() {
        this.ligado = false;
    }
}
