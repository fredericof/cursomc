package com.frederico.cursomc.domain;

import java.util.Date;

import javax.persistence.Entity;

import com.frederico.cursomc.domain.enums.EstadoPagamento;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class PagamentoComBoleto extends Pagamento {
	
	private static final long serialVersionUID = 1L;
	
	private Date dataVencimento;
	private Date dataPagemento;
	
	public PagamentoComBoleto(Integer id, EstadoPagamento estado, Pedido pedido, Date dataVencimento, Date dataPagemento) {
		super(id, estado, pedido);
		this.dataPagemento = dataPagemento;
		this.dataVencimento = dataVencimento;
	}

}
