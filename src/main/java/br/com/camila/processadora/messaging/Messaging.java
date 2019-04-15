package br.com.camila.processadora.messaging;

/**
 * Interface para definição de nomes de exchanges, queues e routing keys.
 */
public interface Messaging {

    EventOutbox INFOS_PESSOAIS_ATUALIZADAS_PROCESSADORA = new EventOutbox("processadora.infos-pessoais-atualizadas-processadora.success.event");
    EventOutbox EMAIL_VALIDADO_ATUALIZADO_PROCESSADORA = new EventOutbox("processadora.email-validado-atualizado-processadora.success.event");

    EventOutbox INFOS_PESSOAIS_ATUALIZADAS_PROCESSADORA_EROOR = new EventOutbox("processadora.infos-pessoais-atualizadas-processadora.error.event");
    EventOutbox EMAIL_VALIDADO_ATUALIZADO_PROCESSADORA_ERROR = new EventOutbox("processadora.email-validado-atualizado-processadora.error.event");

    MessageInbox ATUALIZAR_INFOS_PESSOAIS_PROCESSADORA = new MessageInbox("processadora.atualizar-infos-pessoais-processadora.message");
    MessageInbox ATUALIZAR_EMAIL_VALIDADO_PROCESSADORA = new MessageInbox("processadora.atualizar-email-validado-processadora.message");

    MessageOutbox GFE = new MessageOutbox("gfe.armazenar-mensagem-gfe.message");

    String EXCHANGE = "processadora.exchange";
    String EXCHANGE_EVENTS = "processadora.events.exchange";

    String QUEUE_GFE = "gfe.armazenar-mensagem-gfe.queue";
    String QUEUE_ATUALIZAR_INFOS_PESSOAIS = "processadora.atualizar-infos-pessoais.queue";
    String QUEUE_ATUALIZAR_EMAIL_VALIDADO = "processadora.atualizar-email-validado.queue";
}
