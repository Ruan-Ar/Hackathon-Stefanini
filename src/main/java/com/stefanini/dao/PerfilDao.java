package com.stefanini.dao;
import com.stefanini.dao.abstracao.GenericDao;
import com.stefanini.model.Perfil;
import com.stefanini.model.Pessoa;
import com.stefanini.servico.PerfilServico;
import com.stefanini.util.IGenericService;

import javax.ejb.Stateless;
import javax.faces.flow.builder.ReturnBuilder;
import javax.inject.Inject;
	import javax.persistence.EntityManager;
	import javax.persistence.EntityTransaction;
	import javax.persistence.PersistenceContext;
	import javax.persistence.criteria.CriteriaBuilder;
	import javax.persistence.criteria.CriteriaQuery;
	import javax.validation.Valid;
	import java.io.Serializable;
	import java.util.List;
	import java.util.Optional;

	
@Stateless
public class PerfilDao extends GenericDao<Perfil, Long> {

	public PerfilDao() {
		super(Perfil.class);
	}
	
}
	
	
		
		

	



