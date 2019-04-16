package br.com.camila.processadora.listener;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import br.com.camila.processadora.annotation.EventTemplate;
import br.com.camila.processadora.message.AtualizarInfosPessoaisMessage;
import br.com.camila.processadora.messaging.Messaging;
import lombok.extern.slf4j.Slf4j;

@Component
@RabbitListener(queues = Messaging.QUEUE_ATUALIZAR_INFOS_PESSOAIS)
@Slf4j
public class AtualizarInfosPessoaisListener {

    @Autowired
    @EventTemplate
    private RabbitTemplate rabbitTemplate;

    @RabbitHandler
    void receive(@Payload final AtualizarInfosPessoaisMessage message) {

        log.info("Mensagem: {}", message);

        log.info("Infos pessoais atualizadas. Proposta: {}", message.getNumeroProposta());
    }
}
