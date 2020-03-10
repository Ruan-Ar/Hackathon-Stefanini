package com.stefanini.resource;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.stefanini.model.Perfil;
import com.stefanini.servico.PerfilServico;

@Path(value = "perfis")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class PerfilResource {
	
	@Inject
	private PerfilServico perfilServico;
	
	@GET
	public Response obterPerfis(){
		return Response.ok(perfilServico.getList().get()).build();
		
	}
	
	@POST
	public Response salvarPerfil(Perfil perfil) {
		return Response.ok(perfilServico.salvar(perfil)).build();
	}
	
	@DELETE
	@Path("{id}")
	public Response deletarPerfil(@PathParam("id") Long id) {
		perfilServico.remover(id);
		return Response.ok().build();
	}
	
	@PUT
	public Response atualizarPerfil(Perfil perfil) {
		Perfil perfil2 = perfilServico.encontrar(perfil.getId()).get();
		return Response.ok(perfilServico.atualizar(perfil2)).build();
	}
	
	
	@GET
	@Path("{id}")
	public Response buscarPorId(@PathParam("id") Long id) {
		return Response.ok(perfilServico.encontrar(id).get()).build();
	}
	
	
	

}
