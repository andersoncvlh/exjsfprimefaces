package com.anso.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

import com.anso.entity.Alimento;
import com.anso.entity.Refeicao;

@ManagedBean(name="dietaBean")
public class DietaBean {
	
	private Refeicao refeicao;

	public void prepararModal() {
		refeicao = new Refeicao();
		refeicao.setAlimentos(new ArrayList<Alimento>());
		List<Alimento> alimentos = new ArrayList<Alimento>();
		Alimento alimento = new Alimento();
		alimento.setCalValue(12);
		alimento.setDescricao("Pão com Queijo, Café com Leite");
		alimentos.add(alimento);
		refeicao.setDescricao("Café da manhã");
		refeicao.setAlimentos(alimentos);
	}
	
	public Refeicao getRefeicao() {
		return refeicao;
	}

	public void setRefeicao(Refeicao refeicao) {
		this.refeicao = refeicao;
	}

}
