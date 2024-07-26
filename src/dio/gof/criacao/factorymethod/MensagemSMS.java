package dio.gof.criacao.factorymethod;

import javax.swing.*;

public class MensagemSMS extends Mensagem{
    @Override
    public void getMensagem(String mensagem) {
        //JOptionPane.showMessageDialog(null,"SMS: "+mensagem);
        System.out.println("SMS: "+mensagem);
    }
}
