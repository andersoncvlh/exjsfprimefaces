package com.anso.entity;

import java.util.List;

public class Refeicao {
	
	private String descricao;
	private List<Alimento> alimentos;
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public List<Alimento> getAlimentos() {
		return alimentos;
	}
	public void setAlimentos(List<Alimento> alimentos) {
		this.alimentos = alimentos;
	}
	
}
