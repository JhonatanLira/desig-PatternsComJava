package dio.gof.criacao.factorymethod;

import javax.swing.*;

public class MensagemEmail  extends Mensagem{
    @Override
    public void getMensagem(String mensagem) {
        //JOptionPane.showMessageDialog(null,"E-Mail: "+mensagem);
        System.out.println("E-Mail: "+mensagem);
    }
}
