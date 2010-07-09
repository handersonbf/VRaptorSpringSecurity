package br.com.triadworks.controller;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.triadworks.service.Servico;

@Resource
public class MainController {

	@Get
	@Path("/main")
	public void main() {
		System.out.println("main");
	}
	
}
