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
public class AtualizarEmailValidadoMessage implements Serializable {

    private static final long serialVersionUID = -4861804168893857687L;

    private String cpf;

    private Long numeroProposta;

    private Tipo proposta;
}
