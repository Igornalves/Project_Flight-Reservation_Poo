package App;

import java.io.ObjectInputFilter.Status;

import Class.Assento;
import Class.Pagamento;
import Class.Passageiro;
import Class.Reserva;
import Class.Voo;
import Enum.StatusVoo;
import Enum.TipoProgramaFidelidade;
import Enum.TypeClass;
import Enum.TypePassaporte;

public class App {
    public static void main(String[] args) throws Exception {

        Assento assento1 = new Assento();
        Pagamento pagamento1 = new Pagamento();
        Reserva reserva1 = new Reserva();
        Passageiro passageiro1 = new Passageiro();
        Voo voo1 = new Voo();

        passageiro1.setNome("Julia Viera");
        passageiro1.setCpf(45323412343L);
        passageiro1.setEmail("julia08viera901");
        passageiro1.setDataNascimento("12/03/2005");
        passageiro1.setTypePassaporte(TypePassaporte.comum.toString());
        passageiro1.setProgramaFidelidade(TipoProgramaFidelidade.MILHAS.toString());
        passageiro1.adcionandoReserva(reserva1);

        assento1.setClasse(TypeClass.economy.toString());
        assento1.setDisponibilidade(null);
        assento1.setNumero(0);
        assento1.setPreferencial(null);

    }
}
