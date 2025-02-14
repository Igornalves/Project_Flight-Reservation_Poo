package App;

import Class.Assento;
import Class.Pagamento;
import Class.Passageiro;
import Class.Reserva;
import Class.Voo;

public class App {
    public static void main(String[] args) throws Exception {

        Passageiro passageiro = new Passageiro(null, 0, null, null, null, null);

        Voo voo = new Voo(0, null, null, null, null, null, null, 0, null);

        Reserva reserva = new Reserva(null, passageiro, voo, null, null, 0);

        Assento assento = new Assento(0, null, null, null);

        Pagamento pagamento = new Pagamento(null, null, null, null);

        
    }
}
