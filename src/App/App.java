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

        System.out.println("\n--- Informações do Passageiro ---");
        System.out.println("Nome: " + passageiro1.getNome());
        System.out.println("CPF: " + passageiro1.getCpf());
        System.out.println("Email: " + passageiro1.getEmail());
        System.out.println("Data de Nascimento: " + passageiro1.getDataNascimento());
        System.out.println("Tipo de Passaporte: " + passageiro1.getTypePassaporte());
        System.out.println("Programa de Fidelidade: " + passageiro1.getProgramaFidelidade());

        System.out.println("\n--- Informações da Reserva ---");
        System.out.println("ID da Reserva: " + reserva1.getId());
        System.out.println("Status da Reserva: " + reserva1.getStatus());
        System.out.println("Valor da Reserva: R$" + reserva1.getValor());

        System.out.println("\n--- Informações do Assento ---");
        System.out.println("Número do Assento: " + assento1.getNumero());
        System.out.println("Classe do Assento: " + assento1.getClasse());
        System.out.println("Preferencial: " + assento1.getPreferencial());
        System.out.println("Disponibilidade: " + (assento1.isDisponibilidade() ? "Disponível" : "Indisponível"));

        System.out.println("\n--- Informações do Pagamento ---");
        System.out.println("ID do Pagamento: " + pagamento1.getId());
        System.out.println("Método de Pagamento: " + pagamento1.getMetodoPagamento());
        System.out.println("Status do Pagamento: " + pagamento1.getStatusPagamento());
        System.out.println("Valor do Pagamento: " + pagamento1.getValor());

        System.out.println("\n--- Informações do Voo ---");
        System.out.println("Companhia Aérea: " + voo1.getCompaniaAerea());
        System.out.println("Origem: " + voo1.getOrigem());
        System.out.println("Destino: " + voo1.getDestino());
        System.out.println("Data de Partida: " + voo1.getDataPartida());
        System.out.println("Data de Chegada: " + voo1.getDataChegada());
        System.out.println("Número do Voo: " + voo1.getNumeroVoo());
        System.out.println("Status do Voo: " + voo1.getStatus());
        System.out.println("Tipo de Aeronave: " + voo1.getTipoAeronave());
    }
}
