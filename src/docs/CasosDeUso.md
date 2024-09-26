# Requisitos Funcionais e Regras de Negócio - Aplicação de Reserva de Voo

## Requisitos Funcionais

1. **Cadastro de Passageiros**
   - A aplicação deve permitir o cadastro de passageiros, armazenando informações como nome completo, CPF, data de nascimento, e-mail, e passaporte (caso necessário).

2. **Cadastro de Voos**
   - A aplicação deve permitir o cadastro de voos, incluindo informações como número do voo, origem, destino, data e horário de partida e chegada, companhia aérea e tipo de aeronave.

3. **Busca de Voos**
   - A aplicação deve permitir que os usuários busquem voos com base em critérios como origem, destino, data e horário.

4. **Reserva de Passagens**
   - A aplicação deve permitir a reserva de passagens aéreas, associando o passageiro ao voo selecionado e permitindo a escolha de assentos.

5. **Gerenciamento de Assentos**
   - A aplicação deve permitir a visualização e a seleção de assentos disponíveis no momento da reserva.

6. **Processamento de Pagamento**
   - A aplicação deve permitir o pagamento das passagens, oferecendo opções como cartão de crédito, débito e pix.

7. **Emissão de Bilhetes**
   - A aplicação deve permitir a emissão dos bilhetes de passagem após a confirmação do pagamento.

8. **Alteração e Cancelamento de Reservas**
   - A aplicação deve permitir que o usuário altere ou cancele uma reserva, de acordo com as regras de cada companhia aérea.

9. **Check-in Online**
   - A aplicação deve permitir que os passageiros façam check-in online a partir de um determinado período antes do voo e selecionem seus assentos, caso permitido.

10. **Relatórios de Voos e Reservas**
    - A aplicação deve gerar relatórios sobre os voos realizados, reservas efetuadas, e os passageiros embarcados em um determinado período.

## Regras de Negócio

1. **Política de Cancelamento**
   - O cancelamento de uma reserva só pode ser feito até 24 horas antes do voo. Após esse período, a companhia aérea pode aplicar uma taxa de cancelamento ou não permitir o cancelamento.

2. **Taxa de Alteração**
   - Alterações de voos (como mudança de data ou horário) podem gerar taxas adicionais, dependendo do tipo de bilhete adquirido pelo passageiro.

3. **Limite de Bagagem**
   - Cada passageiro tem direito a uma bagagem de mão de até 10kg e uma bagagem despachada de até 23kg. Excesso de bagagem resulta em taxas adicionais.

4. **Seleção de Assento Preferencial**
   - Assentos preferenciais (como os localizados nas saídas de emergência ou na frente da aeronave) podem ter um custo adicional, dependendo da companhia aérea.

5. **Check-in Antecipado**
   - O check-in online pode ser feito entre 48 e 1 hora antes da partida do voo. Após esse período, o passageiro deve realizar o check-in diretamente no balcão da companhia aérea.

6. **Pontuação de Fidelidade**
   - Passageiros cadastrados em programas de fidelidade podem acumular pontos por cada voo realizado. Os pontos podem ser trocados por descontos ou passagens em voos futuros.

7. **Reservas de Grupos**
   - Para reservas de grupos (mais de 10 passageiros), a aplicação deve permitir descontos especiais e condições diferenciadas.

8. **Reembolso de Passagem**
   - O reembolso de passagens canceladas segue as políticas da companhia aérea, podendo ser integral ou parcial, dependendo do tipo de bilhete.

9. **Voo em Código Compartilhado**
   - Se o voo for operado em código compartilhado (realizado por outra companhia aérea), a aplicação deve notificar o passageiro no momento da reserva.

## Estrutura em POO

Em termos de POO, as seguintes classes podem ser utilizadas:

### Passageiro
- **Atributos**: nome, CPF, dataNascimento, email, passaporte, programaFidelidade.
- **Métodos**: reservarVoo(), cancelarReserva(), realizarCheckin(), acumularPontos().

### Voo
- **Atributos**: numeroVoo, origem, destino, dataPartida, dataChegada, companhiaAerea, tipoAeronave, listaAssentos.
- **Métodos**: verificarDisponibilidade(), adicionarPassageiro(), removerPassageiro(), alterarHorario().

### Reserva
- **Atributos**: id, passageiro, voo, assento, status, valor.
- **Métodos**: confirmarPagamento(), emitirBilhete(), alterarReserva(), cancelarReserva().

### Assento
- **Atributos**: numero, classe, disponivel, preferencial.
- **Métodos**: reservar(), liberar().

### Pagamento
- **Atributos**: id, valor, metodoPagamento, statusPagamento.
- **Métodos**: processarPagamento(), verificarStatus(), emitirRecibo().

