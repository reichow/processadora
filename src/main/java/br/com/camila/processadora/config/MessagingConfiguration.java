package br.com.camila.processadora.config;

import br.com.camila.processadora.annotation.RabbitEnabled;
import br.com.camila.processadora.messaging.Messaging;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RabbitEnabled
public class MessagingConfiguration {

    /**
     * Exchanges
     **/

    @Bean
    TopicExchange processadoraExchange() {
        return new TopicExchange(Messaging.EXCHANGE);
    }

    @Bean
    TopicExchange eventsExchange() {
        return new TopicExchange(Messaging.EXCHANGE_EVENTS);
    }

    /**
     * Queues
     **/

    @Bean
    Queue gfeQueue() {
        return new Queue(Messaging.QUEUE_GFE);
    }

    @Bean
    Queue atualizarInfosPessoaisQueue() {
        return new Queue(Messaging.QUEUE_ATUALIZAR_INFOS_PESSOAIS);
    }

    @Bean
    Queue atualizarEmailValidadoQueue() {
        return new Queue(Messaging.QUEUE_ATUALIZAR_EMAIL_VALIDADO);
    }


    /**
     * Bindings
     **/

    @Bean
    Binding gfeQueueToEventsExchangeBinder() {
        return BindingBuilder.bind(gfeQueue())
            .to(eventsExchange())
            .with(Messaging.GFE.getRoutingKey());
    }

    @Bean
    Binding atualizarInfosPessoaisQueueToProcessaoraExchangeBinder() {
        return BindingBuilder.bind(atualizarInfosPessoaisQueue())
            .to(processadoraExchange())
            .with(Messaging.ATUALIZAR_INFOS_PESSOAIS_PROCESSADORA.getRoutingKey());
    }

    @Bean
    Binding atualizarEmailValidadoQueueToProcessadoraExchangeBinder() {
        return BindingBuilder.bind(atualizarEmailValidadoQueue())
            .to(processadoraExchange())
            .with(Messaging.ATUALIZAR_EMAIL_VALIDADO_PROCESSADORA.getRoutingKey());
    }
}
