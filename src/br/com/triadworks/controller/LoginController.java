package br.com.triadworks.controller;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.view.Results;
import br.com.triadworks.service.Servico;

@Resource
public class LoginController {

	private final Servico servico;
	private final Result result;
	
	public LoginController(Result result, Servico servico) {
		super();
		this.result = result;
		this.servico = servico;
	}

	@Get
	@Path("/login")
	public void login() {
		servico.sayHello();
	}
	
}
