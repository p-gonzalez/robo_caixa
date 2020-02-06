package br.comindra.caixa.entity;

import java.util.Date;

import javax.persistence.Column;
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
	
	@Column(name="DURACAO_1", length = 20)
	private String duracao1;
	
	@Column(name="DURACAO_TOTAL", length = 20)
	private String duracaoTotal;
	
	@Column(name="", length = 200)
	private String habilidades;
	
	@Column(name="", length = 500)
	private String idChamado;
	
	@Column(name="INICIO_CONTATO", length = 20)	
	private Date inicioContato;
	
	@Column(name="RECARREGAR_DATA", length = 20 )
	private Date recarregarData;
	
	@Column(name="INTERLOCUTORES", length = 500 )
	private String interlocutores;
	
	@Column(name="PROPRIETARIO", length = 200 )
	private String proprietario;
	
	@Column(name="SERVICO", length = 200)
	private String servico;
	
	@Column(name="UDF", length = 1000 )
	private String udf;
	
	@Column(name="CPF_CNPJ", length =  14 )
	private String cfpCnpj;
	
	@Column(name="NUMERO_CHAMADOR", length = 200 )
	private String numChamador;
	
	@Column(name="ID_OPERADOR", length = 50 )
	private String idOperador;
	
	@Column(name="ID_CONTRATADA")
	private String idContratada = "INDRA-FO-2015";
	
	@Column(name="STATUS", length = 3)
	private int status;
	
	@Column(name="TELEFONE", length = 11 )
	private String numTel;
	
	@Column(name="NOME_TITULAR", length = 500 )
	private String nomeTitular;
	
	@Column(name="ID_CALL", length = 30 )
	private Integer idCall;
	
	@Column(name="CALL_ID", length = 30)
	private String callId;
	
	@Column(name="DATA_HORA_PROCESSAMENTO", length = 20 )
	private Date dataHoraProcessamento;
	
	@Column(name="NOME_ARQUIVO", length = 100 )
	private   String nomeArquivo;
	
	@Column(name="TEMPO_ATENDIMENTO", length = 30 )
	private String tempoAtend;
	
	@Column(name="DATA_ATENDMENTO", length = 30 )
	private String dtAtendimento;
	
	@Column(name="TEMPO_ATENDIMENTO", length = 30 )
	private String tempoAtendimento;
	
	
	public CadastroLigacoes() {
		
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getDuracao1() {
		return duracao1;
	}


	public void setDuracao1(String duracao1) {
		this.duracao1 = duracao1;
	}


	public String getDuracaoTotal() {
		return duracaoTotal;
	}


	public void setDuracaoTotal(String duracaoTotal) {
		this.duracaoTotal = duracaoTotal;
	}


	public String getHabilidades() {
		return habilidades;
	}


	public void setHabilidades(String habilidades) {
		this.habilidades = habilidades;
	}


	public String getIdChamado() {
		return idChamado;
	}


	public void setIdChamado(String idChamado) {
		this.idChamado = idChamado;
	}


	public Date getInicioContato() {
		return inicioContato;
	}


	public void setInicioContato(Date inicioContato) {
		this.inicioContato = inicioContato;
	}


	public Date getRecarregarData() {
		return recarregarData;
	}


	public void setRecarregarData(Date recarregarData) {
		this.recarregarData = recarregarData;
	}


	public String getInterlocutores() {
		return interlocutores;
	}


	public void setInterlocutores(String interlocutores) {
		this.interlocutores = interlocutores;
	}


	public String getProprietario() {
		return proprietario;
	}


	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}


	public String getServico() {
		return servico;
	}


	public void setServico(String servico) {
		this.servico = servico;
	}


	public String getUdf() {
		return udf;
	}


	public void setUdf(String udf) {
		this.udf = udf;
	}


	public String getCfpCnpj() {
		return cfpCnpj;
	}


	public void setCfpCnpj(String cfpCnpj) {
		this.cfpCnpj = cfpCnpj;
	}


	public String getNumChamador() {
		return numChamador;
	}


	public void setNumChamador(String numChamador) {
		this.numChamador = numChamador;
	}


	public String getIdOperador() {
		return idOperador;
	}


	public void setIdOperador(String idOperador) {
		this.idOperador = idOperador;
	}


	public String getIdContratada() {
		return idContratada;
	}


	public void setIdContratada(String idContratada) {
		this.idContratada = idContratada;
	}


	public int getStatus() {
		return status;
	}


	public void setStatus(int status) {
		this.status = status;
	}


	public String getNumTel() {
		return numTel;
	}


	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}


	public String getNomeTitular() {
		return nomeTitular;
	}


	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}


	public Integer getIdCall() {
		return idCall;
	}


	public void setIdCall(Integer idCall) {
		this.idCall = idCall;
	}


	public String getCallId() {
		return callId;
	}


	public void setCallId(String callId) {
		this.callId = callId;
	}


	public Date getDataHoraProcessamento() {
		return dataHoraProcessamento;
	}


	public void setDataHoraProcessamento(Date dataHoraProcessamento) {
		this.dataHoraProcessamento = dataHoraProcessamento;
	}


	public String getNomeArquivo() {
		return nomeArquivo;
	}


	public void setNomeArquivo(String nomeArquivo) {
		this.nomeArquivo = nomeArquivo;
	}


	public String getTempoAtend() {
		return tempoAtend;
	}


	public void setTempoAtend(String tempoAtend) {
		this.tempoAtend = tempoAtend;
	}


	public String getDtAtendimento() {
		return dtAtendimento;
	}


	public void setDtAtendimento(String dtAtendimento) {
		this.dtAtendimento = dtAtendimento;
	}


	public String getTempoAtendimento() {
		return tempoAtendimento;
	}


	public void setTempoAtendimento(String tempoAtendimento) {
		this.tempoAtendimento = tempoAtendimento;
	}
	
	

}
