package facade;

import facade.subsystem.cep.CepAPI;
import facade.subsystem.crm.CrmService;

public class Facade {
  public void migrateClient(String name, String cep) {
    CepAPI cepAPI = CepAPI.getInstance();

    String city = cepAPI.getCity(cep);
    String state = cepAPI.getState(cep);

    CrmService.saveClient(name, cep, city, state);
  }
}