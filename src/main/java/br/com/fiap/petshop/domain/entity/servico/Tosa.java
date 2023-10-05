package br.com.fiap.petshop.domain.entity.servico;

import br.com.fiap.petshop.domain.entity.animal.Animal;
import jakarta.persistence.DiscriminatorValue;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDateTime;
@Entity
@Table(name = "TB_TOSA")
@DiscriminatorValue( "TOSA" )
public class Tosa extends Servico {
    public Tosa() {
    }

    public Tosa(Long id, BigDecimal valor, LocalDateTime abertura, LocalDateTime autorizacao, LocalDateTime conclusao, String descricao, String observacao) {
        super(id, valor, abertura, autorizacao, conclusao, descricao, observacao);
    }

    @Override
    public String toString() {
        return "Tosa{} " + super.toString();
    }
}
