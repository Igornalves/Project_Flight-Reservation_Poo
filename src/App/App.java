package App;

import java.util.UUID;

import Class.Assento;
import Class.Pagamento;
import Class.Passageiro;
import Class.Reserva;
import Class.Voo;
import Enum.CompanhiaAerea;
import Enum.MetodoPagamento;
import Enum.StatusPagamento;
import Enum.StatusVoo;
import Enum.TipoAeronave;
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

        reserva1.setId(UUID.randomUUID().toString());
        reserva1.setAssento(assento1);
        reserva1.setPagamento(pagamento1);
        reserva1.setStatus(StatusVoo.Check_in.toString());
        reserva1.setValor(2200);
        reserva1.setVoo(voo1);

        assento1.setClasse(TypeClass.economy.toString());
        assento1.setDisponibilidade(false);
        assento1.setNumero(12);
        assento1.setPreferencial("normal");

        pagamento1.setId(UUID.randomUUID().toString());
        pagamento1.setMetodoPagamento(MetodoPagamento.PIX.toString());
        pagamento1.setStatusPagamento(StatusPagamento.Pagamento_Pendente.toString());
        pagamento1.setValor("R$ 12,00");

        voo1.setCompaniaAerea(CompanhiaAerea.AZUL.toString());
        voo1.setOrigem("Brasilia");
        voo1.setDestino("Teresina");
        voo1.setDataPartida("12/03/2025");
        voo1.setDataChegada("13/03/2025");
        voo1.setNumeroVoo(23);
        voo1.setStatus(StatusVoo.Check_out.toString());
        voo1.setTipoAeronave(TipoAeronave.AIRBUS_A350.toString());

        
    }
}
