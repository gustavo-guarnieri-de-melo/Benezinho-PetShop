package br.com.fiap.petshop.domain.entity.servico;

import br.com.fiap.petshop.domain.entity.animal.Animal;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Table;

import javax.persistence.Entity;
import java.math.BigDecimal;
import java.time.LocalDateTime;
@Entity
@Table(name = "TB_CONSULTA")
@DiscriminatorValue( "CONSULTA" )
public class Consulta extends Servico {
    public Consulta() {
    }

    public Consulta(Long id, BigDecimal valor, LocalDateTime abertura, LocalDateTime autorizacao, LocalDateTime conclusao, String descricao, String observacao) {
        super(id, valor, abertura, autorizacao, conclusao, descricao, observacao);
    }

    @Override
    public String toString() {
        return "Consulta{} " + super.toString();
    }
}