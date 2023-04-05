public class ControleUniversal {
    private ControleTV controleTV = new ControleTV();
    private ControleAr controleAr = new ControleAr();
    private ControleAudio controleAudio = new ControleAudio();
    private ControleCortina controleCortina =  new ControleCortina();
    private ControleIluminacao controleIluminacao = new ControleIluminacao();

    public void AssistirTv()
    {
        controleAr.Ligar();
        controleAr.DiminuirTemperatura();
        controleTV.Ligar();
        controleTV.MudarCanal(569);
        controleIluminacao.Ligar();
        controleIluminacao.DiminuirLuiz();
        controleCortina.Fechar();
        controleAudio.Ligar();
        controleAudio.AumentarVolume(5);
    }

    public void AcabeiAssistir()
    {
        controleAr.Desligar();
        controleTV.Desligar();
        controleIluminacao.Desligar();
        controleCortina.Abrir();
        controleAudio.Desligar();

    }
}
