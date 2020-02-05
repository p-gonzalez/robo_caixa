package br.comindra.caixa.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_CADASTRO_LIGACOES")
public class CadastroLigacoes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String duracao1;
	private String duracaoTotal;
	private String habilidades;
	private String idChamado;
		
	private Date inicioContato;
	private Date recarregarData;
	
	private String interlocutores;
	private String proprietario;
	private String servico;
	private String udf;
	
	private String cfpCnpj;
	private String numChamador;
	private String idOperador;
	private String idContratada = "INDRA-FO-2015";
	private int status;
	private String numTel;
	private String nomeTitular;
	
	
	private Integer idCall;
	private String callId;
	private Date dataHoraProcessamento;
	private   String nomeArquivo;
	private String tempoAtend;
	private String dtAtendimento;
	private String tempoAtendimento;
	
	
	public CadastroLigacoes() {
		
	}
	
	

}
