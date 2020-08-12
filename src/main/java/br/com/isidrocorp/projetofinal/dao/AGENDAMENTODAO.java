package br.com.isidrocorp.projetofinal.dao;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import br.com.isidrocorp.projetofinal.model.AGENCIA;
import br.com.isidrocorp.projetofinal.model.AGENDAMENTO;



public interface AGENDAMENTODAO extends CrudRepository<AGENDAMENTO, Integer>{
	
	public ArrayList<AGENDAMENTO> findAllByNomeClienteContaining(String nomeCliente);
	
	public ArrayList<AGENDAMENTO> findAllByAgc(AGENCIA agc);
	
	public ArrayList<AGENDAMENTO> findAllByAgcAndNomeClienteContaining(AGENCIA agc, String nomeCliente);
	
}
