package dio.gof.criacao.factorymethod;

public class MensagemFactory {

    public static Mensagem getmensagem(int i) {

        if(i == 1) {
            return new MensagemSMS();
        } else if(i ==2 ){
            return new MensagemEmail();
        } else
            return new MensagemSMS();
    }
}
