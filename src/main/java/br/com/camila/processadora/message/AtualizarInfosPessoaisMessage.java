package br.com.camila.processadora.message;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import br.com.camila.processadora.domain.Tipo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Builder
@EqualsAndHashCode
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
@NoArgsConstructor
public class AtualizarInfosPessoaisMessage implements Serializable {

    private static final long serialVersionUID = 6646226254491510644L;

    private String cpf;

    private Long numeroProposta;

    private Tipo proposta;
}
