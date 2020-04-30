package br.com.fiap.nac.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import br.com.fiap.nac.model.EletronicoModel;


public class EletronicoRepository {

	private static Map<Long, EletronicoModel> eletronicos;

	private static EletronicoRepository instance;

	public static EletronicoRepository getInstance() {

		if (instance == null) {
			instance = new EletronicoRepository();
		}
		return instance;
	}

	private EletronicoRepository() {
		eletronicos = new HashMap<Long, EletronicoModel>();

		eletronicos.put(1L,
				new EletronicoModel(1, "Sony", "0000001", 9, "descrição da Sony", 1000, "detalhes da Sony"));
		eletronicos.put(2L,
				new EletronicoModel(2, "Beats", "0000002", 8, "descrição da Beats", 2000, "detalhes da Beats"));
		eletronicos.put(3L,
				new EletronicoModel(3, "BenQ", "0000003", 10, "descrição da BenQ", 3000, "detalhes da BenQ"));
		eletronicos.put(4L, new EletronicoModel(4, "Logitech", "0000004", 7, "descrição da Logitech", 4000,
				"detalhes da Logitech"));
	}

	public ArrayList<EletronicoModel> findAll() {
		return new ArrayList<EletronicoModel>(eletronicos.values());
	}

	public EletronicoModel findById(long id) {
		return eletronicos.get(id);
	}

	public void save(EletronicoModel eletronicoModel) {
		Long newId = (long) (eletronicos.size() + 1);
		eletronicoModel.setId(newId);
		eletronicos.put(newId, eletronicoModel);
	}

	public void update(EletronicoModel eletronicoModel) {
		eletronicos.put(eletronicoModel.getId(), eletronicoModel);
	}

	public void deleteById(long id) {
		eletronicos.remove(id);
	}

}
