package br.com.camila.processadora.messaging;

/**
 * Interface para definição de nomes de exchanges, queues e routing keys.
 */
public interface Messaging {

    //msg enviada para api proposta/sm
    MessageInbox ATUALIZAR_INFOS_PESSOAIS_PROCESSADORA = new MessageInbox("processadora.atualizar-infos-pessoais-processadora.message");
    MessageInbox ATUALIZAR_EMAIL_VALIDADO_PROCESSADORA = new MessageInbox("processadora.atualizar-email-validado-processadora.message");

    //msg enviada para api proposta/sm
    MessageOutbox INFOS_PESSOAIS_ATUALIZADAS = new MessageOutbox("proposta.pre-proposta-analisada.message");
    MessageOutbox EMAIL_VALIDADO_ATUALIZADO = new MessageOutbox("proposta.pos-proposta-analisada.message");

    //exchange
    String EXCHANGE = "processadora.exchange";
    String EXCHANGE_EVENTS = "processadora.events.exchange";

    //filas
    String QUEUE_ATUALIZAR_INFOS_PESSOAIS = "processadora.atualizar-infos-pessoais.queue";
    String QUEUE_ATUALIZAR_EMAIL_VALIDADO = "processadora.atualizar-email-validado.queue";
}
