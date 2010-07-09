package br.com.triadworks.service;

import org.springframework.stereotype.Service;

@Service("servico")
public class ServicoImpl implements Servico {

	@Override
	public void sayHello() {
		System.out.println("hello");
	}

}
