package com.anso.entity;

import java.util.List;

public class Dieta {

	private String descricao;
	private List<Refeicao> refeicao;
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public List<Refeicao> getRefeicao() {
		return refeicao;
	}
	public void setRefeicao(List<Refeicao> refeicao) {
		this.refeicao = refeicao;
	}
	
	
}
